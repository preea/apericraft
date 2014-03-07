package net.preea.apericraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperBlock extends Block{

	public CopperBlock(int id, Material material) {
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
}
}