package com.DefineCraft.Items.Terbium;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class TerbiumAxe extends ItemAxe 
{
	public TerbiumAxe(ToolMaterial material, float damage, float speed, String Name) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.ModID + "_" + Name);
		setCreativeTab(DefineCraftCore.DefineCraft);

	}
}
