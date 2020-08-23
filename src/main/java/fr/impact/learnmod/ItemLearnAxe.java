package fr.impact.learnmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemLearnAxe extends ItemAxe {

	protected ItemLearnAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}
