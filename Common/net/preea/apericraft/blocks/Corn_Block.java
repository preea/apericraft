package net.preea.apericraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.preea.apericraft.Crophandler.CropsCorn;
import net.preea.apericraft.declarations.AItems;
import net.preea.apericraft.lib.Reference;

public class Corn_Block extends CropsCorn{

	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;
	
	public Corn_Block(){
	this.setBlockName("CornCrop");
	this.setBlockTextureName(Reference.MODID + ":" + "CornCrop_1");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata){
		return iconArray [metadata & 7];}

	protected Item getSeedItem(){
		return AItems.Corn_Seed;
	}
	
	protected Item getCropItem(){
		return AItems.Corn;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.iconArray = new IIcon[8];
		iconArray[0] = iconRegister.registerIcon(Reference.MODID + ":" + "CornCrop_1");
		iconArray[1] = iconRegister.registerIcon(Reference.MODID + ":" + "CornCrop_2");
		iconArray[2] = iconRegister.registerIcon(Reference.MODID + ":" + "CornCrop_3");
		iconArray[3] = iconRegister.registerIcon(Reference.MODID + ":" + "CornCrop_4");
		iconArray[4] = iconRegister.registerIcon(Reference.MODID + ":" + "CornCrop_5");
		iconArray[5] = iconRegister.registerIcon(Reference.MODID + ":" + "CornCrop_6");
		iconArray[6] = iconRegister.registerIcon(Reference.MODID + ":" + "CornCrop_7");
		iconArray[7] = iconRegister.registerIcon(Reference.MODID + ":" + "CornCrop_8");
		
		
	
	
	
	}

}
