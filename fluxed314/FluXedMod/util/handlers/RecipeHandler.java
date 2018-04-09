package fluxed314.FluXedMod.util.handlers;

import java.util.Iterator;

import fluxed314.FluXedMod.init.ArmorInit;
import fluxed314.FluXedMod.init.BlockInit;
import fluxed314.FluXedMod.init.ItemInit;
import fluxed314.FluXedMod.init.ToolInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@EventBusSubscriber
public class RecipeHandler 
{
	
	//Remove Crafting Recipes
	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
	    ResourceLocation WoodSword = new ResourceLocation("minecraft:wooden_sword");
	    ResourceLocation WoodPick = new ResourceLocation("minecraft:wooden_pickaxe");
	    ResourceLocation WoodAxe = new ResourceLocation("minecraft:wooden_axe");
	    ResourceLocation WoodShovel = new ResourceLocation("minecraft:wooden_shovel");
	    ResourceLocation WoodHoe = new ResourceLocation("minecraft:wooden_hoe");
	    ResourceLocation StoneSword = new ResourceLocation("minecraft:stone_sword");
	    ResourceLocation StonePick = new ResourceLocation("minecraft:stone_pickaxe");
	    ResourceLocation StoneAxe = new ResourceLocation("minecraft:stone_axe");
	    ResourceLocation StoneShovel = new ResourceLocation("minecraft:stone_shovel");
	    ResourceLocation StoneHoe = new ResourceLocation("minecraft:stone_hoe");
	    

	    IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
	        
	    modRegistry.remove(WoodSword);
	    modRegistry.remove(WoodPick);
	    modRegistry.remove(WoodAxe);
	    modRegistry.remove(WoodShovel);
	    modRegistry.remove(WoodHoe);
	    modRegistry.remove(StoneSword);
	
	}
	
	
	
	
	
	
	//
	public static void registerCrafting()
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("f314m:copper_ore"), new ResourceLocation("f314m:copper_blocks"), new ItemStack(BlockInit.copper_ore), new Object[]{"SSS","SIS","SSS",'S', Blocks.STONE, 'I', ItemInit.copper_ingot});
		//registerArmorCrafting(ArmorInit.copper_helmet, ArmorInit.copper_chestplate, ArmorInit.copper_leggings, ArmorInit.copper_boots, ItemInit.copper_ingot);
		//registerToolCrafting(ToolInit.copper_sword, ToolInit.copper_axe, ToolInit.copper_pickaxe, ToolInit.copper_shovel, ToolInit.copper_hoe, ItemInit.copper_ingot);
		GameRegistry.addShapelessRecipe(new ResourceLocation("f314m:copper_ingot"), new ResourceLocation("f314m:copper_items"), new ItemStack(ItemInit.copper_ingot, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(BlockInit.copper_block))});
		
		// Attempt to Re-Add WoodenSword Recipe after Removal
		GameRegistry.addShapedRecipe(new ResourceLocation("minecraft:WOODEN_SWORD"), new ResourceLocation("minecraft:wood_tools"), new ItemStack(Items.WOODEN_SWORD), new Object[]{"B","B","S",'S', Items.STICK, 'B', Blocks.DARK_OAK_FENCE});

	}
	
	
	
	
	/*
	//Add Smelting Recipes
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(BlockInit.copper_ore, new ItemStack(ItemInit.copper_ingot), 10);
	}
	*/
	
	
	
	/*
	//Add Crafting Recipes for Tools
	private static void registerToolCrafting(Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item ingot)
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("f314m:copper_tools"), new ItemStack(sword), new Object[]{" I "," I "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("f314m:copper_tools"), new ItemStack(axe), new Object[]{" II","  I"," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("f314m:copper_tools"), new ItemStack(pickaxe), new Object[]{"III"," S "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("f314m:copper_tools"), new ItemStack(shovel), new Object[]{" I "," S "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + hoe.getRegistryName()), new ResourceLocation("f314m:copper_tools"), new ItemStack(hoe), new Object[]{"II "," S "," S ",'S', Items.STICK, 'I', ingot});
	}
	*/
	
	
	
	/*
	//Add Crafting Recipes for Armor
	private static void registerArmorCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot)
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("f314m:copper_armor"), new ItemStack(helmet), new Object[]{"III","I I","   ", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("f314m:copper_armor"), new ItemStack(chestplate), new Object[]{"I I","III","III", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("f314m:copper_armor"), new ItemStack(leggings), new Object[]{"III","I I","I I", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("f314m:copper_armor"), new ItemStack(boots), new Object[]{"I I","I I", "   ", 'I', ingot});
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Example Code
	
	
	
	/*
	 public static void registerCrafting()
	 {
		GameRegistry.addShapedRecipe(new ResourceLocation("tm:copper_ore"), new ResourceLocation("tm:copper_blocks"), new ItemStack(BlockInit.copper_ore), new Object[]{"SSS","SIS","SSS",'S', Blocks.STONE, 'I', ItemInit.copper_ingot});
		registerArmourCrafting(ArmourInit.copper_helmet, ArmourInit.copper_chestplate, ArmourInit.copper_leggings, ArmourInit.copper_boots, ItemInit.copper_ingot);
		registerToolCrafting(ToolInit.copper_axe, ToolInit.copper_hoe, ToolInit.copper_pickaxe, ToolInit.copper_shovel, ToolInit.copper_sword, ToolInit.copper_multitool, ItemInit.copper_ingot);
		GameRegistry.addShapelessRecipe(new ResourceLocation("tm:copper_ingot"), new ResourceLocation("tm:copper_items"), new ItemStack(ItemInit.copper_ingot, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(BlockInit.copper_block))});
	}
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(BlockInit.copper_ore, new ItemStack(ItemInit.copper_ingot), 10);
	}
	
	private static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item shovel, Item sword, Item multitool, Item ingot)
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("tm:copper_tools"), new ItemStack(axe), new Object[]{"II ","IS "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + hoe.getRegistryName()), new ResourceLocation("tm:copper_tools"), new ItemStack(hoe), new Object[]{"II "," S "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("tm:copper_tools"), new ItemStack(pickaxe), new Object[]{"III"," S "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("tm:copper_tools"), new ItemStack(shovel), new Object[]{" I "," S "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("tm:copper_tools"), new ItemStack(sword), new Object[]{" I "," I "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + multitool.getRegistryName()), new ResourceLocation("tm:copper_tools"), new ItemStack(multitool), new Object[]{"SPA","BHB","III", 'S', shovel, 'P', pickaxe, 'A', axe, 'H', ToolInit.copper_hoe, 'B', BlockInit.copper_block, 'I', ingot});
	}
	
	private static void registerArmourCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot)
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("tm:copper_armour"), new ItemStack(helmet), new Object[]{"III","I I","   ", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("tm:copper_armour"), new ItemStack(chestplate), new Object[]{"I I","III","III", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("tm:copper_armour"), new ItemStack(leggings), new Object[]{"III","I I","I I", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("tm:copper_armour"), new ItemStack(boots), new Object[]{"I I","I I", "   ", 'I', ingot});
	}
	*/
	
}
