package fluxed314.FluXedMod.init;

import fluxed314.FluXedMod.Main;
import fluxed314.FluXedMod.entity.EntityCreeperDirt;
import fluxed314.FluXedMod.entity.EntityCreeperInvis;
import fluxed314.FluXedMod.entity.EntityCreeperSand;
import fluxed314.FluXedMod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	
	public static void registerEntities()
	{
		
		registerEntity("creeper_sand", EntityCreeperSand.class, Reference.ENTITY_CREEPER_SAND, 50, 65280, 16777165); // Green,SandyYellow
		registerEntity("creeper_dirt", EntityCreeperDirt.class, Reference.ENTITY_CREEPER_DIRT, 50, 65280, 7820824); // Green,Brown
		registerEntity("creeper_invis", EntityCreeperInvis.class, Reference.ENTITY_CREEPER_INVIS, 50, 65280, 0); // Green, Black
		
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1,
			int color2)
	{
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id,
				Main.instance, range, 1, true, color1, color2);
	}
}
