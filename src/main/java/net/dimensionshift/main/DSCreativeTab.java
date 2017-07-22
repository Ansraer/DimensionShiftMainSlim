package net.dimensionshift.main;

import java.util.Collections;
import java.util.Comparator;

import net.dimensionshift.main.registry.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class DSCreativeTab extends CreativeTabs {
	private ItemSorter itemSorter = new ItemSorter();

	public DSCreativeTab(String label) {
		super(label);

	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemRegistry.CHAOS_ESSENCE_DROP);
	}

	@Override
	public void displayAllRelevantItems(NonNullList<ItemStack> items) {
		super.displayAllRelevantItems(items);

		Collections.sort(items, itemSorter);
	}

	// Sorts items in alphabetical order using their display names
	private static class ItemSorter implements Comparator<ItemStack> {

		@Override
		public int compare(ItemStack o1, ItemStack o2) {
			Item item1 = o1.getItem();
			Item item2 = o2.getItem();

			if (((item1 instanceof ItemBlock)) && (!(item2 instanceof ItemBlock))) {
				return -1;
			}

			if (((item2 instanceof ItemBlock)) && (!(item1 instanceof ItemBlock))) {
				return 1;
			}

			String displayName1 = o1.getDisplayName();
			String displayName2 = o2.getDisplayName();

			int result = displayName1.compareToIgnoreCase(displayName2);

			return result;
		}
	}
}