package net.dimensionshift.main;

public class DedicatedServerProxy extends CommonProxy {

	@Override
	public void preInit() {
		super.preInit();
		System.out.println("DedicatedServer PreInit");
	}

	@Override
	public void init() {
		super.init();
	}

	@Override
	public void postInit() {
		super.postInit();
	}
}
