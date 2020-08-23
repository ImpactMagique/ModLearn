package fr.impact.learnmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemLearnShovel extends ItemSpade {

	public ItemLearnShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}
