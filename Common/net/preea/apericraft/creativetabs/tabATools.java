package net.preea.apericraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.preea.apericraft.declarations.ABlocks;
import net.preea.apericraft.declarations.AItems;

public class tabATools extends CreativeTabs {

	public tabATools(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return AItems.Aluminium_Axe;
	}

}
