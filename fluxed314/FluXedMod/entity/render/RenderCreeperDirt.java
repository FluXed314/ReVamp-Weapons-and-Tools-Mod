package fluxed314.FluXedMod.entity.render;

import fluxed314.FluXedMod.entity.EntityCreeperDirt;
import fluxed314.FluXedMod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCreeperDirt extends RenderLiving<EntityCreeperDirt>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/creeper/creeperdirt.png");
	
	public RenderCreeperDirt(RenderManager manager) 
	{
		super(manager, new ModelCreeper(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCreeperDirt entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityCreeperDirt entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}
