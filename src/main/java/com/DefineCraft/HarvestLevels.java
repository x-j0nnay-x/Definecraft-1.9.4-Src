package com.DefineCraft;

import com.google.common.collect.Maps;


import java.util.Map;


public class HarvestLevels {

  public static final int STONE = 0;
  public static final int IRON = 1;
  public static final int SILVER = 1;
  public static final int DIAMOND = 2;
  public static final int TERBIUM = 2;
  public static final int OBSIDIAN = 3;
  public static final int HELLSTONE = 4;
  public static final int GEM = 5;

  private HarvestLevels() {
  } // non-instantiable

  public static final Map<Integer, String> harvestLevelNames = Maps.newHashMap();

  public static String getHarvestLevelName(int num) {
    return harvestLevelNames.containsKey(num) ? harvestLevelNames.get(num) : String.valueOf(num);
  }

  public static void init() {
   }

  
}