package com.github.propheticeclipse.tensurastarlight.config.skills;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class aspectSeriesSkillConfig extends ManasConfig {
    public LightRemains LightRemains = new LightRemains();
    public EchoEndures EchoEndures = new EchoEndures();
    public LifeReturns LifeReturns = new LifeReturns();
    public EmberRemains EmberRemains = new EmberRemains();
    public ShapeForgotten ShapeForgotten = new ShapeForgotten();
    public CurrentUnbroken CurrentUnbroken = new CurrentUnbroken();

    public VestigesOfEidolons VestigesOfEidolons = new VestigesOfEidolons();
    public RemnantsOfAscension RemnantsOfAscension = new RemnantsOfAscension();

    public String getFileName() {
        return "tensura/tensura-starlight/skills/aspect-series";
    }

    public static class LightRemains extends ManasSubConfig {
        @Comment("What level should the Light/Darkness spirits be to acquire Light Remains for free?\nLevel 2 = Medium Spirit\nLevel 3 = Greater Spirit\nLevel 4 = Spirit Lord\n")
        public int skillFreeSpiritLevel = 4;
        @Comment("What level should the Light/Darkness spirits be to acquire Light Remains at cost?")
        public int skillAcquireSpiritLevel = 3;
        @Comment("How much MP should Light Remains cost to acquire/plunder/copy under normal circumstances?")
        public double magiculeAcquirementCost = 75000.0;
        @Comment("How much mastery should Light Remains have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 1;

        @Comment("How much aura gain percent should Light Remains grant to its user? 1 = 1%, 100 = 100%")
        public double auraGainPercent = 0.75;
        @Comment("How much mana gain percent should Light Remains grant to its user? 1 = 1%, 100 = 100%")
        public double manaGainPercent = 2.25;

        @Comment("How much mana should Blinding Light cost to activate?")
        public double blindingLightManaCost = 500.0;
        @Comment("How much mana should Overbearing Light cost to activate?")
        public double overbearingLightManaCost = 1200.0;

        @Comment("How much should the damage modifier to Light Damage be?")
        public double damageModMastered = 3.0;
        @Comment("How much should the damage modifier to Light Damage be?")
        public double damageModUnmastered = 1.5;

        @Comment("How much extra MP should the user get when killing a target with Overbearing Light?\n1.0 = 100%, 0.01 = 1%")
        public double overbearingLightManaGain = 0.05;

        @Comment("What should the cone angle of Blinding Light be?")
        public double blindingLightConeAngle = 60.0;
        @Comment("What should the cone length of Blinding Light be?")
        public double blindingLightConeLength = 11.0;
        @Comment("What should the Mastered Damage of Blinding Light be?")
        public float blindingLightDamageMastered = 20;
        @Comment("What should the Unmastered Damage of Blinding Light be?")
        public float blindingLightDamageUnmastered = 10;
        @Comment("How long should the darkness effect applied by Blinding Light last?\nDuration in ticks (20t = 1s)")
        public int blindingLightDarknessDuration = 100;
        @Comment("What should the darkness effect amplifier be?\nAmplifier 0 = Level 1")
        public int blindingLightDarknessAmplifier = 0;
        @Comment("How long should Blinding Light go on cooldown for when used?\nTime in seconds")
        public int blindingLightCooldown = 2;

        @Comment("What should the Mastered Damage of Overbearing Light be?")
        public float overbearingLightDamageMastered = 80;
        @Comment("What should the Unmastered Damage of Overbearing Light be?")
        public float overbearingLightDamageUnmastered = 40;
        @Comment("What should the range of Overbearing Light be?")
        public double overbearingLightRange = 10.0;
        @Comment("How long should Overbearing Light go on cooldown for when used?\nTime in seconds")
        public int overbearingLightCooldown = 6;
    }
    public static class EchoEndures extends ManasSubConfig {
        @Comment("How much MP should Echo Endures cost to acquire/plunder/copy under normal circumstances?")
        public double magiculeAcquirementCost = 100000.0;
        @Comment("How much mastery should Echo Endures have by default?\nAny value above 1 = X Mastery at acquirement\n0 = Must be learned\nAny value below 0 = Requires X Learn Points")
        public int acquirementMastery = 1;

        @Comment("What should the silence effect amplifier be?\nAmplifier 0 = Level 1")
        public int silenceAmplifier = 0;
        @Comment("How long should the silence effect last mastered?\nDuration in ticks (20t = 1s)")
        public int silenceDurationMastered = 120;
        @Comment("How long should the silence effect last unmastered?\nDuration in ticks (20t = 1s)")
        public int silenceDurationUnmastered = 60;

        @Comment("How much mana should Sound Burst cost to activate?")
        public double soundBurstManaCost = 750.0;
        @Comment("What should be the cone angle of Sound Burst be?")
        public double soundBurstConeAngle = 160.0;
        @Comment("What should be the cone length of Sound Burst be?")
        public double soundBurstConeLength = 8.0;
        @Comment("How much damage should Sound Burst do mastered?")
        public float soundBurstMasteredDamage = 10;
        @Comment("How much damage should Sound Burst do unmastered?")
        public float soundBurstUnmasteredDamage = 5;

    }
    public static class LifeReturns extends ManasSubConfig {
        @Comment("How much attack should a entity gain with this effect?")
        public int attackMod = 4;
    }
    public static class EmberRemains extends ManasSubConfig {
        @Comment("How much attack should a entity gain with this effect?")
        public int attackMod = 4;
    }
    public static class ShapeForgotten extends ManasSubConfig {
        @Comment("How much attack should a entity gain with this effect?")
        public int attackMod = 4;
    }
    public static class CurrentUnbroken extends ManasSubConfig {
        @Comment("How much attack should a entity gain with this effect?")
        public int attackMod = 4;
    }

    public static class VestigesOfEidolons extends ManasSubConfig {
        @Comment("How much attack should a entity gain with this effect?")
        public int attackMod = 4;
    }
    public static class RemnantsOfAscension extends ManasSubConfig {
        @Comment("How much attack should a entity gain with this effect?")
        public int attackMod = 4;
    }
}
