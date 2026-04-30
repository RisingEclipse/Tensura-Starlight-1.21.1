package com.github.propheticeclipse.tensurastarlight.data;

import com.github.propheticeclipse.tensurastarlight.data.existence.StarlightEntityExistenceData;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class StarlightRegistryProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(TensuraCustomData.ENTITY_EXISTENCE, StarlightEntityExistenceData::bootstrap);

    public StarlightRegistryProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of("tensura"));
    }
}
