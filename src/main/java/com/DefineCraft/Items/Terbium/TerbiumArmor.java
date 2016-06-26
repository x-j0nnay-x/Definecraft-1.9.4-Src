package com.DefineCraft.Items.Terbium;

import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;
import com.DefineCraft.Core.DefineCraftModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TerbiumArmor extends ItemArmor
{
	public TerbiumArmor(ArmorMaterial material, EntityEquipmentSlot armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(Reference.ModID + "_" + name);
	      //  setTextureName(Ref.MODID + ":" + itemName);
			setCreativeTab(DefineCraftCore.DefineCraft);


	}
	

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if(itemStack.getItem().getUnlocalizedName() == "TerbiumHelmet")
		{
			if(player.isInWater())
			{
				player.setAir(20);
			}
		}
	}
}