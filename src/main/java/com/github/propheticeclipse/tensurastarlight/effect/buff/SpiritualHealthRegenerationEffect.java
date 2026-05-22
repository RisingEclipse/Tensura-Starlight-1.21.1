package com.github.propheticeclipse.tensurastarlight.effect.buff;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

import java.awt.*;

public class SpiritualHealthRegenerationEffect extends TensuraMobEffect {
    public static final ResourceLocation SPIRITUAL_REGEN = ResourceLocation.fromNamespaceAndPath("trstarlight", "spiritual_regen");
    private static final BuffEffectsConfig.spiritualRegen CONFIG = ConfigRegistry.getConfig(BuffEffectsConfig.class).spiritualRegen;

    public SpiritualHealthRegenerationEffect() {
        super(MobEffectCategory.BENEFICIAL, (new Color(255, 255, 255)).getRGB());
    }

    public boolean applyEffectTick(LivingEntity entity, int pAmplifier) {
        // Logic Here
        IExistence existence = TensuraStorages.getExistenceFrom(entity);
        double maxSHP = entity.getAttributeValue(TensuraAttributes.MAX_SPIRITUAL_HEALTH);
        double healthCap = maxSHP * CONFIG.regenCap;
        double regenMod = CONFIG.regenPercent / 100;
        int level = pAmplifier + 1;

        if (entity.isAlive() && healthCap >= existence.getSpiritualHealth()) {
            if (!SkillUtils.shouldCancelHealing(entity)) {
                existence.setSpiritualHealth(existence.getSpiritualHealth() + (maxSHP * (regenMod * level)));
            }
        }
        return true;
    }

    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return pDuration > 0 && pDuration % CONFIG.tickRate == 0;
    }
}
