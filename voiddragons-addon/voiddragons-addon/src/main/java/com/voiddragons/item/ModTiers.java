package com.voiddragons.item;

import com.voiddragons.registry.ModItems;
import java.util.function.Supplier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModTiers implements Tier {
    // nivel 4 = netherite, entre diamante y netherite en durabilidad/velocidad
    VOID(4, 2200, 8.5F, 3.5F, 18, () -> Ingredient.of(ModItems.VOID_SCALE_INGOT.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantability;
    private final Supplier<Ingredient> repair;

    ModTiers(int level, int uses, float speed, float damage, int enchantability, Supplier<Ingredient> repair) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantability = enchantability;
        this.repair = repair;
    }

    @Override public int getUses() { return uses; }
    @Override public float getSpeed() { return speed; }
    @Override public float getAttackDamageBonus() { return damage; }
    @Override public int getLevel() { return level; }
    @Override public int getEnchantmentValue() { return enchantability; }
    @Override public Ingredient getRepairIngredient() { return repair.get(); }
}
