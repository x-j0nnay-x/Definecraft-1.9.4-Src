package com.DefineCraft.Items.Silver;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemSword;

public class SilverSword extends ItemSword
{
	public SilverSword(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(Reference.ModID + "_" + name);
		setCreativeTab(DefineCraftCore.DefineCraft);
}
}