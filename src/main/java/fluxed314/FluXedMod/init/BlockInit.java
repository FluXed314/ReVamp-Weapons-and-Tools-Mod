package fluxed314.FluXedMod.init;

import fluxed314.FluXedMod.Main;
import fluxed314.FluXedMod.init.blocks.CustomBlock;
import fluxed314.FluXedMod.init.blocks.CustomBlockStairs;
import fluxed314.FluXedMod.init.blocks.CustomIngotBlock;
import fluxed314.FluXedMod.init.blocks.CustomOre;
import fluxed314.FluXedMod.init.blocks.machines.purifyingfurnace.BlockPurifyingFurnace;
import fluxed314.FluXedMod.init.blocks.slab.CustomBlockDoubleSlab;
import fluxed314.FluXedMod.init.blocks.slab.CustomBlockHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	public static Block bronze_block, bronze_stairs;
	public static CustomBlockHalfSlab bronze_slab_half;
	public static CustomBlockDoubleSlab bronze_slab_double;
	public static Block copper_ore, copper_ore_ruby, copper_ore_nether, copper_ore_end;
	public static Block copper_block, copper_stairs;
	public static CustomBlockHalfSlab copper_slab_half;
	public static CustomBlockDoubleSlab copper_slab_double;
	public static Block grass_funky;
	public static Block obsidian_block_ingot;
	public static CustomBlockHalfSlab obsidian_slab_half;
	public static CustomBlockDoubleSlab obsidian_slab_double;
	public static Block petrified_log, petrified_leaves;
	//public static CustomSapling petrified_sapling;
	public static Block ruby_block;
	public static CustomBlockHalfSlab ruby_slab_half;
	public static CustomBlockDoubleSlab ruby_slab_double;
	public static Block test_block;
	public static Block tin_ore, tin_ore_ruby, tin_ore_end;
	public static Block tin_block, tin_stairs;
	public static CustomBlockHalfSlab tin_slab_half;
	public static CustomBlockDoubleSlab tin_slab_double;
	
	public static Block purifying_furnace; 
	
	
	public static void init()
	{
		/* 
		*  2.5F = Hardness(Max:5/Unbreakable:-1)
		*  50.0F = Blast Resistance(Obsidian:6,000/DiamondBlock:30/Ores:15)
		*  4 = Harvest Level(0:Wood/1:Stone/2:Iron/3:Diamond)
		*  obsidian_block_ingot = new CustomIngotBlock("obsidian_block_ingot", 2.5F, 50.0F, 4);
		*/ 
		
		bronze_block = new CustomIngotBlock("bronze_block", 2.5F, 4.5F, 2);
		bronze_stairs = new CustomBlockStairs("bronze_stairs", bronze_block.getDefaultState());
		bronze_slab_half = new CustomBlockHalfSlab("bronze_slab_half", 2.5F, 4.5F);
		bronze_slab_double = new CustomBlockDoubleSlab("bronze_slab_double", 2.5F, 4.5F);
		copper_ore = new CustomOre("copper_ore", 2.0F, 4.0F, 2);
		copper_ore_ruby = new CustomOre("copper_ore_ruby", 2.0F, 4.0F, 2);
		copper_ore_nether = new CustomOre("copper_ore_nether", 2.0F, 4.0F, 2);
		copper_ore_end = new CustomOre("copper_ore_end", 2.0F, 4.0F, 2);
		copper_block = new CustomIngotBlock("copper_block", 2.5F, 4.5F, 2);
		copper_stairs = new CustomBlockStairs("copper_stairs", copper_block.getDefaultState());
		copper_slab_half = new CustomBlockHalfSlab("copper_slab_half", 2.5F, 4.5F);
		copper_slab_double = new CustomBlockDoubleSlab("copper_slab_double", 2.5F, 4.5F);
		grass_funky = new CustomBlock("grass_funky", 1.0F, 1.0F);
		obsidian_block_ingot = new CustomIngotBlock("obsidian_block_ingot", 2.5F, 50.0F, 4);
		obsidian_slab_half = new CustomBlockHalfSlab("obsidian_slab_half", 2.5F, 50.0F);
		obsidian_slab_double = new CustomBlockDoubleSlab("obsidian_slab_double", 2.5F, 50.0F);
		petrified_log = new CustomBlock("petrified_log", 2.0F, 15F);
		petrified_leaves = new CustomBlock("petrified_leaves", 2.0F, 15F);
		//petrified_sapling = new CustomSapling("petrified_sapling");
		ruby_block = new CustomIngotBlock("ruby_block", 2.5F, 30F, 3);
		ruby_slab_half = new CustomBlockHalfSlab("ruby_slab_half", 2.5F, 30.0F);
		ruby_slab_double = new CustomBlockDoubleSlab("ruby_slab_double", 2.5F, 30.0F);
		test_block = new CustomBlock("test_block", 1.0F, 1.0F);
		tin_ore = new CustomOre("tin_ore", 2.0F, 4.0F, 2);
		tin_ore_ruby = new CustomOre("tin_ore_ruby", 2.0F, 4.0F, 2);
		tin_ore_end = new CustomOre("tin_ore_end", 2.0F, 4.0F, 2);
		tin_block = new CustomIngotBlock("tin_block", 2.5F, 4.5F, 2);
		tin_stairs = new CustomBlockStairs("tin_stairs", tin_block.getDefaultState());
		tin_slab_half = new CustomBlockHalfSlab("tin_slab_half", 2.5F, 4.5F);
		tin_slab_double = new CustomBlockDoubleSlab("tin_slab_double", 2.5F, 4.5F);
		
		purifying_furnace = new BlockPurifyingFurnace("purifying_furnace");
		
	}
	
	public static void register()
	{
		registerBlock(bronze_block);
		registerBlock(bronze_stairs);
		registerBlock(bronze_slab_half, new ItemSlab(bronze_slab_half, bronze_slab_half, bronze_slab_double));
		ForgeRegistries.BLOCKS.register(bronze_slab_double);
		registerBlock(copper_ore);
		registerBlock(copper_ore_ruby);
		registerBlock(copper_ore_nether);
		registerBlock(copper_ore_end);
		registerBlock(copper_block);
		registerBlock(copper_stairs);
		registerBlock(copper_slab_half, new ItemSlab(copper_slab_half, copper_slab_half, copper_slab_double));
		ForgeRegistries.BLOCKS.register(copper_slab_double);
		registerBlock(grass_funky);
		registerBlock(obsidian_block_ingot);
		registerBlock(obsidian_slab_half, new ItemSlab(obsidian_slab_half, obsidian_slab_half, obsidian_slab_double));
		ForgeRegistries.BLOCKS.register(obsidian_slab_double);
		registerBlock(petrified_log);
		registerBlock(petrified_leaves);
		//registerBlock(petrified_sapling);
		registerBlock(ruby_block);
		registerBlock(ruby_slab_half, new ItemSlab(ruby_slab_half, ruby_slab_half, ruby_slab_double));
		ForgeRegistries.BLOCKS.register(ruby_slab_double);
		registerBlock(test_block);
		registerBlock(tin_ore);
		registerBlock(tin_ore_ruby);
		registerBlock(tin_ore_end);
		registerBlock(tin_block);
		registerBlock(tin_stairs);
		registerBlock(tin_slab_half, new ItemSlab(tin_slab_half, tin_slab_half, tin_slab_double));
		ForgeRegistries.BLOCKS.register(tin_slab_double);
		
		registerBlock(purifying_furnace);
		
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(Main.fluxtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(Main.fluxtab);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
