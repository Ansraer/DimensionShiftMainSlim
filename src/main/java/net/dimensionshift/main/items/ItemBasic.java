package net.dimensionshift.main.items;

import net.dimensionshift.main.DSMain;
import net.dimensionshift.main.registry.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

	public ItemBasic(final String itemName) {
		this(itemName, DSMain.DS_TAB);
	}

	public ItemBasic(final String itemName, CreativeTabs tab) {
		setItemName(this, itemName);
		this.setCreativeTab(tab);
		ItemRegistry.items.add(this);
	}

	public static void setItemName(final Item item, final String itemName) {
		item.setRegistryName(DSMain.MODID, itemName);
		item.setUnlocalizedName(itemName);
	}
}