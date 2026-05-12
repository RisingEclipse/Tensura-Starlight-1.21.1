package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import com.hollingsworth.arsnouveau.setup.registry.ModEntities;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class whirlisprigGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.whirlisprigGenetics CONFIG;
    public static final ResourceLocation WHIRLISPRIG_GENETICS;

    public whirlisprigGeneticsSkill() {
        super(SkillType.INTRINSIC);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {

        boolean LightVestiges = SkillUtils.hasSkillFully(entity, StarlightUniqueSkills.LIGHT_REMAINS.get()) || SkillUtils.hasSkillFully(entity, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get());
        if (entity instanceof ServerPlayer servPlayer) {
            return LightVestiges && (servPlayer.getStats().getValue(Stats.ENTITY_KILLED.get(ModEntities.WHIRLISPRIG_TYPE.get())) >= 25);
        } else {
            return false;
        }
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double satietyBonus = instance.isMastered(entity) ? CONFIG.satietyBonusMastered : CONFIG.satietyBonusUnmastered;

        AttributeInstance satiety = entity.getAttribute(PerkAttributes.WHIRLIESPRIG);

        if (satiety != null) {
            if (!satiety.hasModifier(WHIRLISPRIG_GENETICS)) {
                satiety.addOrReplacePermanentModifier(new AttributeModifier(WHIRLISPRIG_GENETICS, satietyBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance satiety = entity.getAttribute(PerkAttributes.WHIRLIESPRIG);
        if (satiety != null) {
            satiety.removeModifier(WHIRLISPRIG_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double satietyBonus = instance.isMastered(entity) ? CONFIG.satietyBonusMastered : CONFIG.satietyBonusUnmastered;

            AttributeInstance satiety = entity.getAttribute(PerkAttributes.WHIRLIESPRIG);

            if (satiety != null) {
                if (!satiety.hasModifier(WHIRLISPRIG_GENETICS)) {
                    satiety.addOrReplacePermanentModifier(new AttributeModifier(WHIRLISPRIG_GENETICS, satietyBonus, AttributeModifier.Operation.ADD_VALUE));
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
        WHIRLISPRIG_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "whirlisprig_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).whirlisprigGenetics;
    }
}