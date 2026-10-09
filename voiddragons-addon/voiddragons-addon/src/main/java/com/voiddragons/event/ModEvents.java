package com.voiddragons.event;

import com.voiddragons.VoidDragonsMod;
import com.voiddragons.entity.VoidDragonEntity;
import com.voiddragons.registry.ModEntities;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VoidDragonsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void onAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.VOID_DRAGON.get(), VoidDragonEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void onSpawnPlacement(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.VOID_DRAGON.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.OR);
    }
}
