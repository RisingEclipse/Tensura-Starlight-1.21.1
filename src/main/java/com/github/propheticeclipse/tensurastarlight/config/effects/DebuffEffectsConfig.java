package com.github.propheticeclipse.tensurastarlight.config.effects;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class DebuffEffectsConfig extends ManasConfig {
    public existenceDrain existenceDrain = new existenceDrain();

    public String getFileName() {
        return "tensura/tensura-starlight/effects/debuffs";
    }

    public static class existenceDrain extends ManasSubConfig {
        @Comment("How fast should this effect trigger in ticks?")
        public int tickRate = 10;

        @Comment("How much of MP and AP should this effect regenerate per trigger based on Max%\nWhere 1.0 == 1%")
        public double magiculePercent = -0.1;
        public double auraPercent = -0.1;

        @Comment("How much MP and AP should this effect cap out at? Based on a multiplier of Max%")
        public double magiculeCap = -1.0;
        public double auraCap = -1.0;
    }
}
