package net.preea.apericraft.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.preea.apericraft.declarations.ABlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorApericraft implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1: generateNeather(world, random, chunkX * 16, chunkZ * 16);
		case 0: generateOverworld(world, random, chunkX * 16, chunkZ * 16);
		case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}}
	private void generateOverworld(World world, Random random, int x, int z) {
		//																		   VeinSize	    	,SpRate ,  MinY	,   MaxY);
		addOreSpawn(ABlocks.Aluminium_Ore, world, random, x, z, 16, 16, 	5 + random.nextInt(6)	, 	5	, 	1	, 	45	);
		addOreSpawn(ABlocks.Tin_Ore, world, random, x, z, 16, 16, 			7 + random.nextInt(4)	, 	21	, 	1	, 	150	);
		addOreSpawn(ABlocks.Copper_Ore, world, random, x, z, 16, 16, 		7 + random.nextInt(5)	, 	21	, 	1	, 	150	);
		addOreSpawn(ABlocks.Silver_Ore, world, random, x, z, 16, 16, 		5 + random.nextInt(4)	, 	11	, 	1	, 	40	);
		addOreSpawn(ABlocks.Lead_Ore, world, random, x, z, 16, 16, 			5 + random.nextInt(3)	, 	11	, 	1	, 	40	);
		addOreSpawn(ABlocks.Titanium_Ore, world, random, x, z, 16, 16, 		3 + random.nextInt(3)	, 	3	,	1	, 	25	);
		
	}
	private void generateNeather(World world, Random random, int x, int z) {
		
	}
	private void generateEnd(World world, Random random, int x, int z) {
		
	}

	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
	       int maxPossY = minY + (maxY - 1);
	       assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
	       assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
	       assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
	       assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
	       assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
	      
	       int diffBtwnMinMaxY = maxY - minY;
	       for(int x = 0; x < chancesToSpawn; x++)
	       {
	             int posX = blockXPos + random.nextInt(maxX);
	             int posY = minY + random.nextInt(diffBtwnMinMaxY);
	             int posZ = blockZPos + random.nextInt(maxZ);
	             (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
	       }
	}
}
