package net.preea.apericraft.loadhandler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.preea.apericraft.blocks.Aluminium_Ore;
import net.preea.apericraft.blocks.Copper_Ore;
import net.preea.apericraft.blocks.Lead_Ore;
import net.preea.apericraft.blocks.Rubber_Leaf;
import net.preea.apericraft.blocks.Rubber_Log;
import net.preea.apericraft.blocks.Rubber_Sapling;
import net.preea.apericraft.blocks.Silver_Ore;
import net.preea.apericraft.blocks.Tin_Ore;
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
}
}
