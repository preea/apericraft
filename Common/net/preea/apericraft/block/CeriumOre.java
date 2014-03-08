package net.preea.apericraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.preea.apericraft.Apericraft;
import net.preea.apericraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CeriumOre extends Block {

	public CeriumOre(int id, Material material) {
		super(id, material);
		this.setCreativeTab(Apericraft.tabApericraftBlocks);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundStoneFootstep);
	}
	@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
