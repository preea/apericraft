package net.preea.apericraft.loadhandler;

import net.minecraft.item.ItemStack;
import net.preea.apericraft.declarations.ABlocks;
import net.preea.apericraft.declarations.AItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class LoadCrafting {
	public static void Shaped(){
		GameRegistry.addShapedRecipe(new ItemStack(ABlocks.Aluminium_Block), new Object[]{"XXX","XXX","XXX",'X',AItems.Aluminium_Ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ABlocks.Copper_Block), new Object[]{"XXX","XXX","XXX",'X',AItems.Copper_Ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ABlocks.Lead_Block), new Object[]{"XXX","XXX","XXX",'X',AItems.Lead_Ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ABlocks.Silver_Block), new Object[]{"XXX","XXX","XXX",'X',AItems.Silver_Ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ABlocks.Tin_Block), new Object[]{"XXX","XXX","XXX",'X',AItems.Tin_Ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ABlocks.Titanium_Block), new Object[]{"XXX","XXX","XXX",'X',AItems.Titanium_Ingot});
	}
	public static void Shapeless(){	
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Aluminium_Ingot, 9), new Object[]{new ItemStack(ABlocks.Aluminium_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Copper_Ingot, 9), new Object[]{new ItemStack(ABlocks.Copper_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Lead_Ingot, 9), new Object[]{new ItemStack(ABlocks.Lead_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Silver_Ingot, 9), new Object[]{new ItemStack(ABlocks.Silver_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Tin_Ingot, 9), new Object[]{new ItemStack(ABlocks.Tin_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Titanium_Ingot, 9), new Object[]{new ItemStack(ABlocks.Titanium_Block)});
		
	}
	public static void Furnace(){
		GameRegistry.addSmelting(ABlocks.Aluminium_Ore,new ItemStack(AItems.Aluminium_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Copper_Ore,new ItemStack(AItems.Copper_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Lead_Ore,new ItemStack(AItems.Lead_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Silver_Ore,new ItemStack(AItems.Silver_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Tin_Ore,new ItemStack(AItems.Tin_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Titanium_Ore,new ItemStack(AItems.Titanium_Ingot), 0.3F);
	}
}
