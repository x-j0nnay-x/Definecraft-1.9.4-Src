package com.DefineCraft.Items;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;


public class DustItem extends Item{
    
    public DustItem(String itemName){
    	   this.setUnlocalizedName(Reference.ModID + "_" +itemName);
   			setCreativeTab(DefineCraftCore.DefineCraft);
    }
    public static void reg(Item item) {
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		 .register(item, 0, new ModelResourceLocation(Reference.ModID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
