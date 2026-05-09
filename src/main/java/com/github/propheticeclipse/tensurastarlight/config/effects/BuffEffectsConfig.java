package com.github.propheticeclipse.tensurastarlight.config.effects;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class BuffEffectsConfig extends ManasConfig {
    public CombatFlow CombatFlow = new CombatFlow();
    public ShiftingArmor ShiftingArmor = new ShiftingArmor();
    public FlaringForm FlaringForm = new FlaringForm();
    public soulAegis soulAegis = new soulAegis();

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
}
