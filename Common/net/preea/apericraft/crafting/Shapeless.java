package net.preea.apericraft.crafting;

import net.minecraft.item.ItemStack;
import net.preea.apericraft.Apericraft;
import cpw.mods.fml.common.registry.GameRegistry;

public class Shapeless {

	public static void LoadRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.CopperIngot, 9), new Object[]{
			new ItemStack(Apericraft.CopperBlock)
		});
		
	}

}
