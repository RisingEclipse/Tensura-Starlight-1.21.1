package com.github.propheticeclipse.tensurastarlight.effect.debuff;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import com.github.propheticeclipse.tensurastarlight.config.effects.DebuffEffectsConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.registry.effect.TensuraMobEffects;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

import java.awt.*;

public class ExistenceDrainEffect extends TensuraMobEffect {
    public static final ResourceLocation EXISTENCE_DRAIN = ResourceLocation.fromNamespaceAndPath("trstarlight", "existence_drain");
    private static final DebuffEffectsConfig.existenceDrain CONFIG = ConfigRegistry.getConfig(DebuffEffectsConfig.class).existenceDrain;

    public ExistenceDrainEffect() {
        super(MobEffectCategory.HARMFUL, (new Color(255, 255, 255)).getRGB());
    }

    public boolean applyEffectTick(LivingEntity entity, int pAmplifier) {
        // Logic Here
        IExistence existence = TensuraStorages.getExistenceFrom(entity);
        double maxMP = entity.getAttributeValue(TensuraAttributes.MAX_MAGICULE);
        double maxAP = entity.getAttributeValue(TensuraAttributes.MAX_AURA);
        double magicModifier = CONFIG.magiculePercent / 100;
        double auraModifier = CONFIG.auraPercent / 100;
        int level = pAmplifier + 1;

        if (entity.isAlive()) {
            if (existence.getMagicule() >= maxMP * CONFIG.magiculeCap) {
                existence.setMagicule(existence.getMagicule() + (maxAP * (magicModifier * level)));
            }
            if (existence.getAura() >= maxAP * CONFIG.auraCap) {
                existence.setAura(existence.getAura() + (maxAP * (auraModifier * level)));
            }

            existence.markDirty();
        }
        return true;
    }

    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return pDuration > 0 && pDuration % CONFIG.tickRate == 0;
    }
}
