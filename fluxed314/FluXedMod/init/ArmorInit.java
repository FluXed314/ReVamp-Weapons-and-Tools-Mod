package fluxed314.FluXedMod.init;

import fluxed314.FluXedMod.Main;
import fluxed314.FluXedMod.init.armor.CustomArmor;
import fluxed314.FluXedMod.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmorInit {

	public static final ArmorMaterial bronze_armor = EnumHelper.addArmorMaterial("bronze_armor",
			Reference.MODID + ":bronze", 25, new int[] { 3, 5, 7, 2 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F);
	public static final ArmorMaterial copper_armor = EnumHelper.addArmorMaterial("copper_armor",
			Reference.MODID + ":copper", 25, new int[] { 3, 5, 7, 2 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F);
	public static final ArmorMaterial leather_armor = EnumHelper.addArmorMaterial("leather_armor",
			Reference.MODID + ":leather", 3, new int[] { 1, 1, 1, 1 }, 2, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.3F);
	public static final ArmorMaterial ruby_armor = EnumHelper.addArmorMaterial("ruby_armor", Reference.MODID + ":ruby",
			20, new int[] { 4, 8, 10, 4 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	public static Item bronze_helmet, bronze_chestplate, bronze_leggings, bronze_boots;
	public static Item copper_helmet, copper_chestplate, copper_leggings, copper_boots;
	public static Item leather_helmet, leather_chestplate, leather_leggings, leather_boots;
	public static Item ruby_helmet, ruby_chestplate, ruby_leggings, ruby_boots;

	public static void init() {

		bronze_helmet = new CustomArmor("bronze_helmet", bronze_armor, 1, EntityEquipmentSlot.HEAD);
		bronze_chestplate = new CustomArmor("bronze_chestplate", bronze_armor, 1, EntityEquipmentSlot.CHEST);
		bronze_leggings = new CustomArmor("bronze_leggings", bronze_armor, 2, EntityEquipmentSlot.LEGS);
		bronze_boots = new CustomArmor("bronze_boots", bronze_armor, 1, EntityEquipmentSlot.FEET);

		copper_helmet = new CustomArmor("copper_helmet", copper_armor, 1, EntityEquipmentSlot.HEAD);
		copper_chestplate = new CustomArmor("copper_chestplate", copper_armor, 1, EntityEquipmentSlot.CHEST);
		copper_leggings = new CustomArmor("copper_leggings", copper_armor, 2, EntityEquipmentSlot.LEGS);
		copper_boots = new CustomArmor("copper_boots", copper_armor, 1, EntityEquipmentSlot.FEET);

		leather_helmet = new CustomArmor("leather_helmet", leather_armor, 1, EntityEquipmentSlot.HEAD);
		leather_chestplate = new CustomArmor("leather_chestplate", leather_armor, 1, EntityEquipmentSlot.CHEST);
		leather_leggings = new CustomArmor("leather_leggings", leather_armor, 2, EntityEquipmentSlot.LEGS);
		leather_boots = new CustomArmor("leather_boots", leather_armor, 1, EntityEquipmentSlot.FEET);

		ruby_helmet = new CustomArmor("ruby_helmet", ruby_armor, 1, EntityEquipmentSlot.HEAD);
		ruby_chestplate = new CustomArmor("ruby_chestplate", ruby_armor, 1, EntityEquipmentSlot.CHEST);
		ruby_leggings = new CustomArmor("ruby_leggings", ruby_armor, 2, EntityEquipmentSlot.LEGS);
		ruby_boots = new CustomArmor("ruby_boots", ruby_armor, 1, EntityEquipmentSlot.FEET);

	}

	public static void register() {

		registerItem(bronze_helmet);
		registerItem(bronze_chestplate);
		registerItem(bronze_leggings);
		registerItem(bronze_boots);

		registerItem(copper_helmet);
		registerItem(copper_chestplate);
		registerItem(copper_leggings);
		registerItem(copper_boots);

		registerItem(leather_helmet);
		registerItem(leather_chestplate);
		registerItem(leather_leggings);
		registerItem(leather_boots);

		registerItem(ruby_helmet);
		registerItem(ruby_chestplate);
		registerItem(ruby_leggings);
		registerItem(ruby_boots);

	}

	public static void registerItem(Item item) {

		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(Main.fluxtab4);
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
