package com.apericraft.apericraft;

import com.apericraft.apericraft.lib.Reference;
import com.apericraft.apericraft.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * 
 * AperiCraft
 * 
 * @author Preea
 * 
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class Apericraft {
	
	@Instance(Reference.MOD_ID)
	public static Apericraft instance;
	
	@SidedProxy(clientSide = "com.apericraft.apericraft.proxy.ClientProxy", serverSide = "com.apericraft.apericraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
