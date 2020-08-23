package fr.impact.learnmod.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.impact.learnmod.EntityLearn;
import fr.impact.learnmod.common.CommonProxy;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy 
{

	@Override
	public void registerRender() {
	
		System.out.println("méthode côté client");

		RenderingRegistry.registerEntityRenderingHandler(EntityLearn.class, new RenderEntityLearn(new ModelBiped(), 0.5F));
	}
	
}
