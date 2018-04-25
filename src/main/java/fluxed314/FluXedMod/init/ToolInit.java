package fluxed314.FluXedMod.init;

import fluxed314.FluXedMod.Main;
import fluxed314.FluXedMod.init.tools.CustomAxe;
import fluxed314.FluXedMod.init.tools.CustomHoe;
import fluxed314.FluXedMod.init.tools.CustomPickaxe;
import fluxed314.FluXedMod.init.tools.CustomShovel;
import fluxed314.FluXedMod.init.tools.CustomSword;
import fluxed314.FluXedMod.init.tools.RubyAxe;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit
{
	public static final ToolMaterial bronze = EnumHelper.addToolMaterial("bronze", 3, 1200, 7.0F, 2.5F, 8);
	public static final ToolMaterial copper = EnumHelper.addToolMaterial("copper", 3, 1200, 7.0F, 2.5F, 8);
	public static final ToolMaterial ruby = EnumHelper.addToolMaterial("ruby", 4, 1314, 9.0F, 4.0F, 8);
	
	public static Item bronze_sword, bronze_axe, bronze_pickaxe, bronze_shovel, bronze_hoe, bronze_multitool;
	public static Item copper_sword, copper_axe, copper_pickaxe, copper_shovel, copper_hoe, copper_multitool;
	public static Item ruby_sword, ruby_axe, ruby_pickaxe, ruby_shovel, ruby_hoe, ruby_multitool;
	public static Item ruby_mace, ruby_staff, ruby_wand, ruby_waraxe, ruby_hammer, ruby_polearm;
	
	public static void init()
	{
		
		bronze_sword = new CustomSword("bronze_sword", bronze);
		// bronze_axe = new CustomAxe("bronze_axe", bronze);
		bronze_axe = new CustomAxe("bronze_axe", bronze, 7.5F, 1F);
		bronze_pickaxe = new CustomPickaxe("bronze_pickaxe", bronze);
		bronze_shovel = new CustomShovel("bronze_shovel", bronze);
		bronze_hoe = new CustomHoe("bronze_hoe", bronze);
		// bronze_multitool = new CustomMultitool("bronze_multitool", bronze);
		copper_sword = new CustomSword("copper_sword", copper);
		// copper_axe = new CustomAxe("copper_axe", copper);
		copper_axe = new CustomAxe("copper_axe", copper, 7.5F, 1F);
		copper_pickaxe = new CustomPickaxe("copper_pickaxe", copper);
		copper_shovel = new CustomShovel("copper_shovel", copper);
		copper_hoe = new CustomHoe("copper_hoe", copper);
		// copper_multitool = new CustomMultitool("copper_multitool", copper);
		ruby_sword = new CustomSword("ruby_sword", ruby);
		// ruby_axe = new RubyAxe("ruby_axe", ruby);
		ruby_axe = new RubyAxe("ruby_axe", ruby, 10F, 1F);
		ruby_pickaxe = new CustomPickaxe("ruby_pickaxe", ruby);
		ruby_shovel = new CustomShovel("ruby_shovel", ruby);
		ruby_hoe = new CustomHoe("ruby_hoe", ruby);
		// ruby_multitool = new CustomMultitool("ruby_multitool", ruby);
	}
	
	public static void register()
	{
		
		registerItem(bronze_sword);
		registerItem(bronze_axe);
		registerItem(bronze_pickaxe);
		registerItem(bronze_shovel);
		registerItem(bronze_hoe);
		// registerItem(bronze_multitool);
		registerItem(copper_sword);
		registerItem(copper_axe);
		registerItem(copper_pickaxe);
		registerItem(copper_shovel);
		registerItem(copper_hoe);
		// registerItem(copper_multitool);
		registerItem(ruby_sword);
		registerItem(ruby_axe);
		registerItem(ruby_pickaxe);
		registerItem(ruby_shovel);
		registerItem(ruby_hoe);
		// registerItem(ruby_multitool);
	}
	
	public static void registerItem(Item item)
	{
		
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(Main.fluxtab3);
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
