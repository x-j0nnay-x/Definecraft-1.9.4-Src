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
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.client.event.sound.SoundEvent;
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
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		int x = (int) player.posX;
		int y = (int) player.posY - 1;
		int z = (int) player.posZ;
		BlockPos blockpos = new BlockPos(x, y, z);
		for(int _x = -3; _x <= 3; _x++) {
			for(int _z = -3; _z <= 3; _z++) {
				if(Math.abs(_x) + Math.abs(_z) <= 3) {
		for (BlockPos pos : BlockPos.getAllInBox(blockpos.down(3).east(3), blockpos.up(3).west(3)))
			{
			if (itemStack.getItem() == DefineCraftModItems.HellStoneBoots)
			{
			    IBlockState state = world.getBlockState(blockpos);
			    if (state.getBlock() == Blocks.WATER && state.getValue(BlockLiquid.LEVEL) == 0 || state.getBlock() == Blocks.FLOWING_WATER && state.getValue(BlockLiquid.LEVEL) == 0)
			    {
			//    	world.setBlock(x+_x, y, z+_z, DefineCraftModBlocks.meltingObsidian1,0, 1);
			    	//blockState.setBlock(x+_x, y, z+_z, DefineCraftModBlocks.meltingObsidian1);
			    	world.playSound((double)x + 0.5D, (double)y, (double)z + 0.5D, SoundEvents.BLOCK_FIRE_EXTINGUISH , SoundCategory.BLOCKS, 1.0F, 1.0F, true);
			    }
			    if (state.getBlock() == Blocks.LAVA && state.getValue(BlockLiquid.LEVEL) == 0 || state.getBlock() == Blocks.FLOWING_LAVA && state.getValue(BlockLiquid.LEVEL) == 0)
			    {
			   // 	blockState.setBlock(x+_x, y, z+_z, DefineCraftModBlocks.meltingObsidian);
			    	world.playSound((double)x + 0.5D, (double)y, (double)z + 0.5D, SoundEvents.BLOCK_FIRE_EXTINGUISH , SoundCategory.BLOCKS, 1.0F, 1.0F, true);
		        }
			    else if (state.getBlock() == Blocks.LAVA && state.getValue(BlockLiquid.LEVEL) >= 1 || state.getBlock() == Blocks.FLOWING_LAVA && state.getValue(BlockLiquid.LEVEL) >= 1)
			    {
			    //	blockState.setBlock(x+_x, y, z+_z, DefineCraftModBlocks.meltingObsidian0);
			    	world.playSound((double)x + 0.5D, (double)y, (double)z + 0.5D, SoundEvents.BLOCK_FIRE_EXTINGUISH , SoundCategory.BLOCKS , 1.0F, 1.0F, true);
		        }
			}
		//has full armor
							if (itemStack.getItem() == DefineCraftModItems.HellStoneBoots && itemStack.getItem() == DefineCraftModItems.HellStoneLegs && itemStack.getItem() == DefineCraftModItems.HellStoneChest && itemStack.getItem() == DefineCraftModItems.HellStoneHelmet){
								{
							//	if (world.getLightValue (x-1, y+1, z) <7 && block0 != DefineCraftModBlocks.VanishingLight){
							//	if (world.getBlock(x-1, y+1, z) == Blocks.air){ 
							//		 world.setBlock(x-1,y+1,z, DefineCraftModBlocks.VanishingLight);
							    	world.playSound((double)x + 0.5D, (double)y, (double)z + 0.5D, SoundEvents.BLOCK_METAL_PLACE , SoundCategory.BLOCKS , 1.0F, 1.0F, true);
							//	}
							//	  else
							//	  { 
							//		 world.setBlock(x-1,y+2,z, DefineCraftModBlocks.VanishingLight);
							    	world.playSound((double)x + 0.5D, (double)y, (double)z + 0.5D, SoundEvents.BLOCK_METAL_PLACE , SoundCategory.BLOCKS , 1.0F, 1.0F, true);
								  }
							  }
								 if (player.isBurning()){
									player.extinguish(); 
							    	world.playSound((double)x + 0.5D, (double)y, (double)z + 0.5D, SoundEvents.BLOCK_FIRE_EXTINGUISH , SoundCategory.BLOCKS , 1.0F, 1.0F, true);
								 }
							}
					     //   }
					   // }
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
		}}
}