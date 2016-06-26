package com.DefineCraft.Items.Terbium;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemHoe;

public class TerbiumHoe extends ItemHoe
{
	public TerbiumHoe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(Reference.ModID + "_" + name);
	      //  setTextureName(Ref.MODID + ":" + itemName);
			setCreativeTab(DefineCraftCore.DefineCraft);

	}
}