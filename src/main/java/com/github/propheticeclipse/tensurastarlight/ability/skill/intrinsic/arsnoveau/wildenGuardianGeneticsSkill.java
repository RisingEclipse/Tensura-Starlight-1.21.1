package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau;

import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import io.github.manasmods.tensura.damage.TensuraDamageTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class wildenGuardianGeneticsSkill extends Skill {

    private static final arsnouveauSeriesSkillConfig.wildenGuardianGenetics CONFIG;
    public static final ResourceLocation WILDEN_GUARDIAN_GENETICS;

    public wildenGuardianGeneticsSkill() {
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
        double healthBonus = instance.isMastered(entity) ? CONFIG.healthBonusMastered : CONFIG.healthBonusUnmastered;

        AttributeInstance health = entity.getAttribute(Attributes.MAX_HEALTH);

        if (health != null) {
            if (!health.hasModifier(WILDEN_GUARDIAN_GENETICS)) {
                health.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_GUARDIAN_GENETICS, healthBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance health = entity.getAttribute(Attributes.MAX_HEALTH);
        if (health != null) {
            health.removeModifier(WILDEN_GUARDIAN_GENETICS);
        }
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer entity, boolean conqueredEnd) {
        if (instance.isToggled()) {
            double healthBonus = instance.isMastered(entity) ? CONFIG.healthBonusMastered : CONFIG.healthBonusUnmastered;

            AttributeInstance health = entity.getAttribute(Attributes.MAX_HEALTH);

            if (health != null) {
                if (!health.hasModifier(WILDEN_GUARDIAN_GENETICS)) {
                    health.addOrReplacePermanentModifier(new AttributeModifier(WILDEN_GUARDIAN_GENETICS, healthBonus, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        }
    }

    public boolean onTakenDamage(ManasSkillInstance instance, LivingEntity owner, DamageSource source, Changeable<Float> amount) {
        double damageReduction = isMastered(instance, owner) ? CONFIG.reflectDamageResistMastered : CONFIG.reflectDamageResistUnmastered;
        double reflectionPercent = isMastered(instance, owner) ? CONFIG.reflectPercentMastered : CONFIG.reflectPercentUnmastered;
        double originalDamage = amount.get();

        double afterResistance = originalDamage * damageReduction;
        double reflectDamage = afterResistance * reflectionPercent;
        Entity damager = source.getEntity();

        if (afterResistance >= 1 && damager instanceof LivingEntity living) {
            living.hurt(this.createSource(instance, owner, DamageTypes.INDIRECT_MAGIC, 0), (float) reflectDamage);
        }

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

    static {
        WILDEN_GUARDIAN_GENETICS = ResourceLocation.fromNamespaceAndPath("trstarlight", "wilden_guardian_genetics");
        CONFIG = ConfigRegistry.getConfig(arsnouveauSeriesSkillConfig.class).wildenGuardianGenetics;
    }
}