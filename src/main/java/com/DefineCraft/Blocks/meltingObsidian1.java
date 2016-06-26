package com.DefineCraft.Blocks;

import java.util.ArrayList;
import java.util.Random;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class meltingObsidian1 extends Block
{
	
    public meltingObsidian1(String name)
    {
    super(Material.ROCK);
    this.setTickRandomly(true);
	setUnlocalizedName(Reference.ModID + "_" +name);
	setCreativeTab(DefineCraftCore.DefineCraft);
	setHardness(100.0F);
	setResistance(100.0F);
    }
   
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

   
    public void updateTick(World world, int i, int j, int k, Random rand)
    {
    	
   // 	this.dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
    //    world.setBlock(i, j, k, Blocks.flowing_water);
    	
    }

}