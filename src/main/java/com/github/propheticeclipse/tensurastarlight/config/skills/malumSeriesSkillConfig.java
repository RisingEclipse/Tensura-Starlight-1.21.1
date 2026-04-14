package com.github.propheticeclipse.tensurastarlight.config.skills;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class malumSeriesSkillConfig extends ManasConfig {
    public wardedSoul wardedSoul = new wardedSoul();
    public soulPlunderer soulPlunderer = new soulPlunderer();
    public malignantBody malignantBody = new malignantBody();

    public String getFileName() {
        return "tensura/tensura-starlight/skills/malum-series";
    }

    public static class wardedSoul extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double soulWardBonusMastered = 4.0;
        public double soulWardBonusUnmastered = 2.0;

        public double soulWardChargeBonusMastered = -2.0;
        public double soulWardChargeBonusUnmastered = -1.0;

        public double soulWardBonusMastered2 = -2.0;
        public double soulWardBonusUnmastered2 = -1.0;

        public double soulWardChargeBonusMastered2 = 4.0;
        public double soulWardChargeBonusUnmastered2 = 2.0;
    }

    public static class soulPlunderer extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double spiritSpoilsBonusMastered = 2.0;
        public double spiritSpoilsBonusUnmastered = 1.0;
    }

    public static class malignantBody extends ManasSubConfig {
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double magicResistanceBonusMastered = 0.2;
        public double magicResistanceBonusUnmastered = 0.1;

        public double malignantConversionBonusMastered = 0.25;
        public double malignantConversionBonusUnmastered = 0.1125;

        public double magicResistanceDamageModMastered = 0.75;
        public double magicResistanceDamageModUnmastered = 0.9;
    }
}
