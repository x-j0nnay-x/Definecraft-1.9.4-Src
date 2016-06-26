package com.DefineCraft.Core;

import com.DefineCraft.Reference;
import com.DefineCraft.Items.LogicChip;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRenderRegister {
	
	public static void registerItemRenderer() {
//Standered items
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.LogicChip, 0, new ModelResourceLocation(Reference.ModID + ":" + "LogicChip", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.EmptyGem, 0, new ModelResourceLocation(Reference.ModID + ":" + "EmptyGem", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.EnergyGem, 0, new ModelResourceLocation(Reference.ModID + ":" + "EnergyGem", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.Peridot, 0, new ModelResourceLocation(Reference.ModID + ":" + "Peridot", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.GoldStick, 0, new ModelResourceLocation(Reference.ModID + ":" + "GoldStick", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianStick, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianStick", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.GrinderHead, 0, new ModelResourceLocation(Reference.ModID + ":" + "GrinderHead", "inventory"));
//dust items
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.CoalDust, 0, new ModelResourceLocation(Reference.ModID + ":" + "CoalDust", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.DiamondDust, 0, new ModelResourceLocation(Reference.ModID + ":" + "DiamondDust", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.IronDust, 0, new ModelResourceLocation(Reference.ModID + ":" + "IronDust", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.GoldDust, 0, new ModelResourceLocation(Reference.ModID + ":" + "GoldDust", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneDust, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneDust", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianDust, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianDust", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumDust, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumDust", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverDust, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverDust", "inventory"));
//ingot items
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneBar, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneBar", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianBar, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianBar", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumBar, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumBar", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverBar, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverBar", "inventory"));
//armor
    	//silver
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverHelmet, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverHelmet", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverChest, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverChest", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverLegs, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverLegs", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverBoots, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverBoots", "inventory")); 
    	//Terbium
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumHelmet, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumHelmet", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumChest, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumChest", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumLegs, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumLegs", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumBoots, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumBoots", "inventory")); 
    	//Obsidian
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianHelmet, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianHelmet", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianChest, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianChest", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianLegs, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianLegs", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianBoots, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianBoots", "inventory")); 
    	//HellStone
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneHelmet, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneHelmet", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneChest, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneChest", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneLegs, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneLegs", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneBoots, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneBoots", "inventory")); 
//tools
    	//silver
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverAxe, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverAxe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverHoe, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverHoe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverPickAxe, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverPickAxe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverSpade, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverSpade", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.SilverSword, 0, new ModelResourceLocation(Reference.ModID + ":" + "SilverSword", "inventory"));
    	//Terbium
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumAxe, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumAxe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumHoe, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumHoe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumPickAxe, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumPickAxe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumSpade, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumSpade", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.TerbiumSword, 0, new ModelResourceLocation(Reference.ModID + ":" + "TerbiumSword", "inventory"));
    	//Obsidian
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianAxe, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianAxe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianHoe, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianHoe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianPickAxe, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianPickAxe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianSpade, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianSpade", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.ObsidianSword, 0, new ModelResourceLocation(Reference.ModID + ":" + "ObsidianSword", "inventory"));
    	//HellStone
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneAxe, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneAxe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneHoe, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneHoe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStonePickAxe, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStonePickAxe", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneSpade, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneSpade", "inventory"));
    	ModelLoader.setCustomModelResourceLocation(DefineCraftModItems.HellStoneSword, 0, new ModelResourceLocation(Reference.ModID + ":" + "HellStoneSword", "inventory"));
	}
}
