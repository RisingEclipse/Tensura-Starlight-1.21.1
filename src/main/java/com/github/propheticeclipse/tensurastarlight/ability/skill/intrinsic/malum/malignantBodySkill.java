package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.malum;

import com.github.propheticeclipse.tensurastarlight.config.skills.malumSeriesSkillConfig;
import com.sammy.malum.registry.common.MalumAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import team.lodestar.lodestone.helpers.DamageTypeHelper;
import team.lodestar.lodestone.registry.common.LodestoneAttributes;

public class malignantBodySkill extends Skill {

    private static final malumSeriesSkillConfig.malignantBody CONFIG = ConfigRegistry.getConfig(malumSeriesSkillConfig.class).malignantBody;
    public static final ResourceLocation MALIGNANT_BODY = ResourceLocation.fromNamespaceAndPath("trstarlight", "malignant_body");

    public malignantBodySkill() {
        super(SkillType.INTRINSIC);
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
        return false;
    }

    public boolean onTakenDamage(ManasSkillInstance instance, LivingEntity owner, DamageSource source, Changeable<Float> amount) {
        if (instance.isToggled()) {
            // code here
            if (TensuraDamageHelper.isTensuraMagic(source) || TensuraDamageHelper.isNaturalEffects(source)) {
                double damageMod = instance.isMastered(owner) ? CONFIG.magicResistanceDamageModMastered : CONFIG.magicResistanceDamageModUnmastered;
                double endingDamage = (amount.get() * damageMod);

                amount.set((float) endingDamage);
            }
        }

        return true;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double magicResistanceBonus = instance.isMastered(entity) ? CONFIG.magicResistanceBonusMastered : CONFIG.magicResistanceBonusUnmastered;
        double malignantConversionBonus = instance.isMastered(entity) ? CONFIG.malignantConversionBonusMastered : CONFIG.malignantConversionBonusUnmastered;

        AttributeInstance magicResistance = entity.getAttribute(LodestoneAttributes.MAGIC_RESISTANCE);
        AttributeInstance malignantConversion = entity.getAttribute(MalumAttributes.MALIGNANT_CONVERSION);

        if (magicResistance != null) {
            if (!magicResistance.hasModifier(MALIGNANT_BODY)) {
                magicResistance.addOrReplacePermanentModifier(new AttributeModifier(MALIGNANT_BODY, magicResistanceBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (malignantConversion != null) {
            if (!malignantConversion.hasModifier(MALIGNANT_BODY)) {
                malignantConversion.addOrReplacePermanentModifier(new AttributeModifier(MALIGNANT_BODY, malignantConversionBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance magicResistance = entity.getAttribute(LodestoneAttributes.MAGIC_RESISTANCE);
        AttributeInstance malignantConversion = entity.getAttribute(MalumAttributes.MALIGNANT_CONVERSION);
        if (magicResistance != null) {
            magicResistance.removeModifier(MALIGNANT_BODY);
        }

        if (malignantConversion != null) {
            malignantConversion.removeModifier(MALIGNANT_BODY);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double magicResistanceBonus = instance.isMastered(entity) ? CONFIG.magicResistanceBonusMastered : CONFIG.magicResistanceBonusUnmastered;
            double malignantConversionBonus = instance.isMastered(entity) ? CONFIG.malignantConversionBonusMastered : CONFIG.malignantConversionBonusUnmastered;

            AttributeInstance magicResistance = entity.getAttribute(LodestoneAttributes.MAGIC_RESISTANCE);
            AttributeInstance malignantConversion = entity.getAttribute(MalumAttributes.MALIGNANT_CONVERSION);

            if (magicResistance != null) {
                if (!magicResistance.hasModifier(MALIGNANT_BODY)) {
                    magicResistance.addOrReplacePermanentModifier(new AttributeModifier(MALIGNANT_BODY, magicResistanceBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (malignantConversion != null) {
                if (!malignantConversion.hasModifier(MALIGNANT_BODY)) {
                    malignantConversion.addOrReplacePermanentModifier(new AttributeModifier(MALIGNANT_BODY, malignantConversionBonus, AttributeModifier.Operation.ADD_VALUE));
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
}