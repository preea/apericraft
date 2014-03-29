package net.preea.apericraft.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.preea.apericraft.declarations.AItems;
import net.preea.apericraft.lib.Reference;

public class AluminiumArmor extends ItemArmor {

	private String[] armorTypes = new String []{"Aluminium_Helmet","Aluminium_Chestplate","Aluminium_Legs","Aluminium_Boots"};

	public AluminiumArmor(ArmorMaterial material, int renderIndex, int armorType){
		super(material, renderIndex, armorType);
	}
	public String getItemStackDisplayName(ItemStack par1ItemStack)
    {
        return ("\u00a7c" + StatCollector.translateToLocal(this.getUnlocalizedNameInefficiently(par1ItemStack) + ".name")).trim();
    }

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity,int Slot, String Layer){
		if(stack.getItem().equals(AItems.Aluminium_Helmet)||stack.getItem().equals(AItems.Aluminium_Chestplate)||stack.getItem().equals(AItems.Aluminium_Boots)){
			return "apericraft:textures/models/armor/AluminiumArmor_1.png";
		}
		if(stack.getItem().equals(AItems.Aluminium_Legs)){
			return "apericraft:textures/models/armor/AluminiumArmor_2.png";
		}
		else return null;
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister){
		if (this == AItems.Aluminium_Helmet)
			this.itemIcon = iconRegister.registerIcon(Reference.MODID + ":" + "AluminiumHelmet");
		if (this == AItems.Aluminium_Chestplate)
			this.itemIcon = iconRegister.registerIcon(Reference.MODID + ":" + "AluminiumChestplate");
		if (this == AItems.Aluminium_Legs)
			this.itemIcon = iconRegister.registerIcon(Reference.MODID + ":" + "AluminiumLegs");
		if (this == AItems.Aluminium_Boots)
			this.itemIcon = iconRegister.registerIcon(Reference.MODID + ":" + "AluminiumBoots");
	}
}
