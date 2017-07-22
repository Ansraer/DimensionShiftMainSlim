package net.dimensionshift.main.block;

import net.dimensionshift.main.DSMain;
import net.dimensionshift.main.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBasic extends Block {

	public BlockBasic(final Material materialIn, final String blockName) {
		this(materialIn, materialIn.getMaterialMapColor(), blockName);
	}

	public BlockBasic(final Material material, final MapColor mapColor, final String blockName) {
		this(material, mapColor, blockName, DSMain.DS_TAB);
	}

	public BlockBasic(final Material material, final MapColor mapColor, final String blockName, CreativeTabs tab) {
		super(material, mapColor);
		setBlockName(this, blockName);
		setCreativeTab(tab);
		BlockRegistry.blocks.add(this);
	}

	/**
	 * Set the registry name of {@code block} to {@code blockName} and the
	 * unlocalised name to the full registry name.
	 *
	 * @param block
	 *            The block
	 * @param blockName
	 *            The block's name
	 */
	public static void setBlockName(final Block block, final String blockName) {
		block.setRegistryName(DSMain.MODID, blockName);
		block.setUnlocalizedName(blockName);
	}
}