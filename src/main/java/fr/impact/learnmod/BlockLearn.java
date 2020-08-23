package fr.impact.learnmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLearn extends Block {

	public BlockLearn(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}

}
