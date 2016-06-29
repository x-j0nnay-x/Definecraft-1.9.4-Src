package com.DefineCraft.Core.Proxy;

import com.DefineCraft.Core.DefineCraftModBlocks;
import com.DefineCraft.Core.DefineCraftModItems;
import com.DefineCraft.Core.DefineCraftOreDict;
import com.DefineCraft.Core.DefineCraftRecipes;
import com.DefineCraft.Core.GuiHandler;
import com.DefineCraft.Core.ItemRenderRegister;
import com.DefineCraft.World.DefineOreGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy
{
	@EventHandler
	public void pre_init(FMLPreInitializationEvent event) {
		System.out.println("Loading Definecraft Mod Thanks You");
		DefineCraftModItems.pre_init();
		DefineCraftModItems.init();
		System.out.println("Loaded Definecraft Items");
		DefineCraftModBlocks.pre_init();
		DefineCraftModBlocks.init();
		System.out.println("Loaded Definecraft Blocks");
		DefineCraftRecipes.init();
	    System.out.println("Loaded Definecraft Recipes");
	    }
	@EventHandler
    public void init(FMLInitializationEvent event){	
		GameRegistry.registerWorldGenerator(new DefineOreGen(), 1);
		System.out.println("Loaded in DefineCraft Ore Gen");
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		DefineCraftOreDict.init();
	    System.out.println("Loaded DefineCraft Ore Dictionary");
		System.out.println("Definecraft Is Loaded Up, You Are Ready To Play");
	}
	
}