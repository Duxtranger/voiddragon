package com.voiddragons.item;

import com.voiddragons.VoidDragonsMod;
import com.voiddragons.registry.ModItems;
import java.util.function.Supplier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterials implements ArmorMaterial {
    VOID("void", 42, 3.5F, 0.1F, 18, () -> Ingredient.of(ModItems.VOID_SCALE_INGOT.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final float toughness;
    private final float knockbackResistance;
    private final int enchantability;
    private final Supplier<Ingredient> repair;

    ModArmorMaterials(String name, int durabilityMultiplier, float toughness, float knockbackResistance,
                      int enchantability, Supplier<Ingredient> repair) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.enchantability = enchantability;
        this.repair = repair;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        int base = switch (type) {
            case HELMET -> 11;
            case CHESTPLATE -> 16;
            case LEGGINGS -> 15;
            case BOOTS -> 13;
        };
        return base * durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> 3;
            case CHESTPLATE -> 8;
            case LEGGINGS -> 6;
            case BOOTS -> 3;
        };
    }

    @Override public int getEnchantmentValue() { return enchantability; }
    @Override public SoundEvent getEquipSound() { return SoundEvents.ARMOR_EQUIP_NETHERITE; }
    @Override public Ingredient getRepairIngredient() { return repair.get(); }
    @Override public String getName() { return VoidDragonsMod.MODID + ":" + name; }
    @Override public float getToughness() { return toughness; }
    @Override public float getKnockbackResistance() { return knockbackResistance; }
}
