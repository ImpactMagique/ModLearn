package fr.impact.learnmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemLearnSword extends ItemSword {

	public ItemLearnSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
