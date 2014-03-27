package net.preea.apericraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.lib.Reference;

public class Titanium_Axe extends ItemAxe{

	public Titanium_Axe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("TitaniumAxe");
		this.setCreativeTab(ACreativeTabs.TabATools);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister IconRegister){
		this.itemIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));
	}
}