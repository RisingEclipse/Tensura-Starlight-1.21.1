package com.github.propheticeclipse.tensurastarlight.ability.skill.ultimate;

import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.mythos.aspectOfRegressionRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.mythos.mythosRace;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightEffects;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRaces;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUltimateSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import com.github.propheticeclipse.tensurastarlight.utils.ConeProjection;
import com.github.propheticeclipse.tensurastarlight.utils.StarlightUtils;
import com.mojang.datafixers.util.Pair;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import dev.shadowsoffire.placebo.color.GradientColor;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.race.api.RaceAPI;
import io.github.manasmods.manascore.race.impl.RaceStorage;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.manascore.skill.api.SkillAPI;
import io.github.manasmods.manascore.skill.impl.SkillStorage;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.ability.battlewill.utility.BattlewillArt;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.ability.skill.extra.SenseHeatSourceSkill;
import io.github.manasmods.tensura.ability.skill.extra.SenseSoundwaveSkill;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import io.github.manasmods.tensura.damage.TensuraDamageTypes;
import io.github.manasmods.tensura.data.TensuraTags;
import io.github.manasmods.tensura.effect.template.TensuraMobEffect;
import io.github.manasmods.tensura.entity.magic.beam.BeamProjectile;
import io.github.manasmods.tensura.race.RaceUtils;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.registry.battlewill.UtilityArts;
import io.github.manasmods.tensura.registry.effect.TensuraMobEffects;
import io.github.manasmods.tensura.registry.entity.MiscEntityTypes;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.registry.sound.TensuraSoundEvents;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.IExistence;
import io.github.manasmods.tensura.storage.player.TensuraPlayerStorage;
import io.github.manasmods.tensura.util.AttributeHelper;
import io.github.manasmods.tensura.util.EnergyHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import team.lodestar.lodestone.helpers.DamageTypeHelper;

import java.util.List;
import java.util.stream.StreamSupport;

public class LetheSkill extends Skill {

    private static final aspectSeriesSkillConfig.Lethe CONFIG = ConfigRegistry.getConfig(aspectSeriesSkillConfig.class).Lethe;
    public static final ResourceLocation LETHE = ResourceLocation.fromNamespaceAndPath("trstarlight", "lethe");

    public LetheSkill() {
        super(SkillType.ULTIMATE);
    }

    @Override
    public @Nullable MutableComponent getColoredName() {
        MutableComponent name = super.getColoredName();
        return name == null ? null : name.withStyle(s -> s.withColor(GradientColor.RAINBOW)); //Testing Colouring
    }

    public double getAcquiringMagiculeCost(ManasSkillInstance instance) {
        return CONFIG.acquirementCost;
    }

    public int getAcquirementMastery(LivingEntity entity) {
        return CONFIG.acquirementMastery;
    }

