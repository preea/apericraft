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
import net.preea.apericraft.block.CopperOre;
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



@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Apericraft {
	
	@Instance(Reference.MOD_ID)
	public static Apericraft instance;
	
	@SidedProxy(clientSide = "net.preea.apericraft.proxy.ClientProxy", serverSide = "net.preea.apericraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	//Block deceleration

	public static Block CopperOre;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
	
		CopperOre = new CopperOre(500, Material.rock).setUnlocalizedName("CopperOre");
		
		GameRegistry.registerBlock (CopperOre, Reference.MOD_ID + "_" + CopperOre.getUnlocalizedName().substring(5));
		
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		
	}
		
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
