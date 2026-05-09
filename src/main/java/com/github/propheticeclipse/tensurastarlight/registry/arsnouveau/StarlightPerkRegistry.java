package com.github.propheticeclipse.tensurastarlight.registry.arsnouveau;

import com.github.propheticeclipse.tensurastarlight.TensuraStarlight;
import com.hollingsworth.arsnouveau.api.documentation.DocAssets;
import com.hollingsworth.arsnouveau.api.perk.PerkSlot;
import com.hollingsworth.arsnouveau.api.registry.PerkRegistry;
import com.hollingsworth.arsnouveau.api.spell.SpellTier;
import com.hollingsworth.arsnouveau.common.items.data.ArmorPerkHolder;
import com.hollingsworth.arsnouveau.setup.registry.DataComponentRegistry;
import io.github.manasmods.tensura.Tensura;
import io.github.manasmods.tensura.registry.item.TensuraArmorItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import java.util.Arrays;

public class StarlightPerkRegistry {

    public static final PerkSlot PERK_FOUR = registerPerkSlot( "four", 4);
    public static final PerkSlot PERK_FIVE = registerPerkSlot( "five", 5);
    public static final PerkSlot PERK_SIX = registerPerkSlot( "six", 6);
    public static final PerkSlot PERK_SEVEN = registerPerkSlot( "seven", 7);
    public static final PerkSlot PERK_EIGHT = registerPerkSlot( "eight", 8);
    public static final PerkSlot PERK_NINE = registerPerkSlot( "nine", 9);

    private static PerkSlot registerPerkSlot(String name, int value) {
        PerkSlot slot = new PerkSlot(TensuraStarlight.prefix(name), value);
        PerkSlot.PERK_SLOTS.put(slot.id(), slot);
        return slot;
    }

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

    @SubscribeEvent
    public static void onLivingTick(LivingEvent event) {

        LivingEntity entity = event.getEntity();

        for (ItemStack stack : entity.getArmorSlots()) {

            ArmorPerkHolder holder =
                    stack.get(DataComponentRegistry.ARMOR_PERKS.get());

            if (holder == null) continue;

            // force sync from UI edits into actual storage
            stack.set(
                    DataComponentRegistry.ARMOR_PERKS.get(),
                    holder
            );
        }
    }
}
