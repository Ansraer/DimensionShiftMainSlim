package net.dimensionshift.main.client.render;

import net.dimensionshift.main.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

	// update this. all.
	public static void registerBlockRenderer() {
		for (Block block : BlockRegistry.blocks) {
			register(block);
		}
	}

	// and this too
	public static void register(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
