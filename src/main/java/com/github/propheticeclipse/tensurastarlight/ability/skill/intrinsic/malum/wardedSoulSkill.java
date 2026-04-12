package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.malum;

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

public class wardedSoulSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.hyperMetabolistic CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).hyperMetabolistic;
    public static final ResourceLocation WARDED_SOUL = ResourceLocation.fromNamespaceAndPath("trstarlight", "warded_soul");

    public wardedSoulSkill() {
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

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double satietyBonus = instance.isMastered(entity) ? CONFIG.satietyBonusMastered : CONFIG.satietyBonusUnmastered;

        AttributeInstance satiety = entity.getAttribute(PerkAttributes.WHIRLIESPRIG);

        if (satiety != null) {
            if (!satiety.hasModifier(HYPER_METABOLISTIC)) {
                satiety.addOrReplacePermanentModifier(new AttributeModifier(HYPER_METABOLISTIC, satietyBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance satiety = entity.getAttribute(PerkAttributes.WHIRLIESPRIG);
        if (satiety != null) {
            satiety.removeModifier(HYPER_METABOLISTIC);
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
}