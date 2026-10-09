package com.voiddragons.registry;

import com.voiddragons.VoidDragonsMod;
import com.voiddragons.item.ModArmorMaterials;
import com.voiddragons.item.ModTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VoidDragonsMod.MODID);

    // Materiales y drops
    public static final RegistryObject<Item> VOID_SCALE = ITEMS.register("void_scale",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_SCALE_INGOT = ITEMS.register("void_scale_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_DRAGON_BLOOD = ITEMS.register("void_dragon_blood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_DRAGON_BONE = ITEMS.register("void_dragon_bone",
            () -> new Item(new Item.Properties()));

    // Herramientas
    public static final RegistryObject<Item> VOID_SWORD = ITEMS.register("void_sword",
            () -> new SwordItem(ModTiers.VOID, 3, -2.4F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_PICKAXE = ITEMS.register("void_pickaxe",
            () -> new PickaxeItem(ModTiers.VOID, 1, -2.8F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_AXE = ITEMS.register("void_axe",
            () -> new AxeItem(ModTiers.VOID, 5.0F, -3.0F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_SHOVEL = ITEMS.register("void_shovel",
            () -> new ShovelItem(ModTiers.VOID, 1.5F, -3.0F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_HOE = ITEMS.register("void_hoe",
            () -> new HoeItem(ModTiers.VOID, -4, 0.0F, new Item.Properties().fireResistant()));

    // Armadura
    public static final RegistryObject<Item> VOID_HELMET = ITEMS.register("void_helmet",
            () -> new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_CHESTPLATE = ITEMS.register("void_chestplate",
            () -> new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_LEGGINGS = ITEMS.register("void_leggings",
            () -> new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> VOID_BOOTS = ITEMS.register("void_boots",
            () -> new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    // Huevo de aparicion
    public static final RegistryObject<Item> VOID_DRAGON_SPAWN_EGG = ITEMS.register("void_dragon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.VOID_DRAGON, 0x1A0B2E, 0x8A2BE2, new Item.Properties()));
}
