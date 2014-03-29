package net.preea.apericraft.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Corn extends ItemFood{
	
	public Corn(){
		super(4, 0F, false);
		this.setMaxStackSize(64);
		this.setCreativeTab(ACreativeTabs.TabAItems);
		this.setUnlocalizedName("Corn");
	}
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
    	list.add("\u00a7aCoorrrnnnnn");
    	list.add("\u00a7anom nom nom...Yummy");
    	
    }
    public String getItemStackDisplayName(ItemStack par1ItemStack)
    {
        return ("\u00a7c" + StatCollector.translateToLocal(this.getUnlocalizedNameInefficiently(par1ItemStack) + ".name")).trim();
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister IconRegister){
		this.itemIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));

}}
