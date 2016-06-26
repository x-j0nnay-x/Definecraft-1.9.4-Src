package com.DefineCraft.Items;


import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GrinderHeadItem extends Item{
      
       public GrinderHeadItem(String itemName){
    	   this.setUnlocalizedName(Reference.ModID + "_" +itemName);
  //         this.setTextureName(Ref.MODID + ":" + itemName);
  			setCreativeTab(DefineCraftCore.DefineCraft);
       }

}