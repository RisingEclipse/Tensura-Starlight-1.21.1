package com.github.propheticeclipse.tensurastarlight.config.skills;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class arsnouveauSeriesSkillConfig extends ManasConfig {
    public amethystGolemGenetics amethystGolemGenetics = new amethystGolemGenetics();
    public drygmyGenetics drygmyGenetics = new drygmyGenetics();
    public flarecannonGenetics flarecannonGenetics = new flarecannonGenetics();
    public flashjackGenetics flashjackGenetics = new flashjackGenetics();
    public sirenGenetics sirenGenetics = new sirenGenetics();
    public starbuncleGenetics starbuncleGenetics = new starbuncleGenetics();
    public whirlisprigGenetics whirlisprigGenetics = new whirlisprigGenetics();
    public wixieGenetics wixieGenetics = new wixieGenetics();
    public wildenGuardianGenetics wildenGuardianGenetics = new wildenGuardianGenetics();
    public wildenHunterGenetics wildenHunterGenetics = new wildenHunterGenetics();
    public wildenStalkerGenetics wildenStalkerGenetics = new wildenStalkerGenetics();
    public abnormallyLucky abnormallyLucky = new abnormallyLucky();
    public hyperMetabolistic hyperMetabolistic = new hyperMetabolistic();
    public plasmaticSource plasmaticSource = new plasmaticSource();
    public sourcePowered sourcePowered = new sourcePowered();
    public wildenStalk wildenStalk = new wildenStalk();

    public String getFileName() {
        return "tensura/tensura-starlight/skills/arsnoveau-series";
    }

    public static class amethystGolemGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double kbResistMastered = 0.25;
        public double kbResistUnmastered = 0.125;

        public float knockbackStrength = 0.8F;
    }

    public static class drygmyGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public int lootingBonusMastered = 2;
        public int lootingBonusUnmastered = 1;
        public double earthPowerBonusMastered = 4.0;
        public double earthPowerBonusUnmastered = 1.0;
        public double luckBonusMastered = 2.0;
        public double luckBonusUnmastered = 1.0;
    }

    public static class flarecannonGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double fireSpellBonusMastered = 4.0;
        public double fireSpellBonusUnmastered = 2.0;
        public double manaDiscountBonusMastered = 5.0;
        public double manaDiscountBonusUnmastered = 2.5;
    }

    public static class flashjackGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double airSpellBonusMastered = 4.0;
        public double airSpellBonusUnmastered = 2.0;
        public double manaDiscountBonusMastered = 5.0;
        public double manaDiscountBonusUnmastered = 2.5;
    }

    public static class sirenGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double waterSpellBonusMastered = 4.0;
        public double waterSpellBonusUnmastered = 2.0;
        public double manaDiscountBonusMastered = 5.0;
        public double manaDiscountBonusUnmastered = 2.5;
    }

    public static class starbuncleGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double speedBonusMastered = 0.10;
        public double speedBonusUnmastered = 0.05;
    }

    public static class whirlisprigGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public int satietyBonusMastered = 2;
        public int satietyBonusUnmastered = 1;
    }

    public static class wixieGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public int potionDurationBonusMastered = 2;
        public int potionDurationBonusUnmastered = 1;
    }

    public static class wildenGuardianGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double healthBonusMastered = 5.0;
        public double healthBonusUnmastered = 1.0;

        public double reflectDamageResistMastered = 0.025;
        public double reflectDamageResistUnmastered = 0.025;

        public double reflectPercentMastered = 0.025;
        public double reflectPercentUnmastered = 0.025;
    }

    public static class wildenHunterGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double arrowVelocityBonusMastered = 0.5;
        public double arrowVelocityBonusUnmastered = 0.25;

        public double drawSpeedBonusMastered = 0.5;
        public double drawSpeedBonusUnmastered = 0.25;
    }

    public static class wildenStalkerGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double sneakSpeedBonusMastered = 0.4;
        public double sneakSpeedBonusUnmastered = 0.2;

        public double gravityBonusMastered = -0.04;
        public double gravityBonusUnmastered = -0.02;
    }

    public static class abnormallyLucky extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double luckBonusMastered = 0.1;
        public double luckBonusUnmastered = 0.05;
        public int lootingBonusMastered = 2;
        public int lootingBonusUnmastered = 1;
        public double critChanceBonusMastered = 0.1;
        public double critChanceBonusUnmastered = 0.05;
    }

    public static class hyperMetabolistic extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public int satietyBonusMastered = 2;
        public int satietyBonusUnmastered = 1;
        public int potionDurationBonusMastered = 2;
        public int potionDurationBonusUnmastered = 1;
        public double healingRecievedBonusMastered = 0.1;
        public double healingRecievedBonusUnmastered = 0.1;
    }

    public static class plasmaticSource extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double manaRegenBonusMastered = 0.1;
        public double manaRegenBonusUnmastered = 0.1;
        public double manaMaxBonusMastered = 0.05;
        public double manaMaxBonusUnmastered = 0.05;
    }

    public static class sourcePowered extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double elementalPowerBonusMastered = 4.0;
        public double elementalPowerBonusUnmastered = 2.0;
        public double earthResistBonusMastered = 100.0;
        public double earthResistBonusUnmastered = 50.0;
        public double fireResistBonusMastered = 100.0;
        public double fireResistBonusUnmastered = 50.0;
        public double waterResistBonusMastered = 100.0;
        public double waterResistBonusUnmastered = 50.0;
        public double airResistBonusMastered = 100.0;
        public double airResistBonusUnmastered = 50.0;
        public double manaDiscountBonusMastered = 20.0;
        public double manaDiscountBonusUnmastered = 10.0;
    }

    public static class wildenStalk extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double arrowDamageBonusMastered = 0.5;
        public double arrowDamageBonusUnmastered = 0.25;
    }
}
