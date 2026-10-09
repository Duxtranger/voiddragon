package com.voiddragons.registry;

import com.voiddragons.VoidDragonsMod;
import com.voiddragons.entity.VoidDragonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VoidDragonsMod.MODID);

    public static final RegistryObject<EntityType<VoidDragonEntity>> VOID_DRAGON = ENTITIES.register("void_dragon",
            () -> EntityType.Builder.of(VoidDragonEntity::new, MobCategory.MONSTER)
                    .sized(3.0F, 2.5F)
                    .clientTrackingRange(10)
                    .fireImmune()
                    .build(new ResourceLocation(VoidDragonsMod.MODID, "void_dragon").toString()));
}
