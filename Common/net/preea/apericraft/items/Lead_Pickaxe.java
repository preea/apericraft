package net.preea.apericraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.lib.Reference;

public class Lead_Pickaxe extends ItemPickaxe{

	public Lead_Pickaxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("LeadPickaxe");
		this.setCreativeTab(ACreativeTabs.TabATools);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister IconRegister){
		this.itemIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));
	}
}
