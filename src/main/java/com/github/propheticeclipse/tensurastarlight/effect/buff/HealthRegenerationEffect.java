package com.github.propheticeclipse.tensurastarlight.effect.buff;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
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

import java.awt.*;

public class HealthRegenerationEffect extends TensuraMobEffect {
    public static final ResourceLocation HEALTH_REGEN = ResourceLocation.fromNamespaceAndPath("trstarlight", "health_regen");
    private static final BuffEffectsConfig.healthRegen CONFIG = ConfigRegistry.getConfig(BuffEffectsConfig.class).healthRegen;

    public HealthRegenerationEffect() {
        super(MobEffectCategory.BENEFICIAL, (new Color(255, 255, 255)).getRGB());
    }

    public boolean applyEffectTick(LivingEntity entity, int pAmplifier) {
        // Logic Here
        double maxHP = entity.getMaxHealth();
        double healthCap = maxHP * CONFIG.regenCap;
        double regenMod = CONFIG.regenPercent / 100;
        int level = pAmplifier + 1;

        if (entity.isAlive() && healthCap >= entity.getHealth()) {
            if (!SkillUtils.shouldCancelHealing(entity)) {
                entity.heal((float) (maxHP * (regenMod * level)));
            }
        }
        return true;
    }

    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return pDuration > 0 && pDuration % CONFIG.tickRate == 0;
    }
}
