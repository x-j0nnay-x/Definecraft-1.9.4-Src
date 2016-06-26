package com.DefineCraft.Items.Silver;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SilverBar  extends Item
{
	public SilverBar(String itemName){
		setUnlocalizedName(Reference.ModID + "_" + itemName);
	      //  setTextureName(Ref.MODID + ":" + itemName);
			setCreativeTab(DefineCraftCore.DefineCraft);

}
    
}
