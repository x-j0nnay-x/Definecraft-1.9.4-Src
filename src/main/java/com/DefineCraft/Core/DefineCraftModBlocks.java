package com.DefineCraft.Core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.DefineCraft.Reference;
import com.DefineCraft.Blocks.*;
import com.DefineCraft.Blocks.Grinder.*;



public class DefineCraftModBlocks
{
//gui blocks
		public static Block Grinder;
		public static Item IGrinder;
		public static ItemBlock IGrinderActive;
		public static Block GrinderActive;
		public static Block BarMaker;
		public static Block SmartFurnace;
		public static Block GemCharger;
		public static Block Infuser;
//other blocks
		public static Block RefinedWoodenDoorBlock;
		public static Block VanishingLight;
		public static Item IVanishingLight;
		public static Block meltingObsidian;
		public static Item ImeltingObsidian;
		public static Block meltingObsidian1;
		public static Item ImeltingObsidian1;
		public static Block meltingObsidian0;
		public static Item ImeltingObsidian0;
		public static Block meltingIce;
		public static Item ImeltingIce;

//Ore / fluids
		public static Block HellStoneOre;
		public static Item IHellStoneOre;
		//public static Fluid MoltenHellStone;
		public static Block TerbiumOre;
		public static Item ITerbiumOre;
		//public static Fluid MoltenTerbium;
		public static Block SilverOre;
		public static Item ISilverOre;
		//public static Fluid MoltenSilver;
		public static Block GemOre;
		public static Item IGemOre;
		public static Block PeridotOre;
		public static Item IPeridotOre;
		@EventHandler
		public static void pre_init() {
//gui blocks
			GrinderActive = new GrinderBlock(true, "Grinder Lit");
			IGrinderActive = new ItemBlock(GrinderActive);
			Grinder = new GrinderBlock(false, "Grinder");
			IGrinder = new ItemBlock(Grinder);
			//GrinderActive = new GrinderBlock(true);

		//	BarMaker = new BarMakerBlock("BarMaker");
		//	SmartFurnace = new SmartFurnaceBlock("SmartFurnace");
		//	GemCharger = new GemChargerBlock("GemCharger");
		//	Infuser = new InfuserBlock("Infuser");
//other blocks
		//	RefinedWoodenDoorBlock = new RefinedWoodenDoorBlock(Material.iron);
			meltingObsidian = new meltingObsidian("meltingObsidian");
			ImeltingObsidian = new ItemBlock(meltingObsidian);
			meltingObsidian1 = new meltingObsidian1("meltingObsidian1");
			ImeltingObsidian1 = new ItemBlock(meltingObsidian1);
			meltingObsidian0 = new meltingObsidian0("meltingObsidian0");
			ImeltingObsidian0 = new ItemBlock(meltingObsidian0);
			meltingIce = new meltingIce("meltingice");
			ImeltingIce = new ItemBlock(meltingIce);
			VanishingLight = new VanishingLight("VanishingLight");
			IVanishingLight = new ItemBlock(VanishingLight);

//Ore / fluid
			HellStoneOre = new HellStoneOre("HellStoneOre");
			IHellStoneOre = new ItemBlock(HellStoneOre);
			TerbiumOre = new TerbiumOre("TerbiumOre");
			ITerbiumOre = new ItemBlock(TerbiumOre);
			SilverOre = new SilverOre("SilverOre");
			ISilverOre = new ItemBlock(SilverOre);
			GemOre = new GemOre("GemOre");
			IGemOre = new ItemBlock(GemOre);
			PeridotOre = new PeridotOre("PeridotOre");
			IPeridotOre = new ItemBlock(PeridotOre);
		}
    public static void init()
    {
//Tile
        GameRegistry.registerTileEntity(TileEntityGrinder.class, "TileEntityGrinder");
	//    GameRegistry.registerTileEntity(BarMakerLogic.class, "BarMaker");
	//    GameRegistry.registerTileEntity(GemChargerLogic.class, "ChemCharger");
	//    GameRegistry.registerTileEntity(InfuserLogic.class, "Infuser");
//Fluids
	    //FluidRegistry.registerFluid(MultenHellStone);
	   // FluidRegistry.addBucketForFluid(MultenHellStone);
	    //FluidRegistry.registerFluid(MultenSilver);
	   // FluidRegistry.registerFluid(MultenTerbium);
//Blocks gui
    	GameRegistry.register(GrinderActive.setRegistryName("GrinderLit"));
    	GameRegistry.register(IGrinderActive.setRegistryName("GrinderLit"));
    	GameRegistry.register(Grinder.setRegistryName("Grinder"));
    	GameRegistry.register(IGrinder.setRegistryName("Grinder"));
  	//	GameRegistry.registerBlock(BarMaker, "BarMaker");
	//	GameRegistry.registerBlock(SmartFurnace, "SmartFurnace");
	//	GameRegistry.registerBlock(GemCharger, "GemCharger");
	//	GameRegistry.registerBlock(Infuser, "Infuser");
//other blocks
	//	GameRegistry.registerBlock(RefinedWoodenDoorBlock, "RefinedWoodenDoorBlock");
		GameRegistry.register(meltingObsidian.setRegistryName("meltingObsidian"));
    	GameRegistry.register(ImeltingObsidian.setRegistryName("meltingObsidian"));
		GameRegistry.register(meltingObsidian1.setRegistryName("meltingObsidian1"));
    	GameRegistry.register(ImeltingObsidian1.setRegistryName("meltingObsidian1"));
    	GameRegistry.register(meltingObsidian0.setRegistryName("meltingObsidian0"));
    	GameRegistry.register(ImeltingObsidian0.setRegistryName("meltingObsidian0"));
       	GameRegistry.register(meltingIce.setRegistryName("meltingIce"));
    	GameRegistry.register(ImeltingIce.setRegistryName("meltingIce"));
    	GameRegistry.register(VanishingLight.setRegistryName("VanishingLight"));
    	GameRegistry.register(IVanishingLight.setRegistryName("VanishingLight"));
//Ore
		GameRegistry.register(HellStoneOre.setRegistryName("HellStoneOre"));
    	GameRegistry.register(IHellStoneOre.setRegistryName("HellStoneOre"));
    	GameRegistry.register(GemOre.setRegistryName("GemOre"));
    	GameRegistry.register(IGemOre.setRegistryName("GemOre"));
    	GameRegistry.register(TerbiumOre.setRegistryName("TerbiumOre"));
    	GameRegistry.register(ITerbiumOre.setRegistryName("TerbiumOre"));
    	GameRegistry.register(SilverOre.setRegistryName("SilverOre"));
    	GameRegistry.register(ISilverOre.setRegistryName("SilverOre"));
    	GameRegistry.register(PeridotOre.setRegistryName("PeridotOre"));
    	GameRegistry.register(IPeridotOre.setRegistryName("PeridotOre"));
    }
    public static void postinit()
    {
	GameRegistry.registerTileEntity(TileEntityGrinder.class, "Grinder");
    }
	
}