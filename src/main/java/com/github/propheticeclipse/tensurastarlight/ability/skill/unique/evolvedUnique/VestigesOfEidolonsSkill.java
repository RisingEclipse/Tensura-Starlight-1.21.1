package com.github.propheticeclipse.tensurastarlight.ability.skill.unique.evolvedUnique;

import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import dev.shadowsoffire.apothic_attributes.ApothicAttributes;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import dev.shadowsoffire.placebo.color.GradientColor;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.manascore.skill.impl.SkillStorage;
import io.github.manasmods.tensura.Tensura;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;

public class VestigesOfEidolonsSkill extends Skill {

    public static final ResourceLocation VESTIGES_OF_EIDOLONS;
    public VestigesOfEidolonsSkill() {
        super(SkillType.UNIQUE);
    }

    //    # Vestiges of Eidolons
//-# Evolved Unique
//-# “What fades does not vanish. What is gone still lingers. It listens to silence, and weaves truth from what remains.”
//    Acquisition Conditions:
//    Mastered Life Returns (Sacrificed)
//    Mastered Echo Endures (Sacrificed)
//    Mastered Light Remains (Sacrificed)
//150k MP
//
//    Passives
//
//
//[Passive - True] Existence Improvement: Increase EP gain from 3% to 6%, with 3/4 going to MP and 1/4 going to AP. Additionally, you are treated as Blessed.
//[Passive - True] Magicule Observation: See through all forms of lesser concealment, costless universal perception.
//
//[Passive - True] Strike The Vestige: +20% Crit Chance and Crit Damage, and Bypass Resistances, Treating Nullifications as Resistances.
// Additionally, passively increase damage dealt to creatures with a concealment ability active by 1.5x.
//
//[Passive - Toggle] Immutable Being: Passively regenerate 25 (50 Mastered) HP, 5 (10 Mastered) SHP, and 0.25% MP/AP per second.
// Additionally, Bypass Death once per day (800s Mastered). When bypassing, recover to 10% of maximum HP and Teleport to your last spawn point.
//
//            [Passive - Toggle] Lumen Optimization: 1.5x (3x) Light and Dark Damage.
//            Stacking (Overwrites Light Remains if obtained again.)
//
//    Actives
//
//[Active - Press] Solar Echo: Speak a word of doom, in a 160° cone 15 blocks long, deal 125 (250 Mastered)
// Fire Damage and 125 (250 Mastered) Light Damage to all creatures within the cone. Inflict Silence 2, Darkness 2, and
// Fragility for 5s upon hit to any non-allied creature. Doesn’t penetrate walls. 2s CD, 8000 MP. Gains mastery for each target hit.
//
//[Active - Charge] Judgement of Past: Send out a wave of darkness in a 90° cone 15 blocks long, deal 100 (200 Mastered)
// Darkness Damage and shortly after strike targets hit with a pillar of light from above dealing 500 (750 Mastered) Light Damage.
// Doesn’t penetrate walls. 20s CD, 12000 MP. Gains 7 mastery.
    @Override
    public @Nullable MutableComponent getColoredName() {
        MutableComponent name = super.getColoredName();
        return name == null ? null : name.withStyle(s -> s.withColor(GradientColor.RAINBOW)); //Testing Colouring
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {

        boolean lightRemains = SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.LIGHT_REMAINS.get());
        boolean echoEndures = SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.ECHO_ENDURES.get());
        boolean lifeReturns = SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.LIFE_RETURNS.get());
        return lightRemains && echoEndures && lifeReturns;
    }

    @Override
    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        double auraPercent = 0.75; // 100 == 100% of EP, 1 == 1% of EP
        double manaPercent = 2.25;
        AttributeInstance aura = owner.getAttribute(TensuraAttributes.AURA_GAIN);
        if (aura != null && !aura.hasModifier(VESTIGES_OF_EIDOLONS)) {
            aura.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, auraPercent, AttributeModifier.Operation.ADD_VALUE));
        }

        AttributeInstance magicule = owner.getAttribute(TensuraAttributes.MAGICULE_GAIN);
        if (magicule != null && !magicule.hasModifier(VESTIGES_OF_EIDOLONS)) {
            magicule.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, manaPercent, AttributeModifier.Operation.ADD_VALUE));
        }
        double critRateMod = 0.1;
        double critDamMod = 0.15;
        AttributeInstance critRate = owner.getAttribute(ALObjects.Attributes.CRIT_CHANCE);
        if (critRate != null && !critRate.hasModifier(VESTIGES_OF_EIDOLONS)) {
            critRate.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, critRateMod, AttributeModifier.Operation.ADD_VALUE));
        }

        AttributeInstance critDam = owner.getAttribute(ALObjects.Attributes.CRIT_DAMAGE);
        if (critDam != null && !critDam.hasModifier(VESTIGES_OF_EIDOLONS)) {
            critDam.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, critDamMod, AttributeModifier.Operation.ADD_VALUE));
        }
        double degradeMod = 1;
        AttributeInstance degrade = owner.getAttribute(TensuraAttributes.RESISTANCE_DEGRADATION);
        if (degrade != null && !degrade.hasModifier(VESTIGES_OF_EIDOLONS)) {
            degrade.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, degradeMod, AttributeModifier.Operation.ADD_VALUE));
        }
    }

    public void onLearnSkill(ManasSkillInstance instance, LivingEntity entity) {
        IExistence existence = TensuraStorages.getExistenceFrom(entity);
        SkillStorage storage = SkillAPI.getSkillsFrom(entity);

        Skill vestiges = (Skill) StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get();
        Skill lightRemains = (Skill) StarlightUniqueSkills.LIGHT_REMAINS.get();
        Skill echoEndures = (Skill) StarlightUniqueSkills.ECHO_ENDURES.get();
        Skill lifeReturns = (Skill) StarlightUniqueSkills.LIFE_RETURNS.get();
        if (entity instanceof Player player) {
            if (SkillUtils.hasSkill(entity, StarlightUniqueSkills.LIGHT_REMAINS.get())) {
                storage.forgetSkill(StarlightUniqueSkills.LIGHT_REMAINS.get());
                player.displayClientMessage(
                        Component.translatable(
                                "trstarlight.generic.skill.single_skill.sacrifice",
                                lightRemains.getChatDisplayName(true)
                        ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                        false
                );
            }

            if (SkillUtils.hasSkill(entity, StarlightUniqueSkills.ECHO_ENDURES.get())) {
                storage.forgetSkill(StarlightUniqueSkills.ECHO_ENDURES.get());
                player.displayClientMessage(
                        Component.translatable(
                                "trstarlight.generic.skill.single_skill.sacrifice",
                                echoEndures.getChatDisplayName(true)
                        ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                        false
                );
            }

            if (SkillUtils.hasSkill(entity, StarlightUniqueSkills.LIFE_RETURNS.get())) {
                storage.forgetSkill(StarlightUniqueSkills.LIFE_RETURNS.get());
                player.displayClientMessage(
                        Component.translatable(
                                "trstarlight.generic.skill.single_skill.sacrifice",
                                lifeReturns.getChatDisplayName(true)
                        ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                        false
                );
            }

            player.displayClientMessage(
                    Component.translatable(
                            "trstarlight.generic.skill.unique.evolution",
                            lightRemains.getChatDisplayName(true)
                    ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)), //(s -> s.withColor(GradientColor.RAINBOW)
                    false
            );
            player.displayClientMessage(
                    Component.translatable(
                            "trstarlight.generic.skill.success"
                    ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                    false
            );
            player.displayClientMessage(
                    Component.translatable(
                            "trstarlight.generic.skill.unique",
                            vestiges.getChatDisplayName(true)
                    ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                    false
            );
            existence.setBlessed(true);
        } else {
            storage.forgetSkill(StarlightUniqueSkills.LIGHT_REMAINS.get());
            storage.forgetSkill(StarlightUniqueSkills.ECHO_ENDURES.get());
            storage.forgetSkill(StarlightUniqueSkills.LIFE_RETURNS.get());
        }

        double auraPercent = 0.75; // 100 == 100% of EP, 1 == 1% of EP
        double manaPercent = 2.25;
        AttributeInstance aura = entity.getAttribute(TensuraAttributes.AURA_GAIN);
        if (aura != null && !aura.hasModifier(VESTIGES_OF_EIDOLONS)) {
            aura.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, auraPercent, AttributeModifier.Operation.ADD_VALUE));
        }

        AttributeInstance magicule = entity.getAttribute(TensuraAttributes.MAGICULE_GAIN);
        if (magicule != null && !magicule.hasModifier(VESTIGES_OF_EIDOLONS)) {
            magicule.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, manaPercent, AttributeModifier.Operation.ADD_VALUE));
        }
        double critRateMod = 0.1;
        double critDamMod = 0.15;
        AttributeInstance critRate = entity.getAttribute(ALObjects.Attributes.CRIT_CHANCE);
        if (critRate != null && !critRate.hasModifier(VESTIGES_OF_EIDOLONS)) {
            critRate.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, critRateMod, AttributeModifier.Operation.ADD_VALUE));
        }

        AttributeInstance critDam = entity.getAttribute(ALObjects.Attributes.CRIT_DAMAGE);
        if (critDam != null && !critDam.hasModifier(VESTIGES_OF_EIDOLONS)) {
            critDam.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, critDamMod, AttributeModifier.Operation.ADD_VALUE));
        }
        double degradeMod = 1;
        AttributeInstance degrade = entity.getAttribute(TensuraAttributes.RESISTANCE_DEGRADATION);
        if (degrade != null && !degrade.hasModifier(VESTIGES_OF_EIDOLONS)) {
            degrade.addOrReplacePermanentModifier(new AttributeModifier(VESTIGES_OF_EIDOLONS, degradeMod, AttributeModifier.Operation.ADD_VALUE));
        }
    }

    public void onForgetSkill(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance aura = entity.getAttribute(TensuraAttributes.AURA_GAIN);
        if (aura != null) {
            aura.removeModifier(VESTIGES_OF_EIDOLONS);
        }

        AttributeInstance magicule = entity.getAttribute(TensuraAttributes.MAGICULE_GAIN);
        if (magicule != null) {
            magicule.removeModifier(VESTIGES_OF_EIDOLONS);
        }

        AttributeInstance critRate = entity.getAttribute(ALObjects.Attributes.CRIT_CHANCE);
        if (critRate != null) {
            critRate.removeModifier(VESTIGES_OF_EIDOLONS);
        }

        AttributeInstance critDam = entity.getAttribute(ALObjects.Attributes.CRIT_DAMAGE);
        if (critDam != null) {
            critDam.removeModifier(VESTIGES_OF_EIDOLONS);
        }

        AttributeInstance degrade = entity.getAttribute(TensuraAttributes.RESISTANCE_DEGRADATION);
        if (degrade != null) {
            degrade.removeModifier(VESTIGES_OF_EIDOLONS);
        }
    }

    @Override
    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return 150000;
    }

    @Override
    public int getAcquirementMastery(LivingEntity entity) {
        return 1;
    }

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        double cost;
        switch (mode) {
            case 0 -> cost = 8000.0;
            case 1 -> cost = 12000.0;
            default -> cost = 0.0;
        }

        return cost;
    }

    public int getModes(ManasSkillInstance instance) {
        return 3;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "vestiges_of_eidolons.solar_echo";
            case 1 -> var10000 = "vestiges_of_eidolons.judgement_of_past";
            case 2 -> var10000 = "vestiges_of_eidolons.death_bypass";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 1 : mode - 1;
        } else {
            return mode == 1 ? 0 : mode + 1; // (0 - 1) total is 2
        }
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    @Override
    public void onTick(ManasSkillInstance instance, LivingEntity entity) {
        // Immutable Being: Passively regenerate 50 (100 Mastered) HP, 25 (50 Mastered) SHP, and 0.25% MP/AP per second. (Toggle)
        // Magicule Observation: See through all forms of lesser concealment, costless universal perception. (Toggle)
        IExistence existence = TensuraStorages.getExistenceFrom(entity);

        float healthRegen = isMastered(instance, entity) ? 50 : 25; // Replace with Configured options later
        float spiritHealthRegen = isMastered(instance, entity) ? 10 : 5;
        double maxSHP = entity.getAttributeValue(TensuraAttributes.MAX_SPIRITUAL_HEALTH);
        double curSHP = existence.getSpiritualHealth();

        if (!SkillUtils.shouldCancelHealing(entity)) {
            if (entity.isAlive() && (entity.getHealth() < entity.getMaxHealth() || curSHP < maxSHP)) {
                entity.heal(healthRegen);
                existence.setSpiritualHealth(curSHP + spiritHealthRegen);
                addMasteryPoint(instance, entity);
            }
        }

        double maxMP = entity.getAttributeValue(TensuraAttributes.MAX_MAGICULE);
        double maxAP = entity.getAttributeValue(TensuraAttributes.MAX_AURA);
        double manaThresh = (maxMP * 1.2);
        double auraThresh = (maxAP * 1.2);

        if (manaThresh <= existence.getMagicule() || auraThresh <= existence.getAura()) {
            existence.setMagicule(existence.getMagicule() + maxMP * 0.0025);
            existence.setAura(existence.getAura() + maxAP * 0.0025);
            existence.markDirty();
        }
    }

    @Override
    public boolean onDeath(ManasSkillInstance instance, LivingEntity owner, DamageSource source) {
        int cooldown = isMastered(instance, owner) ? 800 : 1200;
        //Additionally, Bypass Death once per day (800s Mastered). When bypassing, recover to 10% of maximum HP and Teleport to your last spawn point.
        if (owner instanceof Player player) {
            double maxHP = player.getMaxHealth();
            // Place anti-resurrection skill flag here!
            if ((instance.getCoolDown(2) == 0) && instance.isToggled()) {
                player.removeAllEffects();
                player.invulnerableTime = 60;

                player.setHealth(((float) ((maxHP * 0.1) + 1)));

                StarlightUtils.TeleportToSpawnpoint(player);

                player.level().playSound((Player) null, player.getX(), player.getY(), player.getZ(), SoundEvents.CHORUS_FRUIT_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
                instance.setCoolDown(cooldown, 2);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
        // Returning true continues the event, returning false CANCELS the event.
    }

    static {
        VESTIGES_OF_EIDOLONS = ResourceLocation.fromNamespaceAndPath("trstarlight", "vestiges_of_eidolons");
    }
}
