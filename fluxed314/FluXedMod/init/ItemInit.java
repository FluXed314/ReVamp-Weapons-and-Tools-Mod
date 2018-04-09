package fluxed314.FluXedMod.init;

import fluxed314.FluXedMod.Main;
import fluxed314.FluXedMod.init.items.CustomIngot;
import fluxed314.FluXedMod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit 
{
	public static Item bronze_ingot, bronze_ingot_pure;
	public static Item copper_ingot, copper_ingot_ruby_encrusted, copper_ingot_pure;
	public static Item iron_ingot_ruby_encrusted, iron_ingot_pure;
	public static Item leather_stitched;
	public static Item obsidian_ingot;
	public static Item ruby_gem, ruby_dust;
	public static Item test_item;
	public static Item tin_ingot, tin_ingot_ruby_encrusted, tin_ingot_pure;
	
	public static void init()
	{
		bronze_ingot = new CustomIngot("bronze_ingot");
		bronze_ingot_pure = new CustomIngot("bronze_ingot_pure");
		copper_ingot = new CustomIngot("copper_ingot");
		copper_ingot_pure = new CustomIngot("copper_ingot_pure");
		copper_ingot_ruby_encrusted = new CustomIngot("copper_ingot_ruby_encrusted");
		iron_ingot_pure = new CustomIngot("iron_ingot_pure");
		iron_ingot_ruby_encrusted = new CustomIngot("iron_ingot_ruby_encrusted");
		leather_stitched = new CustomIngot("leather_stitched");
		obsidian_ingot = new CustomIngot("obsidian_ingot");
		ruby_gem = new CustomIngot("ruby_gem");
		ruby_dust = new CustomIngot("ruby_dust");
		test_item = new CustomIngot("test_item");
		tin_ingot = new CustomIngot("tin_ingot");
		tin_ingot_pure = new CustomIngot("tin_ingot_pure");
		tin_ingot_ruby_encrusted = new CustomIngot("tin_ingot_ruby_encrusted");
	}
	
	public static void register()
	{
		registerItem(bronze_ingot);
		registerItem(bronze_ingot_pure);
		registerItem(copper_ingot);
		registerItem(copper_ingot_pure);
		registerItem(copper_ingot_ruby_encrusted);
		registerItem(iron_ingot_pure);
		registerItem(iron_ingot_ruby_encrusted);
		registerItem(leather_stitched);
		registerItem(obsidian_ingot);
		registerItem(ruby_gem);
		registerItem(ruby_dust);
		registerItem(test_item);
		registerItem(tin_ingot);
		registerItem(tin_ingot_pure);
		registerItem(tin_ingot_ruby_encrusted);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(Main.fluxtab2);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
