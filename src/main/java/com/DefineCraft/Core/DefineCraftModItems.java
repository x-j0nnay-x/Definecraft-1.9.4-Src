package com.DefineCraft.Core;

import com.DefineCraft.Reference;
import com.DefineCraft.Items.*;
import com.DefineCraft.Items.HellStone.*;
import com.DefineCraft.Items.Obsidian.*;
import com.DefineCraft.Items.Terbium.*;
import com.DefineCraft.Items.Silver.*;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.ModID)
public class DefineCraftModItems{

public static Item LogicChip;
public static Item RefinedWoodenDoor;
public static Item GrinderHead;
public static Item GoldStick;
public static Item ObsidianStick;
//Dust
public static Item CoalDust;
public static Item IronDust;
public static Item GoldDust;
public static Item DiamondDust;
//Gems / other ore items
public static Item EmptyGem;
public static Item EnergyGem;
public static Item Peridot;
//HellStone
public static Item HellStoneDust;
public static Item HellStoneBar;
public static Item HellStoneSword;
public static Item HellStoneSpade;
public static Item HellStonePickAxe;
public static Item HellStoneAxe;
public static Item HellStoneHoe;
public static Item HellStoneHelmet;
public static Item HellStoneChest;
public static Item HellStoneLegs;
public static Item HellStoneBoots;
//Obsidian
public static Item ObsidianDust;
public static Item ObsidianBar;
public static Item ObsidianSword;
public static Item ObsidianSpade;
public static Item ObsidianPickAxe;
public static Item ObsidianAxe;
public static Item ObsidianHoe;
public static Item ObsidianHelmet;
public static Item ObsidianChest;
public static Item ObsidianLegs;
public static Item ObsidianBoots;
//Terbium
public static Item TerbiumDust;
public static Item TerbiumBar;
public static Item TerbiumSword;
public static Item TerbiumSpade;
public static Item TerbiumPickAxe;
public static Item TerbiumAxe;
public static Item TerbiumHoe;
public static Item TerbiumHelmet;
public static Item TerbiumChest;
public static Item TerbiumLegs;
public static Item TerbiumBoots;
//Silver
public static Item SilverDust;
public static Item SilverBar;
public static Item SilverSword;
public static Item SilverSpade;
public static Item SilverPickAxe;
public static Item SilverAxe;
public static Item SilverHoe;
public static Item SilverHelmet;
public static Item SilverChest;
public static Item SilverLegs;
public static Item SilverBoots;

public static void pre_init() {

//ToolStats
	ToolMaterial Silver = EnumHelper.addToolMaterial("Silver", 2, 300, 8F, 3F, 20);
	ToolMaterial Terbium = EnumHelper.addToolMaterial("Terbium", 3, 500, 10F, 3F, 25);
	ToolMaterial Obsidian = EnumHelper.addToolMaterial("Obsidian", 4, 1500, 15F, 4F, 30);
	ToolMaterial HellStone = EnumHelper.addToolMaterial("HellStone", 5, 2000, 25F, 5F, 35);
  //ToolMaterial TestMaterial = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
//Armor Stats
	ArmorMaterial SilverArmor1 = EnumHelper.addArmorMaterial("SilverArmor", Reference.ModID + ":" + "Silver", 16, new int[] {3, 4, 4, 3}, 12, null, 0);
	ArmorMaterial TerbiumArmor1 = EnumHelper.addArmorMaterial("TerbiumArmor", Reference.ModID + ":" + "Terbium", 18, new int[] {3, 4, 5, 3}, 25, null, 0);
	ArmorMaterial ObsidianArmor1 = EnumHelper.addArmorMaterial("ObsidianArmor", Reference.ModID + ":" + "Obsidian", 22, new int[] {3, 8, 6, 4}, 30, null, 0);
	ArmorMaterial HellStoneArmor1 = EnumHelper.addArmorMaterial("HellStoneArmor", Reference.ModID + ":" + "HellStone", 28, new int[] {3, 8, 7, 5}, 35, null, 0);	
  //ArmorMaterial Testarmor = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
//Items       
		LogicChip = new LogicChip("LogicChip");
//  	RefinedWoodenDoor = new RefinedWoodenDoorItem("RefinedWoodenDoor");
		GrinderHead = new GrinderHeadItem("GrinderHead");
		GoldStick = new StickItem("GoldStick");
		ObsidianStick = new StickItem("ObsidianStick");
//Dust
		CoalDust = new DustItem("CoalDust");
		IronDust = new DustItem("IronDust");
		GoldDust = new DustItem("GoldDust");
		DiamondDust = new DustItem("DiamondDust");
//Gems
		EmptyGem = new EmptyGemItem("EmptyGem", 0);
		EnergyGem = new EmptyGemItem("EnergyGem", 1);
		Peridot = new PeridotItem("Peridot");
//HellStone
		HellStoneDust = new DustItem("HellStoneDust");
		HellStoneBar = new IngotItem("HellStoneBar");
		HellStoneSword = new HellStoneSword(HellStone, "HellStoneSword");
		HellStoneSpade = new HellStoneSpade(HellStone, "HellStoneSpade");
		HellStonePickAxe = new HellStonePickaxe(HellStone, "HellStonePickAxe");
		HellStoneAxe = new HellStoneAxe(HellStone, 6F, 1.2F, "HellStoneAxe");
		HellStoneHoe = new HellStoneHoe(HellStone, "HellStoneHoe");
		HellStoneHelmet = new HellStoneArmor(HellStoneArmor1, EntityEquipmentSlot.HEAD, "HellStoneHelmet");
		HellStoneChest = new HellStoneArmor(HellStoneArmor1, EntityEquipmentSlot.CHEST, "HellStoneChest");
		HellStoneLegs = new HellStoneArmor(HellStoneArmor1, EntityEquipmentSlot.LEGS, "HellStoneLegs");	
		HellStoneBoots = new HellStoneArmor(HellStoneArmor1, EntityEquipmentSlot.FEET, "HellStoneBoots");		
//Obsidian
		ObsidianDust = new DustItem("ObsidianDust");
		ObsidianBar = new IngotItem("ObsidianBar");
		ObsidianSword = new ObsidianSword(Obsidian, "ObsidianSword");
		ObsidianSpade = new ObsidianSpade(Obsidian, "ObsidianSpade");
		ObsidianPickAxe = new ObsidianPickaxe(Obsidian, "ObsidianPickAxe");
		ObsidianAxe = new ObsidianAxe(Obsidian, 6F, .6F, "ObsidianAxe");
		ObsidianHoe = new ObsidianHoe(Obsidian, "ObsidianHoe");
		ObsidianHelmet = new ObsidianArmor(ObsidianArmor1, EntityEquipmentSlot.HEAD, "ObsidianHelmet");
		ObsidianChest = new ObsidianArmor(ObsidianArmor1, EntityEquipmentSlot.CHEST, "ObsidianChest");
		ObsidianLegs = new ObsidianArmor(ObsidianArmor1, EntityEquipmentSlot.LEGS, "ObsidianLegs");	
		ObsidianBoots = new ObsidianArmor(ObsidianArmor1, EntityEquipmentSlot.FEET, "ObsidianBoots");	
//Terbium
		TerbiumDust = new DustItem("TerbiumDust");
		TerbiumBar = new IngotItem("TerbiumBar");
		TerbiumSword = new TerbiumSword(Terbium, "TerbiumSword");
		TerbiumSpade = new TerbiumSpade(Terbium, "TerbiumSpade");
		TerbiumPickAxe = new TerbiumPickaxe(Terbium, "TerbiumPickAxe");
		TerbiumAxe = new TerbiumAxe(Terbium, 6F, .2F, "TerbiumAxe");
		TerbiumHoe = new TerbiumHoe(Terbium, "TerbiumHoe");
		TerbiumHelmet = new TerbiumArmor(TerbiumArmor1, EntityEquipmentSlot.HEAD, "TerbiumHelmet");
		TerbiumChest = new TerbiumArmor(TerbiumArmor1, EntityEquipmentSlot.CHEST, "TerbiumChest");
		TerbiumLegs = new TerbiumArmor(TerbiumArmor1, EntityEquipmentSlot.LEGS, "TerbiumLegs");	
		TerbiumBoots = new TerbiumArmor(TerbiumArmor1, EntityEquipmentSlot.FEET, "TerbiumBoots");
//Silver
		SilverDust = new DustItem("SilverDust");
		SilverBar = new IngotItem("SilverBar");
		SilverSword = new SilverSword(Silver, "SilverSword");
		SilverSpade = new SilverSpade(Silver, "SilverSpade");
		SilverPickAxe = new SilverPickaxe(Silver, "SilverPickAxe");
		SilverAxe = new SilverAxe(Silver, 6F, 0F, "SilverAxe");
		SilverHoe = new SilverHoe(Silver, "SilverHoe");
		SilverHelmet = new SilverArmor(SilverArmor1, EntityEquipmentSlot.HEAD, "SilverHelmet");
		SilverChest = new SilverArmor(SilverArmor1, EntityEquipmentSlot.CHEST, "SilverChest");
		SilverLegs = new SilverArmor(SilverArmor1, EntityEquipmentSlot.LEGS, "SilverLegs");	
		SilverBoots = new SilverArmor(SilverArmor1, EntityEquipmentSlot.FEET, "SilverBoots"); 
		
}

