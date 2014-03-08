package net.preea.apericraft.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.preea.apericraft.Apericraft;

public class Smelting {

	public static void LoadRecipes() {
		
		FurnaceRecipes.smelting().addSmelting(Apericraft.CopperOre.blockID, new ItemStack(Apericraft.CopperIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.AluminiumOre.blockID, new ItemStack(Apericraft.AluminiumIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.BerylliumOre.blockID, new ItemStack(Apericraft.BerylliumIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.CeriumOre.blockID, new ItemStack(Apericraft.CeriumIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.CobaltOre.blockID, new ItemStack(Apericraft.CobaltIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.LeadOre.blockID, new ItemStack(Apericraft.LeadIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.NickleOre.blockID, new ItemStack(Apericraft.NickleIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.PlatinumOre.blockID, new ItemStack(Apericraft.PlatinumIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.SeleniumOre.blockID, new ItemStack(Apericraft.SeleniumIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.SilverOre.blockID, new ItemStack(Apericraft.SilverIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.TelluriumOre.blockID, new ItemStack(Apericraft.TelluriumIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.TinOre.blockID, new ItemStack(Apericraft.TinIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.TitaniumOre.blockID, new ItemStack(Apericraft.TitaniumIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.TungstenOre.blockID, new ItemStack(Apericraft.TungstenIngot), 0.35F);
		FurnaceRecipes.smelting().addSmelting(Apericraft.ZirconiumOre.blockID, new ItemStack(Apericraft.ZirconiumIngot), 0.35F);
	
	
	
	}

}
