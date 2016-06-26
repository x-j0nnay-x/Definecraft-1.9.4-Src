package com.DefineCraft.Items.Obsidian;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword
{
	public ObsidianSword(ToolMaterial material, String name) 
	{
		super(material);
		 setUnlocalizedName(Reference.ModID + "_" + name);
	      //  setTextureName(Ref.MODID + ":" + itemName);
			setCreativeTab(DefineCraftCore.DefineCraft);

	}
}