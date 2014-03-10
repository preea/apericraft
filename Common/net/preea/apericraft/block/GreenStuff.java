package net.preea.apericraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.preea.apericraft.Apericraft;
import net.preea.apericraft.lib.Reference;

public class GreenStuff extends BlockFluidClassic{

	public GreenStuff(int id){
		super(id, Apericraft.GreenStuffFluid, Apericraft.materialGreenStuff);
		this.setCreativeTab(Apericraft.tabApericraftFluids);
	
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
	this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
}

}
