package fr.impact.learnmod.common;

import java.awt.List;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import scala.actors.threadpool.Arrays;

public class ItemLearn extends Item 
{
	
	public ItemLearn()
	{
		this.setCreativeTab(CreativeTabs.tabMisc);
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
		// TODO Auto-generated method stub
		return super.onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);
	}
	
	@Override
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_,
			boolean p_77663_5_) {
		
		super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
	}
	

}
