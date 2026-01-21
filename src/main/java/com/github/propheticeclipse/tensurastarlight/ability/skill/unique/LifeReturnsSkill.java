package com.github.propheticeclipse.tensurastarlight.ability.skill.unique;

import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.registry.effect.TensuraMobEffects;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class LifeReturnsSkill extends Skill {
    public LifeReturnsSkill() {
        super(SkillType.UNIQUE);
    }

    // Acquisition Conditions:
    //Have Light Remains (Mastered)
    //Have Magicule Poisoning, or >= 200k ep, or Die 10 times.
    //100k MP, or Reincarnation
    //
    //Passives
    //
    //[Passive - Toggle]: Passively regenerate 5 (10 Mastered) HP and SHP per second. This consumes no MP. Gains Mastery
    //
    //[Passive - Toggle]: Bypass death once per day, teleporting back to your spawnpoint, and set your HP to 1% + 1. Additionally, clear all current effects on self.

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        //magicule poisoning (OR, have above a certain amount of collective EP, OR die a certain amount of times), Light Remains
        int deathCount = 0;
        if (entity instanceof ServerPlayer serverPlayer) {
            deathCount = serverPlayer.getStats().getValue(Stats.CUSTOM.get(Stats.DEATHS));
        } else {
            deathCount = 0;
        }
        boolean magiculePoisoningEffect = entity.hasEffect(TensuraMobEffects.MAGICULE_POISON);
        boolean overEPTrigger = newEP >= (2 * 100000); // When adding configs replace with magicule cost
        boolean deathComparison = (deathCount >= 10);
        return (magiculePoisoningEffect || overEPTrigger || deathComparison) && SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.LIGHT_REMAINS.get());
    }

    @Override
    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return 75000;
    }

    @Override
    public int getAcquirementMastery(LivingEntity entity) {
        return 1;
    }

    @Override
    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return instance.isToggled();
    }

    @Override
    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        return instance.isMastered(entity) ? 50 : 100;
    }

    @Override
    public void onTick(ManasSkillInstance instance, LivingEntity entity) {
        IExistence existence = TensuraStorages.getExistenceFrom(entity);

        float healthRegen = isMastered(instance, entity) ? 10 : 5; // Replace with Configured options later
        float spiritHealthRegen = isMastered(instance, entity) ? 2 : 1;
        double maxSHP = entity.getAttributeValue(TensuraAttributes.MAX_SPIRITUAL_HEALTH);
        double curSHP = existence.getSpiritualHealth();

        if (EnergyHelper.isOutOfEnergy(entity, instance, 0, 1)) {
            entity.sendSystemMessage(Component.translatable("tensura.skill.lack_magicule.toggled_off", new Object[]{instance.getChatDisplayName(true)}).setStyle(Style.EMPTY.withColor(ChatFormatting.RED)));
            instance.setToggled(false);
            instance.onToggleOff(entity);
            instance.markDirty();
            return;
        }

        if (!SkillUtils.shouldCancelHealing(entity) && instance.getCoolDown(0) <= 1000) {
            if (entity.isAlive() && (entity.getHealth() < entity.getMaxHealth() || curSHP < maxSHP)) {
                entity.heal(healthRegen);
                existence.setSpiritualHealth(curSHP + spiritHealthRegen);
                addMasteryPoint(instance, entity);
            }
        }

    }

    @Override
    public boolean onDeath(ManasSkillInstance instance, LivingEntity owner, DamageSource source) {

        if (owner instanceof Player player) {
            double maxHP = player.getMaxHealth();
            // Place anti-resurrection skill flag here!
            if ((instance.getCoolDown(0) == 0) && instance.isToggled()) {
                player.removeAllEffects();
                player.invulnerableTime = 60;

                player.setHealth(((float) ((maxHP * 0.01) + 1)));

                StarlightUtils.TeleportToSpawnpoint(player);

                player.level().playSound((Player) null, player.getX(), player.getY(), player.getZ(), SoundEvents.CHORUS_FRUIT_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
                instance.setCoolDown(1200, 0);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
        // Returning true continues the event, returning false CANCELS the event.
    }
}
