package com.DefineCraft.Items;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;
import com.DefineCraft.Core.DefineCraftModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LogicChip extends Item{
      
	private final String name = "logicchip";
	
       public LogicChip(String itemName){
  			setCreativeTab(DefineCraftCore.DefineCraft);
  	 	   this.setUnlocalizedName(Reference.ModID + "_" +itemName);
  	 	   
    
       }
       
     
}