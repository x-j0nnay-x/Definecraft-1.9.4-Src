package com.DefineCraft.Items.HellStone;




import com.DefineCraft.DefineCraftCore;
import com.DefineCraft.Reference;
import com.DefineCraft.Core.DefineCraftModBlocks;
import com.DefineCraft.Core.DefineCraftModItems;
import com.DefineCraft.Core.Proxy.ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class HellStoneArmor extends ItemArmor
{
	public HellStoneArmor(ArmorMaterial material, EntityEquipmentSlot armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(Reference.ModID + "_" + name);
       // setTextureName(Ref.MODID + ":" + name);
		setCreativeTab(DefineCraftCore.DefineCraft);

	}
	//public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack, IBlockState blockState,Block block, BlockPos blockPos)
	{
		if (itemStack.getItem() == DefineCraftModItems.HellStoneBoots)
		{
				for(int _x = -3; _x <= 3; _x++) {
				for(int _z = -3; _z <= 3; _z++) {
					if(Math.abs(_x) + Math.abs(_z) <= 3) {
							int x = (int) player.posX;
							int y = (int) player.posY - 1;
							int z = (int) player.posZ;
							boolean IsFlowing = (world.getBlockState(blockPos.getDistance(x+_x, y, z+_z)) >= 1); //(x+_x, y, z+_z).getBlock >= 1);
							boolean IsStill = (world.getBlockMetadata(x+_x, y, z+_z) == 0);
							Block block0 = world.getBlock(x,y+1,z);
							Block block = world.getBlock(x+_x, y, z+_z);
					            //check and replace.
					        if(block == Blocks.WATER && IsStill || block ==Blocks.FLOWING_WATER && IsStill){
					        	blockState.setBlock(x+_x, y, z+_z, DefineCraftModBlocks.meltingObsidian1);
					    		world.playSound(player, (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F, "random.fizz",  0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
					    			}
					        if(block == Blocks.LAVA && IsStill || block ==Blocks.FLOWING_LAVA && IsStill){
				    			world.setBlock(x+_x, y, z+_z, DefineCraftModBlocks.meltingObsidian);
				    			world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
				    			}
					        if(block == Blocks.WATER && IsFlowing || block ==Blocks.FLOWING_WATER && IsFlowing || block == Blocks.LAVA && IsFlowing || block ==Blocks.FLOWING_LAVA && IsFlowing){
				    			world.setBlock(x+_x, y, z+_z, DefineCraftModBlocks.meltingObsidian0);
				    			world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
				    			}
					      //has full armor
							if (itemStack.getItem() == DefineCraftModItems.HellStoneBoots && itemStack.getItem() == DefineCraftModItems.HellStoneLegs && itemStack.getItem() == DefineCraftModItems.HellStoneChest && itemStack.getItem() == DefineCraftModItems.HellStoneHelmet){
								{
								if (world.getLightValue (x-1, y+1, z) <7 && block0 != DefineCraftModBlocks.VanishingLight){
								if (world.getBlock(x-1, y+1, z) == Blocks.air){ 
									 world.setBlock(x-1,y+1,z, DefineCraftModBlocks.VanishingLight);
									 world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "step.stone", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
								  }
								  else
								  { 
									 world.setBlock(x-1,y+2,z, DefineCraftModBlocks.VanishingLight);
								     world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "step.stone", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
								  }
								  }
								 if (player.isBurning()){
									player.extinguish(); 
									// world.playSound((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
								 }
							}
					        }
					    }
					}
				}
			}
		//Just Chest
			if (itemStack.getItem() == (DefineCraftModItems.HellStoneChest)){
				player.fallDistance = 0.0F;
				 player.capabilities.allowFlying = true;
				}
		//just helme
		if(itemStack.getItem().getUnlocalizedName() == "HellStoneHelmet")
		{
			if(player.isInWater())
			{
				player.setAir(20);
			}
		}
	  }
}