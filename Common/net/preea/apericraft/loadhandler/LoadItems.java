package net.preea.apericraft.loadhandler;

import net.minecraft.item.Item.ToolMaterial;
import net.preea.apericraft.declarations.AItems;
import net.preea.apericraft.declarations.AToolMaterial;
import net.preea.apericraft.items.Aluminium_Axe;
import net.preea.apericraft.items.Aluminium_Hoe;
import net.preea.apericraft.items.Aluminium_Ingot;
import net.preea.apericraft.items.Aluminium_Pickaxe;
import net.preea.apericraft.items.Aluminium_Spade;
import net.preea.apericraft.items.Aluminium_Sword;
import net.preea.apericraft.items.Copper_Axe;
import net.preea.apericraft.items.Copper_Hoe;
import net.preea.apericraft.items.Copper_Ingot;
import net.preea.apericraft.items.Copper_Pickaxe;
import net.preea.apericraft.items.Copper_Spade;
import net.preea.apericraft.items.Copper_Sword;
import net.preea.apericraft.items.Greenstone;
import net.preea.apericraft.items.Lead_Axe;
import net.preea.apericraft.items.Lead_Hoe;
import net.preea.apericraft.items.Lead_Ingot;
import net.preea.apericraft.items.Lead_Pickaxe;
import net.preea.apericraft.items.Lead_Spade;
import net.preea.apericraft.items.Lead_Sword;
import net.preea.apericraft.items.Silver_Axe;
import net.preea.apericraft.items.Silver_Hoe;
import net.preea.apericraft.items.Silver_Ingot;
import net.preea.apericraft.items.Silver_Pickaxe;
import net.preea.apericraft.items.Silver_Spade;
import net.preea.apericraft.items.Silver_Sword;
import net.preea.apericraft.items.Tin_Axe;
import net.preea.apericraft.items.Tin_Hoe;
import net.preea.apericraft.items.Tin_Ingot;
import net.preea.apericraft.items.Tin_Pickaxe;
import net.preea.apericraft.items.Tin_Spade;
import net.preea.apericraft.items.Tin_Sword;
import net.preea.apericraft.items.Titanium_Axe;
import net.preea.apericraft.items.Titanium_Hoe;
import net.preea.apericraft.items.Titanium_Ingot;
import net.preea.apericraft.items.Titanium_Pickaxe;
import net.preea.apericraft.items.Titanium_Spade;
import net.preea.apericraft.items.Titanium_Sword;
import cpw.mods.fml.common.registry.GameRegistry;

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
public static void Swords(){
	AItems.Aluminium_Sword = new Aluminium_Sword(AToolMaterial.ALUMINIUM);
	GameRegistry.registerItem(AItems.Aluminium_Sword, "AluminiumSword");
	
	AItems.Copper_Sword = new Copper_Sword(AToolMaterial.COPPER);
	GameRegistry.registerItem(AItems.Copper_Sword, "CopperSword");
	
	AItems.Lead_Sword = new Lead_Sword(AToolMaterial.LEAD);
	GameRegistry.registerItem(AItems.Lead_Sword, "LeadSword");
	
	AItems.Silver_Sword = new Silver_Sword(AToolMaterial.SILVER);
	GameRegistry.registerItem(AItems.Silver_Sword, "SilverSword");
	
	AItems.Tin_Sword = new Tin_Sword(AToolMaterial.TIN);
	GameRegistry.registerItem(AItems.Tin_Sword, "TinSword");
	
	AItems.Titanium_Sword = new Titanium_Sword(AToolMaterial.TITANIUM);
	GameRegistry.registerItem(AItems.Titanium_Sword, "TitaniumSword");
}
public static void Pickaxes(){
	AItems.Aluminium_Pickaxe = new Aluminium_Pickaxe(AToolMaterial.ALUMINIUM);
	GameRegistry.registerItem(AItems.Aluminium_Pickaxe, "AluminiumPickaxe");
	
	AItems.Copper_Pickaxe = new Copper_Pickaxe(AToolMaterial.COPPER);
	GameRegistry.registerItem(AItems.Copper_Pickaxe, "CopperPickaxe");
	
	AItems.Lead_Pickaxe = new Lead_Pickaxe(AToolMaterial.LEAD);
	GameRegistry.registerItem(AItems.Lead_Pickaxe, "LeadPickaxe");
	
	AItems.Silver_Pickaxe = new Silver_Pickaxe(AToolMaterial.SILVER);
	GameRegistry.registerItem(AItems.Silver_Pickaxe, "SilverPickaxe");
	
	AItems.Tin_Pickaxe = new Tin_Pickaxe(AToolMaterial.TIN);
	GameRegistry.registerItem(AItems.Tin_Pickaxe, "TinPickaxe");
	
	AItems.Titanium_Pickaxe = new Titanium_Pickaxe(AToolMaterial.TITANIUM);
	GameRegistry.registerItem(AItems.Titanium_Pickaxe, "TitaniumPickaxe");
}
public static void Axes(){
	AItems.Aluminium_Axe = new Aluminium_Axe(AToolMaterial.ALUMINIUM);
	GameRegistry.registerItem(AItems.Aluminium_Axe, "AluminiumAxe");
	
	AItems.Copper_Axe = new Copper_Axe(AToolMaterial.COPPER);
	GameRegistry.registerItem(AItems.Copper_Axe, "CopperAxe");
	
	AItems.Lead_Axe = new Lead_Axe(AToolMaterial.LEAD);
	GameRegistry.registerItem(AItems.Lead_Axe, "LeadAxe");
	
	AItems.Silver_Axe = new Silver_Axe(AToolMaterial.SILVER);
	GameRegistry.registerItem(AItems.Silver_Axe, "SilverAxe");
	
	AItems.Tin_Axe = new Tin_Axe(AToolMaterial.TIN);
	GameRegistry.registerItem(AItems.Tin_Axe, "TinAxe");
	
	AItems.Titanium_Axe = new Titanium_Axe(AToolMaterial.TITANIUM);
	GameRegistry.registerItem(AItems.Titanium_Axe, "TitaniumAxe");
}
public static void Hoes(){
	AItems.Aluminium_Hoe = new Aluminium_Hoe(AToolMaterial.ALUMINIUM);
	GameRegistry.registerItem(AItems.Aluminium_Hoe, "AluminiumHoe");
	
	AItems.Copper_Hoe = new Copper_Hoe(AToolMaterial.COPPER);
	GameRegistry.registerItem(AItems.Copper_Hoe, "CopperHoe");
	
	AItems.Lead_Hoe = new Lead_Hoe(AToolMaterial.LEAD);
	GameRegistry.registerItem(AItems.Lead_Hoe, "LeadHoe");
	
	AItems.Silver_Hoe = new Silver_Hoe(AToolMaterial.SILVER);
	GameRegistry.registerItem(AItems.Silver_Hoe, "SilverHoe");
	
	AItems.Tin_Hoe = new Tin_Hoe(AToolMaterial.TIN);
	GameRegistry.registerItem(AItems.Tin_Hoe, "TinHoe");
	
	AItems.Titanium_Hoe = new Titanium_Hoe(AToolMaterial.TITANIUM);
	GameRegistry.registerItem(AItems.Titanium_Hoe, "TitaniumHoe");
}
public static void Spades(){
	AItems.Aluminium_Spade = new Aluminium_Spade(AToolMaterial.ALUMINIUM);
	GameRegistry.registerItem(AItems.Aluminium_Spade, "AluminiumSpade");
	
	AItems.Copper_Spade = new Copper_Spade(AToolMaterial.COPPER);
	GameRegistry.registerItem(AItems.Copper_Spade, "CopperSpade");
	
	AItems.Lead_Spade = new Lead_Spade(AToolMaterial.LEAD);
	GameRegistry.registerItem(AItems.Lead_Spade, "LeadSpade");
	
	AItems.Silver_Spade = new Silver_Spade(AToolMaterial.SILVER);
	GameRegistry.registerItem(AItems.Silver_Spade, "SilverSpade");
	
	AItems.Tin_Spade = new Tin_Spade(AToolMaterial.TIN);
	GameRegistry.registerItem(AItems.Tin_Spade, "TinSpade");
	
	AItems.Titanium_Spade = new Titanium_Spade(AToolMaterial.TITANIUM);
	GameRegistry.registerItem(AItems.Titanium_Spade, "TitaniumSade");
}
}
