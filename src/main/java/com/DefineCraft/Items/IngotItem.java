package com.DefineCraft.Items;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotItem  extends Item
{
	public IngotItem(String itemName){
      setUnlocalizedName(Reference.ModID + "_" + itemName);
      setCreativeTab(DefineCraftCore.DefineCraft);

}
    
}
