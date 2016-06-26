package com.DefineCraft.Items.Silver;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemSpade;

public class SilverSpade extends ItemSpade
{
	public SilverSpade(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(Reference.ModID + "_" + name);
	      //  setTextureName(Ref.MODID + ":" + itemName);
			setCreativeTab(DefineCraftCore.DefineCraft);

	}
}