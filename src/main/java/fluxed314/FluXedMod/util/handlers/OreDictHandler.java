package fluxed314.FluXedMod.util.handlers;

import fluxed314.FluXedMod.init.ArmorInit;
import fluxed314.FluXedMod.init.BlockInit;
import fluxed314.FluXedMod.init.ItemInit;
import fluxed314.FluXedMod.init.ToolInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler 
{
	public static void Common()
	{
		
		/////////////
		// BLOCKS  //
		/////////////
		
		
		// ORES
		OreDictionary.registerOre("oreCopper", BlockInit.copper_ore);
		OreDictionary.registerOre("oreCopper", BlockInit.copper_ore_end);
		OreDictionary.registerOre("oreCopper", BlockInit.copper_ore_nether);
		OreDictionary.registerOre("oreTin", BlockInit.tin_ore);
		OreDictionary.registerOre("oreTin", BlockInit.tin_ore_end);
		
		// BLOCKS
		OreDictionary.registerOre("blockBronze", BlockInit.bronze_block);
		OreDictionary.registerOre("blockCopper", BlockInit.copper_block);
		OreDictionary.registerOre("blockTin", BlockInit.tin_block);
		
		// STAIRS
		OreDictionary.registerOre("stairCopper", BlockInit.copper_stairs);
		
		// SLABS
		OreDictionary.registerOre("slabCopper", BlockInit.copper_slab_half);
		
		//////////////////////////////////////
		
		
		
		////////////
		// ITEMS  //
		////////////
		
		// INGOTS
		OreDictionary.registerOre("ingot", ItemInit.bronze_ingot);
		OreDictionary.registerOre("ingot", ItemInit.bronze_ingot_pure);
		OreDictionary.registerOre("ingot", ItemInit.copper_ingot);
		OreDictionary.registerOre("ingot", ItemInit.copper_ingot_pure);
		OreDictionary.registerOre("ingot", ItemInit.copper_ingot_ruby_encrusted);
		OreDictionary.registerOre("ingot", ItemInit.iron_ingot_pure);
		OreDictionary.registerOre("ingot", ItemInit.iron_ingot_ruby_encrusted);
		OreDictionary.registerOre("ingot", ItemInit.tin_ingot);
		OreDictionary.registerOre("ingot", ItemInit.tin_ingot_pure);
		OreDictionary.registerOre("ingot", ItemInit.tin_ingot_ruby_encrusted);
		OreDictionary.registerOre("ingotBronze", ItemInit.bronze_ingot);
		OreDictionary.registerOre("ingotBronze", ItemInit.bronze_ingot_pure);
		OreDictionary.registerOre("ingotBronzePure", ItemInit.bronze_ingot_pure);
		OreDictionary.registerOre("ingotCopper", ItemInit.copper_ingot);
		OreDictionary.registerOre("ingotCopper", ItemInit.copper_ingot_pure);
		OreDictionary.registerOre("ingotCopperPure", ItemInit.copper_ingot_pure);
		OreDictionary.registerOre("ingotIron", ItemInit.iron_ingot_pure);
		OreDictionary.registerOre("ingotIron", ItemInit.iron_ingot_ruby_encrusted);
		OreDictionary.registerOre("ingotIronPure", ItemInit.iron_ingot_pure);
		OreDictionary.registerOre("ingotTin", ItemInit.tin_ingot);
		OreDictionary.registerOre("ingotTin", ItemInit.tin_ingot_pure);
		OreDictionary.registerOre("ingotTin", ItemInit.tin_ingot_ruby_encrusted);
		OreDictionary.registerOre("ingotTinPure", ItemInit.tin_ingot_pure);
		
		// TOOLS // ALL
		OreDictionary.registerOre("swordCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("axeCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("pickaxeCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("shovelCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("hoeCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("maceCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("staffCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("wandCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("pickaxeCopper", ToolInit.copper_sword);
		OreDictionary.registerOre("shovelCopper", ToolInit.copper_sword);
		
		// TOOLS // COPPER
		
		
		// ARMOR // ALL
		OreDictionary.registerOre("helmet", ArmorInit.copper_helmet);
		OreDictionary.registerOre("helmet", ArmorInit.leather_helmet);
		OreDictionary.registerOre("helmet", ArmorInit.ruby_helmet);
		OreDictionary.registerOre("chestplate", ArmorInit.copper_chestplate);
		OreDictionary.registerOre("chestplate", ArmorInit.leather_chestplate);
		OreDictionary.registerOre("chestplate", ArmorInit.ruby_chestplate);
		OreDictionary.registerOre("leggings", ArmorInit.copper_leggings);
		OreDictionary.registerOre("leggings", ArmorInit.leather_leggings);
		OreDictionary.registerOre("leggings", ArmorInit.ruby_leggings);
		OreDictionary.registerOre("boots", ArmorInit.copper_boots);
		OreDictionary.registerOre("boots", ArmorInit.leather_boots);
		OreDictionary.registerOre("boots", ArmorInit.ruby_boots);
		
		// ARMOR // COPPER
		OreDictionary.registerOre("helmetCopper", ArmorInit.copper_helmet);
		OreDictionary.registerOre("chestplateCopper", ArmorInit.copper_chestplate);
		OreDictionary.registerOre("leggingsCopper", ArmorInit.copper_leggings);
		OreDictionary.registerOre("bootsCopper", ArmorInit.copper_boots);
		
		// ARMOR // LEATHER
		OreDictionary.registerOre("helmetLeather", ArmorInit.leather_helmet);
		OreDictionary.registerOre("chestplateLeather", ArmorInit.leather_chestplate);
		OreDictionary.registerOre("leggingsLeather", ArmorInit.leather_leggings);
		OreDictionary.registerOre("bootsLeather", ArmorInit.leather_boots);
		
		// ARMOR // RUBY
		OreDictionary.registerOre("helmetRuby", ArmorInit.ruby_helmet);
		OreDictionary.registerOre("chestplateRuby", ArmorInit.ruby_chestplate);
		OreDictionary.registerOre("leggingsRuby", ArmorInit.ruby_leggings);
		OreDictionary.registerOre("bootsRuby", ArmorInit.ruby_boots);
		
	}
	
	
	
}
