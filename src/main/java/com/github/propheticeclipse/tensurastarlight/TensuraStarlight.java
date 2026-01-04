package com.github.propheticeclipse.tensurastarlight;

import com.github.propheticeclipse.tensurastarlight.registry.StarlightRegistry;
import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TensuraStarlight.MODID)
public final class TensuraStarlight {
    public static final String MODID = "trstarlight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        StarlightRegistry.init();
    }

}
