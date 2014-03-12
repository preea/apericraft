package net.preea.apericraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.preea.apericraft.declarations.ABlocks;

public class tabABlocks extends CreativeTabs {

	public tabABlocks(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ABlocks.Copper_Ore);
	}

}
