package com.DefineCraft.Items.Terbium;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TerbiumBar  extends Item
{
	public TerbiumBar(String itemName){
		setUnlocalizedName(Reference.ModID + "_" + itemName);
	      //  setTextureName(Ref.MODID + ":" + itemName);
			setCreativeTab(DefineCraftCore.DefineCraft);
}
    
}
