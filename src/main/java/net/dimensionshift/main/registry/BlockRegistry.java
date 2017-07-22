package net.dimensionshift.main.registry;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Preconditions;

import net.dimensionshift.main.block.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockRegistry {

	public static List<Block> blocks = new ArrayList<Block>();

	// test block. REMOVE!!!
	static final Block TEST;

	static {
		// TEST BLOCK, REMOVE
		TEST = new BlockBasic(Material.GROUND, "foo");

		// TO-DO: group blocks somehow. Remove unused blocks

	}

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		for (Block b : blocks)
			event.getRegistry().register(b);
	}

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		for (Block b : blocks) {
			final ResourceLocation registryName = Preconditions.checkNotNull(b.getRegistryName(),
					"Block %s has null registry name", b);
			event.getRegistry().register(new ItemBlock(b).setRegistryName(registryName));
		}
	}
}
