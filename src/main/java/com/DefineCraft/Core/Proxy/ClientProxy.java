package com.DefineCraft.Core.Proxy;

import com.DefineCraft.Core.BlockRenderRegister;
import com.DefineCraft.Core.DefineCraftModBlocks;
import com.DefineCraft.Core.DefineCraftModItems;
import com.DefineCraft.Core.ItemRenderRegister;
import com.DefineCraft.Items.LogicChip;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy  {

	@Override
	public void pre_init(FMLPreInitializationEvent event) {
		super.pre_init(event);
		ItemRenderRegister.registerItemRenderer();
        System.out.println("Loaded Definecraft Item textures");
        BlockRenderRegister.registerBlockRenderer();
        System.out.println("Loaded Definecraft Block textures");
	}
	@Override
    public void init(FMLInitializationEvent event){
        super.init(event);
    }
	@Override
    public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
	}
	

}
