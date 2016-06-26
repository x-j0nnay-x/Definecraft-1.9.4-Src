package com.DefineCraft.World;

import java.util.Random;

import com.DefineCraft.Core.DefineCraftModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;


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

	private void generateOverWorld(World world, Random rand, int i, int j)
    {
		//your-block,metadata-of-block,Block-spawns-on,World,Ran,i=XPos,j=ZPos,maxX,maxZ,maxVeinSize,chancesToSpawn,minY,maxY)
		addOreSpawn(DefineCraftModBlocks.SilverOre, 0, Blocks.STONE, world, rand, i, j, 16, 16, 7 + rand.nextInt(5), 5, 20, 38);
		addOreSpawn(DefineCraftModBlocks.TerbiumOre, 0, Blocks.STONE, world, rand, i, j, 16, 16, 7 + rand.nextInt(5), 5, 10, 28);
		addOreSpawn(DefineCraftModBlocks.PeridotOre, 0, Blocks.STONE, world, rand, i, j, 16, 6, 3+ rand.nextInt(5), 5, 10, 40);
		addOreSpawn(DefineCraftModBlocks.GemOre, 0, Blocks.STONE, world, rand, i, j, 16, 16, 5, 3+ rand.nextInt(5), 10, 18);
    }

    private void generateNeather(World world, Random rand, int i, int j)
    {
    	addOreSpawn(DefineCraftModBlocks.HellStoneOre, 0, Blocks.NETHERRACK, world, rand, i, j, 16, 16, 5 + rand.nextInt(5), 5, 20, 146);
    }
    public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
          int maxPossY = minY + (maxY - 1);
          assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
          assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
          assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
          assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
          assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
         
          int diffBtwnMinMaxY = maxY - minY;
          for(int x = 0; x < chancesToSpawn; x++)
          {
                 int posX = blockXPos + random.nextInt(maxX);
                 int posY = minY + random.nextInt(diffBtwnMinMaxY);
                 int posZ = blockZPos + random.nextInt(maxZ);
              //   new WorldGenMinable(block, metadata, maxVeinSize, target).generate(world, random, posX, posY, posZ);
          }
    }
}