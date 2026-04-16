package com.github.propheticeclipse.tensurastarlight;

import com.github.propheticeclipse.tensurastarlight.config.StarlightConfigs;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRegistry;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TensuraStarlight.MODID)
public final class TensuraStarlight {
    public static final String MODID = "trstarlight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TensuraStarlight(IEventBus modEventBus) {
        StarlightRegistry.init();

        modEventBus.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            StarlightConfigs.addToConfig();
        });
    }
}
