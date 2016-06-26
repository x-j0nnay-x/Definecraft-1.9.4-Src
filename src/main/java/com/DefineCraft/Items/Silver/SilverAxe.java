package com.DefineCraft.Items.Silver;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemAxe;

public class SilverAxe extends ItemAxe 
{
	public SilverAxe(ToolMaterial material, float damage, float speed, String Name) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.ModID + "_" + Name);
		setCreativeTab(DefineCraftCore.DefineCraft);
	}
}
