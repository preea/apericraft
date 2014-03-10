package net.preea.apericraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.preea.apericraft.Apericraft;
import net.preea.apericraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AluminiumHoe extends ItemHoe {
	public AluminiumHoe(int id, EnumToolMaterial toolMaterial) {
	super(id, toolMaterial);
	this.setCreativeTab(Apericraft.tabApericraftTools);

}
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister){
this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
}
}
