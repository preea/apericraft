package net.preea.apericraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.preea.apericraft.Apericraft;
import net.preea.apericraft.lib.Reference;

public class TitaniumBlock extends Block{

	public TitaniumBlock(int id, Material material) {
		super(id, material);
		this.setCreativeTab(Apericraft.tabApericraftBlocks);
		this.setHardness(4);
		this.setResistance(6);
	}
	@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