    public boolean checkAcquiringRequirement(Player entity, double newEP) {
        // Mastered Law Manip, Mastered and Sacrifice Vestiges and Remnants
        // Check Mythos and Aspect of Regression For details.
        if (StarlightUtils.isMythos(entity)) {
            if (SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get()) && SkillUtils.isSkillMastered(entity, StarlightUniqueSkills.REMNANTS_OF_ASCENSION.get()) && SkillUtils.isSkillMastered(entity, ExtraSkills.LAW_MANIPULATION.get())) {
                return newEP >= CONFIG.acquirementCost && CONFIG.enabled;
            }
        }
        return false;
    }

    public int getModes(ManasSkillInstance instance) {
        return 5;
    }

    public String getModeId(ManasSkillInstance instance, int mode) {
        String var10000;
        switch (mode) {
            case 0 -> var10000 = "lethe.solar_flare";
            case 1 -> var10000 = "lethe.deep_tides";
            case 2 -> var10000 = "lethe.reform_the_vestige";
            case 3 -> var10000 = "lethe.death_bypass";
            case 4 -> var10000 = "lethe.armor_buff";
            default -> var10000 = super.getModeId(instance, mode);
        }

        return var10000;
    }

    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        double cost;
        switch (mode) {
            case 0 -> cost = 5000.0;
            case 1 -> cost = 2000.0;
            case 2 -> cost = 0.0;
            case 3 -> cost = 0.0;
            case 4 -> cost = 500.0;
            default -> cost = 0.0;
        }

        return cost;
    }

    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if (reverse) {
            return mode == 0 ? 2 : mode - 1;
        } else {
            return mode == 2 ? 0 : mode + 1; // (0 - 1) total is 2
        }
    }

    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return instance.isToggled();
    }

    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    /*
    Implement These:
    Actives
    [Active - Press] Solar Flare: Release a stream of blinding flames in a line in front of you dealing 125 (250 Mastered)
    Light damage and 125 (250 Mastered) Fire damage.
    Inflicting Magic Darkness 3? to all targets hit by the flames. 2s CD, 5000 MP. Gain mastery for each target hit by this.

    [Active - Press] Deep Tides: Release a tide of water destroying all within its path. Deal 100 (200 Mastered) Dark damage
    and 100 (200 Mastered) Water damage.
    Inflict Silence 4, Fragility 4, and
    Tidal Crushing to all targets hit by the waves. 3s CD, 2000 MP per hit target.. Gain mastery.

    [Active - Press] Reform The Vestige: Increase the duration of beneficial effects by 90 (120 Mastered)s and cure negative status effects.
     Consume 5000 MP/ Minute and 500 MP/ Level cured. 30s (15s Mastered) CD.

    DEPRECATED, REPURPOSE OR DO NOT USE!!!!:

    Deal 50 (100 Mastered) + (0.5% (1.0% Mastered) + 1%) of dealt damage of max HP/SHP (Split Evenly) True Damage to targets hit, cooking HP.
    [Active - Held] Magicule Radiation: Radiate magicules in a large area around you, inflicting 50 (100 Mastered) Magicule Radiation damage to all non-ally targets within the range,
     and deal 5 (10 Mastered) Vestige damage to targets within range. Ignores CD, 2000 MP/trigger.

     [Active - Press] Fading Eidolon: All allies within 30 blocks gain Presence Concealment 3 (4 Mastered) for 1 (3 Mastered) minute(s). 120s (60s Mastered) CD, 10000 MP/ Ally affected.
     */

    public void onLearnSkill(ManasSkillInstance instance, LivingEntity entity) {
        /*
        Sacrifice Vestiges
        Sacrifice Ember

        Do some cool chat thing for the evolution?
         */
        IExistence existence = TensuraStorages.getExistenceFrom(entity);
        SkillStorage storage = SkillAPI.getSkillsFrom(entity);

        Skill vestiges = (Skill) StarlightUniqueSkills.VESTIGES_OF_EIDOLONS.get();
        Skill remnants = (Skill) StarlightUniqueSkills.REMNANTS_OF_ASCENSION.get();

        if (entity instanceof Player player) {
            if (SkillUtils.hasSkill(entity, vestiges)) {
                storage.forgetSkill(vestiges);
                player.displayClientMessage(
                        Component.translatable(
                                "trstarlight.generic.skill.single_skill.sacrifice",
                                vestiges.getChatDisplayName(true)
                        ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                        false
                );
            }

            if (SkillUtils.hasSkill(entity, remnants)) {
                storage.forgetSkill(remnants);
                player.displayClientMessage(
                        Component.translatable(
                                "trstarlight.generic.skill.single_skill.sacrifice",
                                remnants.getChatDisplayName(true)
                        ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                        false
                );
            }

            player.displayClientMessage(
                    Component.translatable(
                            "trstarlight.generic.skill.unique.evolution",
                            vestiges.getChatDisplayName(true)
                    ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)), //(s -> s.withColor(GradientColor.RAINBOW)
                    false
            );
            player.displayClientMessage(
                    Component.translatable(
                            "trstarlight.generic.skill.unique.evolution",
                            remnants.getChatDisplayName(true)
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
                            "trstarlight.generic.skill.ultimate",
                            this.getChatDisplayName(true)
                    ).withStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)),
                    false
            );
            if (!existence.isBlessed()) {
                existence.setBlessed(true);
            }
            if (!existence.isDemonLordSeed() || !existence.isTrueDemonLord()) {
                existence.setDemonLordSeed(true);
            }
            if (!existence.isHeroEgg() || !existence.isTrueHero()) {
                existence.setHeroEgg(true);
            }
        } else {
            storage.forgetSkill(vestiges);
            storage.forgetSkill(remnants);
        }
    }

    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        double presenceSenseBonus = instance.isMastered(entity) ? CONFIG.presenceSenseBonusMastered : CONFIG.presenceSenseBonusUnmastered;
        double critChanceBonus = instance.isMastered(entity) ? CONFIG.critChanceBonusMastered : CONFIG.critChanceBonusUnmastered;
        double critDamageBonus = instance.isMastered(entity) ? CONFIG.critDamageBonusMastered : CONFIG.critDamageBonusUnmastered;
        double protShredBonus = instance.isMastered(entity) ? CONFIG.protShredBonusMastered : CONFIG.protShredBonusUnmastered;
        double armorShredBonus = instance.isMastered(entity) ? CONFIG.armorShredBonusMastered : CONFIG.armorShredBonusUnmastered;
        double magiculeGainBonus = instance.isMastered(entity) ? CONFIG.magiculeGainBonusMastered : CONFIG.magiculeGainBonusUnmastered;
        double auraGainBonus = instance.isMastered(entity) ? CONFIG.auraGainBonusMastered : CONFIG.auraGainBonusUnmastered;

        double resistDegradeBonus = instance.isMastered(entity) ? CONFIG.resistDegradeBonusMastered : CONFIG.resistDegradeBonusUnmastered;

        AttributeInstance presenceSense = entity.getAttribute(TensuraAttributes.PRESENCE_SENSE);
        AttributeInstance critChance = entity.getAttribute(ALObjects.Attributes.CRIT_CHANCE);
        AttributeInstance critDamage = entity.getAttribute(ALObjects.Attributes.CRIT_DAMAGE);
        AttributeInstance protShred = entity.getAttribute(ALObjects.Attributes.PROT_SHRED);
        AttributeInstance armorShred = entity.getAttribute(ALObjects.Attributes.ARMOR_SHRED);
        AttributeInstance magiculeGain = entity.getAttribute(TensuraAttributes.MAGICULE_GAIN);
        AttributeInstance auraGain = entity.getAttribute(TensuraAttributes.AURA_GAIN);
        AttributeInstance resistDegrade = entity.getAttribute(TensuraAttributes.RESISTANCE_DEGRADATION);

        if (presenceSense != null) {
            if (!presenceSense.hasModifier(LETHE)) {
                presenceSense.addOrReplacePermanentModifier(new AttributeModifier(LETHE, presenceSenseBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (critChance != null) {
            if (!critChance.hasModifier(LETHE)) {
                critChance.addOrReplacePermanentModifier(new AttributeModifier(LETHE, critChanceBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (critDamage != null) {
            if (!critDamage.hasModifier(LETHE)) {
                critDamage.addOrReplacePermanentModifier(new AttributeModifier(LETHE, critDamageBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (protShred != null) {
            if (!protShred.hasModifier(LETHE)) {
                protShred.addOrReplacePermanentModifier(new AttributeModifier(LETHE, protShredBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (armorShred != null) {
            if (!armorShred.hasModifier(LETHE)) {
                armorShred.addOrReplacePermanentModifier(new AttributeModifier(LETHE, armorShredBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (magiculeGain != null) {
            if (!magiculeGain.hasModifier(LETHE)) {
                magiculeGain.addOrReplacePermanentModifier(new AttributeModifier(LETHE, magiculeGainBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (auraGain != null) {
            if (!auraGain.hasModifier(LETHE)) {
                auraGain.addOrReplacePermanentModifier(new AttributeModifier(LETHE, auraGainBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }
        if (resistDegrade != null) {
            if (!resistDegrade.hasModifier(LETHE)) {
                resistDegrade.addOrReplacePermanentModifier(new AttributeModifier(LETHE, resistDegradeBonus, AttributeModifier.Operation.ADD_VALUE));
            }
        }

        AttributeHelper.addPresenceSense(entity, instance.isMastered(entity) ? CONFIG.presenceSenseLevelMastered : CONFIG.presenceSenseLevelUnmastered);
        AttributeHelper.addPermanentAttributeIfHigher(entity, TensuraAttributes.PRESENCE_SENSE_RADIUS, SenseHeatSourceSkill.HEAT_SENSE, instance.isMastered(entity) ? CONFIG.heatSenseRadiusMastered : CONFIG.heatSenseRadiusUnmastered, AttributeModifier.Operation.ADD_VALUE);
        AttributeHelper.addPermanentAttributeIfHigher(entity, TensuraAttributes.PRESENCE_SENSE_RADIUS, SenseSoundwaveSkill.SOUND_SENSE, instance.isMastered(entity) ? CONFIG.soundSenseRadiusMastered : CONFIG.soundSenseRadiusUnmastered, AttributeModifier.Operation.ADD_VALUE);
    }

    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        AttributeInstance presenceSense = entity.getAttribute(TensuraAttributes.PRESENCE_SENSE);
        AttributeInstance critChance = entity.getAttribute(ALObjects.Attributes.CRIT_CHANCE);
        AttributeInstance critDamage = entity.getAttribute(ALObjects.Attributes.CRIT_DAMAGE);
        AttributeInstance protShred = entity.getAttribute(ALObjects.Attributes.PROT_SHRED);
        AttributeInstance armorShred = entity.getAttribute(ALObjects.Attributes.ARMOR_SHRED);
        AttributeInstance magiculeGain = entity.getAttribute(TensuraAttributes.MAGICULE_GAIN);
        AttributeInstance auraGain = entity.getAttribute(TensuraAttributes.AURA_GAIN);
        AttributeInstance resistDegrade = entity.getAttribute(TensuraAttributes.RESISTANCE_DEGRADATION);

        if (presenceSense != null) {
            presenceSense.removeModifier(LETHE);
        }
        if (critChance != null) {
            critChance.removeModifier(LETHE);
        }
        if (critDamage != null) {
            critDamage.removeModifier(LETHE);
        }
        if (protShred != null) {
            protShred.removeModifier(LETHE);
        }
        if (armorShred != null) {
            armorShred.removeModifier(LETHE);
        }
        if (magiculeGain != null) {
            magiculeGain.removeModifier(LETHE);
        }
        if (auraGain != null) {
            auraGain.removeModifier(LETHE);
        }
        if (resistDegrade != null) {
            resistDegrade.removeModifier(LETHE);
        }

        AttributeHelper.removePresenceSense(entity, instance.isMastered(entity) ? CONFIG.presenceSenseLevelMastered : CONFIG.presenceSenseLevelUnmastered);
        AttributeHelper.removeAttributeIfCorrect(entity, TensuraAttributes.PRESENCE_SENSE_RADIUS, SenseHeatSourceSkill.HEAT_SENSE, instance.isMastered(entity) ? CONFIG.heatSenseRadiusMastered : CONFIG.heatSenseRadiusUnmastered);
        AttributeHelper.removeAttributeIfCorrect(entity, TensuraAttributes.PRESENCE_SENSE_RADIUS, SenseSoundwaveSkill.SOUND_SENSE, instance.isMastered(entity) ? CONFIG.soundSenseRadiusMastered : CONFIG.soundSenseRadiusUnmastered);
    }

    public void onRespawn(ManasSkillInstance instance, ServerPlayer owner, boolean conqueredEnd) {
        if (instance.isToggled()) {
            this.onToggleOn(instance, owner);
        } else {
            this.onToggleOff(instance, owner);
        }
    }

    public void onSkillMastered(ManasSkillInstance instance, LivingEntity entity) {
        IExistence existence = TensuraStorages.getExistenceFrom(entity);
        if (instance.isToggled()) {
            this.onToggleOff(instance, entity);
            this.onToggleOn(instance, entity);
        } else {
            this.onToggleOff(instance, entity);
        }

        existence.setName("Lethe, Eternal Phantasm");
    }

    public void onTick(ManasSkillInstance instance, LivingEntity entity) {
        // Apply Existence Regeneration to self :)
        if (instance.isToggled()) {
            if (!entity.hasEffect(StarlightEffects.EXISTENCE_REGENERATION)) {
                StarlightUtils.applyTensuraEffect(instance, entity, StarlightEffects.EXISTENCE_REGENERATION, -1, CONFIG.existenceRegenAmpMastered, CONFIG.existenceRegenAmpUnmastered);
            }
            if (!entity.hasEffect(StarlightEffects.HEALTH_REGEN)) {
                StarlightUtils.applyTensuraEffect(instance, entity, StarlightEffects.HEALTH_REGEN, -1, CONFIG.healthRegenAmpMastered, CONFIG.healthRegenAmpUnmastered);
            }
            if (!entity.hasEffect(StarlightEffects.SPIRITUAL_REGEN)) {
                StarlightUtils.applyTensuraEffect(instance, entity, StarlightEffects.SPIRITUAL_REGEN, -1, CONFIG.spiritualHealthRegenAmpMastered, CONFIG.spiritualHealthRegenAmpUnmastered);
            }
        }
    }

    public boolean onTakenDamage(ManasSkillInstance instance, LivingEntity owner, DamageSource source, Changeable<Float> amount) {
        /*After taking damage, temporarily increase armour by 10 and armour toughness by 2, up to 100/20 points respectively with repeated damage.
        Effects will fade over time. Additionally, for every 10 points of armour gained by this effect,
        negate 5 (10 Mastered) damage from any incoming damage. Consumes 500 MP per level of buff added.*/

        /*
        Armor Rate: 10 Armor : 2 Toughness
        Cap: Level 10 (Amp 9)
         */

        double originalDamageNum = amount.get();
        MobEffectInstance buff = owner.getEffect(TensuraMobEffects.getReference(StarlightEffects.REMNANT_ASCENSION_ARMOR));

        if (originalDamageNum >= CONFIG.shiftingFormDamageTrigger) {
            int i = 0;
            int originalDuration = CONFIG.shiftingFormDurationFirstHit;
            int duration;
            if (buff != null) {
                duration = buff.getDuration() + CONFIG.shiftingFormDurationConsecutiveHit;
                i = (duration - originalDuration) / (CONFIG.shiftingFormAmpliDurationScaling);
                addMasteryPoint(instance, owner);
            } else {
                duration = originalDuration;
            }
            if (i > CONFIG.shiftingFormBuffMaxAmplifier) {
                i = CONFIG.shiftingFormBuffMaxAmplifier;
            }

            if (EnergyHelper.isOutOfEnergy(owner, instance, 4, i)) {
                // This should prevent the skill from adding the effect if you are out of the magicules to apply the amplifier level.
                return true;
            }

            owner.addEffect(new MobEffectInstance((TensuraMobEffects.getReference(StarlightEffects.REMNANT_ASCENSION_ARMOR)), duration, i, false, false, false));

            if (buff != null) {
                int effectLevel = (buff.getAmplifier() + 1);
                double damageModifier = isMastered(instance, owner) ? CONFIG.damageNegationMastered : CONFIG.damageNegationUnmastered;
                double totalReduction = damageModifier * effectLevel;


                amount.set((float) (originalDamageNum - totalReduction));
            }
        }

        // Resist 20% of All Magic, and Elemental damage, up to a limit of 1000 (1500 Mastered) points.
        // Resisted damage is rerouted into barriers. Adapt to new limits

        double damageModifier = CONFIG.elementalDamageResistanceMod;
        double reducedDamageTotal = (originalDamageNum * damageModifier);
        double damageDifference = (originalDamageNum - reducedDamageTotal);
        int damageNegation = isMastered(instance, owner) ? CONFIG.elementalDamageNegationCapMastered : CONFIG.elementalDamageNegationCapUnmastered;
        if (TensuraDamageHelper.isTensuraMagic(source) || TensuraDamageHelper.isNaturalEffects(source)) {
            if (instance.isToggled()) {
                if (damageDifference >= damageNegation) {
                    double currentBarrier = owner.getAttributeValue(TensuraAttributes.MULTILAYER_BARRIER);
                    AttributeHelper.addPermanentAttributeIfHigher(owner, TensuraAttributes.MULTILAYER_BARRIER, LETHE, (currentBarrier + damageNegation) * CONFIG.elementalResistanceBarrierMulti, AttributeModifier.Operation.ADD_VALUE);

                    amount.set((float) (originalDamageNum - damageNegation));
                }

                if (damageDifference <= damageNegation) {
                    double currentBarrier = owner.getAttributeValue(TensuraAttributes.MULTILAYER_BARRIER);
                    AttributeHelper.addPermanentAttributeIfHigher(owner, TensuraAttributes.MULTILAYER_BARRIER, LETHE, (currentBarrier + damageDifference) * CONFIG.elementalResistanceBarrierMulti, AttributeModifier.Operation.ADD_VALUE);

                    amount.set((float) reducedDamageTotal);
                }
            }
        }

        return true;
    }

    public boolean onDeath(ManasSkillInstance instance, LivingEntity owner, DamageSource source) {
        if (owner instanceof Player player) {
            IExistence existence = TensuraStorages.getExistenceFrom(player);
            double maxSHP = player.getAttributeValue(TensuraAttributes.MAX_SPIRITUAL_HEALTH);
            double maxHP = player.getMaxHealth();
            // Place anti-resurrection skill flag here!
            if ((instance.getCoolDown(3) == 0) && instance.isToggled()) {
                player.removeAllEffects();
                player.invulnerableTime = 60;

                player.setHealth(((float) ((maxHP * CONFIG.deathBypassHealthReturn) + 1)));
                if (maxSHP <= (existence.getSpiritualHealth() * CONFIG.deathBypassSpiritualHealthReturnThresh)) {
                    existence.setSpiritualHealth((maxSHP * CONFIG.deathBypassSpiritualHealthReturn) + 1);
                }

                applyEffects(owner);

                instance.setCoolDown(CONFIG.deathBypassCooldown, 3);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    private void applyEffects(LivingEntity owner) {
        if (owner instanceof Player player) {
            MobEffectInstance resistance = new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, CONFIG.deathBypassResistanceDuration, CONFIG.deathBypassResistanceAmplifier, false, false, false);
            player.addEffect(resistance);
        }
    }

    public boolean onDamageEntity(ManasSkillInstance instance, LivingEntity owner, LivingEntity target, DamageSource source, Changeable<Float> amount) {
        if (instance.isToggled()) {
            double concealedMod = isMastered(instance, owner) ? CONFIG.concealedTargetDamageModMastered : CONFIG.concealedTargetDamageModUnmastered;
            double LDWFWDamageBonus = isMastered(instance, owner) ? CONFIG.LDFWModMastered : CONFIG.LDFWModUnmastered;
            double otherElementDamageBonus = isMastered(instance, owner) ? CONFIG.otherElementalModMastered : CONFIG.otherElementalModUnmastered;
            double targetConceal = target.getAttributeValue(TensuraAttributes.PRESENCE_CONCEALMENT);

            if (TensuraDamageHelper.isLightDamage(source) || TensuraDamageHelper.isDarkDamage(source) || TensuraDamageHelper.isFireDamage(source) || TensuraDamageHelper.isWaterDamage(source)) {
                Float initDamage = amount.get();
                if (initDamage != null) {
                    amount.set((float) (initDamage * LDWFWDamageBonus));
                }
            } else if (TensuraDamageHelper.isNaturalEffects(source) || TensuraDamageHelper.isTensuraMagic(source)) {
                Float initDamage = amount.get();
                if (initDamage != null) {
                    amount.set((float) (initDamage * otherElementDamageBonus));
                }
            }
            if (targetConceal > 0) {
                Float initDamage = amount.get();
                double concealMath = (targetConceal * concealedMod);
                if (initDamage != null) {
                    amount.set((float) (initDamage * (1 + concealMath)));
                }
            }

            MobEffectInstance emberBuff = owner.getEffect(TensuraMobEffects.getReference(StarlightEffects.EMBER_ATTACK_IMPROVEMENT));
            int i = 0;
            int originalDuration = CONFIG.combatFlowDurationFirstHit;
            int duration;
            if (emberBuff != null) {
                duration = emberBuff.getDuration() + CONFIG.combatFlowDurationConsecutiveHit;
                i = (duration - originalDuration) / (CONFIG.combatFlowAmpliDurationScaling);
            } else {
                duration = originalDuration;
            }
            if (i > CONFIG.combatFlowMaxAmplifier) {
                i = CONFIG.combatFlowMaxAmplifier;
            }

            owner.addEffect(new MobEffectInstance((TensuraMobEffects.getReference(StarlightEffects.EMBER_ATTACK_IMPROVEMENT)), duration, i, false, false, false));
        }

        return true;
    }

    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {
        if (mode == 0) {
            /*
            [Active - Press] Solar Flare: Release a stream of blinding flames in a line in front of you dealing 125 (250 Mastered)
            Light damage and 125 (250 Mastered) Fire damage.
            Inflicting Magic Darkness 3? to all targets hit by the flames. 2s CD, 5000 MP. Gain mastery for each target hit by this.
             */

            if (entity instanceof Player player) {
                List<LivingEntity> targets = ConeProjection.getTargetsInFront(player, 32.0, 2.0, 2.0, 2.0, 2.0);

                double damage = instance.isMastered(entity) ? CONFIG.solarFlareDamageMastered : CONFIG.solarFlareDamageUnmastered;
                int cooldown = instance.isMastered(entity) ? CONFIG.solarFlareCDMastered : CONFIG.solarFlareCDUnmastered;
                int darknessDuration = instance.isMastered(entity) ? CONFIG.darknessDurationMastered : CONFIG.darknessDurationUnmastered;
                int darknessAmplifier = instance.isMastered(entity) ? CONFIG.darknessAmplifierMastered : CONFIG.darknessAmplifierUnmastered;

                for (LivingEntity target : targets) {
                    if (target != null) {
                        TensuraDamageHelper.hurtSplit(
                                target,
                                (this.createSource(instance, entity, TensuraDamageTypes.LIGHT_ELEMENTAL, mode)),
                                0.5F,
                                (this.createSource(instance, entity, TensuraDamageTypes.FIRE_ELEMENTAL, mode)),
                                (float) damage
                        );

                        target.addEffect(new MobEffectInstance(MobEffects.DARKNESS, darknessDuration, darknessAmplifier));
                        StarlightUtils.applyTensuraEffect(instance, target, TensuraMobEffects.INSANITY, CONFIG.insanityDurationMastered, CONFIG.insanityDurationUnmastered,CONFIG.insanityAmplifierMastered, CONFIG.insanityAmplifierUnmastered);
                    }
                }

                instance.setCoolDown(cooldown, 0);
            }
        } else if (mode == 1) {
            /*
            [Active - Press] Deep Tides: Release a tide of water destroying all within its path. Deal 100 (200 Mastered) Dark damage
            and 100 (200 Mastered) Water damage.
            Inflict Silence 4, Fragility 4, and
            Tidal Crushing to all targets hit by the waves. 3s CD, 2000 MP per hit target.. Gain mastery.
             */
            Level level = entity.level();
            double coneAngleDeg = CONFIG.deepTidesConeAngle; // 60 degrees cone
            double range = CONFIG.deepTidesConeLength;
            double damage = this.isMastered(instance, entity) ? CONFIG.deepTidesDamageMastered : CONFIG.deepTidesDamageUnmastered; // M:UM // 37.5% : 30%

            List<LivingEntity> targets = level.getEntitiesOfClass(LivingEntity.class,
                    entity.getBoundingBox().inflate(range),
                    e -> e != entity && entity.hasLineOfSight(e) && ConeProjection.isInFrontCone(entity, e, coneAngleDeg, range));

            int targetHitCount = 0;

            for (LivingEntity target : targets) {
                if (target != null) {
                    // Replace with split damage
                    TensuraDamageHelper.hurtSplit(
                            target,
                            (this.createSource(instance, entity, TensuraDamageTypes.WATER_ELEMENTAL, mode)),
                            0.5F,
                            (this.createSource(instance, entity, TensuraDamageTypes.DARKNESS_ELEMENTAL, mode)),
                            (float) damage
                    );

                    StarlightUtils.applyTensuraEffect(instance, target, TensuraMobEffects.SILENCE, CONFIG.deepTidesSilenceDurationMastered, CONFIG.deepTidesSilenceDurationUnmastered, CONFIG.deepTidesSilenceAmplifierMastered, CONFIG.deepTidesSilenceAmplifierUnmastered);
                    StarlightUtils.applyTensuraEffect(instance, target, TensuraMobEffects.FRAGILITY, CONFIG.deepTidesFragilityDurationMastered, CONFIG.deepTidesFragilityDurationUnmastered, CONFIG.deepTidesFragilityAmplifierMastered, CONFIG.deepTidesFragilityAmplifierUnmastered);
                    targetHitCount++;
                }
            }
            this.addMasteryPoint(instance, entity, targetHitCount);
            this.addMasteryPoint(instance, entity);
            instance.setCoolDown(CONFIG.deepTidesCooldown, 1);
        } else if (mode == 2) {
            if (entity instanceof Player player) {
                IExistence existence = TensuraStorages.getExistenceFrom(player);
                int effectsRemoved = 0;
                int totalDurationExtended = 0;

                int cooldown = instance.isMastered(entity) ? CONFIG.reformCooldownMastered : CONFIG.reformCooldownUnmastered;
                int durationBonus = instance.isMastered(entity) ? CONFIG.reformVestigeDurationBonusMastered : CONFIG.reformVestigeDurationBonusUnmastered;

                for (MobEffectInstance effect : StarlightUtils.getFilteredEffects(player, CONFIG.reformEffectBlacklist, CONFIG.reformEffectWhitelist)) {
                    if (effect.getEffect().value().getCategory() == MobEffectCategory.BENEFICIAL) {
                        int newDuration = effect.getDuration() + durationBonus; // +60s
                        MobEffectInstance extended = new MobEffectInstance(effect.getEffect(), newDuration, effect.getAmplifier(), effect.isAmbient(), effect.isVisible(), effect.showIcon());
                        player.addEffect(extended);
                        totalDurationExtended += 1;
                    }
                    if (effect.getEffect().value().getCategory() == MobEffectCategory.HARMFUL) {
                        int levels = (effect.getAmplifier() + 1);
                        player.removeEffect(effect.getEffect());
                        effectsRemoved += levels;
                    }
                }
                double extensionCost = CONFIG.buffExtensionCostMP;
                double removalCost = CONFIG.debuffLevelDecreaseCostMP;
                double mpRemovalCost = (effectsRemoved * removalCost);
                double mpExtensionCost = (totalDurationExtended * extensionCost);
                double currentMP = existence.getMagicule();

                existence.setMagicule(currentMP - (mpRemovalCost + mpExtensionCost));
                addMasteryPoint(instance, entity);
                instance.setCoolDown(cooldown, 2);
            }
        }

    }
}