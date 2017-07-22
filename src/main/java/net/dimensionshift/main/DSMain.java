package net.dimensionshift.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DSMain.MODID, version = DSMain.VERSION)
public class DSMain {
	public static final String MODID = "dimensionshiftmain";
	public static final String VERSION = "1.0";

	@SidedProxy(clientSide = "net.dimensionshift.main.ClientProxy", serverSide = "net.dimensionshift.main.DedicatedServerProxy")
	public static CommonProxy proxy;

	public static final CreativeTabs DS_TAB = new DSCreativeTab("ds_tab");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("slim run configuration");
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}

}
