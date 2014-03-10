package net.preea.apericraft.LoadHandler;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.preea.apericraft.Apericraft;
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
import net.preea.apericraft.block.GreenStuff;
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
import net.preea.apericraft.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {
	public static void LoadOres(){
		Apericraft.AluminiumOre = new AluminiumOre(500, Material.rock).setUnlocalizedName("AluminiumOre"); 
		GameRegistry.registerBlock (Apericraft.AluminiumOre, Reference.MOD_ID + "_" + Apericraft.AluminiumOre.getUnlocalizedName().substring(5));
		Apericraft.CopperOre = new CopperOre(501, Material.rock).setUnlocalizedName("CopperOre"); 
		GameRegistry.registerBlock (Apericraft.CopperOre, Reference.MOD_ID + "_" + Apericraft.CopperOre.getUnlocalizedName().substring(5)); 
		Apericraft.LeadOre = new LeadOre(502, Material.rock).setUnlocalizedName("LeadOre");
		GameRegistry.registerBlock (Apericraft.LeadOre, Reference.MOD_ID + "_" + Apericraft.LeadOre.getUnlocalizedName().substring(5)); 
		Apericraft.NickleOre = new NickleOre(503, Material.rock).setUnlocalizedName("NickleOre");
		GameRegistry.registerBlock (Apericraft.NickleOre, Reference.MOD_ID + "_" + Apericraft.NickleOre.getUnlocalizedName().substring(5)); 
		Apericraft.TinOre = new TinOre(504, Material.rock).setUnlocalizedName("TinOre"); 
		GameRegistry.registerBlock (Apericraft.TinOre, Reference.MOD_ID + "_" + Apericraft.TinOre.getUnlocalizedName().substring(5)); 
		Apericraft.TitaniumOre = new TitaniumOre(505, Material.rock).setUnlocalizedName("TitaniumOre"); 
		GameRegistry.registerBlock (Apericraft.TitaniumOre, Reference.MOD_ID + "_" + Apericraft.TitaniumOre.getUnlocalizedName().substring(5)); 
		Apericraft.SilverOre = new SilverOre(506, Material.rock).setUnlocalizedName("SilverOre");
		GameRegistry.registerBlock (Apericraft.SilverOre, Reference.MOD_ID + "_" + Apericraft.SilverOre.getUnlocalizedName().substring(5)); 
		Apericraft.PlatinumOre = new PlatinumOre(507, Material.rock).setUnlocalizedName("PlatinumOre"); 
		GameRegistry.registerBlock (Apericraft.PlatinumOre, Reference.MOD_ID + "_" + Apericraft.PlatinumOre.getUnlocalizedName().substring(5)); 
		Apericraft.CobaltOre = new CobaltOre(508, Material.rock).setUnlocalizedName("CobaltOre"); 
		GameRegistry.registerBlock (Apericraft.CobaltOre, Reference.MOD_ID + "_" + Apericraft.CobaltOre.getUnlocalizedName().substring(5)); 
		Apericraft.TungstenOre = new TungstenOre(509, Material.rock).setUnlocalizedName("TungstenOre");
		GameRegistry.registerBlock (Apericraft.TungstenOre, Reference.MOD_ID + "_" + Apericraft.TungstenOre.getUnlocalizedName().substring(5)); 
		Apericraft.BerylliumOre = new BerylliumOre(510, Material.rock).setUnlocalizedName("BerylliumOre");
		GameRegistry.registerBlock (Apericraft.BerylliumOre, Reference.MOD_ID + "_" + Apericraft.BerylliumOre.getUnlocalizedName().substring(5)); 
		Apericraft.CeriumOre = new CeriumOre(511, Material.rock).setUnlocalizedName("CeriumOre"); 
		GameRegistry.registerBlock (Apericraft.CeriumOre, Reference.MOD_ID + "_" + Apericraft.CeriumOre.getUnlocalizedName().substring(5)); 
		Apericraft.SeleniumOre = new SeleniumOre(512, Material.rock).setUnlocalizedName("SeleniumOre"); 
		GameRegistry.registerBlock (Apericraft.SeleniumOre, Reference.MOD_ID + "_" + Apericraft.SeleniumOre.getUnlocalizedName().substring(5)); 
		Apericraft.TelluriumOre = new TelluriumOre(513, Material.rock).setUnlocalizedName("TelluriumOre"); 
		GameRegistry.registerBlock (Apericraft.TelluriumOre, Reference.MOD_ID + "_" + Apericraft.TelluriumOre.getUnlocalizedName().substring(5)); 
		Apericraft.ZirconiumOre = new ZirconiumOre(514, Material.rock).setUnlocalizedName("ZirconiumOre");
		GameRegistry.registerBlock (Apericraft.ZirconiumOre, Reference.MOD_ID + "_" + Apericraft.ZirconiumOre.getUnlocalizedName().substring(5)); 
	}
	
	public static void LoadMetalBlocks(){
		Apericraft.AluminiumBlock = new AluminiumBlock(515, Material.rock).setUnlocalizedName("AluminiumBlock"); 
		GameRegistry.registerBlock (Apericraft.AluminiumBlock, Reference.MOD_ID + "_" + Apericraft.AluminiumBlock.getUnlocalizedName().substring(5)); 
		Apericraft.CopperBlock = new CopperBlock(516, Material.rock).setUnlocalizedName("CopperBlock"); 
		GameRegistry.registerBlock (Apericraft.CopperBlock, Reference.MOD_ID + "_" + Apericraft.CopperBlock.getUnlocalizedName().substring(5)); 
		Apericraft.LeadBlock = new LeadBlock(517, Material.rock).setUnlocalizedName("LeadBlock"); 
		GameRegistry.registerBlock (Apericraft.LeadBlock, Reference.MOD_ID + "_" + Apericraft.LeadBlock.getUnlocalizedName().substring(5));
		Apericraft.NickleBlock = new NickleBlock(518, Material.rock).setUnlocalizedName("NickleBlock"); 
		GameRegistry.registerBlock (Apericraft.NickleBlock, Reference.MOD_ID + "_" + Apericraft.NickleBlock.getUnlocalizedName().substring(5)); 
		Apericraft.TinBlock = new TinBlock(519, Material.rock).setUnlocalizedName("TinBlock"); 
		GameRegistry.registerBlock (Apericraft.TinBlock, Reference.MOD_ID + "_" + Apericraft.TinBlock.getUnlocalizedName().substring(5)); 
		Apericraft.TitaniumBlock = new TitaniumBlock(520, Material.rock).setUnlocalizedName("TitaniumBlock"); 
		GameRegistry.registerBlock (Apericraft.TitaniumBlock, Reference.MOD_ID + "_" + Apericraft.TitaniumBlock.getUnlocalizedName().substring(5)); 
		Apericraft.SilverBlock = new SilverBlock(521, Material.rock).setUnlocalizedName("SilverBlock"); 
		GameRegistry.registerBlock (Apericraft.SilverBlock, Reference.MOD_ID + "_" + Apericraft.SilverBlock.getUnlocalizedName().substring(5)); 
		Apericraft.PlatinumBlock = new PlatinumBlock(522, Material.rock).setUnlocalizedName("PlatinumBlock"); 
		GameRegistry.registerBlock (Apericraft.PlatinumBlock, Reference.MOD_ID + "_" + Apericraft.PlatinumBlock.getUnlocalizedName().substring(5)); 
		Apericraft.CobaltBlock = new CobaltBlock(523, Material.rock).setUnlocalizedName("CobaltBlock"); 
		GameRegistry.registerBlock (Apericraft.CobaltBlock, Reference.MOD_ID + "_" + Apericraft.CobaltBlock.getUnlocalizedName().substring(5)); 
		Apericraft.TungstenBlock = new TungstenBlock(524, Material.rock).setUnlocalizedName("TungstenBlock"); 
		GameRegistry.registerBlock (Apericraft.TungstenBlock, Reference.MOD_ID + "_" + Apericraft.TungstenBlock.getUnlocalizedName().substring(5)); 
		Apericraft.BerylliumBlock = new BerylliumBlock(525, Material.rock).setUnlocalizedName("BerylliumBlock"); 
		GameRegistry.registerBlock (Apericraft.BerylliumBlock, Reference.MOD_ID + "_" + Apericraft.BerylliumBlock.getUnlocalizedName().substring(5)); 
		Apericraft.CeriumBlock = new CeriumBlock(526, Material.rock).setUnlocalizedName("CeriumBlock"); 
		GameRegistry.registerBlock (Apericraft.CeriumBlock, Reference.MOD_ID + "_" + Apericraft.CeriumBlock.getUnlocalizedName().substring(5)); 
		Apericraft.SeleniumBlock = new SeleniumBlock(527, Material.rock).setUnlocalizedName("SeleniumBlock"); 
		GameRegistry.registerBlock (Apericraft.SeleniumBlock, Reference.MOD_ID + "_" + Apericraft.SeleniumBlock.getUnlocalizedName().substring(5)); 
		Apericraft.TelluriumBlock = new TelluriumBlock(528, Material.rock).setUnlocalizedName("TelluriumBlock"); 
		GameRegistry.registerBlock (Apericraft.TelluriumBlock, Reference.MOD_ID + "_" + Apericraft.TelluriumBlock.getUnlocalizedName().substring(5)); 
		Apericraft.ZirconiumBlock = new ZirconiumBlock(529, Material.rock).setUnlocalizedName("ZirconiumBlock"); 
		GameRegistry.registerBlock (Apericraft.ZirconiumBlock, Reference.MOD_ID + "_" + Apericraft.ZirconiumBlock.getUnlocalizedName().substring(5));

	}
	public static void LoadFluids(){
	//green stuff
		Apericraft.GreenStuffFluid = new Fluid("FluidGreenStuff").setBlockID(Apericraft.idGreenStuff);
		FluidRegistry.registerFluid(Apericraft.GreenStuffFluid);
		Apericraft.materialGreenStuff = new MaterialLiquid(MapColor.grassColor);
		Apericraft.GreenStuff = new GreenStuff(Apericraft.idGreenStuff).setUnlocalizedName("GreenStuff");
		GameRegistry.registerBlock(Apericraft.GreenStuff, "GreenStuff");	
	}
}
