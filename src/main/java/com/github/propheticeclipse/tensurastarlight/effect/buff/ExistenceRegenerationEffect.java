package com.github.propheticeclipse.tensurastarlight.effect.buff;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import com.sammy.malum.registry.common.MalumAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.common.SelfRegenerationSkill;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

import java.awt.*;

public class ExistenceRegenerationEffect extends TensuraMobEffect {
    public static final ResourceLocation EXISTENCE_REGENERATION = ResourceLocation.fromNamespaceAndPath("trstarlight", "existence_regeneration");
    private static final BuffEffectsConfig.existenceRegeneration CONFIG = ConfigRegistry.getConfig(BuffEffectsConfig.class).existenceRegeneration;

    public ExistenceRegenerationEffect() {
        super(MobEffectCategory.BENEFICIAL, (new Color(255, 255, 255)).getRGB());
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
            if (existence.getMagicule() <= maxMP * CONFIG.magiculeCap) {
                existence.setMagicule(existence.getMagicule() + (maxMP * (magicModifier * level)));
            }
            if (existence.getAura() <= maxAP * CONFIG.auraCap) {
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
