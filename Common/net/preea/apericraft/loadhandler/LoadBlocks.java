package net.preea.apericraft.loadhandler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.preea.apericraft.blocks.Aluminium_Block;
import net.preea.apericraft.blocks.Aluminium_Ore;
import net.preea.apericraft.blocks.Copper_Block;
import net.preea.apericraft.blocks.Copper_Ore;
import net.preea.apericraft.blocks.Greenstone_Ore;
import net.preea.apericraft.blocks.Lead_Block;
import net.preea.apericraft.blocks.Lead_Ore;
import net.preea.apericraft.blocks.Light_Greenstone_Ore;
import net.preea.apericraft.blocks.Silver_Block;
import net.preea.apericraft.blocks.Silver_Ore;
import net.preea.apericraft.blocks.Tin_Block;
import net.preea.apericraft.blocks.Tin_Ore;
import net.preea.apericraft.blocks.Titanium_Block;
import net.preea.apericraft.blocks.Titanium_Ore;
import net.preea.apericraft.declarations.ABlocks;

public class LoadBlocks {
public static void ore(){
 ABlocks.Aluminium_Ore = new Aluminium_Ore().setBlockName("AluminiumOre");
 GameRegistry.registerBlock(ABlocks.Aluminium_Ore, "AluminiumOre");
 
 ABlocks.Tin_Ore = new Tin_Ore().setBlockName("TinOre");
 GameRegistry.registerBlock(ABlocks.Tin_Ore, "TinOre");
 
 ABlocks.Copper_Ore = new Copper_Ore().setBlockName("CopperOre");
 GameRegistry.registerBlock(ABlocks.Copper_Ore, "CopperOre");
 
 ABlocks.Lead_Ore = new Lead_Ore().setBlockName("LeadOre");
 GameRegistry.registerBlock(ABlocks.Lead_Ore, "LeadOre");
 
 ABlocks.Silver_Ore = new Silver_Ore().setBlockName("SilverOre");
 GameRegistry.registerBlock(ABlocks.Silver_Ore, "SilverOre");
 
 ABlocks.Titanium_Ore = new Titanium_Ore().setBlockName("TitaniumOre");
 GameRegistry.registerBlock(ABlocks.Titanium_Ore, "TitaniumOre");
 
 ABlocks.Greenstone_Ore = new Greenstone_Ore(false).setBlockName("GreenstoneOre");
 GameRegistry.registerBlock(ABlocks.Greenstone_Ore, "GreenstoneOre");
 
 ABlocks.Light_Greenstone_Ore = new Light_Greenstone_Ore(false).setBlockName("LightGreenstoneOre");
 GameRegistry.registerBlock(ABlocks.Light_Greenstone_Ore, "LightGreenstoneOre");
}
public static void blocks(){
	 ABlocks.Aluminium_Block = new Aluminium_Block().setBlockName("AluminiumBlock");
	 GameRegistry.registerBlock(ABlocks.Aluminium_Block, "AluminiumBlock");
	 
	 ABlocks.Tin_Block = new Tin_Block().setBlockName("TinBlock");
	 GameRegistry.registerBlock(ABlocks.Tin_Block, "TinBlock");
	 
	 ABlocks.Copper_Block = new Copper_Block().setBlockName("CopperBlock");
	 GameRegistry.registerBlock(ABlocks.Copper_Block, "CopperBlock");
	 
	 ABlocks.Lead_Block = new Lead_Block().setBlockName("LeadBlock");
	 GameRegistry.registerBlock(ABlocks.Lead_Block, "LeadBlock");
	 
	 ABlocks.Silver_Block = new Silver_Block().setBlockName("SilverBlock");
	 GameRegistry.registerBlock(ABlocks.Silver_Block, "SilverBlock");
	 
	 ABlocks.Titanium_Block = new Titanium_Block().setBlockName("TitaniumBlock");
	 GameRegistry.registerBlock(ABlocks.Titanium_Block, "TitaniumBlock");
}

}
