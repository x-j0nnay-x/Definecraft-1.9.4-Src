package com.DefineCraft.Items.Obsidian;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ObsidianAxe extends ItemAxe 
{
	public ObsidianAxe(ToolMaterial material, float damage, float speed, String Name) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.ModID + "_" + Name);
		setCreativeTab(DefineCraftCore.DefineCraft);
}
}
