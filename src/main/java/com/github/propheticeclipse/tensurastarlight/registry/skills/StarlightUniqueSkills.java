package com.github.propheticeclipse.tensurastarlight.registry.skills;

import com.github.propheticeclipse.tensurastarlight.ability.skill.unique.LightRemainsSkill;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.impl.SkillRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class StarlightUniqueSkills {

    //public static final RegistrySupplier<ManasSkill> BUTCHER = register("butcher", ButcherSkill::new); (Thanks Myst)
    public static final RegistrySupplier<ManasSkill> LIGHT_REMAINS = register("light_remains", LightRemainsSkill::new);

    private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath("trstarlight", name), supplier);
    }

    public static void init() {
    }
}
