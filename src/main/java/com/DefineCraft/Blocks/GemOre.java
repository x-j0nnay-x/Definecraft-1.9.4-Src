package com.DefineCraft.Blocks;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;
import com.DefineCraft.Core.HarvestLevels;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GemOre extends Block {

	public GemOre(String name) {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModID + "_" +name);
		setCreativeTab(DefineCraftCore.DefineCraft);
		setHardness(2.0F);
		setResistance(2.0F);
	    setHarvestLevel("pickaxe", HarvestLevels.GEM);

	}

}
