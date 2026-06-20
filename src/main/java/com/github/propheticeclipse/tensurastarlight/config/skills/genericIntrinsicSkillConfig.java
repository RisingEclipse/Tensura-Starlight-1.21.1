package com.github.propheticeclipse.tensurastarlight.config.skills;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class genericIntrinsicSkillConfig extends ManasConfig {
    public lucky lucky = new lucky();


    public String getFileName() {
        return "tensura/tensura-starlight/skills/generic-intrinsics";
    }

    public static class lucky extends ManasSubConfig {
        @Comment("Should this skill be enabled?\nThis ONLY affects whether it has a natural acquirement, such as reaching a EP goal.\nIf it is a intrinsic, you can remove it from the relevant race config.")
        public boolean enabled = true;
        @Comment("How much MP should this skill cost to acquire/plunder/copy under normal circumstances?")
        public double acquirementCost = 10000.0;
        @Comment("How much mastery should this skill have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 0;

        public double luckBonusMastered = 2.0;
        public double luckBonusUnmastered = 1.0;
    }

}