	public static void init()
    {
        GameRegistry.register(LogicChip.setRegistryName(Reference.ModID + "_" + "LogicChip"));
	//	GameRegistry.registerItem(RefinedWoodenDoor, "RefinedWoodenDoor");
		GameRegistry.register(GrinderHead.setRegistryName(Reference.ModID + "_" + "GrinderHead"));
		GameRegistry.register(GoldStick.setRegistryName(Reference.ModID + "_" + "GoldStick"));
		GameRegistry.register(ObsidianStick.setRegistryName(Reference.ModID + "_" + "ObsidianStick"));
//Dust
		GameRegistry.register(CoalDust.setRegistryName(Reference.ModID + "_" + "CoalDust"));
		GameRegistry.register(IronDust.setRegistryName(Reference.ModID + "_" + "IronDust"));
		GameRegistry.register(GoldDust.setRegistryName(Reference.ModID + "_" + "GoldDust"));
		GameRegistry.register(DiamondDust.setRegistryName(Reference.ModID + "_" + "DiamondDust"));		
//Gems
		GameRegistry.register(EmptyGem.setRegistryName(Reference.ModID + "_" + "EmptyGem"));
		GameRegistry.register(EnergyGem.setRegistryName(Reference.ModID + "_" + "EnergyGem"));
		GameRegistry.register(Peridot.setRegistryName(Reference.ModID + "_" + "Peridot"));
//HellStone
		GameRegistry.register(HellStoneDust.setRegistryName(Reference.ModID + "_" + "HellStoneDust"));
		GameRegistry.register(HellStoneBar.setRegistryName(Reference.ModID + "_" + "HellStoneBar"));
		GameRegistry.register(HellStoneSword.setRegistryName(Reference.ModID + "_" + "HellStoneSword"));
		GameRegistry.register(HellStoneSpade.setRegistryName(Reference.ModID + "_" + "HellStoneSpade"));
		GameRegistry.register(HellStonePickAxe.setRegistryName(Reference.ModID + "_" + "HellStonePickAxe"));
		GameRegistry.register(HellStoneAxe.setRegistryName(Reference.ModID + "_" + "HellStoneAxe"));
		GameRegistry.register(HellStoneHoe.setRegistryName(Reference.ModID + "_" + "HellStoneHoe"));
		GameRegistry.register(HellStoneHelmet.setRegistryName(Reference.ModID + "_" + "HellStoneHelmet"));
		GameRegistry.register(HellStoneChest.setRegistryName(Reference.ModID + "_" + "HellStoneChest"));
		GameRegistry.register(HellStoneLegs.setRegistryName(Reference.ModID + "_" + "HellStoneLegs"));
		GameRegistry.register(HellStoneBoots.setRegistryName(Reference.ModID + "_" + "HellStoneBoots"));
//Obsidian
		GameRegistry.register(ObsidianDust.setRegistryName(Reference.ModID + "_" + "ObsidianDust"));
		GameRegistry.register(ObsidianBar.setRegistryName(Reference.ModID + "_" + "ObsidianBar"));
		GameRegistry.register(ObsidianSword.setRegistryName(Reference.ModID + "_" + "ObsidianSword"));
		GameRegistry.register(ObsidianSpade.setRegistryName(Reference.ModID + "_" + "ObsidianSpade"));
		GameRegistry.register(ObsidianPickAxe.setRegistryName(Reference.ModID + "_" + "ObsidianPickAxe"));
		GameRegistry.register(ObsidianAxe.setRegistryName(Reference.ModID + "_" + "ObsidianAxe"));
		GameRegistry.register(ObsidianHoe.setRegistryName(Reference.ModID + "_" + "ObsidianHoe"));
		GameRegistry.register(ObsidianHelmet.setRegistryName(Reference.ModID + "_" + "ObsidianHelmet"));
		GameRegistry.register(ObsidianChest.setRegistryName(Reference.ModID + "_" + "ObsidianChest"));
		GameRegistry.register(ObsidianLegs.setRegistryName(Reference.ModID + "_" + "ObsidianLegs"));
		GameRegistry.register(ObsidianBoots.setRegistryName(Reference.ModID + "_" + "ObsidianBoots"));
//Terbium
		GameRegistry.register(TerbiumDust.setRegistryName(Reference.ModID + "_" + "TerbiumDust"));
		GameRegistry.register(TerbiumBar.setRegistryName(Reference.ModID + "_" + "TerbiumBar"));
		GameRegistry.register(TerbiumSword.setRegistryName(Reference.ModID + "_" + "TerbiumSword"));
		GameRegistry.register(TerbiumSpade.setRegistryName(Reference.ModID + "_" + "TerbiumSpade"));
		GameRegistry.register(TerbiumPickAxe.setRegistryName(Reference.ModID + "_" + "TerbiumPickAxe"));
		GameRegistry.register(TerbiumAxe.setRegistryName(Reference.ModID + "_" + "TerbiumAxe"));
		GameRegistry.register(TerbiumHoe.setRegistryName(Reference.ModID + "_" + "TerbiumHoe"));
		GameRegistry.register(TerbiumHelmet.setRegistryName(Reference.ModID + "_" + "TerbiumHelmet"));
		GameRegistry.register(TerbiumChest.setRegistryName(Reference.ModID + "_" + "TerbiumChest"));
		GameRegistry.register(TerbiumLegs.setRegistryName(Reference.ModID + "_" + "TerbiumLegs"));
		GameRegistry.register(TerbiumBoots.setRegistryName(Reference.ModID + "_" + "TerbiumBoots"));
//Silver
		GameRegistry.register(SilverDust.setRegistryName(Reference.ModID + "_" + "SilverDust"));
		GameRegistry.register(SilverBar.setRegistryName(Reference.ModID + "_" + "SilverBar"));
		GameRegistry.register(SilverSword.setRegistryName(Reference.ModID + "_" + "SilverSword"));
		GameRegistry.register(SilverSpade.setRegistryName(Reference.ModID + "_" + "SilverSpade"));
		GameRegistry.register(SilverPickAxe.setRegistryName(Reference.ModID + "_" + "SilverPickAxe"));
		GameRegistry.register(SilverAxe.setRegistryName(Reference.ModID + "_" + "SilverAxe"));
		GameRegistry.register(SilverHoe.setRegistryName(Reference.ModID + "_" + "SilverHoe"));
		GameRegistry.register(SilverHelmet.setRegistryName(Reference.ModID + "SilverHelmet"));
		GameRegistry.register(SilverChest.setRegistryName(Reference.ModID + "SilverChest"));
		GameRegistry.register(SilverLegs.setRegistryName(Reference.ModID + "SilverLegs"));
		GameRegistry.register(SilverBoots.setRegistryName(Reference.ModID + "SilverBoots"));

    }
}