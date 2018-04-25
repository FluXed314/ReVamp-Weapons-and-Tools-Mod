package fluxed314.FluXedMod.world.gen;

import java.util.Random;

import fluxed314.FluXedMod.init.BlockInit;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class FluXOreGen implements IWorldGenerator
{
	private WorldGenerator copper_ore, copper_ore_ruby, copper_nether, copper_end;
	private WorldGenerator tin_ore, tin_ore_ruby, tin_end;
	
	public FluXOreGen() 
	{
		copper_ore = new WorldGenMinable(BlockInit.copper_ore.getDefaultState(), 9);
		copper_ore_ruby = new WorldGenMinable(BlockInit.copper_ore_ruby.getDefaultState(), 9);
		copper_nether = new WorldGenMinable(BlockInit.copper_ore_nether.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		copper_end = new WorldGenMinable(BlockInit.copper_ore_end.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		tin_ore = new WorldGenMinable(BlockInit.tin_ore.getDefaultState(), 9);
		tin_ore_ruby = new WorldGenMinable(BlockInit.tin_ore_ruby.getDefaultState(), 9);
		tin_end = new WorldGenMinable(BlockInit.tin_ore_end.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
	}

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			runGenerator(copper_ore, world, random, chunkX, chunkZ, 50, 0, 50);
			runGenerator(copper_ore_ruby, world, random, chunkX, chunkZ, 50, 0, 50);
			runGenerator(tin_ore, world, random, chunkX, chunkZ, 50, 0, 50);
			runGenerator(tin_ore_ruby, world, random, chunkX, chunkZ, 50, 0, 50);
			
			break;
			
		case 1:
			
			runGenerator(copper_end, world, random, chunkX, chunkZ, 50, 0, 255);
			runGenerator(tin_end, world, random, chunkX, chunkZ, 50, 0, 50);
			
			break;
			
		case -1:
		
			runGenerator(copper_nether, world, random, chunkX, chunkZ, 50, 0, 50);
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		int heightDiff = maxHeight - minHeight + 1;
		
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
