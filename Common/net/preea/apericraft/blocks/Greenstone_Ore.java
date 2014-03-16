package net.preea.apericraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.preea.apericraft.declarations.ABlocks;
import net.preea.apericraft.declarations.ACreativeTabs;
import net.preea.apericraft.declarations.AItems;
import net.preea.apericraft.lib.Reference;

public class Greenstone_Ore extends Block{
	    private boolean istrue1;
	    private static final String __OBFID = "CL_00000294";

	    public Greenstone_Ore(boolean istrue)
	    {
	        super(Material.rock);

	        if (istrue)
	        {
	            this.setTickRandomly(true);
	        }
	        this.setCreativeTab(ACreativeTabs.TabABlocks);
			this.setHardness(5F);
			this.setResistance(10F);
			this.setHarvestLevel("pickaxe", 2);	
	        this.istrue1 = istrue;
	    }

	    /**
	     * How many world ticks before ticking
	     */
	    public int tickRate(World p_149738_1_)
	    {
	        return 30;
	    }

	    /**
	     * Called when a player hits the block. Args: world, x, y, z, player
	     */
	    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
	    {
	        this.func_150185_e(world, x, y, z);
	        super.onBlockClicked(world, y, x, z, player);
	    }

	    /**
	     * Called whenever an entity is walking on top of this block. Args: world, x, y, z, entity
	     */
	    public void onEntityWalking(World world, int x, int y, int z, Entity entity)
	    {
	        this.func_150185_e(world, x, y, z);
	        super.onEntityWalking(world, x, y, z, entity);
	    }

	    /**
	     * Called upon block activation (right click on the block.)
	     */
	    public boolean onBlockActivated(World world, int p2, int p3, int p4, EntityPlayer player, int p6, float p7, float p8, float p9)
	    {
	        this.func_150185_e(world, p2, p3, p4);
	        return super.onBlockActivated(world, p2, p3, p4, player, p6, p7, p8, p9);
	    }

	    private void func_150185_e(World world, int p2, int p3, int p4)
	    {
	        this.func_150186_m(world, p2, p3, p4);

	        if (this == ABlocks.Greenstone_Ore)
	        {
	            world.setBlock(p2, p3, p4, ABlocks.Light_Greenstone_Ore);
	        }
	    }

	    /**
	     * Ticks the block if it's been scheduled
	     */
	    public void updateTick(World world, int p2, int p3, int p4, Random random)
	    {
	        if (this == ABlocks.Light_Greenstone_Ore)
	        {
	            world.setBlock(p2, p3, p4, ABlocks.Greenstone_Ore);
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
	     * Drops the block items with a specified chance of dropping the specified items
	     */
	    public void dropBlockAsItemWithChance(World world, int p2, int p3, int p4, int p5, float p6, int p7)
	    {
	        super.dropBlockAsItemWithChance(world, p2, p3, p4, p5, p6, p7);
	    }

	    private Random rand = new Random();
	    @Override // World, meta, fortune
	    public int getExpDrop(IBlockAccess access, int par2, int par3)
	    {
	        if (this.getItemDropped(par2, rand, par3) != Item.getItemFromBlock(this))
	        {
	            return 1 + rand.nextInt(5);
	        }
	        return 0;
	    }

	    /**
	     * A randomly called display update to be able to add particles or other items for display
	     */
	    @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World world, int x, int y, int z, Random random)
	    {
	        if (this.istrue1){
	            this.func_150186_m(world, x, y, z);}
	    }

	    private void func_150186_m(World world, int x, int y, int z){
	        Random random = world.rand;
	        double d0 = 0.0625D;

	        for (int l = 0; l < 6; ++l){
	        	
	            double d1 = (double)((float)x + random.nextFloat());
	            double d2 = (double)((float)y + random.nextFloat());
	            double d3 = (double)((float)z + random.nextFloat());

	            if (l == 0 && !world.getBlock(x, y + 1, z).isOpaqueCube()){d2 = (double)(y + 1) + d0;}
	            if (l == 1 && !world.getBlock(x, y - 1, z).isOpaqueCube()){d2 = (double)(y + 0) - d0;}
	            if (l == 2 && !world.getBlock(x, y, z + 1).isOpaqueCube()){d3 = (double)(z + 1) + d0;}
	            if (l == 3 && !world.getBlock(x, y, z - 1).isOpaqueCube()){d3 = (double)(z + 0) - d0;}
	            if (l == 4 && !world.getBlock(x + 1, y, z).isOpaqueCube()){d1 = (double)(x + 1) + d0;}
	            if (l == 5 && !world.getBlock(x - 1, y, z).isOpaqueCube()){d1 = (double)(x + 0) - d0;}

	            if (d1 < (double)x || d1 > (double)(x + 1) || d2 < 0.0D || d2 > (double)(y + 1) || d3 < (double)z || d3 > (double)(z + 1)){
	                world.spawnParticle("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);}}}

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
