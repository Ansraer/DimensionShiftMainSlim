package net.dimensionshift.main.client.render;

import net.dimensionshift.main.items.ItemBasic;
import net.dimensionshift.main.registry.ItemRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemRenderRegister {

	public static void registerItemRenderer() {
		for (ItemBasic item : ItemRegistry.items) {
			register(item);
		}
	}

	@SubscribeEvent
	public static void registerItems(final ModelRegistryEvent event) {
		for (final Item item : ItemRegistry.items) {

			registerNew(item);

		}
	}

	public static void registerNew(Item item) {
		// normal items
		if (!item.getHasSubtypes()) {
			ModelLoader.setCustomModelResourceLocation(item, 0,
					new ModelResourceLocation(item.getRegistryName(), "inventory"));
		} else {
			NonNullList<ItemStack> list = NonNullList.create();
			item.getSubItems(null, list);
			for (ItemStack stack : list) {
				ModelLoader.setCustomModelResourceLocation(item, stack.getItemDamage(),
						new ModelResourceLocation(item.getRegistryName(), "test=2"));
			}
		}
	}

	public static void register(ItemBasic item) {
		// normal items
		if (!item.getHasSubtypes()) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
					new ModelResourceLocation(item.getRegistryName(), "inventory"));
		} else {
			NonNullList<ItemStack> list = NonNullList.create();
			item.getSubItems(null, list);
			for (ItemStack stack : list) {
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, stack.getItemDamage(),
						new ModelResourceLocation(item.getRegistryName(), "inventory"));
			}
		}

	}
}
