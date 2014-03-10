package net.preea.apericraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.preea.apericraft.Apericraft;
import net.preea.apericraft.lib.Reference;

public class AluminiumAxe extends ItemAxe {

	public AluminiumAxe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setCreativeTab(Apericraft.tabApericraftTools);

	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
	this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
