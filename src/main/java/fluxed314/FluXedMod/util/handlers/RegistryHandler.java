package fluxed314.FluXedMod.util.handlers;

import fluxed314.FluXedMod.world.gen.FluXOreGen;
import fluxed314.FluXedMod.init.ArmorInit;
import fluxed314.FluXedMod.init.BlockInit;
import fluxed314.FluXedMod.init.EntityInit;
import fluxed314.FluXedMod.init.ItemInit;
//import fluxed314.FluXedMod.init.TileEntityPurifyingFurnace;
import fluxed314.FluXedMod.init.ToolInit;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler 
{
	public static void Client()
	{	
		RecipeHandler.registerCrafting();
		//RecipeHandler.registerSmelting();
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
		ToolInit.init();
		ToolInit.register();
		
		ArmorInit.init();
		ArmorInit.register();
		
		GameRegistry.registerWorldGenerator(new FluXOreGen(), 0);

		//GameRegistry.registerTileEntity(fluxed314.FluXedMod.init.blocks.machines.purifyingfurnace.TileEntityPurifyingFurnace.class, 15);
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
}
