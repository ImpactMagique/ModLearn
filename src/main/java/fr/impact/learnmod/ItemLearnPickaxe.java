package fr.impact.learnmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemLearnPickaxe extends ItemPickaxe {

	protected ItemLearnPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}
