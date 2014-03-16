package net.preea.apericraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.preea.apericraft.declarations.ABlocks;
import net.preea.apericraft.declarations.AItems;
import net.preea.apericraft.lib.Reference;

public class Light_Greenstone_Ore extends Block {
	   
	private final boolean istrue1;
	private static final String __OBFID = "CL_00000297";

	    public Light_Greenstone_Ore(boolean istrue)
	    {
	        super(Material.redstoneLight);
			this.setHardness(5F);
			this.setResistance(10F);
			this.setHarvestLevel("pickaxe", 2);	
	        this.istrue1 = istrue;
	        this.setLightLevel(1.0F);
	        if (istrue)
	        {}
	    }

	    /**
	     * Called whenever the block is added into the world. Args: world, x, y, z
	     */
	    public void onBlockAdded(World world, int x, int y, int z)
	    {
	        if (!world.isRemote)
	        {
	            if (this.istrue1 && !world.isBlockIndirectlyGettingPowered(x, y, z))
	            {
	               world.scheduleBlockUpdate(x, y, z, this, 4);
	            }
	            else if (!this.istrue1 && world.isBlockIndirectlyGettingPowered(x, y, z))
	            {
	                world.setBlock(x, y, z, ABlocks.Light_Greenstone_Ore, 0, 2);
	            }
	        }
	    }

	    /**
	     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	     * their own) Args: x, y, z, neighbor Block
	     */
	    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor)
	    {
	        if (!world.isRemote)
	        {
	            if (this.istrue1 && !world.isBlockIndirectlyGettingPowered(x, y, z))
	            {
	                world.scheduleBlockUpdate(x, y, z, this, 4);
	            }
	            else if (!this.istrue1 && world.isBlockIndirectlyGettingPowered(x, y, z))
	            {
	                world.setBlock(x, y, z, Blocks.lit_redstone_lamp, 0, 2);
	            }
	        }
	    }

	    /**
	     * Ticks the block if it's been scheduled
	     */
	    public void updateTick(World world, int x, int y, int z, Random random)
	    {
	        if (!world.isRemote && this.istrue1 && !world.isBlockIndirectlyGettingPowered(x, y, z))
	        {
	            world.setBlock(x, y, z, ABlocks.Greenstone_Ore, 0, 2);
	        }
	    }

	    public Item getItemDropped(int p1, Random random, int p3)
	    {
	        return AItems.Greenstone;
	    }

	    /**
	     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
	     */
	    public int quantityDroppedWithBonus(int p1, Random random)
	    {
	        return this.quantityDropped(random) + random.nextInt(p1 + 1);
	    }

	    /**
	     * Returns the quantity of items to drop on block destruction.
	     */
	    public int quantityDropped(Random random)
	    {
	        return 4 + random.nextInt(2);
	    }


	    /**
	     * Gets an item for the block being called on. Args: world, x, y, z
	     */
	    @SideOnly(Side.CLIENT)
	    public Item getItem(World world, int x, int y, int z)
	    {
	        return Item.getItemFromBlock(ABlocks.Greenstone_Ore);
	    }

	    /**
	     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
	     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
	     */
	    protected ItemStack createStackedBlock(int p_149644_1_)
	    {
	        return new ItemStack(ABlocks.Greenstone_Ore);
	    }
		@SideOnly(Side.CLIENT)
		public void registerBlockIcons(IIconRegister IconRegister){
			this.blockIcon = IconRegister.registerIcon(Reference.MODID + ":" +(this.getUnlocalizedName().substring(5)));
		}
	}