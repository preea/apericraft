package net.preea.apericraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.lib.Reference;

public class Green_Infused_Soil extends Block{

	public Green_Infused_Soil() {
		super(Material.ground);
		this.setCreativeTab(ACreativeTabs.TabABlocks);	
		this.setHardness(5F);
		this.setResistance(10F);
		this.setLightLevel(0.5F);
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister IconRegister){
		this.blockIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));
	}
}
