package fr.impact.learnmod;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;


public class EntityLearn extends EntityMob {

	public EntityLearn(World world) {
		super(world);
	}
	

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0d);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(12D);
		
	}
	
	@Override
	protected Item getDropItem() {
		
		return ModLearn.healStick;
	}
	
	
}
