package com.github.propheticeclipse.tensurastarlight.registry.skills;

import com.github.propheticeclipse.tensurastarlight.ability.skill.extra.deadEndRainbowSkill;
import com.github.propheticeclipse.tensurastarlight.ability.skill.unique.raceUniques.MemoryRecreationSkill;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.impl.SkillRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class StarlightExtraSkills {
    public static final RegistrySupplier<ManasSkill> DEAD_END_RAINBOW_SKILL = register("dead_end_rainbow_skill", deadEndRainbowSkill::new);

    private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath("trstarlight", name), supplier);
    }

    public static void init() {
    }
}
