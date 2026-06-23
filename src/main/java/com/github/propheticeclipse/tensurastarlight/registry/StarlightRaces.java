package com.github.propheticeclipse.tensurastarlight.registry;

import com.github.propheticeclipse.tensurastarlight.race.Starborn.debris.*;
import com.github.propheticeclipse.tensurastarlight.race.Starborn.debris.moonHidden.ladyLunaRace;
import com.github.propheticeclipse.tensurastarlight.race.Starborn.largeMolecularCloudRace;
import com.github.propheticeclipse.tensurastarlight.race.Starborn.smallMolecularCloudRace;
import com.github.propheticeclipse.tensurastarlight.race.Starborn.stardustRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.aspectBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.convergence.convergenceBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.convergence.elderConvergenceBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.convergence.greaterConvergenceBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.convergence.lesserConvergenceBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.greaterAspectBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.lesserAspectBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.grandMemoryBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.greaterMemoryBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.lesserMemoryBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.memoryBornRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.mythos.aspectOfRegressionRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.mythos.falseAspectOfRegressionRace;
import com.github.propheticeclipse.tensurastarlight.race.personal.aspectborn.trueAspect.memoryAspect.mythos.mythosRace;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.impl.RaceRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class StarlightRaces {
    // Aspectborn
    public static final RegistrySupplier<ManasRace> LESSER_ASPECT_BORN = register("lesser_aspect_born", lesserAspectBornRace::new);
    public static final RegistrySupplier<ManasRace> ASPECT_BORN = register("aspect_born", aspectBornRace::new);
    public static final RegistrySupplier<ManasRace> GREATER_ASPECT_BORN = register("greater_aspect_born", greaterAspectBornRace::new);

    public static final RegistrySupplier<ManasRace> LESSER_CONVERGENCE_BORN = register("lesser_convergence_born", lesserConvergenceBornRace::new);
    public static final RegistrySupplier<ManasRace> CONVERGENCE_BORN = register("convergence_born", convergenceBornRace::new);
    public static final RegistrySupplier<ManasRace> GREATER_CONVERGENCE_BORN = register("greater_convergence_born", greaterConvergenceBornRace::new);
    public static final RegistrySupplier<ManasRace> ELDER_CONVERGENCE_BORN = register("elder_convergence_born", elderConvergenceBornRace::new);

    public static final RegistrySupplier<ManasRace> LESSER_MEMORY_BORN = register("lesser_memory_born", lesserMemoryBornRace::new);
    public static final RegistrySupplier<ManasRace> MEMORY_BORN = register("memory_born", memoryBornRace::new);
    public static final RegistrySupplier<ManasRace> GREATER_MEMORY_BORN = register("greater_memory_born", greaterMemoryBornRace::new);
    public static final RegistrySupplier<ManasRace> GRAND_MEMORY_BORN = register("grand_memory_born", grandMemoryBornRace::new);

    public static final RegistrySupplier<ManasRace> FALSE_ASPECT_OF_REGRESSION = register("false_aspect_of_regression", falseAspectOfRegressionRace::new);
    public static final RegistrySupplier<ManasRace> ASPECT_OF_REGRESSION = register("aspect_of_regression", aspectOfRegressionRace::new);
    public static final RegistrySupplier<ManasRace> MYTHOS = register("mythos", mythosRace::new);

    // Starborn
    public static final RegistrySupplier<ManasRace> SMALL_MOLECULAR_CLOUD = register("small_molecular_cloud", smallMolecularCloudRace::new);
    public static final RegistrySupplier<ManasRace> LARGE_MOLECULAR_CLOUD = register("large_molecular_cloud", largeMolecularCloudRace::new);
    public static final RegistrySupplier<ManasRace> STARDUST = register("stardust", stardustRace::new);

    public static final RegistrySupplier<ManasRace> SMALL_METEOROID = register("small_meteoroid", smallMeteoroidRace::new);
    public static final RegistrySupplier<ManasRace> LARGE_METEOROID = register("large_meteoroid", largeMeteoroidRace::new);

    public static final RegistrySupplier<ManasRace> SMALL_COMET = register("small_comet", smallCometRace::new);
    public static final RegistrySupplier<ManasRace> LARGE_COMET = register("large_comet", largeCometRace::new);

    public static final RegistrySupplier<ManasRace> SMALL_ASTEROID = register("small_asteroid", smallAsteroidRace::new);
    public static final RegistrySupplier<ManasRace> LARGE_ASTEROID = register("large_asteroid", largeAsteroidRace::new);

    public static final RegistrySupplier<ManasRace> SMALL_MOON = register("small_moon", smallMoonRace::new);
    public static final RegistrySupplier<ManasRace> MOON = register("moon", moonRace::new);
    public static final RegistrySupplier<ManasRace> LADY_LUNA = register("lady_luna", ladyLunaRace::new);
    public static final RegistrySupplier<ManasRace> LARGE_MOON = register("large_moon", largeMoonRace::new);

    private static <E extends ManasRace> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return RaceRegistry.RACES.register(ResourceLocation.fromNamespaceAndPath("trstarlight", name), supplier);
    }

    public static void init() {
    }
}
