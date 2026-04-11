package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.alexthw.sauce.registry.ModRegistry;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class drygmyGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.drygmyGenetics CONFIG;
    public static final ResourceLocation DRYGMY_GENETICS;

    public drygmyGeneticsSkill() {
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

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        int lootingBonus = instance.isMastered(entity) ? CONFIG.lootingBonusMastered : CONFIG.lootingBonusUnmastered;
        double earthPowerBonus = instance.isMastered(entity) ? CONFIG.earthPowerBonusMastered : CONFIG.earthPowerBonusUnmastered;
        double luckBonus = instance.isMastered(entity) ? CONFIG.luckBonusMastered : CONFIG.luckBonusUnmastered;
        AttributeInstance looting = entity.getAttribute(PerkAttributes.DRYGMY);
        AttributeInstance earthPower = entity.getAttribute(ModRegistry.EARTH_POWER);
        AttributeInstance luck = entity.getAttribute(Attributes.LUCK);
        if (looting != null) {
            if (!looting.hasModifier(DRYGMY_GENETICS)) {
                looting.addOrReplacePermanentModifier(new AttributeModifier(DRYGMY_GENETICS, lootingBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (earthPower != null) {
            if (!earthPower.hasModifier(DRYGMY_GENETICS)) {
                earthPower.addOrReplacePermanentModifier(new AttributeModifier(DRYGMY_GENETICS, earthPowerBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (luck != null) {
            if (!luck.hasModifier(DRYGMY_GENETICS)) {
                luck.addOrReplacePermanentModifier(new AttributeModifier(DRYGMY_GENETICS, luckBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance looting = entity.getAttribute(PerkAttributes.DRYGMY);
        AttributeInstance earthPower = entity.getAttribute(ModRegistry.EARTH_POWER);
        AttributeInstance luck = entity.getAttribute(Attributes.LUCK);
        if (looting != null) {
            looting.removeModifier(DRYGMY_GENETICS);
        }
        if (earthPower != null) {
            earthPower.removeModifier(DRYGMY_GENETICS);
        }
        if (luck != null) {
            luck.removeModifier(DRYGMY_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        if (instance.isToggled()) {
            int lootingBonus = instance.isMastered(owner) ? CONFIG.lootingBonusMastered : CONFIG.lootingBonusUnmastered;
            double earthPowerBonus = instance.isMastered(owner) ? CONFIG.earthPowerBonusMastered : CONFIG.earthPowerBonusUnmastered;
            double luckBonus = instance.isMastered(owner) ? CONFIG.luckBonusMastered : CONFIG.luckBonusUnmastered;
            AttributeInstance looting = owner.getAttribute(PerkAttributes.DRYGMY);
            AttributeInstance earthPower = owner.getAttribute(ModRegistry.EARTH_POWER);
            AttributeInstance luck = owner.getAttribute(Attributes.LUCK);
            if (looting != null) {
                if (!looting.hasModifier(DRYGMY_GENETICS)) {
                    looting.addOrReplacePermanentModifier(new AttributeModifier(DRYGMY_GENETICS, lootingBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
            if (earthPower != null) {
                if (!earthPower.hasModifier(DRYGMY_GENETICS)) {
                    earthPower.addOrReplacePermanentModifier(new AttributeModifier(DRYGMY_GENETICS, earthPowerBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
            if (luck != null) {
                if (!luck.hasModifier(DRYGMY_GENETICS)) {
                    luck.addOrReplacePermanentModifier(new AttributeModifier(DRYGMY_GENETICS, luckBonus, AttributeModifier.Operation.ADD_VALUE));
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
        DRYGMY_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "drygmy_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).drygmyGenetics;
    }
}