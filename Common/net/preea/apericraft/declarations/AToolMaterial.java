package net.preea.apericraft.declarations;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AToolMaterial {
	public static ToolMaterial ALUMINIUM = EnumHelper.addToolMaterial("ALUMINIUM", 1,150, 3F, 1F, 14);
	public static ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 240, 4F, 2F, 12);
	public static ToolMaterial LEAD = EnumHelper.addToolMaterial("LEAD", 2, 400, 6F, 3F, 0);
	public static ToolMaterial SILVER = EnumHelper.addToolMaterial("SILVER", 2, 540, 8F, 4F, 20);
	public static ToolMaterial TIN = EnumHelper.addToolMaterial("TIN", 1, 240, 4F, 2F, 4);
	public static ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 3, 2561, 12F, 7F, 25);
	
}
