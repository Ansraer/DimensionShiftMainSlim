package net.dimensionshift.main;

import net.dimensionshift.main.registry.BlockRegistry;
import net.dimensionshift.main.registry.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

	public void preInit() {
		System.out.println("Common PreInit");

		// registering Items
		MinecraftForge.EVENT_BUS.register(ItemRegistry.class);

		// registering Blocks, ItemBlocks and stuff
		MinecraftForge.EVENT_BUS.register(BlockRegistry.class);
	}

	public void init() {
		// TO-DO: Split following event handler up into more files.

	}

	public void postInit() {
	}

}
