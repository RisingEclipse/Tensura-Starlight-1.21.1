package com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.starborn;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.starbornIntrinsicSkillConfig;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class massAccumulationSkill extends Skill {

    private static final starbornIntrinsicSkillConfig.massAccumulation CONFIG = ConfigRegistry.getConfig(starbornIntrinsicSkillConfig.class).massAccumulation;
    public static final ResourceLocation MASS_ACCUMULATION = ResourceLocation.fromNamespaceAndPath("trstarlight", "mass_accumulation");

    public massAccumulationSkill() {
        super(SkillType.INTRINSIC);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public int getMaxMastery() {
        return 2147483647;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        return false;
    }

    public int getModes(ManasSkillInstance instance) {
        return 0;
    }

    public boolean onDeath(ManasSkillInstance instance, LivingEntity owner, DamageSource source) {
        // Reduce mastery on death.
        instance.setMastery( Math.round( instance.getMastery() * 0.8 ) );
        return true;
    }

    public boolean onDamageEntity(ManasSkillInstance instance, LivingEntity owner, LivingEntity target, DamageSource source, Changeable<Float> amount) {
        // If entity is dead, add mastery.
        // Cap this mastery based on what starborn race you are.
        CompoundTag tag = instance.getOrCreateTag();

        tag.putBoolean("accumulating", true);

        if (tag.getBoolean("accumulating")) {
            System.err.println("Is the target dead or dying?");
            System.err.println(target.isDeadOrDying());
            System.err.println("Is the OWNER dead or dying?");
            System.err.println(owner.isDeadOrDying());
            if (target.isDeadOrDying()) {
                System.out.println("Is the target dead or dying?");
                System.out.println(target.isDeadOrDying());
                System.out.println("Is the OWNER dead or dying?");
                System.out.println(owner.isDeadOrDying());
            }
        }

        System.err.println("Is the target dead or dying?");
        System.err.println(target.isDeadOrDying());
        System.err.println("Is the OWNER dead or dying?");
        System.err.println(owner.isDeadOrDying());
        if (target.isDeadOrDying()) {
            System.err.println("Passed Dead Or Dying && Starborn Check!!");
            System.err.println(StarlightUtils.isStarborn(owner));
            System.err.println(target.isDeadOrDying());
            if(StarlightUtils.isLadyLuna(owner) && instance.getMastery() <= 20000) {
                instance.addMasteryPoint(owner);
                System.err.println("Mastery Added1!");
            } else

            if(StarlightUtils.isTerrestrialPlanet(owner) && instance.getMastery() < 80000) {
                instance.addMasteryPoint(owner);
                System.err.println("Mastery Added2!");
            } else

            if(StarlightUtils.isNeutronStar(owner)) {
                instance.addMasteryPoint(owner);
                System.err.println("Mastery Added3!");
            } else

            if(StarlightUtils.isBlackhole(owner)) {
                instance.addMasteryPoint(owner);
                System.err.println("Mastery Added4!");
            } else

            if(StarlightUtils.isDebrisClass(owner) && instance.getMastery() <= 10000) {
                instance.addMasteryPoint(owner);
                System.err.println("Mastery Added5!");
            } else

            if(StarlightUtils.isPlanetaryClass(owner) && instance.getMastery() <= 25000) {
                instance.addMasteryPoint(owner);
                System.err.println("Mastery Added6!");
            } else

            if(StarlightUtils.isStellarClass(owner) && instance.getMastery() <= 100000) {
                instance.addMasteryPoint(owner);
                System.err.println("Mastery Added!6");
            } else

            if(StarlightUtils.isDust(owner) && instance.getMastery() <= 10000) {
                instance.addMasteryPoint(owner);
                System.err.println("Mastery Added7!");
            }
        }

        return true;
    }

}