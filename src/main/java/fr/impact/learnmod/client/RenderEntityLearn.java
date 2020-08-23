package fr.impact.learnmod.client;

import fr.impact.learnmod.EntityLearn;
import fr.impact.learnmod.ModLearn;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityLearn extends RenderBiped {

	public final ResourceLocation texture = new ResourceLocation(ModLearn.MODID, "textures/entity/mob_learn.png");
	
	public RenderEntityLearn(ModelBiped modelBiped, float shadow) {
		super(modelBiped, shadow);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity living) {
		return this.getMobLearnTexture((EntityLearn) living);
	}
	
	private ResourceLocation getMobLearnTexture(EntityLearn entity)
	{
		return texture;
	}

}
