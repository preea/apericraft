package net.preea.apericraft.loadhandler;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraftforge.common.BiomeManager;
import net.preea.apericraft.biomes.BiomeGenAperi;
import net.preea.apericraft.declarations.ABiomes;
import cpw.mods.fml.common.registry.GameRegistry;

public class LoadBiomes {
	//Height Decelerations
	protected static final BiomeGenBase.Height Height_Aperi = new BiomeGenBase.Height(0.1F, 0.15F);
	
public static void Biomes(){
	ABiomes.Aperi = (new BiomeGenAperi(60)).setColor(9286496).setBiomeName("Aperi").setHeight(Height_Aperi);

}

}
