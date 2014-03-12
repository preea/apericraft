package net.preea.apericraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.preea.apericraft.Apericraft;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.lib.Reference;

public class Silver_Ore extends Block {
	public Silver_Ore(){
		super(Material.rock);
		this.setCreativeTab(ACreativeTabs.TabABlocks);	
		this.setHardness(5F);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 2);	
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister IconRegister){
		this.blockIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));
	}
}
