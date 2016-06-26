package com.DefineCraft.Items;

import net.minecraft.item.Item;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

public class StickItem extends Item{
    
    public StickItem(String itemName){
 	   this.setUnlocalizedName(Reference.ModID + "_" +itemName);
	   setCreativeTab(DefineCraftCore.DefineCraft);
    }

}
