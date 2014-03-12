package net.preea.apericraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.lib.Reference;

public class Silver_Ingot extends Item {
public Silver_Ingot(){
	this.setUnlocalizedName("SilverIngot");
	this.setCreativeTab(ACreativeTabs.TabAItems);
}
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister IconRegister){
	this.itemIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));
}
}
