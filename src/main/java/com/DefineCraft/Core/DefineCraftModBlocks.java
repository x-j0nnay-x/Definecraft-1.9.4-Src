package com.DefineCraft.Core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.DefineCraft.Blocks.*;


public class DefineCraftModBlocks
{
//gui blocks
		public static Block Grinder;
		public static Block BarMaker;
		public static Block SmartFurnace;
		public static Block GemCharger;
		public static Block Infuser;
//other blocks
		public static Block RefinedWoodenDoorBlock;
		public static Block VanishingLight;
		public static Block meltingObsidian;
		public static Block meltingObsidian1;
		public static Block meltingObsidian0;
		public static Block meltingIce;
//Ore / fluids
		public static Block HellStoneOre;
		//public static Fluid MoltenHellStone;
		public static Block TerbiumOre;
		//public static Fluid MoltenTerbium;
		public static Block SilverOre;
		//public static Fluid MoltenSilver;
		public static Block GemOre;
		public static Block PeridotOre;
		@EventHandler
		public static void pre_init() {
//gui blocks
		//	Grinder = new MaterBlock("Grinder");
		//	BarMaker = new BarMakerBlock("BarMaker");
		//	SmartFurnace = new SmartFurnaceBlock("SmartFurnace");
		//	GemCharger = new GemChargerBlock("GemCharger");
		//	Infuser = new InfuserBlock("Infuser");
//other blocks
		//	RefinedWoodenDoorBlock = new RefinedWoodenDoorBlock(Material.iron);
			meltingObsidian = new meltingObsidian("meltingObsidian");
			meltingObsidian1 = new meltingObsidian1("meltingObsidian1");
			meltingObsidian0 = new meltingObsidian0("meltingObsidian0");
			meltingIce = new meltingIce("meltingice");
			VanishingLight = new VanishingLight("VanishingLight");
//Ore / fluid
			HellStoneOre = new HellStoneOre("HellStoneOre");
			TerbiumOre = new TerbiumOre("TerbiumOre");
			SilverOre = new SilverOre("SilverOre");
			GemOre = new GemOre("GemOre");
			PeridotOre = new PeridotOre("PeridotOre");
		}
    public static void init()
    {
//TileEnt's
	//    GameRegistry.registerTileEntity(GrinderLogic.class, "Grinder");
	//    GameRegistry.registerTileEntity(BarMakerLogic.class, "BarMaker");
	//    GameRegistry.registerTileEntity(GemChargerLogic.class, "ChemCharger");
	//    GameRegistry.registerTileEntity(InfuserLogic.class, "Infuser");
//Fluids
	    //FluidRegistry.registerFluid(MultenHellStone);
	   // FluidRegistry.addBucketForFluid(MultenHellStone);
	    //FluidRegistry.registerFluid(MultenSilver);
	   // FluidRegistry.registerFluid(MultenTerbium);
//Blocks gui
	//	GameRegistry.registerBlock(Grinder, "Grinder");
	//	GameRegistry.registerBlock(BarMaker, "BarMaker");
	//	GameRegistry.registerBlock(SmartFurnace, "SmartFurnace");
	//	GameRegistry.registerBlock(GemCharger, "GemCharger");
	//	GameRegistry.registerBlock(Infuser, "Infuser");
//other blocks
	//	GameRegistry.registerBlock(RefinedWoodenDoorBlock, "RefinedWoodenDoorBlock");
		GameRegistry.registerBlock(meltingObsidian, "meltingObsidian");
		GameRegistry.registerBlock(meltingObsidian1, "meltingObsidian1");
		GameRegistry.registerBlock(meltingObsidian0, "meltingObsidian0");
		GameRegistry.registerBlock(meltingIce, "meltingIce");
		GameRegistry.registerBlock(VanishingLight, "VanishingLight");
//Ore
		GameRegistry.registerBlock(HellStoneOre, "HellStoneOre");
		GameRegistry.registerBlock(GemOre, "GemOre");
		GameRegistry.registerBlock(TerbiumOre, "TerbiumOre");
		GameRegistry.registerBlock(SilverOre, "SilverOre");
		GameRegistry.registerBlock(PeridotOre, "PeridotOre");
    }
}