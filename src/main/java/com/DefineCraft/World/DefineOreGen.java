package com.DefineCraft.World;

import java.util.Random;

import com.DefineCraft.Core.DefineCraftModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import java.util.Random;

public class DefineOreGen implements IWorldGenerator
{
	
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator arg4, IChunkProvider arg5) {
        switch (world.provider.getDimension())
        {
            case -1:
                generateNeather(world, rand, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateOverWorld(world, rand, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, rand, chunkX * 16, chunkZ * 16);
                break;
            
        }
    }

    private void generateEnd(World world, Random rand, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void generateOverWorld(World world, Random rand, int chunkX, int chunkZ)
    {
		for (int k = 0; k < 16; k++)
        {
            int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);
            //Will be found between y = 0 and y = 38
            int quisqueY = rand.nextInt(38);
            BlockPos quisquePos = new BlockPos(firstBlockXCoord, quisqueY, firstBlockZCoord);
            //The 10 as the second parameter sets the maximum vein size
                (new WorldGenMinable(DefineCraftModBlocks.SilverOre.getDefaultState(), 5)).generate(world, rand, quisquePos);
        }
		for (int k = 0; k < 16; k++)
        {
            int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);
            //Will be found between y = 0 and y = 28
            int quisqueY = rand.nextInt(28);
            BlockPos quisquePos = new BlockPos(firstBlockXCoord, quisqueY, firstBlockZCoord);
            //The 10 as the second parameter sets the maximum vein size
                (new WorldGenMinable(DefineCraftModBlocks.TerbiumOre.getDefaultState(), 5)).generate(world, rand, quisquePos);
        }for (int k = 0; k < 16; k++)
        {
            int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);
            //Will be found between y = 0 and y = 18
            int quisqueY = rand.nextInt(18);
            BlockPos quisquePos = new BlockPos(firstBlockXCoord, quisqueY, firstBlockZCoord);
            //The 10 as the second parameter sets the maximum vein size
                (new WorldGenMinable(DefineCraftModBlocks.GemOre.getDefaultState(), 3)).generate(world, rand, quisquePos);
        }for (int k = 0; k < 16; k++)
        {
            int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);
            //Will be found between y = 0 and y = 40
            int quisqueY = rand.nextInt(40);
            BlockPos quisquePos = new BlockPos(firstBlockXCoord, quisqueY, firstBlockZCoord);
            //The 10 as the second parameter sets the maximum vein size
                (new WorldGenMinable(DefineCraftModBlocks.PeridotOre.getDefaultState(), 3)).generate(world, rand, quisquePos);
        }
		
		
		//your-block,metadata-of-block,Block-spawns-on,World,Ran,i=XPos,j=ZPos,maxX,maxZ,maxVeinSize,chancesToSpawn,minY,maxY)
	//	addOreSpawn(DefineCraftModBlocks.SilverOre, 0, Blocks.STONE, world, rand, i, j, 16, 16, 7 + rand.nextInt(5), 5, 20, 38);
	//	addOreSpawn(DefineCraftModBlocks.TerbiumOre, 0, Blocks.STONE, world, rand, i, j, 16, 16, 7 + rand.nextInt(5), 5, 10, 28);
	//	addOreSpawn(DefineCraftModBlocks.PeridotOre, 0, Blocks.STONE, world, rand, i, j, 16, 6, 3+ rand.nextInt(5), 5, 10, 40);
	//	addOreSpawn(DefineCraftModBlocks.GemOre, 0, Blocks.STONE, world, rand, i, j, 16, 16, 5, 3+ rand.nextInt(5), 10, 18);
    }

    private void generateNeather(World world, Random rand, int chunkX, int chunkZ)
    {
    	for (int k = 0; k < 16; k++)
        {
            int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);
            //Will be found between y = 0 and y = 200
            int quisqueY = rand.nextInt(200);
            BlockPos quisquePos = new BlockPos(firstBlockXCoord, quisqueY, firstBlockZCoord);
            //The 10 as the second parameter sets the maximum vein size
                (new WorldGenMinable(DefineCraftModBlocks.HellStoneOre.getDefaultState(), 5)).generate(world, rand, quisquePos);
        }
    	//addOreSpawn(DefineCraftModBlocks.HellStoneOre, 0, Blocks.NETHERRACK, world, rand, i, j, 16, 16, 5 + rand.nextInt(5), 5, 20, 146);
    }
    
}