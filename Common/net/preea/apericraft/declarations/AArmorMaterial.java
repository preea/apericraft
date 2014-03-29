package net.preea.apericraft.declarations;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AArmorMaterial {
public static ArmorMaterial ALUMINIUM = EnumHelper.addArmorMaterial("ALUMINIUM",11 , new int[]{1, 4, 3, 1}, 16);
public static ArmorMaterial COPPER = EnumHelper.addArmorMaterial("COPPER",12 , new int[]{2, 5, 4, 1}, 14);
public static ArmorMaterial LEAD = EnumHelper.addArmorMaterial("LEAD",11 , new int[]{2, 5, 5, 2}, 0);
public static ArmorMaterial SILVER = EnumHelper.addArmorMaterial("SILVER",11 , new int[]{2, 7, 5, 2}, 22);
public static ArmorMaterial TIN = EnumHelper.addArmorMaterial("TIN",12 , new int[]{2, 5, 4, 1}, 6);
public static ArmorMaterial TITANIUM = EnumHelper.addArmorMaterial("TITANIUM",11 , new int[]{3, 9, 7, 3}, 27);
}
