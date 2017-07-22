package net.dimensionshift.main;

import net.dimensionshift.main.client.render.BlockRenderRegister;
import net.dimensionshift.main.client.render.ItemRenderRegister;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit() {
		super.preInit();
		System.out.println("Client PreInit");
		MinecraftForge.EVENT_BUS.register(ItemRenderRegister.class);
	}

	@Override
	public void init() {
		super.init();

		// registers all the item icons
		// ItemRenderRegister.registerItemRenderer();

		BlockRenderRegister.registerBlockRenderer();
	}

	@Override
	public void postInit() {
		super.postInit();
	}
}
