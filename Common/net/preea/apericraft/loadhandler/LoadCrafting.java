package net.preea.apericraft.loadhandler;

import net.minecraft.init.Items;
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
		GameRegistry.addShapedRecipe(new ItemStack(ABlocks.Greenstone_Block), new Object[]{"XXX","XXX","XXX",'X',AItems.Greenstone});
	//Swords
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Sword), new Object[]{"X","X","S",'X',AItems.Aluminium_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Copper_Sword), new Object[]{"X","X","S",'X',AItems.Copper_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Lead_Sword), new Object[]{"X","X","S",'X',AItems.Lead_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Silver_Sword), new Object[]{"X","X","S",'X',AItems.Silver_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Tin_Sword), new Object[]{"X","X","S",'X',AItems.Tin_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Titanium_Sword), new Object[]{"X","X","S",'X',AItems.Titanium_Ingot, 'S', Items.stick});
	//Pickaxes
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Pickaxe), new Object[]{"XXX"," S "," S ",'X',AItems.Aluminium_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Copper_Pickaxe), new Object[]{"XXX"," S "," S ",'X',AItems.Copper_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Lead_Pickaxe), new Object[]{"XXX"," S "," S ",'X',AItems.Lead_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Silver_Pickaxe), new Object[]{"XXX"," S "," S ",'X',AItems.Silver_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Tin_Pickaxe), new Object[]{"XXX"," S "," S ",'X',AItems.Tin_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Titanium_Pickaxe), new Object[]{"XXX"," S "," S ",'X',AItems.Titanium_Ingot, 'S', Items.stick});
	//Axes
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Axe), new Object[]{"XX","XS"," S",'X',AItems.Aluminium_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Copper_Axe), new Object[]{"XX","XS"," S",'X',AItems.Copper_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Lead_Axe), new Object[]{"XX","XS"," S",'X',AItems.Lead_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Silver_Axe), new Object[]{"XX","XS"," S",'X',AItems.Silver_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Tin_Axe), new Object[]{"XX","XS"," S",'X',AItems.Tin_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Titanium_Axe), new Object[]{"XX","XS"," S",'X',AItems.Titanium_Ingot, 'S', Items.stick});
	//Spades
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Spade), new Object[]{"X","S","S",'X',AItems.Aluminium_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Copper_Spade), new Object[]{"X","S","S",'X',AItems.Copper_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Lead_Spade), new Object[]{"X","S","S",'X',AItems.Lead_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Silver_Spade), new Object[]{"X","S","S",'X',AItems.Silver_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Tin_Spade), new Object[]{"X","S","S",'X',AItems.Tin_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Titanium_Spade), new Object[]{"X","S","S",'X',AItems.Titanium_Ingot, 'S', Items.stick});
	//Hoes
		
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Hoe), new Object[]{"XX"," S"," S",'X',AItems.Aluminium_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Copper_Hoe), new Object[]{"XX"," S"," S",'X',AItems.Copper_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Lead_Hoe), new Object[]{"XX"," S"," S",'X',AItems.Lead_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Silver_Hoe), new Object[]{"XX"," S"," S",'X',AItems.Silver_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Tin_Hoe), new Object[]{"XX"," S"," S",'X',AItems.Tin_Ingot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Titanium_Hoe), new Object[]{"XX"," S"," S",'X',AItems.Titanium_Ingot, 'S', Items.stick});
	//Helmets
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Helmet), new Object[]{"XXX","X X",'X',AItems.Aluminium_Ingot,});
	//Chestplates
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Chestplate), new Object[]{"X X","XXX", "XXX",'X',AItems.Aluminium_Ingot,});
	//Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Legs), new Object[]{"XXX","X X", "X X",'X',AItems.Aluminium_Ingot,});
	//Boots
		GameRegistry.addShapedRecipe(new ItemStack(AItems.Aluminium_Boots), new Object[]{"X X","X X",'X',AItems.Aluminium_Ingot,});
	}
	public static void Shapeless(){	
	//Blocks
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Aluminium_Ingot, 9), new Object[]{new ItemStack(ABlocks.Aluminium_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Copper_Ingot, 9), new Object[]{new ItemStack(ABlocks.Copper_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Lead_Ingot, 9), new Object[]{new ItemStack(ABlocks.Lead_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Silver_Ingot, 9), new Object[]{new ItemStack(ABlocks.Silver_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Tin_Ingot, 9), new Object[]{new ItemStack(ABlocks.Tin_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Titanium_Ingot, 9), new Object[]{new ItemStack(ABlocks.Titanium_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(AItems.Greenstone, 9), new Object[]{new ItemStack(ABlocks.Greenstone_Block)});
	}
	public static void Furnace(){
	//Ingots
		GameRegistry.addSmelting(ABlocks.Aluminium_Ore,new ItemStack(AItems.Aluminium_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Copper_Ore,new ItemStack(AItems.Copper_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Lead_Ore,new ItemStack(AItems.Lead_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Silver_Ore,new ItemStack(AItems.Silver_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Tin_Ore,new ItemStack(AItems.Tin_Ingot), 0.3F);
		GameRegistry.addSmelting(ABlocks.Titanium_Ore,new ItemStack(AItems.Titanium_Ingot), 0.3F);
	//Food
		GameRegistry.addSmelting(AItems.Corn,new ItemStack(AItems.CookedCorn), 0.3F);
	}
}
