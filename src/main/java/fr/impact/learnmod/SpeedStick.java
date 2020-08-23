package fr.impact.learnmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SpeedStick extends Item 
{
	
	public SpeedStick() 
	{
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
		this.setMaxDamage(5);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World worldIn, EntityPlayer playerIn) 
	{
		if(!playerIn.capabilities.isCreativeMode) 
		{
			if(!playerIn.isPotionActive(Potion.moveSpeed.id)) 
			{
				playerIn.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 120 * 20, 1));
				itemStack.damageItem(1, playerIn);
			}
		}
		return itemStack;
	}

}
