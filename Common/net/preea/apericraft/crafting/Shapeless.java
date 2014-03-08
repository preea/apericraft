package net.preea.apericraft.crafting;

import net.minecraft.item.ItemStack;
import net.preea.apericraft.Apericraft;
import cpw.mods.fml.common.registry.GameRegistry;

public class Shapeless {

	public static void LoadRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.AluminiumIngot, 9), new Object[]{
			new ItemStack(Apericraft.AluminiumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.BerylliumIngot, 9), new Object[]{
			new ItemStack(Apericraft.BerylliumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.CeriumIngot, 9), new Object[]{
			new ItemStack(Apericraft.CeriumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.CobaltIngot, 9), new Object[]{
			new ItemStack(Apericraft.CobaltBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.CopperIngot, 9), new Object[]{
			new ItemStack(Apericraft.CopperBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.LeadIngot, 9), new Object[]{
			new ItemStack(Apericraft.LeadBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.NickleIngot, 9), new Object[]{
			new ItemStack(Apericraft.NickleBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.PlatinumIngot, 9), new Object[]{
			new ItemStack(Apericraft.PlatinumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.SeleniumIngot, 9), new Object[]{
			new ItemStack(Apericraft.SeleniumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.SilverIngot, 9), new Object[]{
			new ItemStack(Apericraft.SilverBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.TelluriumIngot, 9), new Object[]{
			new ItemStack(Apericraft.TelluriumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.TinIngot, 9), new Object[]{
			new ItemStack(Apericraft.TinBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.TitaniumIngot, 9), new Object[]{
			new ItemStack(Apericraft.TitaniumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.TungstenIngot, 9), new Object[]{
			new ItemStack(Apericraft.TungstenBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Apericraft.ZirconiumIngot, 9), new Object[]{
			new ItemStack(Apericraft.ZirconiumBlock)});
		
	}

}
