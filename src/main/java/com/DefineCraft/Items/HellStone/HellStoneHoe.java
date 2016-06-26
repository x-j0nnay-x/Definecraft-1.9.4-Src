package com.DefineCraft.Items.HellStone;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemHoe;

public class HellStoneHoe extends ItemHoe
{
	public HellStoneHoe(ToolMaterial material, String name) 
	{
		super(material);
		        setUnlocalizedName(Reference.ModID + "_" + name);
	      //  setTextureName(Ref.MODID + ":" + itemName);
			setCreativeTab(DefineCraftCore.DefineCraft);

	}
}