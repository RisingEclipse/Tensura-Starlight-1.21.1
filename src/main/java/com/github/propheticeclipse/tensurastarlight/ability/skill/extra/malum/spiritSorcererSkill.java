package com.github.propheticeclipse.tensurastarlight.ability.skill.extra.malum;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.malumSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightEffects;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import com.sammy.malum.registry.common.MalumAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import io.github.manasmods.tensura.particle.TensuraParticleHelper;
import io.github.manasmods.tensura.particle.TensuraParticleUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;

public class spiritSorcererSkill extends Skill {

    private static final malumSeriesSkillConfig.spiritSorcerer CONFIG = ConfigRegistry.getConfig(malumSeriesSkillConfig .class).spiritSorcerer;
    private static final BuffEffectsConfig.soulAegis EFFECT_CONFIG = ConfigRegistry.getConfig(BuffEffectsConfig .class).soulAegis;
    public static final ResourceLocation SPIRIT_SORCERER = ResourceLocation.fromNamespaceAndPath("trstarlight", "spirit_sorcerer");

    public spiritSorcererSkill() {
        super(SkillType.EXTRA);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        boolean wardedSoul = SkillUtils.hasSkillFully(entity, StarlightIntrinsicSkills.WARDED_SOUL.get());
        boolean soulPlunderer = SkillUtils.hasSkillFully(entity, StarlightIntrinsicSkills.SOUL_PLUNDERER.get());
        boolean malignantBody = SkillUtils.hasSkillFully(entity, StarlightIntrinsicSkills.MALIGNANT_BODY.get());


        return wardedSoul && soulPlunderer && malignantBody;
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }
    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return instance.isToggled();
    }

    public void onTick(ManasSkillInstance instance, LivingEntity living) {
        CompoundTag tag = instance.getOrCreateTag();
        int time = tag.getInt("activatedTimes");
        if (time % 20 == 0) {
            this.addMasteryPoint(instance, living);
        }

        tag.putInt("activatedTimes", time + 1);
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double soulWardMulti = instance.isMastered(entity) ? CONFIG.soulWardMultiMastered : CONFIG.soulWardMultiUnmastered;
        double soulWardIntegrityBonus = instance.isMastered(entity) ? CONFIG.soulWardIntegrityBonusMastered : CONFIG.soulWardIntegrityBonusUnmastered;

        AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
        AttributeInstance soulWardIntegrity = entity.getAttribute(MalumAttributes.SOUL_WARD_INTEGRITY);

        if (soulWard != null) {
            if (!soulWard.hasModifier(SPIRIT_SORCERER)) {
                soulWard.addOrReplacePermanentModifier(new AttributeModifier(SPIRIT_SORCERER, soulWardMulti, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
            }
        }

        if (soulWardIntegrity  != null) {
            if (!soulWardIntegrity.hasModifier(SPIRIT_SORCERER)) {
                soulWardIntegrity.addOrReplacePermanentModifier(new AttributeModifier(SPIRIT_SORCERER, soulWardIntegrityBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
        AttributeInstance soulWardIntegrity = entity.getAttribute(MalumAttributes.SOUL_WARD_INTEGRITY);
        if (soulWard != null) {
            soulWard.removeModifier(SPIRIT_SORCERER);
        }

        if (soulWardIntegrity != null) {
            soulWardIntegrity.removeModifier(SPIRIT_SORCERER);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double soulWardMulti = instance.isMastered(entity) ? CONFIG.soulWardMultiMastered : CONFIG.soulWardMultiUnmastered;
            double soulWardIntegrityBonus = instance.isMastered(entity) ? CONFIG.soulWardIntegrityBonusMastered : CONFIG.soulWardIntegrityBonusUnmastered;

            AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
            AttributeInstance soulWardIntegrity = entity.getAttribute(MalumAttributes.SOUL_WARD_INTEGRITY);

            if (soulWard != null) {
                if (!soulWard.hasModifier(SPIRIT_SORCERER)) {
                    soulWard.addOrReplacePermanentModifier(new AttributeModifier(SPIRIT_SORCERER, soulWardMulti, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
                }
            }

            if (soulWardIntegrity  != null) {
                if (!soulWard.hasModifier(SPIRIT_SORCERER)) {
                    soulWard.addOrReplacePermanentModifier(new AttributeModifier(SPIRIT_SORCERER, soulWardIntegrityBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        } else {
            AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
            AttributeInstance soulWardIntegrity = entity.getAttribute(MalumAttributes.SOUL_WARD_INTEGRITY);
            if (soulWard != null) {
                soulWard.removeModifier(SPIRIT_SORCERER);
            }

            if (soulWardIntegrity != null) {
                soulWardIntegrity.removeModifier(SPIRIT_SORCERER);
            }
        }
    }

    public int getModes(ManasSkillInstance instance) {
        return 1;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "spirit_sorcerer.soul_aegis";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        double cost;
        switch (mode) {
            case 0 -> cost = CONFIG.soulAegisManaCost;
            default -> cost = 0.0;
        }

        return cost;
    }

    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {
        if (mode == 0) {
            AttributeInstance soulWard = entity.getAttribute(MalumAttributes.SOUL_WARD_CAPACITY);
            double soulWardAbsolute = EFFECT_CONFIG.soulWardBonus * -1.0;
            // Grant effect that removes all Soul Ward and turns it into aegis, and grants a influx of arcane resonance

            // By default the values are -5 ward = +5 aegis and 15% resonance, though do the math using the config numbers.
            if (soulWard.getValue() >= soulWardAbsolute) { // Check that you have enough soul ward to trigger
                double amplifier = (soulWard.getValue() / soulWardAbsolute) - 1;
                int trueAmplifier = (int) Math.round(amplifier);
                double duration = (amplifier * EFFECT_CONFIG.soulAegisBaseDuration) + EFFECT_CONFIG.soulAegisBaseDuration;

                MobEffectInstance effectInstance = new MobEffectInstance(StarlightEffects.SOUL_AEGIS,(int) duration, trueAmplifier, false, false, false);
                TensuraMobEffect.addEffect(entity, effectInstance, entity, this, mode);
                TensuraParticleHelper.spawnServerParticles(entity.level(), TensuraParticleUtils.getColorlessReversedWave(0.9F, entity.getBbWidth() * 3.0F), entity.getX(), entity.getY() + (double)entity.getBbHeight() * 0.33, entity.getZ());
                TensuraParticleHelper.spawnServerParticles(entity.level(), TensuraParticleUtils.getColorlessReversedWave(0.9F, entity.getBbWidth() * 3.0F), entity.getX(), entity.getY() + (double)entity.getBbHeight() * 0.66, entity.getZ());

                instance.setCoolDown(CONFIG.soulAegisCooldown, 0);
            } else if (entity instanceof ServerPlayer serverPlayer) {
                // Tell the player they need more soul ward.
                serverPlayer.displayClientMessage(Component.translatable("trstarlight.soul_aegis_fail").setStyle(Style.EMPTY.withColor(ChatFormatting.DARK_PURPLE)), false);
            }
        }
    }
}