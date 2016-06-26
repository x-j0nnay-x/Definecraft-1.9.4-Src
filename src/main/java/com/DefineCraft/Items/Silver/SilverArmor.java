package com.DefineCraft.Items.Silver;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;
import com.DefineCraft.Core.DefineCraftModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SilverArmor extends ItemArmor
{
	public SilverArmor(final ArmorMaterial material, final EntityEquipmentSlot equipmentSlot, String Name) {
			super(material, 0, equipmentSlot);
			setUnlocalizedName(Reference.ModID + "_" + Name);
   			setCreativeTab(DefineCraftCore.DefineCraft);

	    }
	
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if(itemStack.getItem().getUnlocalizedName() == "SilverHelmet")
		{
			if(player.isInWater())
			{
				player.setAir(20);
			}
		}
	}
}