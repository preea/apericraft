package net.preea.apericraft.declarations;

import net.minecraft.creativetab.CreativeTabs;
import net.preea.apericraft.creativetabs.tabABlocks;
import net.preea.apericraft.creativetabs.tabAItems;

public class ACreativeTabs {
	public static CreativeTabs TabABlocks = new tabABlocks(CreativeTabs.getNextID(), "TabABlocks");
	public static CreativeTabs TabAItems = new tabAItems(CreativeTabs.getNextID(), "TabAItems");
}
