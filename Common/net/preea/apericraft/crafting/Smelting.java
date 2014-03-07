package net.preea.apericraft.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.preea.apericraft.Apericraft;

public class Smelting {

	public static void LoadRecipes() {
		
		FurnaceRecipes.smelting().addSmelting(Apericraft.CopperOre.blockID, new ItemStack(Apericraft.CopperIngot), 0.35F);
		
	}

}
