package com.DefineCraft.Items;


import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EmptyGemItem extends Item{
      
	private int isFull;
	
       public EmptyGemItem(String itemName, int par2){
    	   this.setUnlocalizedName(Reference.ModID + "_" +itemName);
  //             setTextureName(Ref.MODID + ":" + itemName);
  			setCreativeTab(DefineCraftCore.DefineCraft);
       		this.isFull = par2;
       }

}