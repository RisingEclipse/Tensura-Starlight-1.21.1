package com.github.propheticeclipse.tensurastarlight.config;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.genericIntrinsicSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.itemExtraSkillsConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.config.ReincarnationConfig;
import io.github.manasmods.tensura.config.ability.skill.UniqueSkillConfig;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class StarlightConfigs {
    public static void init() {
        ConfigRegistry.registerConfig(new StarlightCommon());
        // Effects
        ConfigRegistry.registerConfig(new BuffEffectsConfig());
        // Skills
        ConfigRegistry.registerConfig(new aspectSeriesSkillConfig());
        ConfigRegistry.registerConfig(new itemExtraSkillsConfig());
        ConfigRegistry.registerConfig(new arsnouveauSeriesSkillConfig());
        ConfigRegistry.registerConfig(new genericIntrinsicSkillConfig());
        // Races
        ConfigRegistry.registerConfig(new aspectBornRaceConfig());
    }

    protected static final List<String> races = List.of("trstarlight:lesser_aspect_born");
    protected static final List<String> reincspellraces = List.of("trstarlight:lesser_aspect_born");
    protected static final List<String> reincspellmasteredraces = List.of("trstarlight:lesser_aspect_born");
    protected static final List<String> skills = List.of();
    protected static final List<String> aspectSkills = List.of("trstarlight:light_remains", "trstarlight:echo_endures", "trstarlight:life_returns", "trstarlight:ember_remains", "trstarlight:current_unbroken", "trstarlight:shape_forgotten");


    public static void addToConfig() {
        if (shouldAddToConfig()) {
            boolean changesMade = false;
            ReincarnationConfig reinc = ConfigRegistry.getConfig(ReincarnationConfig.class);
            UniqueSkillConfig unique = ConfigRegistry.getConfig(UniqueSkillConfig.class);

            ArrayList<String> startingSkills = new ArrayList(reinc.Skills.startingSkills);
            ArrayList<String> startingRaces = new ArrayList(reinc.Races.startingRaces);
            ArrayList<String> randomRaces = new ArrayList(reinc.Races.randomRaces);
            ArrayList<String> reincSpellRaces = new ArrayList(reinc.Races.reincarnationRaces);
            ArrayList<String> reincSpellMasteredRaces = new ArrayList(reinc.Races.reincarnationRacesMastered);
            ArrayList<String> creatorSkills = new ArrayList(unique.Creator.uniqueSkills);

            LinkedHashSet<String> startSkillSet = new LinkedHashSet(startingSkills);
            LinkedHashSet<String> startRaceSet = new LinkedHashSet(startingRaces);
            LinkedHashSet<String> randomRaceSet = new LinkedHashSet(randomRaces);
            LinkedHashSet<String> reincSpellRaceSet = new LinkedHashSet(reincSpellRaces);
            LinkedHashSet<String> reincSpellMasteredRaceSet = new LinkedHashSet(reincSpellMasteredRaces);
            LinkedHashSet<String> creatorSet = new LinkedHashSet(creatorSkills);

            // Stuff

            for (String skillRegistry : skills) {
                if (startSkillSet.add(skillRegistry)) {
                    changesMade = true;
                }
            }

            if (ConfigRegistry.getConfig(StarlightCommon.class).DangerZone.addAspectSkillsReincarnation) {
                for (String skillRegistry : aspectSkills) {
                    if (startSkillSet.add(skillRegistry)) {
                        changesMade = true;
                    }
                }
            }

            for (String raceRegistry : races) {
                if (startRaceSet.add(raceRegistry)) {
                    changesMade = true;
                }

                if (randomRaceSet.add(raceRegistry)) {
                    changesMade = true;
                }
            }
            if (ConfigRegistry.getConfig(StarlightCommon.class).DangerZone.addReincSpellRaces) {
                for (String raceRegistry : reincspellraces) {
                    if (reincSpellRaceSet.add(raceRegistry)) {
                        changesMade = true;
                    }
                }
            }

            if (ConfigRegistry.getConfig(StarlightCommon.class).DangerZone.addReincSpellMasteredRaces) {
                for (String raceRegistry : reincspellmasteredraces) {
                    if (reincSpellMasteredRaceSet.add(raceRegistry)) {
                        changesMade = true;
                    }
                }
            }

            // End of stuff.

            reinc.Skills.startingSkills = new ArrayList(startSkillSet);
            reinc.Races.startingRaces = new ArrayList(startRaceSet);
            reinc.Races.randomRaces = new ArrayList(randomRaceSet);
            reinc.Races.reincarnationRaces = new ArrayList(reincSpellRaceSet);
            reinc.Races.reincarnationRacesMastered = new ArrayList(reincSpellMasteredRaceSet);
            unique.Creator.uniqueSkills = new ArrayList(creatorSet);

            if (changesMade) {
                ConfigRegistry.saveAllConfigs();
            }

            (ConfigRegistry.getConfig(StarlightCommon.class)).DangerZone.addReincSpellRaces = false;
            (ConfigRegistry.getConfig(StarlightCommon.class)).DangerZone.addReincSpellMasteredRaces = false;
            (ConfigRegistry.getConfig(StarlightCommon.class)).DangerZone.addAspectSkillsReincarnation = false;
            (ConfigRegistry.getConfig(StarlightCommon.class)).DangerZone.redoStarlightConfigs = false;
            ConfigRegistry.saveAllConfigs();
        }
    }

    public static boolean shouldAddToConfig() {
        return (ConfigRegistry.getConfig(StarlightCommon.class).DangerZone.redoStarlightConfigs);
    }
}
