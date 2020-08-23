package fr.impact.learnmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class HealStick extends Item 
{
	
	public HealStick() 
	{
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
		this.setMaxDamage(5);
	}
	
	@Override
	public void onUpdate(ItemStack itemStack, World worldIn, Entity playerIn, int slot,
			boolean inHand) 
	{
		if(!itemStack.hasTagCompound()) 
		{
			itemStack.setTagCompound(new NBTTagCompound());
			itemStack.getTagCompound().setInteger("timer", 0);
		}
		
		if(itemStack.getTagCompound().getInteger("timer") > 0) 
		{
			itemStack.getTagCompound().setInteger("timer", itemStack.getTagCompound().getInteger("timer") - 1);
		}
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World worldIn, EntityPlayer playerIn) 
	{
		if(!playerIn.capabilities.isCreativeMode) 
		{
			if(playerIn.getHealth() != playerIn.getMaxHealth()) 
			{
				if(itemStack.getTagCompound().getInteger("timer") <= 0) 
				{
					playerIn.setHealth(playerIn.getMaxHealth());
					itemStack.damageItem(1, playerIn);
					itemStack.getTagCompound().setInteger("timer", 10 * 20);
				}
					
				
			}
		}
		
		
		return itemStack;
	}
	
	

}
