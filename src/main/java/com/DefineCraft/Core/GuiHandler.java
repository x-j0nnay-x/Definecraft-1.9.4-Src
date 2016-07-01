package com.DefineCraft.Core;

import com.DefineCraft.Reference;
import com.DefineCraft.Blocks.Grinder.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
    public static final int Grinder =  0;
    public static final int BarMaker =   1;
    public static final int GemCharger =   2;
    public static final int Infuser =  3;
    public static final int SmartFurnace =   4;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
		
		if (tileEntity != null) {
			switch(ID) {
			case 0: return new GrinderContainer(player.inventory, (TileEntityGrinder)tileEntity);
			}
		}
		
		return null;
	}
	
	@Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if (tileEntity != null) {
              switch(ID) {
              case  0: return new GrinderGUI(player.inventory, (TileEntityGrinder)tileEntity);
              }
        }

        return null;
    }
}
