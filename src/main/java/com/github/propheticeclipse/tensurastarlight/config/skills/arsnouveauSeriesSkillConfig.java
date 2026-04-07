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
    public wildenGuardianGenetics wildenGuardianGenetics = new wildenGuardianGenetics();
    public wildenHunterGenetics wildenHunterGenetics = new wildenHunterGenetics();
    public wildenStalkerGenetics wildenStalkerGenetics = new wildenStalkerGenetics();

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
    }

    public static class whirlisprigGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;
    }

    public static class wildenGuardianGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;
    }

    public static class wildenHunterGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;
    }

    public static class wildenStalkerGenetics extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;
    }
}
