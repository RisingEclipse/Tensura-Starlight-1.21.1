package com.github.propheticeclipse.tensurastarlight.registry.skills;

import com.github.propheticeclipse.tensurastarlight.ability.skill.unique.*;
import com.github.propheticeclipse.tensurastarlight.ability.skill.unique.evolvedUnique.RemnantsOfAscensionSkill;
import com.github.propheticeclipse.tensurastarlight.ability.skill.unique.evolvedUnique.VestigesOfEidolonsSkill;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.impl.SkillRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class StarlightUniqueSkills {

    //public static final RegistrySupplier<ManasSkill> BUTCHER = register("butcher", ButcherSkill::new); (Thanks Myst)
    public static final RegistrySupplier<ManasSkill> LIGHT_REMAINS = register("light_remains", LightRemainsSkill::new);
    public static final RegistrySupplier<ManasSkill> ECHO_ENDURES = register("echo_endures", EchoEnduresSkill::new);
    public static final RegistrySupplier<ManasSkill> LIFE_RETURNS = register("life_returns", LifeReturnsSkill::new);
    public static final RegistrySupplier<ManasSkill> CURRENT_UNBROKEN = register("current_unbroken", CurrentUnbrokenSkill::new);
    public static final RegistrySupplier<ManasSkill> EMBER_REMAINS = register("ember_remains", EmberRemainsSkill::new);
    public static final RegistrySupplier<ManasSkill> SHAPE_FORGOTTEN = register("shape_forgotten", ShapeForgottenSkill::new);
    public static final RegistrySupplier<ManasSkill> VESTIGES_OF_EIDOLONS = register("vestiges_of_eidolons", VestigesOfEidolonsSkill::new);
    public static final RegistrySupplier<ManasSkill> REMNANTS_OF_ASCENSION = register("remnants_of_ascension", RemnantsOfAscensionSkill::new);

    private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath("trstarlight", name), supplier);
    }

    public static void init() {
    }
}
