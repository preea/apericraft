package net.preea.apericraft.fuel;

import net.minecraft.item.ItemStack;
import net.preea.apericraft.Apericraft;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

		public int getBurnTime(ItemStack fuel) {
			//Return 200 = 1 item
			if (fuel.itemID == Apericraft.TitaniumIngot.itemID) return 3000;
			return 0;
		}
}
