package com.github.propheticeclipse.tensurastarlight.config.skills;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class starbornIntrinsicSkillConfig extends ManasConfig {
    public massAccumulation massAccumulation = new massAccumulation();

    public String getFileName() {
        return "tensura/tensura-starlight/skills/starborn-intrinsics";
    }

    public static class massAccumulation extends ManasSubConfig {
        @Comment("Should this skill be enabled?\nThis ONLY affects whether it has a natural acquirement, such as reaching a EP goal.\nIf it is a intrinsic, you can remove it from the relevant race config.")
        public boolean enabled = true;
        public double acquirementCost = 0;
        public int acquirementMastery = 1;

        public int stardustMassAccumulationCap = 10000;
        public int debrisClassMassAccumulationCap = 10000;
        public int planetaryClassMassAccumulationCap = 25000;
        public int stellarClassMassAccumulationCap = 100000;
        public int ladyLunaMassAccumulationCap = 20000;
        public int terrestrialPlanetMassAccumulationCap = 80000;
        public int neutronMassAccumulationCap = 2147483647;
        public int blackholeMassAccumulationCap = 2147483647;
    }

}
