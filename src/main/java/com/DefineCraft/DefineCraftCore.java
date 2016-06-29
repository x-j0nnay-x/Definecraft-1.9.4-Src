package com.DefineCraft;

import org.apache.logging.log4j.Logger;

import com.DefineCraft.Core.DefineCraftModBlocks;
import com.DefineCraft.Core.DefineCraftModItems;
import com.DefineCraft.Core.GuiHandler;
import com.DefineCraft.Core.Proxy.CommonProxy;
import com.DefineCraft.World.DefineOreGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = Reference.ModID, name = Reference.Name, version = Reference.Version)
public class DefineCraftCore {

	@SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
	public static CommonProxy proxy;
	
	@Mod.Instance(Reference.ModID)
	public static DefineCraftCore instance; 
	public static Logger logger;
	
	@EventHandler
	public void pre_init(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.pre_init(event);
	}
	@EventHandler
    public void init(FMLInitializationEvent event){
		proxy.init(event);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		System.out.println("Loaded DefineCraft Gui's");
		}
	public static final CreativeTabs DefineCraft = new CreativeTabs("DefineCraft") {
	    @Override public Item getTabIconItem() {
	        return DefineCraftModItems.HellStoneAxe;
	    }
	};
        

	@EventHandler
    public void postinit(FMLPostInitializationEvent event) {
		proxy.postinit(event);
	}
	

}
