package com.github.propheticeclipse.tensurastarlight.registry;

import com.github.propheticeclipse.tensurastarlight.config.StarlightConfigs;
import com.github.propheticeclipse.tensurastarlight.registry.attachments.StarlightAttachments;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightExtraSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightIntrinsicSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUltimateSkills;
import com.github.propheticeclipse.tensurastarlight.registry.skills.StarlightUniqueSkills;
import net.neoforged.bus.api.IEventBus;

public class StarlightRegistry {
    public static void init() {
        StarlightUltimateSkills.init();
        StarlightUniqueSkills.init();
        StarlightExtraSkills.init();
        StarlightIntrinsicSkills.init();
        StarlightEffects.init();
        StarlightConfigs.init();
        StarlightRaces.init();
    }
}
