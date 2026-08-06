package com.github.propheticeclipse.tensurastarlight.config.races;

import com.github.propheticeclipse.tensurastarlight.config.StarlightCommon;
import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;

import java.util.List;

public class starbornRaceConfig extends ManasConfig {
    public smallMolecularCloud smallMolecularCloud = new smallMolecularCloud();
    public largeMolecularCloud largeMolecularCloud = new largeMolecularCloud();
    public stardust stardust = new stardust();

    public smallMeteoroid smallMeteoroid = new smallMeteoroid();
    public largeMeteoroid largeMeteoroid = new largeMeteoroid();
    public smallComet smallComet = new smallComet();
    public largeComet largeComet = new largeComet();
    public smallAsteroid smallAsteroid = new smallAsteroid();
    public largeAsteroid largeAsteroid = new largeAsteroid();
    public smallMoon smallMoon = new smallMoon();
    public moon moon = new moon();
    public ladyLuna ladyLuna = new ladyLuna();
    public largeMoon largeMoon = new largeMoon();

    public dwarfPlanet dwarfPlanet = new dwarfPlanet();
    public smallPlanet smallPlanet = new smallPlanet();
    public planetaryBody planetaryBody = new planetaryBody();
    public terrestrialPlanet terrestrialPlanet = new terrestrialPlanet();
    public terra terra = new terra();
    public superTerra superTerra = new superTerra();
    public megaTerra megaTerra = new megaTerra();
    public largePlanet largePlanet = new largePlanet();
    public gasGiant gasGiant = new gasGiant();

    public dwarfStar dwarfStar = new dwarfStar();
    public smallStar smallStar = new smallStar();
    public star star = new star();
    public largeStar largeStar = new largeStar();
    public subGiantStar subGiantStar = new subGiantStar();

    public giantStar giantStar = new giantStar();
    public superGiantStar superGiantStar = new superGiantStar();
    public hyperGiantStar hyperGiantStar = new hyperGiantStar();

    public neutronStar neutronStar = new neutronStar();

    public microBlackhole microBlackhole = new microBlackhole();
    public stellarBlackhole stellarBlackhole = new stellarBlackhole();
    public intermediateBlackhole intermediateBlackhole = new intermediateBlackhole();
    public supermassiveBlackhole supermassiveBlackhole = new supermassiveBlackhole();
    public ultramassiveBlackhole ultramassiveBlackhole = new ultramassiveBlackhole();

    public String getFileName() {
        return "tensura/tensura-starlight/races/starborn";
    }

