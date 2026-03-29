package com.github.propheticeclipse.tensurastarlight.config;

import com.github.propheticeclipse.tensurastarlight.config.effects.BuffEffectsConfig;
import com.github.propheticeclipse.tensurastarlight.config.races.aspectBornRaceConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.arsnouveauSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.aspectSeriesSkillConfig;
import com.github.propheticeclipse.tensurastarlight.config.skills.itemExtraSkillsConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;

import java.io.ObjectInputFilter;

public class StarlightConfigs {
    public static void init() {
        ConfigRegistry.registerConfig(new StarlightCommon());
        // Effects
        ConfigRegistry.registerConfig(new BuffEffectsConfig());
        // Skills
        ConfigRegistry.registerConfig(new aspectSeriesSkillConfig());
        ConfigRegistry.registerConfig(new itemExtraSkillsConfig());
        ConfigRegistry.registerConfig(new arsnouveauSeriesSkillConfig());
        // Races
        ConfigRegistry.registerConfig(new aspectBornRaceConfig());
    }
}
