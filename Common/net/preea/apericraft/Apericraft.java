package net.preea.apericraft;

import com.jcraft.jorbis.Block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.preea.apericraft.creativetabs.tabABlocks;
import net.preea.apericraft.creativetabs.tabAItems;
import net.preea.apericraft.lib.Reference;
import net.preea.apericraft.loadhandler.LoadBlocks;
import net.preea.apericraft.loadhandler.LoadCrafting;
import net.preea.apericraft.loadhandler.LoadItems;
import net.preea.apericraft.loadhandler.LoadRenderer;
import net.preea.apericraft.world.WorldGeneratorApericraft;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Apericraft{

    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	//Renderers
    	LoadRenderer.RenderRegistery();
    	//Blocks
    	LoadBlocks.ore();
    	LoadBlocks.blocks();
    	LoadBlocks.Crops();
    	LoadBlocks.earth();
    	//Items
    	LoadItems.Ingots();
    	LoadItems.Dusts();
    	LoadItems.Swords();
    	LoadItems.Spades();
    	LoadItems.Pickaxes();
    	LoadItems.Hoes();
    	LoadItems.Axes();
    	LoadItems.Seeds();
    	LoadItems.Food();
    	LoadItems.Armor_Helmet();
    	LoadItems.Armor_Legs();
    	LoadItems.Armor_Chestplate();
    	LoadItems.Armor_Boots();
    	//Crafting
    	LoadCrafting.Shaped();
    	LoadCrafting.Shapeless();
    	LoadCrafting.Furnace();
    	//World Generation
    	GameRegistry.registerWorldGenerator(new WorldGeneratorApericraft(),0);
    }
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event){
    	
    }
}
