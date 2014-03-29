package net.preea.apericraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.lib.Reference;

public class Lead_Hoe extends ItemHoe {

	public Lead_Hoe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("LeadHoe");
		this.setCreativeTab(ACreativeTabs.TabATools);
	}
	 public String getItemStackDisplayName(ItemStack par1ItemStack)
	    {
	        return ("\u00a7c" + StatCollector.translateToLocal(this.getUnlocalizedNameInefficiently(par1ItemStack) + ".name")).trim();
	    }
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister IconRegister){
		this.itemIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));
	}
}
