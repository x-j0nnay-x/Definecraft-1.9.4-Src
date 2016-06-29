package com.DefineCraft.Core;

import com.DefineCraft.Reference;
import com.DefineCraft.Items.LogicChip;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class BlockRenderRegister {
	
	public static void registerBlockRenderer() {
//TileEntity
	//	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.GrinderActive), 0, new ModelResourceLocation(Reference.ModID + ":" + "GrinderActive", "inventory"));
	//	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.GrinderIdle), 0, new ModelResourceLocation(Reference.ModID + ":" + "GrinderIdle", "inventory"));
//vanishing Block		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.meltingObsidian), 0, new ModelResourceLocation(Reference.ModID + ":" + "meltingObsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.meltingObsidian0), 0, new ModelResourceLocation(Reference.ModID + ":" + "meltingObsidian0", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.meltingObsidian1), 0, new ModelResourceLocation(Reference.ModID + ":" + "meltingObsidian1", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.meltingIce), 0, new ModelResourceLocation(Reference.ModID + ":" + "meltingIce", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.VanishingLight), 0, new ModelResourceLocation(Reference.ModID + ":" + "VanishingLight", "inventory"));
//Ore Blocks 
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.GemOre), 0, new ModelResourceLocation(Reference.ModID + ":" + "GemOre", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.HellStoneOre), 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneOre", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.TerbiumOre), 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumOre", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.SilverOre), 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverOre", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DefineCraftModBlocks.PeridotOre), 0, new ModelResourceLocation(Reference.ModID + ":" + "PeridotOre", "inventory"));
	}
}
