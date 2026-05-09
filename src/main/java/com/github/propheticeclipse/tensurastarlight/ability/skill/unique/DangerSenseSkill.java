/* package com.github.propheticeclipse.tensurastarlight.ability.skill.unique;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class DangerSenseSkill extends Skill {

    private static final CONFGFILENAME.QuirkDangerSense CONFIG = ConfigRegistry.getConfig(CONFGFILENAME.class).QuirkDangerSense;
    public static final ResourceLocation QUIRK_DANGER_SENSE = ResourceLocation.fromNamespaceAndPath("trstarlight", "quirk_danger_sense");

    public DangerSenseSkill() {
        super(SkillType.UNIQUE);
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        return false;
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {

    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {

    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {

    }

    public void onLearnSkill(ManasSkillInstance instance, LivingEntity entity) {

    }

    public void onForgetSkill(ManasSkillInstance instance, LivingEntity entity) {

    }

    public boolean onBeingTargeted(ManasSkillInstance instance, Changeable<LivingEntity> owner, LivingEntity attacker) {
        if (!isInSlot(owner.get(), instance)) {
            return true;
        } else {
            if (owner.get() instanceof ServerPlayer) {
                if (!(attacker instanceof Mob)) {
                    return true;
                } else {
                    Mob mob = (Mob)attacker;
                    if (mob.getTarget() == null || !owner.get().is(mob.getTarget())) {
                        if (owner.get().getRandom().nextBoolean()) {
                            instance.addMasteryPoint(owner.get());
                        }

                        this.sendSound((ServerPlayer) owner.get(), mob);
                    }

                    return true;
                }
            }
        }
        return true;
    }

    private void sendSound(ServerPlayer user, LivingEntity target) {
        Vec3 eyeVec = user.getEyePosition();
        Vec3 soundPos = eyeVec.add(target.getEyePosition().subtract(eyeVec).normalize().scale((double)5.0F));
        user.connection.send(new ClientboundSoundPacket(BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.BELL_BLOCK), SoundSource.HOSTILE, soundPos.x(), eyeVec.y(), soundPos.z(), 1.0F, 1.0F, user.getRandom().nextLong()));
    }

    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return isInSlot(entity, instance) || instance.isToggled();
    }

    public void onTick(ManasSkillInstance instance, LivingEntity living) {
        CompoundTag tag = instance.getOrCreateTag();
        int time = tag.getInt("activatedTimes");
        if (time % 10 == 0) {
            this.addMasteryPoint(instance, living);
        }

        tag.putInt("activatedTimes", time + 1);
    }

    //    > **Danger Sense**
//
//            "**Quirk: Danger Sense**, Detects threats with a sharp stinging pain in the head, scaling with the danger level. Great for dodging malice, though too many at once can be intense."
//
//    Obtainment
//- Become the 4th User of One For All
//    or
//- Become the 9th User of One For All and have 40% Mastery of OFA
//
//﻿
//        > **Passives**
//
//    Detect [Passive - In Slot] - Gives a 60% dodge chance and when mastered will make a 80% chance to dodge attacks.
//
//    Danger Level [Passive - Toggle] - Alarm the player should a mob lock onto them or a player hit them with a bell noise and provides though acceleration.
//
//            ﻿
//            > **Modes**
//            ﻿
//    none
}


 */