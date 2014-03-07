package net.preea.apericraft.crafting;

import net.minecraft.item.ItemStack;
import net.preea.apericraft.Apericraft;
import cpw.mods.fml.common.registry.GameRegistry;

public class Shaped {

	public static void LoadRecipes() {		
	//Copper Block
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.CopperBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.CopperIngot}); 
		
	}
}
