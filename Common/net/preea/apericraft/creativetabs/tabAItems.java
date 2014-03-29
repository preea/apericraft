package net.preea.apericraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.preea.apericraft.declarations.ABlocks;
import net.preea.apericraft.declarations.AItems;

public class tabAItems extends CreativeTabs {

	public tabAItems(int par1, String string) {
		super(par1, string);
	}

	@Override
	public Item getTabIconItem() {
		return AItems.Aluminium_Ingot;
	}

}
