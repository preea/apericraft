package net.preea.apericraft.crafting;

import net.minecraft.item.ItemStack;
import net.preea.apericraft.Apericraft;
import cpw.mods.fml.common.registry.GameRegistry;

public class Shaped {

	public static void LoadRecipes() {		
	//Metal Blocks
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.AluminiumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.AluminiumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.BerylliumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.BerylliumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.CeriumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.CeriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.CobaltBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.CobaltIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.CopperBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.CopperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.LeadBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.LeadIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.NickleBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.NickleIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.PlatinumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.PlatinumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.SeleniumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.SeleniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.SilverBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.SilverIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.TelluriumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.TelluriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.TinBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.TinIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.TitaniumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.TitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.TungstenBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.TungstenIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Apericraft.ZirconiumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', Apericraft.ZirconiumIngot});
		
	}
}
