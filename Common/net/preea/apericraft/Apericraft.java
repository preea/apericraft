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
	@SidedProxy(clientSide = "net.preea.apericraft.proxy.ClientProxy", serverSide = "net.preea.apericraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static Apericraft instance;
	
	//Creative tabs
	public static CreativeTabs tabApericraftBlocks = new BlocksTab(CreativeTabs.getNextID(), "BlocksTab");
	public static CreativeTabs tabApericraftItems = new ItemsTab(CreativeTabs.getNextID(), "ItemsTab");
	
	//Blocks
	
	public static Block AluminiumOre;
	public static Block CopperOre;
	public static Block LeadOre;
	public static Block NickleOre;
	public static Block TinOre;
	public static Block TitaniumOre;
	public static Block SilverOre;
	public static Block PlatinumOre;
	public static Block CobaltOre;
	public static Block TungstenOre;
	public static Block BerylliumOre;
	public static Block CeriumOre;
	public static Block SeleniumOre;
	public static Block TelluriumOre;
	public static Block ZirconiumOre;
	
	public static Block AluminiumBlock;
	public static Block CopperBlock;
	public static Block LeadBlock;
	public static Block NickleBlock;
	public static Block TinBlock;
	public static Block TitaniumBlock;
	public static Block SilverBlock;
	public static Block PlatinumBlock;
	public static Block CobaltBlock;
	public static Block TungstenBlock;
	public static Block BerylliumBlock;
	public static Block CeriumBlock;
	public static Block SeleniumBlock;
	public static Block TelluriumBlock;
	public static Block ZirconiumBlock;
	
	
	//Items
	public static Item CopperIngot;
	
	
	//all event handlers load the mods at start of minecraft
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//proxy
		proxy.registerRenderInformation();
		
		//Ore
		AluminiumOre = new AluminiumOre(500, Material.rock).setUnlocalizedName("AluminiumOre");
		GameRegistry.registerBlock (AluminiumOre, Reference.MOD_ID + "_" + AluminiumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(AluminiumOre, "Aluminium Ore");
		CopperOre = new CopperOre(501, Material.rock).setUnlocalizedName("CopperOre");
		GameRegistry.registerBlock (CopperOre, Reference.MOD_ID + "_" + CopperOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		LeadOre = new LeadOre(502, Material.rock).setUnlocalizedName("LeadOre");
		GameRegistry.registerBlock (LeadOre, Reference.MOD_ID + "_" + LeadOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(LeadOre, "Lead Ore");
		NickleOre = new NickleOre(503, Material.rock).setUnlocalizedName("NickleOre");
		GameRegistry.registerBlock (NickleOre, Reference.MOD_ID + "_" + NickleOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(NickleOre, "Nickle Ore");
		TinOre = new TinOre(504, Material.rock).setUnlocalizedName("TinOre");
		GameRegistry.registerBlock (TinOre, Reference.MOD_ID + "_" + TinOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(TinOre, "Tin Ore");
		TitaniumOre = new TitaniumOre(505, Material.rock).setUnlocalizedName("TitaniumOre");
		GameRegistry.registerBlock (TitaniumOre, Reference.MOD_ID + "_" + TitaniumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(TitaniumOre, "Titanium Ore");
		SilverOre = new SilverOre(506, Material.rock).setUnlocalizedName("SilverOre");
		GameRegistry.registerBlock (SilverOre, Reference.MOD_ID + "_" + SilverOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(SilverOre, "Silver Ore");
		PlatinumOre = new PlatinumOre(507, Material.rock).setUnlocalizedName("PlatinumOre");
		GameRegistry.registerBlock (PlatinumOre, Reference.MOD_ID + "_" + PlatinumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(PlatinumOre, "Platinum Ore");
		CobaltOre = new CobaltOre(508, Material.rock).setUnlocalizedName("CobaltOre");
		GameRegistry.registerBlock (CobaltOre, Reference.MOD_ID + "_" + CobaltOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CobaltOre, "Cobalt Ore");
		TungstenOre = new TungstenOre(509, Material.rock).setUnlocalizedName("TungstenOre");
		GameRegistry.registerBlock (TungstenOre, Reference.MOD_ID + "_" + TungstenOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(TungstenOre, "Tungsten Ore");
		BerylliumOre = new BerylliumOre(510, Material.rock).setUnlocalizedName("BerylliumOre");
		GameRegistry.registerBlock (BerylliumOre, Reference.MOD_ID + "_" + BerylliumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(BerylliumOre, "Beryllium Ore");
		CeriumOre = new CeriumOre(511, Material.rock).setUnlocalizedName("CeriumOre");
		GameRegistry.registerBlock (CeriumOre, Reference.MOD_ID + "_" + CeriumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CeriumOre, "Cerium Ore");
		SeleniumOre = new SeleniumOre(512, Material.rock).setUnlocalizedName("SeleniumOre");
		GameRegistry.registerBlock (SeleniumOre, Reference.MOD_ID + "_" + SeleniumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(SeleniumOre, "Selenium Ore");
		TelluriumOre = new TelluriumOre(513, Material.rock).setUnlocalizedName("TelluriumOre");
		GameRegistry.registerBlock (TelluriumOre, Reference.MOD_ID + "_" + TelluriumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(TelluriumOre, "Tellurium Ore");
		ZirconiumOre = new ZirconiumOre(514, Material.rock).setUnlocalizedName("ZirconiumOre");
		GameRegistry.registerBlock (ZirconiumOre, Reference.MOD_ID + "_" + ZirconiumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(ZirconiumOre, "Zirconium Ore");
		
		//Blocks
		AluminiumBlock = new AluminiumBlock(515, Material.rock).setUnlocalizedName("AluminiumBlock");
		GameRegistry.registerBlock (AluminiumBlock, Reference.MOD_ID + "_" + AluminiumBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(AluminiumBlock, "Aluminium Block");
		CopperBlock = new CopperBlock(516, Material.rock).setUnlocalizedName("CopperBlock");
		GameRegistry.registerBlock (CopperBlock, Reference.MOD_ID + "_" + CopperBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CopperBlock, "Copper Block");
		LeadBlock = new LeadBlock(517, Material.rock).setUnlocalizedName("LeadBlock");
		GameRegistry.registerBlock (LeadBlock, Reference.MOD_ID + "_" + LeadBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(LeadBlock, "Lead Block");
		NickleBlock = new NickleBlock(518, Material.rock).setUnlocalizedName("NickleBlock");
		GameRegistry.registerBlock (NickleBlock, Reference.MOD_ID + "_" + NickleBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(NickleBlock, "Nickle Block");
		TinBlock = new TinBlock(519, Material.rock).setUnlocalizedName("TinBlock");
		GameRegistry.registerBlock (TinBlock, Reference.MOD_ID + "_" + TinBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(TinBlock, "Tin Block");
		TitaniumBlock = new TitaniumBlock(520, Material.rock).setUnlocalizedName("TitaniumBlock");
		GameRegistry.registerBlock (TitaniumBlock, Reference.MOD_ID + "_" + TitaniumBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(TitaniumBlock, "Titanium Block");
		SilverBlock = new SilverBlock(521, Material.rock).setUnlocalizedName("SilverBlock");
		GameRegistry.registerBlock (SilverBlock, Reference.MOD_ID + "_" + SilverBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(SilverBlock, "Silver Block");
		PlatinumBlock = new PlatinumBlock(522, Material.rock).setUnlocalizedName("PlatinumBlock");
		GameRegistry.registerBlock (PlatinumBlock, Reference.MOD_ID + "_" + PlatinumBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(PlatinumBlock, "Platinum Block");
		CobaltBlock = new CobaltBlock(523, Material.rock).setUnlocalizedName("CobaltBlock");
		GameRegistry.registerBlock (CobaltBlock, Reference.MOD_ID + "_" + CobaltBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CobaltBlock, "Cobalt Block");
		TungstenBlock = new TungstenBlock(524, Material.rock).setUnlocalizedName("TungstenBlock");
		GameRegistry.registerBlock (TungstenBlock, Reference.MOD_ID + "_" + TungstenBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(TungstenBlock, "Tungsten Block");
		BerylliumBlock = new BerylliumBlock(525, Material.rock).setUnlocalizedName("BerylliumBlock");
		GameRegistry.registerBlock (BerylliumBlock, Reference.MOD_ID + "_" + BerylliumBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(BerylliumBlock, "Beryllium Block");
		CeriumBlock = new CeriumBlock(526, Material.rock).setUnlocalizedName("CeriumBlock");
		GameRegistry.registerBlock (CeriumBlock, Reference.MOD_ID + "_" + CeriumBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CeriumBlock, "Cerium Block");
		SeleniumBlock = new SeleniumBlock(527, Material.rock).setUnlocalizedName("SeleniumBlock");
		GameRegistry.registerBlock (SeleniumBlock, Reference.MOD_ID + "_" + SeleniumBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(SeleniumBlock, "Selenium Block");
		TelluriumBlock = new TelluriumBlock(528, Material.rock).setUnlocalizedName("TelluriumBlock");
		GameRegistry.registerBlock (TelluriumBlock, Reference.MOD_ID + "_" + TelluriumBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(TelluriumBlock, "Tellurium Block");
		ZirconiumBlock = new ZirconiumBlock(529, Material.rock).setUnlocalizedName("ZirconiumBlock");
		GameRegistry.registerBlock (ZirconiumBlock, Reference.MOD_ID + "_" + ZirconiumBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(ZirconiumBlock, "Zirconium Block");
	
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