    public static class smallMolecularCloud extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of("trstarlight:mass_accumulation");
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.9;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = -10.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = -36.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class largeMolecularCloud extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.85;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 0.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = -13.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class stardust extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of("tensura:gravity_manipulation");

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.8;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 20.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 34.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }

    public static class smallMeteoroid extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of("tensura:gravity_manipulation");

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.7;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 100.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 222.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class largeMeteoroid extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.6;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 150.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 339.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }

    public static class smallComet extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.5;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 235.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 539.3F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class largeComet extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.4;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 350.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 809.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }

    public static class smallAsteroid extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.3;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 500.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1162.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class largeAsteroid extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.2;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 690.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1608.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    
    public static class smallMoon extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.1;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 930.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 2172.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class moon extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.0;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1230.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 2877.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class ladyLuna extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.1;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1580.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 3700.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class largeMoon extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.1;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1580.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 3700.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }

    public static class dwarfPlanet extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.3;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 180.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 410.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class smallPlanet extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.5;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 255.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 586.3F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class planetaryBody extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.7;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 380.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 880.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class terrestrialPlanet extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.7;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 580.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1350.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class terra extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.7;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 830.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1937.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class superTerra extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.7;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1180.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 2760.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class megaTerra extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.7;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1580.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 3700.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class largePlanet extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.9;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 730.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1702.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class gasGiant extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 1.1;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1580.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 3700.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }

    public static class dwarfStar extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 1.4;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 220.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 504.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class smallStar extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 1.7;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 320.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 739.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class star extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 2.0;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 480.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1115.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 2.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class largeStar extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 2.3;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 610.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1420.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 3.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class subGiantStar extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 2.6;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 730.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1702.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 3.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }

    public static class giantStar extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 2.9;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1055.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 2466.3F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 3.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class superGiantStar extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 3.2;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1480.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 3465.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 4.5;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class hyperGiantStar extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 3.5;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1980.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 4640.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 4.5;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }

    public static class neutronStar extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.6;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1980.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 4640.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }

    public static class microBlackhole extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.9;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 610.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1420.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class stellarBlackhole extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = -0.2;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 730.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 1702.5F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class intermediateBlackhole extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 0.7;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1055.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 2466.3F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 0.0;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class supermassiveBlackhole extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 2.0;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 1480.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 3465.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 4.5;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
    public static class ultramassiveBlackhole extends StarlightCommon.RaceDefault {
        @Comment("What should the minimum Aura (AP) of this race be?")
        public double minAura = 2500.0F;
        @Comment("What should the maximum Aura (AP) of this race be?")
        public double maxAura = 2500.0F;
        @Comment("What should the minimum Mana (MP) of this race be?")
        public double minMagicule = 500.0F;
        @Comment("What should the maximum Mana (MP) of this race be?")
        public double maxMagicule = 500.0F;

        @Comment("What intrinsics should this race have?")
        public List<String> intrinsics = List.of();
        @Comment("What learnable intrinsics should this race have?")
        public List<String> learnableIntrinsics = List.of();

        @Comment("What should the additonal size modifier of this race be?")
        public double size = 5.0;

        @Comment("How much additional Max Health should this race have? (Can be Negative)")
        public double maxHealth = 2180.0F;
        @Comment("How much additional Max Spiritual Health should this race have? (Can be Negative)")
        public double maxSpiritualHealth = 5110.0F;

        @Comment("How much additional Attack Damage should this race have? (Can be Negative)")
        public double attack = 0.0;
        @Comment("How much additional Attack Speed should this race have? (Can be Negative)")
        public double attackSpeed = 0.0;

        @Comment("How much additional Knockback Resistance should this race have? (Can be Negative)")
        public double knockbackResistance = 0.0;

        @Comment("How much additional Movement Speed should this race have? (Can be Negative), (Default Movement Speed is 0.1)")
        public double movementSpeed = 0.00;
        @Comment("How much additional Swim Speed should this race have? (Can be Negative)")
        public double swimSpeed = 0.0;

        // Additional Tensura Attributes
        public double abilityLearnGain = 0.0;
        public double abilityMasterGain = 0.0;
        public double analysisDistance = 0.0;
        public double analysisLevel = 0.0;
        public double auraRegenMulti = 0.0;
        public double manaRegenMulti = 0.0;
        public double shpRegen = 0.0;
        public double chantSpeed = 0.0;
        public double darkVision = 0.0;
        public double magicCostMulti = 0.0;
        public double presenceConcealment = 0.0;
        public double presenceSense = 0.0;
        public double presenceSenseRange = 0.0;
        // Additional Apotheosis Attributes
        public double armorPierce = 0.0;
        public double armorShred = 0.0;
        public double arrowDamage = 0.0;
        public double arrowVelocity = 0.0;
        public double critChance = 0.0;
        public double critDamage = 0.0;
        public double healingRecieved = 0.0;
        public double overHeal = 0.0;
        public double lifeSteal = 0.0;
        public double currentHealthDamage = 0.0;
        public double dodgeChance = 0.0;
        public double drawSpeed = 0.0;
        public double experienceGained = 0.0;
        public double projDamage = 0.0;
        public double protPierce = 0.0;
        public double protShred = 0.0;
        // Additional Minecraft Attributes
        public double armor = 0.0;
        public double armorToughness = 0.0;
        public double attackKnockback = 0.0;
        public double blockBreakSpeed = 0.0;
        public double blockInteractionRange = 4.5;
        public double entityInteractionRange = 0.0;
        public double explosionKnockbackResistance = 0.0;
        public double stepHeight = 0.0;
        public double miningEfficiency = 0.0;
        public double movementEfficiency = 0.25;
        public double waterMovementEfficiency = 0.25;
        public double submergedMiningSpeed = 0.0;
        public double fallDamageMultiplier = 0.0;
        public double luck = 0.0;
        public double gravity = 0.0;
        public double oxygenBonus = 0.0;
        public double sneakingSpeed = 0.0;
        public double sweepingDamageRatio = 0.0;
        public double safeFallDistance = 3.5;
        // Additional Ars Nouveau Attributes
        public double drygmyLootingModifier = 0.0;
        public double wixiePotionDuration = 0.0;
        public double whirlsprigSaturationModifier = 0.0;
        public double spellDamageBonus = 0.0;
        public double maxMana = 0.0;
        public double manaRegen = 0.0;
        public double feather = 0.0;
        public double warding = 0.0;
        public double weight = 0.0;

        public double fireSpellDamage = 0.0;
        public double fireSpellResistance = 0.0;
        public double waterSpellDamage = 0.0;
        public double waterSpellResistance = 0.0;
        public double earthSpellDamage = 0.0;
        public double earthSpellResistance = 0.0;
        public double airSpellDamage = 0.0;
        public double airSpellResistance = 0.0;
        public double abjurationSpellPower = 0.0;
        public double abjurationSpellResistance = 0.0;
        public double manipulationSpellPower = 0.0;
        public double manipulationSpellResistance = 0.0;
        public double necromancySpellPower = 0.0;
        public double necromancySpellResistance = 0.0;
        public double summonSpellPower = 0.0;
        public double conjurationSpellResistance = 0.0;
        public double elementalSpellPower = 0.0;
        public double elementalSpellResistance = 0.0;
        public double manaDiscount = 0.0;
        public double spellCriticalChance = 0.0;
        public double spellCriticalDamage = 0.0;
        // Additional Malum Attributes
        public double arcaneResonance = 0.0;
        public double chargeCapacity = 0.0;
        public double chargeDuration = 0.0;
        public double chargeRecoveryRate = 0.0;
        public double geasLimit = 0.0;
        public double malignantAegisCapacity = 0.0;
        public double malignantAegisRecoveryGain = 0.0;
        public double malignantAegisRecoveryRate = 0.0;
        public double malignantConversion = 0.0;
        public double scytheProficiency = 0.0;
        public double soulWardCapacity = 0.0;
        public double soulWardIntegrity = 0.0;
        public double soulWardRecoveryGain = 0.0;
        public double soulWardRecoveryRate = 0.0;
        public double spiritSpoils = 0.0;
        public double magicDamage = 0.0;
        public double magicProficiency = 0.0;
        public double magicResistance = 0.0;

        public double getMinAura() {
            return this.minAura;
        }
        public double getMaxAura() {
            return this.maxAura;
        }
        public double getMinMagicule() {
            return this.minMagicule;
        }
        public double getMaxMagicule() {
            return this.maxMagicule;
        }
        public double getSize() {
            return this.size;
        }
        public double getMaxHealth() {
            return this.maxHealth;
        }
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }
        public double getAttack() {
            return this.attack;
        }
        public double getAttackSpeed() {
            return this.attackSpeed;
        }
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }
        public double getMovementSpeed() {
            return this.movementSpeed;
        }
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
        // Tensura Additional Attributes
        public double getAbilityLearnGain() {
            return this.abilityLearnGain;
        }
        public double getAbilityMasterGain() {
            return this.abilityMasterGain;
        }
        public double getAnalysisDistance() {
            return this.analysisDistance;
        }
        public double getAnalysisLevel() {
            return this.analysisLevel;
        }
        public double getAuraRegenMulti() {
            return this.auraRegenMulti;
        }
        public double getManaRegenMulti() {
            return this.manaRegenMulti;
        }
        public double getShpRegen() {
            return this.shpRegen;
        }
        public double getChantSpeed() {
            return this.chantSpeed;
        }
        public double getDarkVision() {
            return this.darkVision;
        }
        public double getMagicCostMulti() {
            return this.magicCostMulti;
        }
        public double getPresenceConcealment() {
            return this.presenceConcealment;
        }
        public double getPresenceSense() {
            return this.presenceSense;
        }
        public double getPresenceSenseRange() {
            return this.presenceSenseRange;
        }
        // Apotheosis Additional Attributes
        public double getArmorPierce() {
            return this.armorPierce;
        }
        public double getArmorShred() {
            return this.armorShred;
        }
        public double getArrowDamage() {
            return this.arrowDamage;
        }
        public double getArrowVelocity() {
            return this.arrowVelocity;
        }
        public double getCritChance() {
            return this.critChance;
        }
        public double getCritDamage() {
            return this.critDamage;
        }
        public double getHealingRecieved() {
            return this.healingRecieved;
        }
        public double getOverHeal() {
            return this.overHeal;
        }
        public double getLifeSteal() {
            return this.lifeSteal;
        }
        public double getCurrentHealthDamage() {
            return this.currentHealthDamage;
        }
        public double getDodgeChance() {
            return this.dodgeChance;
        }
        public double getDrawSpeed() {
            return this.drawSpeed;
        }
        public double getExperienceGained() {
            return this.experienceGained;
        }
        public double getProjDamage() {
            return this.projDamage;
        }
        public double getProtPierce() {
            return this.protPierce;
        }
        public double getProtShred() {
            return this.protShred;
        }
        // Minecraft Additional Attributes
        public double getArmor() {
            return this.armor;
        }
        public double getArmorToughness() {
            return this.armorToughness;
        }
        public double getAttackKnockback() {
            return this.attackKnockback;
        }
        public double getBlockBreakSpeed() {
            return this.blockBreakSpeed;
        }
        public double getBlockInteractionRange() {
            return this.blockInteractionRange;
        }
        public double getEntityInteractionRange() {
            return this.entityInteractionRange;
        }
        public double getExplosionKnockbackResistance() {
            return this.explosionKnockbackResistance;
        }
        public double getStepHeight() {
            return this.stepHeight;
        }
        public double getMiningEfficiency() {
            return this.miningEfficiency;
        }
        public double getMovementEfficiency() {
            return this.movementEfficiency;
        }
        public double getWaterMovementEfficiency() {
            return this.waterMovementEfficiency;
        }
        public double getSubmergedMiningSpeed() {
            return this.submergedMiningSpeed;
        }
        public double getFallDamageMultiplier() {
            return this.fallDamageMultiplier;
        }
        public double getLuck() {
            return this.luck;
        }
        public double getGravity() {
            return this.gravity;
        }
        public double getOxygenBonus() {
            return this.oxygenBonus;
        }
        public double getSneakingSpeed() {
            return this.sneakingSpeed;
        }
        public double getSweepingDamageRatio() {
            return this.sweepingDamageRatio;
        }
        public double getSafeFallDistance() {
            return this.safeFallDistance;
        }
        // Ars Nouveau Additional Attributes
        public double getDrygmyLootingModifier() {
            return this.drygmyLootingModifier;
        }
        public double getWixiePotionDuration() {
            return this.wixiePotionDuration;
        }
        public double getWhirlsprigSaturationModifier() {
            return this.whirlsprigSaturationModifier;
        }
        public double getSpellDamageBonus() {
            return this.spellDamageBonus;
        }
        public double getMaxMana() {
            return this.maxMana;
        }
        public double getManaRegen() {
            return this.manaRegen;
        }
        public double getFeather() {
            return this.feather;
        }
        public double getWarding() {
            return this.warding;
        }
        public double getWeight() {
            return this.weight;
        }

        public double getFireSpellDamage() {
            return this.fireSpellDamage;
        }
        public double getFireSpellResistance() {
            return this.fireSpellResistance;
        }
        public double getWaterSpellDamage() {
            return this.waterSpellDamage;
        }
        public double getWaterSpellResistance() {
            return this.waterSpellResistance;
        }
        public double getEarthSpellDamage() {
            return this.earthSpellDamage;
        }
        public double getEarthSpellResistance() {
            return this.earthSpellResistance;
        }
        public double getAirSpellDamage() {
            return this.airSpellDamage;
        }
        public double getAirSpellResistance() {
            return this.airSpellResistance;
        }
        public double getAbjurationSpellPower() {
            return this.abjurationSpellPower;
        }
        public double getAbjurationSpellResistance() {
            return this.abjurationSpellResistance;
        }
        public double getManipulationSpellPower() {
            return this.manipulationSpellPower;
        }
        public double getManipulationSpellResistance() {
            return this.manipulationSpellResistance;
        }
        public double getNecromancySpellPower() {
            return this.necromancySpellPower;
        }
        public double getNecromancySpellResistance() {
            return this.necromancySpellResistance;
        }
        public double getSummonSpellPower() {
            return this.summonSpellPower;
        }
        public double getConjurationSpellResistance() {
            return this.conjurationSpellResistance;
        }
        public double getElementalSpellPower() {
            return this.elementalSpellPower;
        }
        public double getElementalSpellResistance() {
            return this.elementalSpellResistance;
        }
        public double getManaDiscount() {
            return this.manaDiscount;
        }
        public double getSpellCriticalChance() {
            return this.spellCriticalChance;
        }
        public double getSpellCriticalDamage() {
            return this.spellCriticalDamage;
        }
        // Malum Additional Attributes
        public double getArcaneResonance() {
            return this.arcaneResonance;
        }
        public double getChargeCapacity() {
            return this.chargeCapacity;
        }
        public double getChargeDuration() {
            return this.chargeDuration;
        }
        public double getChargeRecoveryRate() {
            return this.chargeRecoveryRate;
        }
        public double getGeasLimit() {
            return this.geasLimit;
        }
        public double getMalignantAegisCapacity() {
            return this.malignantAegisCapacity;
        }
        public double getMalignantAegisRecoveryGain() {
            return this.malignantAegisRecoveryGain;
        }
        public double getMalignantAegisRecoveryRate() {
            return this.malignantAegisRecoveryRate;
        }
        public double getMalignantConversion() {
            return this.malignantConversion;
        }
        public double getScytheProficiency() {
            return this.scytheProficiency;
        }
        public double getSoulWardCapacity() {
            return this.soulWardCapacity;
        }
        public double getSoulWardIntegrity() {
            return this.soulWardIntegrity;
        }
        public double getSoulWardRecoveryGain() {
            return this.soulWardRecoveryGain;
        }
        public double getSoulWardRecoveryRate() {
            return this.soulWardRecoveryRate;
        }
        public double getSpiritSpoils() {
            return this.spiritSpoils;
        }
        public double getMagicDamage() {
            return this.magicDamage;
        }
        public double getMagicProficiency() {
            return this.magicProficiency;
        }
        public double getMagicResistance() {
            return this.magicResistance;
        }
    }
}
