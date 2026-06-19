package com.github.propheticeclipse.tensurastarlight.registry;

import com.github.propheticeclipse.tensurastarlight.effect.buff.*;
import com.github.propheticeclipse.tensurastarlight.effect.debuff.ExistenceDrainEffect;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;

public class StarlightEffects {
    public static void init() {
        MOB_EFFECTS.register();
    }

    private static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create("trstarlight", Registries.MOB_EFFECT);
    public static final RegistrySupplier<MobEffect> EMBER_ATTACK_IMPROVEMENT = MOB_EFFECTS.register("ember_attack_improvement", EmberAttackImprovementEffect::new);
    public static final RegistrySupplier<MobEffect> SHAPE_FORGOTTEN_ARMOR = MOB_EFFECTS.register("shape_forgotten_armor", ShapeForgottenArmorEffect::new);
    public static final RegistrySupplier<MobEffect> REMNANT_ASCENSION_ARMOR = MOB_EFFECTS.register("remnant_ascension_armor", RemnantsOfAscensionArmorEffect::new);

    public static final RegistrySupplier<MobEffect> SOUL_AEGIS = MOB_EFFECTS.register("soul_aegis", SoulAegisEffect::new);
    public static final RegistrySupplier<MobEffect> EXISTENCE_REGENERATION = MOB_EFFECTS.register("existence_regeneration", ExistenceRegenerationEffect::new);
    public static final RegistrySupplier<MobEffect> EXISTENCE_DRAIN = MOB_EFFECTS.register("existence_drain", ExistenceDrainEffect::new);
    public static final RegistrySupplier<MobEffect> HEALTH_REGEN = MOB_EFFECTS.register("health_regen", HealthRegenerationEffect::new);
    public static final RegistrySupplier<MobEffect> SPIRITUAL_REGEN = MOB_EFFECTS.register("spiritual_regen", SpiritualHealthRegenerationEffect::new);
    public static final RegistrySupplier<MobEffect> SOURCE_BLOOD_REJUVENATION = MOB_EFFECTS.register("source_blood_rejuvenation", SourceBloodRejuvenationEffect::new);
}
