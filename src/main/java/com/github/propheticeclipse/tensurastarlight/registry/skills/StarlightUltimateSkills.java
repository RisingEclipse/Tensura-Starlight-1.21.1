package com.github.propheticeclipse.tensurastarlight.registry.skills;

import com.github.propheticeclipse.tensurastarlight.ability.skill.ultimate.LetheSkill;
import com.github.propheticeclipse.tensurastarlight.ability.skill.unique.raceUniques.PhantasmalCreationSkill;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.impl.SkillRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class StarlightUltimateSkills {

    public static final RegistrySupplier<ManasSkill> LETHE = register("lethe_lady_of_phantasm", LetheSkill::new);

    private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath("trstarlight", name), supplier);
    }

    public static void init() {
    }
}
