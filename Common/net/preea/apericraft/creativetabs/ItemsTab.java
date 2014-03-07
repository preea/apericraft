package net.preea.apericraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.preea.apericraft.Apericraft;

public class ItemsTab extends CreativeTabs{

	public ItemsTab(int id, String string) {
	super(id, string);
	}
	public int getTabItemIconIndex(){
	return Apericraft.CopperIngot.itemID;
	}
	public String getTranslatedTabLabel(){
	return "Apericraft - Items";
}

}

