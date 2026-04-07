package com.github.propheticeclipse.tensurastarlight.registry;

import com.github.propheticeclipse.tensurastarlight.config.StarlightConfigs;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightExtraSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;

public class StarlightRegistry {
    public static void init() {
        StarlightUniqueSkills.init();
        StarlightExtraSkills.init();
        StarlightIntrinsicSkills.init();
        StarlightEffects.init();
        StarlightConfigs.init();
        StarlightRaces.init();
    }
}
