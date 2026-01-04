package com.github.propheticeclipse.tensurastarlight.ability.skill;

import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.EntityEvents;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ProjectileDeflection;
import net.minecraft.world.phys.EntityHitResult;

public class SkillTemplateSkill extends Skill {
    public SkillTemplateSkill() {
        super(SkillType.UNIQUE);
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        return newEP > 0;
    }

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        return 0;
    }

    public int getModes(ManasSkillInstance instance) {
        return 3;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "THIS IS A LANG TRANSLATEABLE";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 2 : mode - 1;
        } else {
            return mode == 2 ? 0 : mode + 1; // (0 - 2 is total 3)
        }
    }

    @Override
    public void onTick(ManasSkillInstance instance, LivingEntity living) {
        super.onTick(instance, living);
    }

    @Override
    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        super.onToggleOn(instance, entity);
    }

    @Override
    public boolean onDamageEntity(ManasSkillInstance instance, LivingEntity owner, LivingEntity target, DamageSource source, Changeable<Float> amount) {
        return super.onDamageEntity(instance, owner, target, source, amount);
    }

    @Override
    public void onLearnSkill(ManasSkillInstance instance, LivingEntity entity) {
        super.onLearnSkill(instance, entity);
    }

    @Override
    public void onProjectileHit(ManasSkillInstance instance, LivingEntity living, EntityHitResult hitResult, Projectile projectile, Changeable<ProjectileDeflection> deflection, Changeable<EntityEvents.ProjectileHitResult> result) {
        super.onProjectileHit(instance, living, hitResult, projectile, deflection, result);
    }

    @Override
    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        super.onRespawn(instance, owner, conqueredEnd);
    }

    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {

    }
}
