package com.github.propheticeclipse.tensurastarlight.ability.skill.extra;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.genericIntrinsicSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
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

public class abnormallyLuckySkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.abnormallyLucky CONFIG;
    public static final ResourceLocation ABNORMALLY_LUCKY;

    public abnormallyLuckySkill() {
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
        return (entity.getAttributeValue(Attributes.LUCK) >= 50.0 && SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.LUCKY.get()) && SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.DRYGMY_GENETICS.get()));
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double luckBonus = instance.isMastered(entity) ? CONFIG.luckBonusMastered : CONFIG.luckBonusUnmastered;
        double lootingBonus = instance.isMastered(entity) ? CONFIG.lootingBonusMastered : CONFIG.lootingBonusUnmastered;
        double critChanceBonus = instance.isMastered(entity) ? CONFIG.critChanceBonusMastered : CONFIG.critChanceBonusUnmastered;

        AttributeInstance luck = entity.getAttribute(Attributes.LUCK);
        AttributeInstance looting = entity.getAttribute(PerkAttributes.DRYGMY);
        AttributeInstance critChance = entity.getAttribute(ALObjects.Attributes.CRIT_CHANCE);

        if (luck != null) {
            if (!luck.hasModifier(ABNORMALLY_LUCKY)) {
                luck.addOrReplacePermanentModifier(new AttributeModifier(ABNORMALLY_LUCKY, luckBonus, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
            }
        }

        if (looting != null) {
            if (!looting.hasModifier(ABNORMALLY_LUCKY)) {
                looting.addOrReplacePermanentModifier(new AttributeModifier(ABNORMALLY_LUCKY, lootingBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (critChance != null) {
            if (!critChance.hasModifier(ABNORMALLY_LUCKY)) {
                critChance.addOrReplacePermanentModifier(new AttributeModifier(ABNORMALLY_LUCKY, critChanceBonus, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance luck = entity.getAttribute(Attributes.LUCK);
        AttributeInstance looting = entity.getAttribute(PerkAttributes.DRYGMY);
        AttributeInstance critChance = entity.getAttribute(ALObjects.Attributes.CRIT_CHANCE);
        if (luck != null) {
            luck.removeModifier(ABNORMALLY_LUCKY);
        }

        if (looting != null) {
            looting.removeModifier(ABNORMALLY_LUCKY);
        }

        if (critChance != null) {
            critChance.removeModifier(ABNORMALLY_LUCKY);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double luckBonus = instance.isMastered(entity) ? CONFIG.luckBonusMastered : CONFIG.luckBonusUnmastered;
            double lootingBonus = instance.isMastered(entity) ? CONFIG.lootingBonusMastered : CONFIG.lootingBonusUnmastered;
            double critChanceBonus = instance.isMastered(entity) ? CONFIG.critChanceBonusMastered : CONFIG.critChanceBonusUnmastered;

            AttributeInstance luck = entity.getAttribute(Attributes.LUCK);
            AttributeInstance looting = entity.getAttribute(PerkAttributes.DRYGMY);
            AttributeInstance critChance = entity.getAttribute(ALObjects.Attributes.CRIT_CHANCE);

            if (luck != null) {
                if (!luck.hasModifier(ABNORMALLY_LUCKY)) {
                    luck.addOrReplacePermanentModifier(new AttributeModifier(ABNORMALLY_LUCKY, luckBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (looting != null) {
                if (!looting.hasModifier(ABNORMALLY_LUCKY)) {
                    looting.addOrReplacePermanentModifier(new AttributeModifier(ABNORMALLY_LUCKY, lootingBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (critChance != null) {
                if (!critChance.hasModifier(ABNORMALLY_LUCKY)) {
                    critChance.addOrReplacePermanentModifier(new AttributeModifier(ABNORMALLY_LUCKY, critChanceBonus, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
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
        ABNORMALLY_LUCKY = ResourceLocation.fromNamespaceAndPath("trstarlight", "abnormally_lucky");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).abnormallyLucky;
    }
}