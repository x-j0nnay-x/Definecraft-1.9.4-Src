package com.DefineCraft.Core;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class DefineCraftOreDict {
	 public static void init()
	    {
		//Ore Dictionary adding
	        OreDictionary.registerOre("dustSilver", new ItemStack(DefineCraftModItems.SilverDust));
	        OreDictionary.registerOre("ingotSilver", new ItemStack(DefineCraftModItems.SilverBar));
	        OreDictionary.registerOre("dustTerbium", new ItemStack(DefineCraftModItems.TerbiumDust));
	        OreDictionary.registerOre("ingotTerbium", new ItemStack(DefineCraftModItems.TerbiumBar));
	        OreDictionary.registerOre("dustObsidian", new ItemStack(DefineCraftModItems.ObsidianDust));
	        OreDictionary.registerOre("ingotObsidian", new ItemStack(DefineCraftModItems.ObsidianBar));
	        OreDictionary.registerOre("dustHellStone", new ItemStack(DefineCraftModItems.HellStoneDust));
	        OreDictionary.registerOre("ingotHellStone", new ItemStack(DefineCraftModItems.HellStoneBar));
	        OreDictionary.registerOre("dustDiamond", new ItemStack(DefineCraftModItems.DiamondDust));
	        OreDictionary.registerOre("dustGold", new ItemStack(DefineCraftModItems.GoldDust));
	        OreDictionary.registerOre("dustIron", new ItemStack(DefineCraftModItems.IronDust));
	        OreDictionary.registerOre("dustCoal", new ItemStack(DefineCraftModItems.CoalDust));
	    	OreDictionary.registerOre("oreHellstone", new ItemStack(DefineCraftModBlocks.HellStoneOre));
	    	OreDictionary.registerOre("oreTerbium", new ItemStack(DefineCraftModBlocks.TerbiumOre));
	    	OreDictionary.registerOre("oreSilver", new ItemStack(DefineCraftModBlocks.SilverOre));
	    }
}
