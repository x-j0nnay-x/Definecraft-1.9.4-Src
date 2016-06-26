package com.DefineCraft.Items.HellStone;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemSpade;

public class HellStoneSpade extends ItemSpade
{
	public HellStoneSpade(ToolMaterial material, String name) 
	{
		super(material);
		 setUnlocalizedName(Reference.ModID + "_" + name);
	      //  setTextureName(Ref.MODID + ":" + itemName);
			setCreativeTab(DefineCraftCore.DefineCraft);

	}
}