package com.github.propheticeclipse.tensurastarlight.data.existence;

import com.hollingsworth.arsnouveau.setup.registry.ModEntities;
import io.github.manasmods.tensura.data.existence.EntityExistenceData;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import io.github.manasmods.tensura.registry.skill.UniqueSkills;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class StarlightEntityExistenceData {

    public static void bootstrap(BootstrapContext<EntityExistenceData> context) {
        applyArsNouveau(context);
    }

    public static void register(BootstrapContext<EntityExistenceData> context, EntityExistenceData data) {
        ResourceKey<EntityExistenceData> key = ResourceKey.create(TensuraCustomData.ENTITY_EXISTENCE, data.entity());
        context.register(key, data);
    }

    private static void applyArsNouveau(BootstrapContext<EntityExistenceData> context) {
        /*
        List<ResourceLocation> okamiSkills = new ArrayList();
        okamiSkills.add(CommonSkills.SELF_REGENERATION.getId());
        okamiSkills.add(IntrinsicSkills.BEAST_TRANSFORMATION.getId());
        register(context, EntityExistenceData.getDefault(MysticismMonsterEntityTypes.OKAMI.getId(), 70, 300, 600, 1500, 2500, okamiSkills));
        */

        Map<ResourceLocation, Double> randomAbilities = new HashMap<>();
        // THIS IS A TEST AND NOT REPRESENTATIVE OF FACT.
        randomAbilities.put(UniqueSkills.GREAT_SAGE.getId(), 0.8);

        register(context, EntityExistenceData.getDefault(ModEntities.ENTITY_DRYGMY.getId(), 40, 1000, 1000, 1000, 1000, null, null, randomAbilities));
    }
}
