package com.voiddragons;

import com.voiddragons.registry.ModCreativeTabs;
import com.voiddragons.registry.ModEntities;
import com.voiddragons.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VoidDragonsMod.MODID)
public class VoidDragonsMod {
    public static final String MODID = "voiddragons";

    public VoidDragonsMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModEntities.ENTITIES.register(bus);
        ModCreativeTabs.TABS.register(bus);
    }
}
