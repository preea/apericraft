package net.preea.apericraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.lib.Reference;

public class Silver_Block extends Block{
 public Silver_Block(){
		super(Material.rock);
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(ACreativeTabs.TabABlocks);
		this.setHardness(4F);
		this.setResistance(10F);
 }
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister IconRegister){
		this.blockIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));
	}
}
