package fluxed314.FluXedMod.entity.render;

import fluxed314.FluXedMod.entity.EntityCreeperSand;
import fluxed314.FluXedMod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCreeperSand extends RenderLiving<EntityCreeperSand>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/creeper/creepersand.png");
	
	public RenderCreeperSand(RenderManager manager) 
	{
		super(manager, new ModelCreeper(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCreeperSand entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityCreeperSand entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}
