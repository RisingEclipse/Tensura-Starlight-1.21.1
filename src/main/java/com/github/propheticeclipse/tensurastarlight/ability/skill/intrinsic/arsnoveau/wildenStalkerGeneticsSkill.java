package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
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

public class wildenStalkerGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.wildenStalkerGenetics CONFIG;
    public static final ResourceLocation WILDEN_STALKER_GENETICS;

    public wildenStalkerGeneticsSkill() {
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
        double sneakSpeedBonus = instance.isMastered(entity) ? CONFIG.sneakSpeedBonusMastered : CONFIG.sneakSpeedBonusUnmastered;
        double gravityBonus = instance.isMastered(entity) ? CONFIG.gravityBonusMastered : CONFIG.gravityBonusUnmastered;

        AttributeInstance sneakSpeed = entity.getAttribute(Attributes.SNEAKING_SPEED);
        AttributeInstance gravity = entity.getAttribute(Attributes.GRAVITY);

        if (sneakSpeed != null) {
            if (!sneakSpeed.hasModifier(WILDEN_STALKER_GENETICS)) {
                sneakSpeed.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_STALKER_GENETICS, sneakSpeedBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        if (gravity != null) {
            if (!gravity.hasModifier(WILDEN_STALKER_GENETICS)) {
                gravity.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_STALKER_GENETICS, gravityBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance sneakSpeed = entity.getAttribute(Attributes.SNEAKING_SPEED);
        AttributeInstance gravity = entity.getAttribute(Attributes.GRAVITY);

        if (sneakSpeed != null) {
            sneakSpeed.removeModifier(WILDEN_STALKER_GENETICS);
        }

        if (gravity != null) {
            gravity.removeModifier(WILDEN_STALKER_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {

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
        WILDEN_STALKER_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "wilden_stalker_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).wildenStalkerGenetics;
    }
}