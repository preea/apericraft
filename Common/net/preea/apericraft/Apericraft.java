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
import net.preea.apericraft.block.AluminiumBlock;
import net.preea.apericraft.block.AluminiumOre;
import net.preea.apericraft.block.BerylliumBlock;
import net.preea.apericraft.block.BerylliumOre;
import net.preea.apericraft.block.CeriumBlock;
import net.preea.apericraft.block.CeriumOre;
import net.preea.apericraft.block.CobaltBlock;
import net.preea.apericraft.block.CobaltOre;
import net.preea.apericraft.block.CopperBlock;
import net.preea.apericraft.block.CopperOre;
import net.preea.apericraft.block.LeadBlock;
import net.preea.apericraft.block.LeadOre;
import net.preea.apericraft.block.NickleBlock;
import net.preea.apericraft.block.NickleOre;
import net.preea.apericraft.block.PlatinumBlock;
import net.preea.apericraft.block.PlatinumOre;
import net.preea.apericraft.block.SeleniumBlock;
import net.preea.apericraft.block.SeleniumOre;
import net.preea.apericraft.block.SilverBlock;
import net.preea.apericraft.block.SilverOre;
import net.preea.apericraft.block.TelluriumBlock;
import net.preea.apericraft.block.TelluriumOre;
import net.preea.apericraft.block.TinBlock;
import net.preea.apericraft.block.TinOre;
import net.preea.apericraft.block.TitaniumBlock;
import net.preea.apericraft.block.TitaniumOre;
import net.preea.apericraft.block.TungstenBlock;
import net.preea.apericraft.block.TungstenOre;
import net.preea.apericraft.block.ZirconiumBlock;
import net.preea.apericraft.block.ZirconiumOre;
import net.preea.apericraft.crafting.Shaped;
import net.preea.apericraft.crafting.Shapeless;
import net.preea.apericraft.crafting.Smelting;
import net.preea.apericraft.creativetabs.BlocksTab;
import net.preea.apericraft.creativetabs.ItemsTab;
import net.preea.apericraft.creativetabs.ToolsTab;
import net.preea.apericraft.event.EventManager;
import net.preea.apericraft.items.AluminiumIngot;
import net.preea.apericraft.items.BerylliumIngot;
import net.preea.apericraft.items.CeriumIngot;
import net.preea.apericraft.items.CobaltIngot;
import net.preea.apericraft.items.CopperIngot;
import net.preea.apericraft.items.LeadIngot;
import net.preea.apericraft.items.NickleIngot;
import net.preea.apericraft.items.PlatinumIngot;
import net.preea.apericraft.items.SeleniumIngot;
import net.preea.apericraft.items.SilverIngot;
import net.preea.apericraft.items.TelluriumIngot;
import net.preea.apericraft.items.TinIngot;
import net.preea.apericraft.items.TitaniumIngot;
import net.preea.apericraft.items.TungstenIngot;
import net.preea.apericraft.items.ZirconiumIngot;
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
	@SidedProxy(clientSide = "net.preea.apericraft.proxy.ClientProxy", serverSide = "net.preea.apericraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static Apericraft instance;
	
	//Creative tabs
	public static CreativeTabs tabApericraftBlocks = new BlocksTab(CreativeTabs.getNextID(), "BlocksTab");
	public static CreativeTabs tabApericraftItems = new ItemsTab(CreativeTabs.getNextID(), "ItemsTab");
	public static CreativeTabs tabApericraftTools = new ToolsTab(CreativeTabs.getNextID(), "ToolsTab");
	
//Blocks
	//Ore
	public static Block	AluminiumOre, CopperOre, LeadOre, NickleOre, TinOre, TitaniumOre, SilverOre, PlatinumOre, CobaltOre, TungstenOre, BerylliumOre, CeriumOre, SeleniumOre, TelluriumOre, ZirconiumOre;
	//Metal Blocks
	public static Block	AluminiumBlock, CopperBlock, LeadBlock, NickleBlock, TinBlock, TitaniumBlock, SilverBlock, PlatinumBlock, CobaltBlock, TungstenBlock, BerylliumBlock, CeriumBlock, SeleniumBlock, TelluriumBlock, ZirconiumBlock;
	
//Items
	//Ingots
	public static Item	AluminiumIngot, CopperIngot, LeadIngot, NickleIngot, TinIngot, TitaniumIngot, SilverIngot, PlatinumIngot,CobaltIngot, TungstenIngot, BerylliumIngot, CeriumIngot, SeleniumIngot, TelluriumIngot, ZirconiumIngot;
	
	//tool Materials 															(   Name    ,Harvest,  MaxUses  ,Efficiency ,  Damage   ,Enchant),
	public static EnumToolMaterial 	toolaluminium = EnumHelper.addToolMaterial	("ALUMINIUM", 	1	, 	90		,	3.5F	,	0.0F	,	5	),
									toolcopper = EnumHelper.addToolMaterial		("COPPER"	, 	2	, 	160		,	5.5F	,	1.0F	, 	12	),
									toollead = EnumHelper.addToolMaterial		("LEAD"		, 	2	, 	200		,	6.0F	, 	2.0F	, 	10	),
									toolnickle = EnumHelper.addToolMaterial		("NICKLE"	, 	2	, 	200		,	6.0F	, 	2.0F	, 	15	),
									tooltin = EnumHelper.addToolMaterial		("TIN"		, 	1	, 	160		,	5.5F	, 	1.0F	, 	12	),
									tooltitanium = EnumHelper.addToolMaterial	("TITANIUM"	, 	3	, 	2000	,	6.0F	, 	8.0F	, 	25	),
									toolsilver = EnumHelper.addToolMaterial		("SILVER"	, 	1	, 	160		,	5.5F	, 	1.0F	, 	12	),
									toolplatinum = EnumHelper.addToolMaterial	("PLATINUM"	, 	3	, 	2000	,	6.0F	, 	8.0F	, 	25	),
									toolcobalt = EnumHelper.addToolMaterial		("COBALT"	, 	3	, 	1200	,	4.0F	, 	3.0F	, 	10	),
									tooltungsten = EnumHelper.addToolMaterial	("TUNGSTEN"	, 	2	, 	450		,	3.0F	, 	3.0F	, 	10	),
									toolberyllium = EnumHelper.addToolMaterial	("BERYLLIUM", 	1	, 	340		,	6.0F	, 	2.0F	, 	15	),
									toolcerium = EnumHelper.addToolMaterial		("CERIUM"	, 	2	, 	360		,	4.5F	, 	5.0F	, 	5	),
									toolselenium = EnumHelper.addToolMaterial	("SELENIUM"	, 	2	, 	370		,	5.5F	, 	4.0F	, 	40	),
									tooltellurium = EnumHelper.addToolMaterial	("TELLURIUM", 	2	, 	640		,	4.0F	, 	3.0F	, 	10	),
									toolzirconium = EnumHelper.addToolMaterial	("ZIRCONIUM", 	3	, 	3500	,	12.0F	, 	10.0F	, 	45	);
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

//Block Registration 
		//Ore Initialization
		AluminiumOre = new AluminiumOre(500, Material.rock).setUnlocalizedName("AluminiumOre"); GameRegistry.registerBlock (AluminiumOre, Reference.MOD_ID + "_" + AluminiumOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(AluminiumOre, "Aluminium Ore");
		CopperOre = new CopperOre(501, Material.rock).setUnlocalizedName("CopperOre"); GameRegistry.registerBlock (CopperOre, Reference.MOD_ID + "_" + CopperOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(CopperOre, "Copper Ore");
		LeadOre = new LeadOre(502, Material.rock).setUnlocalizedName("LeadOre"); GameRegistry.registerBlock (LeadOre, Reference.MOD_ID + "_" + LeadOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(LeadOre, "Lead Ore");
		NickleOre = new NickleOre(503, Material.rock).setUnlocalizedName("NickleOre"); GameRegistry.registerBlock (NickleOre, Reference.MOD_ID + "_" + NickleOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(NickleOre, "Nickle Ore");
		TinOre = new TinOre(504, Material.rock).setUnlocalizedName("TinOre"); GameRegistry.registerBlock (TinOre, Reference.MOD_ID + "_" + TinOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(TinOre, "Tin Ore");
		TitaniumOre = new TitaniumOre(505, Material.rock).setUnlocalizedName("TitaniumOre"); GameRegistry.registerBlock (TitaniumOre, Reference.MOD_ID + "_" + TitaniumOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(TitaniumOre, "Titanium Ore");
		SilverOre = new SilverOre(506, Material.rock).setUnlocalizedName("SilverOre"); GameRegistry.registerBlock (SilverOre, Reference.MOD_ID + "_" + SilverOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(SilverOre, "Silver Ore");
		PlatinumOre = new PlatinumOre(507, Material.rock).setUnlocalizedName("PlatinumOre"); GameRegistry.registerBlock (PlatinumOre, Reference.MOD_ID + "_" + PlatinumOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(PlatinumOre, "Platinum Ore");
		CobaltOre = new CobaltOre(508, Material.rock).setUnlocalizedName("CobaltOre"); GameRegistry.registerBlock (CobaltOre, Reference.MOD_ID + "_" + CobaltOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(CobaltOre, "Cobalt Ore");
		TungstenOre = new TungstenOre(509, Material.rock).setUnlocalizedName("TungstenOre"); GameRegistry.registerBlock (TungstenOre, Reference.MOD_ID + "_" + TungstenOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(TungstenOre, "Tungsten Ore");
		BerylliumOre = new BerylliumOre(510, Material.rock).setUnlocalizedName("BerylliumOre"); GameRegistry.registerBlock (BerylliumOre, Reference.MOD_ID + "_" + BerylliumOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(BerylliumOre, "Beryllium Ore");
		CeriumOre = new CeriumOre(511, Material.rock).setUnlocalizedName("CeriumOre"); GameRegistry.registerBlock (CeriumOre, Reference.MOD_ID + "_" + CeriumOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(CeriumOre, "Cerium Ore");
		SeleniumOre = new SeleniumOre(512, Material.rock).setUnlocalizedName("SeleniumOre"); GameRegistry.registerBlock (SeleniumOre, Reference.MOD_ID + "_" + SeleniumOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(SeleniumOre, "Selenium Ore");
		TelluriumOre = new TelluriumOre(513, Material.rock).setUnlocalizedName("TelluriumOre"); GameRegistry.registerBlock (TelluriumOre, Reference.MOD_ID + "_" + TelluriumOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(TelluriumOre, "Tellurium Ore");
		ZirconiumOre = new ZirconiumOre(514, Material.rock).setUnlocalizedName("ZirconiumOre"); GameRegistry.registerBlock (ZirconiumOre, Reference.MOD_ID + "_" + ZirconiumOre.getUnlocalizedName().substring(5)); LanguageRegistry.addName(ZirconiumOre, "Zirconium Ore");
		
		//Metal Blocks Initialization
		AluminiumBlock = new AluminiumBlock(515, Material.rock).setUnlocalizedName("AluminiumBlock"); GameRegistry.registerBlock (AluminiumBlock, Reference.MOD_ID + "_" + AluminiumBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(AluminiumBlock, "Aluminium Block");
		CopperBlock = new CopperBlock(516, Material.rock).setUnlocalizedName("CopperBlock"); GameRegistry.registerBlock (CopperBlock, Reference.MOD_ID + "_" + CopperBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(CopperBlock, "Copper Block");
		LeadBlock = new LeadBlock(517, Material.rock).setUnlocalizedName("LeadBlock"); GameRegistry.registerBlock (LeadBlock, Reference.MOD_ID + "_" + LeadBlock.getUnlocalizedName().substring(5));LanguageRegistry.addName(LeadBlock, "Lead Block");
		NickleBlock = new NickleBlock(518, Material.rock).setUnlocalizedName("NickleBlock"); GameRegistry.registerBlock (NickleBlock, Reference.MOD_ID + "_" + NickleBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(NickleBlock, "Nickle Block");
		TinBlock = new TinBlock(519, Material.rock).setUnlocalizedName("TinBlock"); GameRegistry.registerBlock (TinBlock, Reference.MOD_ID + "_" + TinBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(TinBlock, "Tin Block");
		TitaniumBlock = new TitaniumBlock(520, Material.rock).setUnlocalizedName("TitaniumBlock"); GameRegistry.registerBlock (TitaniumBlock, Reference.MOD_ID + "_" + TitaniumBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(TitaniumBlock, "Titanium Block");
		SilverBlock = new SilverBlock(521, Material.rock).setUnlocalizedName("SilverBlock"); GameRegistry.registerBlock (SilverBlock, Reference.MOD_ID + "_" + SilverBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(SilverBlock, "Silver Block");
		PlatinumBlock = new PlatinumBlock(522, Material.rock).setUnlocalizedName("PlatinumBlock"); GameRegistry.registerBlock (PlatinumBlock, Reference.MOD_ID + "_" + PlatinumBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(PlatinumBlock, "Platinum Block");
		CobaltBlock = new CobaltBlock(523, Material.rock).setUnlocalizedName("CobaltBlock"); GameRegistry.registerBlock (CobaltBlock, Reference.MOD_ID + "_" + CobaltBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(CobaltBlock, "Cobalt Block");
		TungstenBlock = new TungstenBlock(524, Material.rock).setUnlocalizedName("TungstenBlock"); GameRegistry.registerBlock (TungstenBlock, Reference.MOD_ID + "_" + TungstenBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(TungstenBlock, "Tungsten Block");
		BerylliumBlock = new BerylliumBlock(525, Material.rock).setUnlocalizedName("BerylliumBlock"); GameRegistry.registerBlock (BerylliumBlock, Reference.MOD_ID + "_" + BerylliumBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(BerylliumBlock, "Beryllium Block");
		CeriumBlock = new CeriumBlock(526, Material.rock).setUnlocalizedName("CeriumBlock"); GameRegistry.registerBlock (CeriumBlock, Reference.MOD_ID + "_" + CeriumBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(CeriumBlock, "Cerium Block");
		SeleniumBlock = new SeleniumBlock(527, Material.rock).setUnlocalizedName("SeleniumBlock"); GameRegistry.registerBlock (SeleniumBlock, Reference.MOD_ID + "_" + SeleniumBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(SeleniumBlock, "Selenium Block");
		TelluriumBlock = new TelluriumBlock(528, Material.rock).setUnlocalizedName("TelluriumBlock"); GameRegistry.registerBlock (TelluriumBlock, Reference.MOD_ID + "_" + TelluriumBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(TelluriumBlock, "Tellurium Block");
		ZirconiumBlock = new ZirconiumBlock(529, Material.rock).setUnlocalizedName("ZirconiumBlock"); GameRegistry.registerBlock (ZirconiumBlock, Reference.MOD_ID + "_" + ZirconiumBlock.getUnlocalizedName().substring(5)); LanguageRegistry.addName(ZirconiumBlock, "Zirconium Block");

//Item Registration
		//Ingots Initialization
		AluminiumIngot = new AluminiumIngot(5000).setUnlocalizedName("AluminiumIngot"); LanguageRegistry.addName(AluminiumIngot, "Aluminium Ingot");
		CopperIngot = new CopperIngot(5001).setUnlocalizedName("CopperIngot"); LanguageRegistry.addName(CopperIngot, "Copper Ingot");
		LeadIngot = new LeadIngot(5002).setUnlocalizedName("LeadIngot"); LanguageRegistry.addName(LeadIngot, "Lead Ingot");
		NickleIngot = new NickleIngot(5003).setUnlocalizedName("NickleIngot"); LanguageRegistry.addName(NickleIngot, "Nickle Ingot");
		TinIngot = new TinIngot(5004).setUnlocalizedName("TinIngot"); LanguageRegistry.addName(TinIngot, "Tin Ingot");
		TitaniumIngot = new TitaniumIngot(5005).setUnlocalizedName("TitaniumIngot"); LanguageRegistry.addName(TitaniumIngot, "Titanium Ingot");
		SilverIngot = new SilverIngot(5006).setUnlocalizedName("SilverIngot"); LanguageRegistry.addName(SilverIngot, "Silver Ingot");
		PlatinumIngot = new PlatinumIngot(5007).setUnlocalizedName("PlatinumIngot"); LanguageRegistry.addName(PlatinumIngot, "Platinum Ingot");
		CobaltIngot = new CobaltIngot(5008).setUnlocalizedName("CobaltIngot"); LanguageRegistry.addName(CobaltIngot, "Cobalt Ingot");
		TungstenIngot = new TungstenIngot(5009).setUnlocalizedName("TungstenIngot"); LanguageRegistry.addName(TungstenIngot, "Tungsten Ingot");
		BerylliumIngot = new BerylliumIngot(5010).setUnlocalizedName("BerylliumIngot"); LanguageRegistry.addName(BerylliumIngot, "Beryllium Ingot");
		CeriumIngot = new CeriumIngot(5011).setUnlocalizedName("CeriumIngot"); LanguageRegistry.addName(CeriumIngot, "Cerium Ingot");
		SeleniumIngot = new SeleniumIngot(5012).setUnlocalizedName("SeleniumIngot"); LanguageRegistry.addName(SeleniumIngot, "Selenium Ingot");
		TelluriumIngot = new TelluriumIngot(5013).setUnlocalizedName("TelluriumIngot"); LanguageRegistry.addName(TelluriumIngot, "Tellurium Ingot");
		ZirconiumIngot = new ZirconiumIngot(5014).setUnlocalizedName("ZirconiumIngot"); LanguageRegistry.addName(ZirconiumIngot, "Zirconium Ingot");
		
		//Tools Initialization
		
		//World Generation
		GameRegistry.registerWorldGenerator(eventmanager);
		
		//loading in recipes
		Smelting.LoadRecipes();
		Shapeless.LoadRecipes();
		Shaped.LoadRecipes();

	}
		
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
