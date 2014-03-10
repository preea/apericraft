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
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.fluids.Fluid;
import net.preea.apericraft.LoadHandler.Blocks;
import net.preea.apericraft.LoadHandler.ConectionHandler;
import net.preea.apericraft.LoadHandler.Items;
import net.preea.apericraft.LoadHandler.Language;
import net.preea.apericraft.crafting.Shaped;
import net.preea.apericraft.crafting.Shapeless;
import net.preea.apericraft.crafting.Smelting;
import net.preea.apericraft.creativetabs.BlocksTab;
import net.preea.apericraft.creativetabs.FluidsTab;
import net.preea.apericraft.creativetabs.ItemsTab;
import net.preea.apericraft.creativetabs.ToolsTab;
import net.preea.apericraft.event.EventManager;
import net.preea.apericraft.fuel.FuelHandler;
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
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


//Initialization with forge
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Apericraft {
	@SidedProxy(clientSide = "net.preea.apericraft.proxy.ClientProxy", serverSide = "net.preea.apericraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static Apericraft instance;
	
	//Creative tabs
	public static CreativeTabs tabApericraftBlocks = new BlocksTab(CreativeTabs.getNextID(), "BlocksTab");
	public static CreativeTabs tabApericraftItems = new ItemsTab(CreativeTabs.getNextID(), "ItemsTab");
	public static CreativeTabs tabApericraftTools = new ToolsTab(CreativeTabs.getNextID(), "ToolsTab");
	public static CreativeTabs tabApericraftFluids = new FluidsTab(CreativeTabs.getNextID(), "FluidsTab");
	
//Blocks
	//Ore
	public static Block	AluminiumOre, CopperOre, LeadOre, NickleOre, TinOre, TitaniumOre, SilverOre, PlatinumOre, CobaltOre, TungstenOre, BerylliumOre, CeriumOre, SeleniumOre, TelluriumOre, ZirconiumOre;
	//Metal Blocks
	public static Block	AluminiumBlock, CopperBlock, LeadBlock, NickleBlock, TinBlock, TitaniumBlock, SilverBlock, PlatinumBlock, CobaltBlock, TungstenBlock, BerylliumBlock, CeriumBlock, SeleniumBlock, TelluriumBlock, ZirconiumBlock;
	//Liquid
	public static Block GreenStuff;
	public static Material materialGreenStuff;
	public static Fluid GreenStuffFluid;
	public static Item GreenStuffBucket;
	public static final int idGreenStuff = (530);
//Items
	//Ingots
	public static Item AluminiumIngot, CopperIngot, LeadIngot, NickleIngot, TinIngot, TitaniumIngot, SilverIngot, PlatinumIngot,CobaltIngot, TungstenIngot, BerylliumIngot, CeriumIngot, SeleniumIngot, TelluriumIngot, ZirconiumIngot;
	//tool Materials 															(   Name    ,Harvest,  MaxUses  ,Efficiency ,  Damage   ,Enchant),
	public static EnumToolMaterial 	toolAluminium = EnumHelper.addToolMaterial	("ALUMINIUM", 	1	, 	90		,	3.5F	,	0.0F	,	5	),
									toolCopper = EnumHelper.addToolMaterial		("COPPER"	, 	2	, 	160		,	5.5F	,	1.0F	, 	12	),
									toolLead = EnumHelper.addToolMaterial		("LEAD"		, 	2	, 	200		,	6.0F	, 	2.0F	, 	10	),
									toolNickle = EnumHelper.addToolMaterial		("NICKLE"	, 	2	, 	200		,	6.0F	, 	2.0F	, 	15	),
									toolTin = EnumHelper.addToolMaterial		("TIN"		, 	1	, 	160		,	5.5F	, 	1.0F	, 	12	),
									toolTitanium = EnumHelper.addToolMaterial	("TITANIUM"	, 	3	, 	2000	,	6.0F	, 	8.0F	, 	25	),
									toolSilver = EnumHelper.addToolMaterial		("SILVER"	, 	1	, 	160		,	5.5F	, 	1.0F	, 	12	),
									toolPlatinum = EnumHelper.addToolMaterial	("PLATINUM"	, 	3	, 	2000	,	6.0F	, 	8.0F	, 	25	),
									toolCobalt = EnumHelper.addToolMaterial		("COBALT"	, 	3	, 	1200	,	4.0F	, 	3.0F	, 	10	),
									toolTungsten = EnumHelper.addToolMaterial	("TUNGSTEN"	, 	2	, 	450		,	3.0F	, 	3.0F	, 	10	),
									toolBeryllium = EnumHelper.addToolMaterial	("BERYLLIUM", 	1	, 	340		,	6.0F	, 	2.0F	, 	15	),
									toolCerium = EnumHelper.addToolMaterial		("CERIUM"	, 	2	, 	360		,	4.5F	, 	5.0F	, 	5	),
									toolSelenium = EnumHelper.addToolMaterial	("SELENIUM"	, 	2	, 	370		,	5.5F	, 	4.0F	, 	40	),
									toolTellurium = EnumHelper.addToolMaterial	("TELLURIUM", 	2	, 	640		,	4.0F	, 	3.0F	, 	10	),
									toolZirconium = EnumHelper.addToolMaterial	("ZIRCONIUM", 	3	, 	3500	,	12.0F	, 	10.0F	, 	45	);
	//Basic Tools
		public static Item AluminiumSword;
		public static Item AluminiumPickaxe;
		public static Item AluminiumAxe;
		public static Item AluminiumHoe;
		public static Item AluminiumShovel;
		
	//Event Manager
	EventManager eventmanager = new EventManager();
	
	//all event handlers load the mods at start of minecraft
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//proxy Initialization
		proxy.registerRenderInformation();
	//Initialization
		Blocks.LoadMetalBlocks();
		Blocks.LoadOres();
		Blocks.LoadFluids();
		Items.LoadIngots();
		Items.LoadSwords();
		Items.LoadPickaxes();
		Items.LoadAxes();
		Items.LoadShovels();
		Items.LoadHoes();
		Language.LanguageRegister();
	//Liquid
	//World Generation
		GameRegistry.registerWorldGenerator(eventmanager);
		
	//loading in recipes
		Smelting.LoadRecipes();
		Shapeless.LoadRecipes();
		Shaped.LoadRecipes();
		GameRegistry.registerFuelHandler (new FuelHandler());
	//Connection Handler
		NetworkRegistry.instance().registerConnectionHandler(new ConectionHandler());
	}
		
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
