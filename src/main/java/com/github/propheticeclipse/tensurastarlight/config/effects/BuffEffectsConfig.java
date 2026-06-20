package com.github.propheticeclipse.tensurastarlight.config.effects;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class BuffEffectsConfig extends ManasConfig {
    public CombatFlow CombatFlow = new CombatFlow();
    public ShiftingArmor ShiftingArmor = new ShiftingArmor();
    public FlaringForm FlaringForm = new FlaringForm();
    public soulAegis soulAegis = new soulAegis();
    public existenceRegeneration existenceRegeneration = new existenceRegeneration();
    public healthRegen healthRegen = new healthRegen();
    public spiritualRegen spiritualRegen = new spiritualRegen();
    public sourceBlood sourceBlood = new sourceBlood();

    public String getFileName() {
        return "tensura/tensura-starlight/effects/buffs";
    }

    public static class CombatFlow extends ManasSubConfig {
        @Comment("How much attack should a entity gain with this effect?")
        public int attackMod = 4;
    }

    public static class ShiftingArmor extends ManasSubConfig {
        @Comment("How much armor should a entity gain with this effect?")
        public int armorMod = 5;
    }

    public static class FlaringForm extends ManasSubConfig {
        @Comment("How much armor and armor toughness should a entity gain with this effect?")
        public int armorMod = 10;
        public int armorToughMod = 2;
    }

    public static class soulAegis extends ManasSubConfig {
        @Comment("How much soul ward is removed per level of Soul Aegis")
        public double soulWardBonus = -5.0;
        @Comment("How much malignant aegis is added per level of Soul Aegis")
        public double malignantAegisBonus = 5.0;
        @Comment("How much arcane resonance is multiplied by per level of Soul Aegis")
        public double arcaneResonanceMod = 0.15;
        @Comment("What is the base duration of Soul Aegis")
        public int soulAegisBaseDuration = (10 * 20);
    }

    public static class existenceRegeneration extends ManasSubConfig {
        @Comment("How fast should this effect trigger in ticks?")
        public int tickRate = 20;

        @Comment("How much of MP and AP should this effect regenerate per trigger based on Max%\nWhere 1.0 == 1%")
        public double magiculePercent = 0.05;
        public double auraPercent = 0.05;

        @Comment("How much MP and AP should this effect cap out at? Based on a multiplier of Max%")
        public double magiculeCap = 1.20;
        public double auraCap = 1.20;
    }

    public static class healthRegen extends ManasSubConfig {
        @Comment("How fast should this effect trigger in ticks?")
        public int tickRate = 20;

        @Comment("How much Health should this effect regen per trigger based on Max%\nWhere 1.0 == 1%")
        public double regenPercent = 1.0;

        @Comment("How much should this effect regen up to based on Max%")
        public double regenCap = 1.0;
    }

    public static class spiritualRegen extends ManasSubConfig {
        @Comment("How fast should this effect trigger in ticks?")
        public int tickRate = 20;

        @Comment("How much Spiritual Health should this effect regen per trigger based on Max%\nWhere 1.0 == 1%")
        public double regenPercent = 1.0;

        @Comment("How much should this effect regen up to based on Max%")
        public double regenCap = 1.0;
    }

    public static class sourceBlood extends ManasSubConfig {
        @Comment("How fast should this effect trigger in ticks?")
        public int tickRate = 20;

        public double healingEfficency = 0.1;

        public double healthBaseHeal = 10.0;
        public double spiritualBaseHeal = 5.0;
    }
}
