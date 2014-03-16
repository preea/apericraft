package net.preea.apericraft.loadhandler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.preea.apericraft.blocks.Aluminium_Ore;
import net.preea.apericraft.declarations.ABlocks;
import net.preea.apericraft.declarations.AItems;
import net.preea.apericraft.items.Aluminium_Ingot;
import net.preea.apericraft.items.Copper_Ingot;
import net.preea.apericraft.items.Greenstone;
import net.preea.apericraft.items.Lead_Ingot;
import net.preea.apericraft.items.Silver_Ingot;
import net.preea.apericraft.items.Tin_Ingot;
import net.preea.apericraft.items.Titanium_Ingot;

public class LoadItems {
public static void Ingots(){
	AItems.Aluminium_Ingot = new Aluminium_Ingot();
	GameRegistry.registerItem(AItems.Aluminium_Ingot, "AluminiumIngot");
	
	AItems.Tin_Ingot = new Tin_Ingot();
	GameRegistry.registerItem(AItems.Tin_Ingot, "TinIngot");
	
	AItems.Copper_Ingot = new Copper_Ingot();
	GameRegistry.registerItem(AItems.Copper_Ingot, "CopperIngot");
	
	AItems.Lead_Ingot = new Lead_Ingot();
	GameRegistry.registerItem(AItems.Lead_Ingot, "LeadIngot");
	
	AItems.Silver_Ingot = new Silver_Ingot();
	GameRegistry.registerItem(AItems.Silver_Ingot, "SilverIngot");
	
	AItems.Titanium_Ingot = new Titanium_Ingot();
	GameRegistry.registerItem(AItems.Titanium_Ingot, "TitaniumIngot");
}
public static void Dusts() {
	AItems.Greenstone = new Greenstone();
	GameRegistry.registerItem(AItems.Greenstone, "Greenstone");

}
}
