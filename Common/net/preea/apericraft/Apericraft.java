package net.preea.apericraft;
/**
 * 
 * AperiCraft
 * 
 * AperiCraft
 * 
 * @author Preea
 * 
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.preea.apericraft.block.CopperOre;
import net.preea.apericraft.block.CopperBlock;
import net.preea.apericraft.crafting.Shaped;
import net.preea.apericraft.crafting.Shapeless;
import net.preea.apericraft.crafting.Smelting;
import net.preea.apericraft.creativetabs.BlocksTab;
import net.preea.apericraft.creativetabs.ItemsTab;
import net.preea.apericraft.items.CopperIngot;
import net.preea.apericraft.lib.Reference;
import net.preea.apericraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


//Initialization with forge
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Apericraft {
	
	@Instance(Reference.MOD_ID)
	public static Apericraft instance;
	
	@SidedProxy(clientSide = "net.preea.apericraft.proxy.ClientProxy", serverSide = "net.preea.apericraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	//Creative tabs
	public static CreativeTabs tabApericraftBlocks = new BlocksTab(CreativeTabs.getNextID(), "BlocksTab");
	public static CreativeTabs tabApericraftItems = new ItemsTab(CreativeTabs.getNextID(), "ItemsTab");
	
	//Blocks
	public static Block CopperOre;
	public static Block CopperBlock;
	
	//Items
	public static Item CopperIngot;
	
	
	//all event handlers load the mods at start of minecraft
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		//Blocks
		CopperOre = new CopperOre(500, Material.rock).setUnlocalizedName("CopperOre");
		GameRegistry.registerBlock (CopperOre, Reference.MOD_ID + "_" + CopperOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		
		CopperBlock = new CopperBlock(501, Material.rock).setUnlocalizedName("CopperBlock");
		GameRegistry.registerBlock (CopperBlock, Reference.MOD_ID + "_" + CopperBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CopperBlock, "Copper Block");
		
		//Items
		CopperIngot = new CopperIngot(5000).setUnlocalizedName("CopperIngot");
		LanguageRegistry.addName(CopperIngot, "Copper Ingot");
		
		//loading in recipes
		Smelting.LoadRecipes();
		Shapeless.LoadRecipes();
		Shaped.LoadRecipes();

	}
		
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
