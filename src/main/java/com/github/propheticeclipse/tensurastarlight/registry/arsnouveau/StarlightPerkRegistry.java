package com.github.propheticeclipse.tensurastarlight.registry.arsnouveau;

import com.github.propheticeclipse.tensurastarlight.TensuraStarlight;
import com.hollingsworth.arsnouveau.api.documentation.DocAssets;
import com.hollingsworth.arsnouveau.api.perk.PerkSlot;
import com.hollingsworth.arsnouveau.api.registry.PerkRegistry;
import com.hollingsworth.arsnouveau.api.spell.SpellTier;
import com.hollingsworth.arsnouveau.common.items.data.ArmorPerkHolder;
import com.hollingsworth.arsnouveau.setup.registry.APIRegistry;
import com.hollingsworth.arsnouveau.setup.registry.DataComponentRegistry;
import io.github.manasmods.tensura.Tensura;
import io.github.manasmods.tensura.registry.item.TensuraArmorItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class StarlightPerkRegistry {

    @SubscribeEvent
    public static void modifyComponents(ModifyDefaultComponentsEvent event) {

        event.modify(
                TensuraArmorItems.ADAMANTITE_BOOTS.get(),

                builder -> builder.set(
                        DataComponentRegistry.ARMOR_PERKS.get(),
                        new ArmorPerkHolder()
                )
        );
    }

    public static void constructThreads() {
        PerkRegistry.registerPerkProvider(
                TensuraArmorItems.ADAMANTITE_BOOTS.get(),
                Arrays.asList(
                        Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.ONE)
                )
        );
    }
}
