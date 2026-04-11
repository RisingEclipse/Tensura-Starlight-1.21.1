package com.github.propheticeclipse.tensurastarlight.ability.skill.extra;

import com.alexthw.sauce.registry.ModRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.genericIntrinsicSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class sourcePoweredSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.sourcePowered CONFIG;
    public static final ResourceLocation SOURCE_POWERED;

    public sourcePoweredSkill() {
        super(SkillType.EXTRA);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        boolean skill1 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.AMETHYST_GOLEM_GENETICS.get());
        boolean skill2 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.DRYGMY_GENETICS.get());
        boolean skill3 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.FLARECANNON_GENETICS.get());
        boolean skill4 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.FLASHJACK_GENETICS.get());
        boolean skill5 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.SIREN_GENETICS.get());
        boolean skill6 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.STARBUNCLE_GENETICS.get());
        boolean skill7 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WHIRLISPRIG_GENETICS.get());
        boolean skill8 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WILDEN_GUARDIAN_GENETICS.get());
        boolean skill9 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WILDEN_HUNTER_GENETICS.get());
        boolean skill10 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WILDEN_STALKER_GENETICS.get());
        boolean skill11 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WIXIE_GENETICS.get());
        return skill1 && skill2 && skill3 && skill4 && skill5 && skill6 && skill7 && skill8 && skill9 && skill10 && skill11;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double elementalPowerBonus = instance.isMastered(entity) ? CONFIG.elementalPowerBonusMastered : CONFIG.elementalPowerBonusUnmastered;
        double earthResistBonus = instance.isMastered(entity) ? CONFIG.earthResistBonusMastered : CONFIG.earthResistBonusUnmastered;
        double fireResistBonus = instance.isMastered(entity) ? CONFIG.fireResistBonusMastered : CONFIG.fireResistBonusUnmastered;
        double waterResistBonus = instance.isMastered(entity) ? CONFIG.waterResistBonusMastered : CONFIG.waterResistBonusUnmastered;
        double airResistBonus = instance.isMastered(entity) ? CONFIG.airResistBonusMastered : CONFIG.airResistBonusUnmastered;
        double manaDiscountBonus = instance.isMastered(entity) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

        AttributeInstance elementalPower = entity.getAttribute(ModRegistry.ELEMENTAL_POWER);
        AttributeInstance earthResist = entity.getAttribute(ModRegistry.EARTH_RESISTANCE);
        AttributeInstance fireResist = entity.getAttribute(ModRegistry.FIRE_RESISTANCE);
        AttributeInstance waterResist = entity.getAttribute(ModRegistry.WATER_RESISTANCE);
        AttributeInstance airResist = entity.getAttribute(ModRegistry.AIR_RESISTANCE);

        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (elementalPower != null) {
            if (!elementalPower.hasModifier(SOURCE_POWERED)) {
                elementalPower.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, elementalPowerBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (earthResist != null) {
            if (!earthResist.hasModifier(SOURCE_POWERED)) {
                earthResist.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, earthResistBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (fireResist != null) {
            if (!fireResist.hasModifier(SOURCE_POWERED)) {
                fireResist.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, fireResistBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (waterResist != null) {
            if (!waterResist.hasModifier(SOURCE_POWERED)) {
                waterResist.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, waterResistBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (airResist != null) {
            if (!airResist.hasModifier(SOURCE_POWERED)) {
                airResist.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, airResistBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (manaDiscount != null) {
            if (!manaDiscount.hasModifier(SOURCE_POWERED)) {
                manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance elementalPower = entity.getAttribute(ModRegistry.ELEMENTAL_POWER);
        AttributeInstance earthResist = entity.getAttribute(ModRegistry.EARTH_RESISTANCE);
        AttributeInstance fireResist = entity.getAttribute(ModRegistry.FIRE_RESISTANCE);
        AttributeInstance waterResist = entity.getAttribute(ModRegistry.WATER_RESISTANCE);
        AttributeInstance airResist = entity.getAttribute(ModRegistry.AIR_RESISTANCE);

        AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

        if (elementalPower != null) {
            elementalPower.removeModifier(SOURCE_POWERED);
        }

        if (earthResist != null) {
            earthResist.removeModifier(SOURCE_POWERED);
        }

        if (fireResist != null) {
            fireResist.removeModifier(SOURCE_POWERED);
        }

        if (waterResist != null) {
            waterResist.removeModifier(SOURCE_POWERED);
        }

        if (airResist != null) {
            airResist.removeModifier(SOURCE_POWERED);
        }

        if (manaDiscount != null) {
            manaDiscount.removeModifier(SOURCE_POWERED);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double elementalPowerBonus = instance.isMastered(entity) ? CONFIG.elementalPowerBonusMastered : CONFIG.elementalPowerBonusUnmastered;
            double earthResistBonus = instance.isMastered(entity) ? CONFIG.earthResistBonusMastered : CONFIG.earthResistBonusUnmastered;
            double fireResistBonus = instance.isMastered(entity) ? CONFIG.fireResistBonusMastered : CONFIG.fireResistBonusUnmastered;
            double waterResistBonus = instance.isMastered(entity) ? CONFIG.waterResistBonusMastered : CONFIG.waterResistBonusUnmastered;
            double airResistBonus = instance.isMastered(entity) ? CONFIG.airResistBonusMastered : CONFIG.airResistBonusUnmastered;
            double manaDiscountBonus = instance.isMastered(entity) ? CONFIG.manaDiscountBonusMastered : CONFIG.manaDiscountBonusUnmastered;

            AttributeInstance elementalPower = entity.getAttribute(ModRegistry.ELEMENTAL_POWER);
            AttributeInstance earthResist = entity.getAttribute(ModRegistry.EARTH_RESISTANCE);
            AttributeInstance fireResist = entity.getAttribute(ModRegistry.FIRE_RESISTANCE);
            AttributeInstance waterResist = entity.getAttribute(ModRegistry.WATER_RESISTANCE);
            AttributeInstance airResist = entity.getAttribute(ModRegistry.AIR_RESISTANCE);

            AttributeInstance manaDiscount = entity.getAttribute(ModRegistry.MANA_DISCOUNT);

            if (elementalPower != null) {
                if (!elementalPower.hasModifier(SOURCE_POWERED)) {
                    elementalPower.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, elementalPowerBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (earthResist != null) {
                if (!earthResist.hasModifier(SOURCE_POWERED)) {
                    earthResist.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, earthResistBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (fireResist != null) {
                if (!fireResist.hasModifier(SOURCE_POWERED)) {
                    fireResist.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, fireResistBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (waterResist != null) {
                if (!waterResist.hasModifier(SOURCE_POWERED)) {
                    waterResist.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, waterResistBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (airResist != null) {
                if (!airResist.hasModifier(SOURCE_POWERED)) {
                    airResist.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, airResistBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (manaDiscount != null) {
                if (!manaDiscount.hasModifier(SOURCE_POWERED)) {
                    manaDiscount.addOrReplacePermanentModifier(new AttributeModifier(SOURCE_POWERED, manaDiscountBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        }
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

    static {
        SOURCE_POWERED = ResourceLocation.fromNamespaceAndPath("trstarlight", "source_powered");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).sourcePowered;
    }
}