package net.preea.apericraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.preea.apericraft.Apericraft;

public class ToolsTab extends CreativeTabs{
	
	public ToolsTab(int id, String string) {
		super(id, string);
	}
	public int getTabIconItemIndex(){
		return Apericraft.CopperOre.blockID;
	}
	public String getTranslatedTabLabel(){
		return "Apericraft - Tools";
	}

}
