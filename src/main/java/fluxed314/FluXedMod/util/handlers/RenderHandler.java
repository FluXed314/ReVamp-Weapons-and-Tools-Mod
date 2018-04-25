package fluxed314.FluXedMod.util.handlers;

import fluxed314.FluXedMod.entity.EntityCreeperSand;
import fluxed314.FluXedMod.entity.render.RenderCreeperSand;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCreeperSand.class, new IRenderFactory<EntityCreeperSand>()
				{
					@Override
					public Render<? super EntityCreeperSand> createRenderFor(RenderManager manager)
					{
						return new RenderCreeperSand(manager);
					}
				});
	}
	
}
