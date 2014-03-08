package net.preea.apericraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.preea.apericraft.Apericraft;

public class BlocksTab extends CreativeTabs {

	public BlocksTab(int id, String string) {
		super(id, string);
	}
	public int getTabIconItemIndex(){
		return Apericraft.CopperOre.blockID;
	}
	public String getTranslatedTabLabel(){
		return "Apericraft - Blocks";
	}

}
