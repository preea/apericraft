package net.preea.apericraft.declarations;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AToolMaterial {
	public static ToolMaterial ALUMINIUM = EnumHelper.addToolMaterial("Aluminium Material", 1,150, 3F, 1F, 14);
	public static ToolMaterial COPPER = EnumHelper.addToolMaterial("Copper Material", 1, 240, 4F, 2F, 12);
	public static ToolMaterial LEAD = EnumHelper.addToolMaterial("Lead Material", 2, 400, 6F, 3F, 0);
	public static ToolMaterial SILVER = EnumHelper.addToolMaterial("Silver Material", 2, 540, 8F, 4F, 20);
	public static ToolMaterial TIN = EnumHelper.addToolMaterial("Tin Material", 1, 240, 4F, 2F, 4);
	public static ToolMaterial TITANIUM = EnumHelper.addToolMaterial("Titanium Material", 3, 2561, 12F, 7F, 25);
	
}
