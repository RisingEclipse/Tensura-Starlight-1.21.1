package com.github.propheticeclipse.tensurastarlight;

import com.github.propheticeclipse.tensurastarlight.config.StarlightConfigs;
import com.github.propheticeclipse.tensurastarlight.data.StarlightRegistryProvider;
import com.github.propheticeclipse.tensurastarlight.registry.StarlightRegistry;
import com.github.propheticeclipse.tensurastarlight.registry.arsnouveau.StarlightPerkRegistry;
import com.mojang.logging.LogUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TensuraStarlight.MODID)
public final class TensuraStarlight {
    public static final String MODID = "trstarlight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TensuraStarlight(IEventBus bus) {
        StarlightRegistry.init();

        bus.addListener(this::onCommonSetup);
        bus.addListener(this::gatherData);
        bus.addListener(StarlightPerkRegistry::modifyComponents);

    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        StarlightPerkRegistry.constructThreads();
        event.enqueueWork(() -> {
            StarlightConfigs.addToConfig();
        });
    }

    public void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        DatapackBuiltinEntriesProvider registryProvider = new StarlightRegistryProvider(output, lookupProvider);
        CompletableFuture<HolderLookup.Provider> lookup = registryProvider.getRegistryProvider();

        generator.addProvider(event.includeServer(), registryProvider);
    }

    public static ResourceLocation prefix(String path){
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
