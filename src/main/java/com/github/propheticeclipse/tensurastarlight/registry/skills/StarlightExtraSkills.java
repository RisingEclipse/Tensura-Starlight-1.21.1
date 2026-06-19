package com.github.propheticeclipse.tensurastarlight.registry.skills;

import com.github.hvnbael.trnightmare.config.races.canonraces.ManasRaceConfig;
import com.github.propheticeclipse.tensurastarlight.ability.skill.extra.*;
import com.github.propheticeclipse.tensurastarlight.ability.skill.extra.arsnouveau.*;
import com.github.propheticeclipse.tensurastarlight.ability.skill.extra.malum.spiritSorcererSkill;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.impl.SkillRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class StarlightExtraSkills {
    public static final RegistrySupplier<ManasSkill> DEAD_END_RAINBOW_SKILL = register("unleashed_dead_end", deadEndRainbowSkill::new);
    public static final RegistrySupplier<ManasSkill> ABNORMALLY_LUCKY = register("abnormally_lucky", abnormallyLuckySkill::new);
    public static final RegistrySupplier<ManasSkill> HYPER_METABOLISTIC = register("hyper_metabolistic", hyperMetabolisticSkill::new);
    public static final RegistrySupplier<ManasSkill> PLASMATIC_SOURCE = register("plasmatic_source", plasmaticSourceSkill::new);
    public static final RegistrySupplier<ManasSkill> SOURCE_POWERED = register("source_powered", sourcePoweredSkill::new);
    public static final RegistrySupplier<ManasSkill> WILDEN_STALK = register("wilden_stalk", wildenStalkSkill::new);

    public static final RegistrySupplier<ManasSkill> SPIRIT_SORCERER = register("spirit_sorcerer", spiritSorcererSkill::new);
    public static final RegistrySupplier<ManasSkill> SOURCE_BLOOD = register("source_blood", sourceBloodSkill::new);

    private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath("trstarlight", name), supplier);
    }

    public static void init() {
    }
}
