package com.github.propheticeclipse.tensurastarlight.ability.skill.extra.arsnouveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
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
import net.minecraft.world.entity.player.Player;

public class hyperMetabolisticSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.hyperMetabolistic CONFIG;
    public static final ResourceLocation HYPER_METABOLISTIC;

    public hyperMetabolisticSkill() {
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
        boolean skill1 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WIXIE_GENETICS.get());
        boolean skill2 = SkillUtils.isSkillMastered(entity, StarlightIntrinsicSkills.WHIRLISPRIG_GENETICS.get());
        return skill1 && skill2;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double satietyBonus = instance.isMastered(entity) ? CONFIG.satietyBonusMastered : CONFIG.satietyBonusUnmastered;
        double potionDurationBonus = instance.isMastered(entity) ? CONFIG.potionDurationBonusMastered : CONFIG.potionDurationBonusUnmastered;
        double healingRecievedBonus = instance.isMastered(entity) ? CONFIG.healingRecievedBonusMastered : CONFIG.healingRecievedBonusUnmastered;

        AttributeInstance satiety = entity.getAttribute(PerkAttributes.WHIRLIESPRIG);
        AttributeInstance potionDuration = entity.getAttribute(PerkAttributes.WIXIE);
        AttributeInstance healingRecieved = entity.getAttribute(ALObjects.Attributes.HEALING_RECEIVED);

        if (satiety != null) {
            if (!satiety.hasModifier(HYPER_METABOLISTIC)) {
                satiety.addOrReplacePermanentModifier(new AttributeModifier(HYPER_METABOLISTIC, satietyBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (potionDuration != null) {
            if (!potionDuration.hasModifier(HYPER_METABOLISTIC)) {
                potionDuration.addOrReplacePermanentModifier(new AttributeModifier(HYPER_METABOLISTIC, potionDurationBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (healingRecieved != null) {
            if (!healingRecieved.hasModifier(HYPER_METABOLISTIC)) {
                healingRecieved.addOrReplacePermanentModifier(new AttributeModifier(HYPER_METABOLISTIC, healingRecievedBonus, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance satiety = entity.getAttribute(PerkAttributes.WHIRLIESPRIG);
        AttributeInstance potionDuration = entity.getAttribute(PerkAttributes.WIXIE);
        AttributeInstance healingRecieved = entity.getAttribute(ALObjects.Attributes.HEALING_RECEIVED);
        if (satiety != null) {
            satiety.removeModifier(HYPER_METABOLISTIC);
        }

        if (potionDuration != null) {
            potionDuration.removeModifier(HYPER_METABOLISTIC);
        }

        if (healingRecieved != null) {
            healingRecieved.removeModifier(HYPER_METABOLISTIC);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double satietyBonus = instance.isMastered(entity) ? CONFIG.satietyBonusMastered : CONFIG.satietyBonusUnmastered;
            double potionDurationBonus = instance.isMastered(entity) ? CONFIG.potionDurationBonusMastered : CONFIG.potionDurationBonusUnmastered;
            double healingRecievedBonus = instance.isMastered(entity) ? CONFIG.healingRecievedBonusMastered : CONFIG.healingRecievedBonusUnmastered;

            AttributeInstance satiety = entity.getAttribute(PerkAttributes.WHIRLIESPRIG);
            AttributeInstance potionDuration = entity.getAttribute(PerkAttributes.WIXIE);
            AttributeInstance healingRecieved = entity.getAttribute(ALObjects.Attributes.HEALING_RECEIVED);

            if (satiety != null) {
                if (!satiety.hasModifier(HYPER_METABOLISTIC)) {
                    satiety.addOrReplacePermanentModifier(new AttributeModifier(HYPER_METABOLISTIC, satietyBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (potionDuration != null) {
                if (!potionDuration.hasModifier(HYPER_METABOLISTIC)) {
                    potionDuration.addOrReplacePermanentModifier(new AttributeModifier(HYPER_METABOLISTIC, potionDurationBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }

            if (healingRecieved != null) {
                if (!healingRecieved.hasModifier(HYPER_METABOLISTIC)) {
                    healingRecieved.addOrReplacePermanentModifier(new AttributeModifier(HYPER_METABOLISTIC, healingRecievedBonus, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
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
        HYPER_METABOLISTIC = ResourceLocation.fromNamespaceAndPath("trstarlight", "hyper_metabolistic");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).hyperMetabolistic;
    }
}