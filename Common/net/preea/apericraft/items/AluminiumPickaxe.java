package net.preea.apericraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.preea.apericraft.Apericraft;
import net.preea.apericraft.lib.Reference;

public class AluminiumPickaxe extends ItemPickaxe{

	public AluminiumPickaxe(int id, EnumToolMaterial ToolMaterial) {
		super(id, ToolMaterial);
		this.setCreativeTab(Apericraft.tabApericraftTools);

	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
	this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
