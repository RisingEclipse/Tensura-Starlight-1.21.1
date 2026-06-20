package com.github.propheticeclipse.tensurastarlight.config.skills;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class itemExtraSkillsConfig extends ManasConfig {
    public deadEndRainbowSkill deadEndRainbowSkill = new deadEndRainbowSkill();

    public String getFileName() {
        return "tensura/tensura-starlight/skills/item-skills";
    }

    public static class deadEndRainbowSkill extends ManasSubConfig {
        @Comment("Should this skill be enabled?\nThis ONLY affects whether it has a natural acquirement, such as reaching a EP goal.\nIf it is a intrinsic, you can remove it from the relevant race config.")
        public boolean enabled = true;
        public double acquirementCost = 0;
        public int acquirementMastery = 1;

        @Comment("0.1 = 10%")
        public double currentSHPBonusDamagePercentMastered = 0.075;
        public double currentSHPBonusDamagePercentUnmastered = 0.05;
        public float currentSHPBonusDamageCapUnmastered = 2500;
        public double cookDamagePercentMastered = 0.25;
        public double cookDamagePercentUnmastered = 0.125;
        public float cookDamageCapUnmastered = 2500;
    }

}
