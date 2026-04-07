package com.github.propheticeclipse.tensurastarlight.registry.skills;

import com.github.propheticeclipse.tensurastarlight.ability.skill.intrinsic.arsnoveau.*;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.impl.SkillRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class StarlightIntrinsicSkills {
    public static final RegistrySupplier<ManasSkill> AMETHYST_GOLEM_GENETICS = register("amethyst_golem_genetics", amethystGolemGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> DRYGMY_GENETICS = register("drygmy_genetics", drygmyGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> FLARECANNON_GENETICS = register("flarecannon_genetics", flarecannonGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> FLASHJACK_GENETICS = register("flashjack_genetics", flashjackGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> SIREN_GENETICS = register("siren_genetics", sirenGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> STARBUNCLE_GENETICS = register("starbuncle_genetics", starbuncleGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> WHIRLISPRIG_GENETICS = register("whirlisprig_genetics", whirlisprigGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> WILDEN_GUARDIAN_GENETICS = register("wilden_guardian_genetics", wildenGuardianGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> WILDEN_HUNTER_GENETICS = register("wilden_hunter_genetics", wildenHunterGeneticsSkill::new);
    public static final RegistrySupplier<ManasSkill> WILDEN_STALKER_GENETICS = register("wilden_stalker_genetics", wildenStalkerGeneticsSkill::new);

    private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath("trstarlight", name), supplier);
    }

    public static void init() {
    }
}
