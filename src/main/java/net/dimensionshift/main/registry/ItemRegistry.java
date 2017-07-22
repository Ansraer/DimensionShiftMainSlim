package net.dimensionshift.main.registry;

import java.util.ArrayList;
import java.util.List;

import net.dimensionshift.main.items.ItemBasic;
import net.dimensionshift.main.items.ItemGlassBottleChaosEssence;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemRegistry {

	public static List<ItemBasic> items = new ArrayList<ItemBasic>();

	// removed all other items. GLASS_BOTTLE is the problem. CHAOS ESSENCE DROP is
	// proof that normal items work.

	// TO-DO: replace texture, dust is the wrong one.
	public static final Item CHAOS_ESSENCE_DROP;
	public static final Item GLASS_BOTTLE_CHAOS_ESSENCE;

	static {

		// chaos essence stuff
		CHAOS_ESSENCE_DROP = new ItemBasic("chaos_essence_drop").setMaxStackSize(1);
		GLASS_BOTTLE_CHAOS_ESSENCE = new ItemGlassBottleChaosEssence("glass_bottle_chaos_essence");

	}

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		for (final Item item : items) {
			event.getRegistry().register(item);
		}
	}

}
