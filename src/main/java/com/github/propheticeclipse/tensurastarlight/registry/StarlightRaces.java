package com.github.propheticeclipse.tensurastarlight.registry;

import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.lesserAspectBornRace;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.impl.RaceRegistry;
import io.github.manasmods.tensura.race.beastfolk.BeastfolkRace;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class StarlightRaces {
    public static final RegistrySupplier<ManasRace> LESSER_ASPECT_BORN = register("lesser_aspect_born", lesserAspectBornRace::new);

    private static <E extends ManasRace> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return RaceRegistry.RACES.register(ResourceLocation.fromNamespaceAndPath("trstarlight", name), supplier);
    }

    public static void init() {
    }
}
