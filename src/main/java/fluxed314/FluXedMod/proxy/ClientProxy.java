package fluxed314.FluXedMod.proxy;

import fluxed314.FluXedMod.util.handlers.RegistryHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
	}
	
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		RegistryHandler.Client();
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}
	
	
	private void setupTile(Class class1, TileEntitySpecialRenderer render) {
		try {
			ClientRegistry.bindTileEntitySpecialRenderer(class1, render.getClass().newInstance());
		} catch (Exception e) {
			e.printStackTrace();
			}
			GameRegistry.registerTileEntity(class1, class1.getName());
	}
	
	
}
