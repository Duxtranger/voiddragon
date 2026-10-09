package com.voiddragons.event;

import com.voiddragons.VoidDragonsMod;
import com.voiddragons.item.ModArmorMaterials;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.MobEffectEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VoidDragonsMod.MODID)
public class ForgeEvents {

    /** Bonus de set completo: inmunidad al efecto Wither. */
    @SubscribeEvent
    public static void onEffectApplicable(MobEffectEvent.Applicable event) {
        if (event.getEffectInstance().getEffect() == MobEffects.WITHER && hasFullSet(event.getEntity())) {
            event.setResult(Event.Result.DENY);
        }
    }

    public static boolean hasFullSet(LivingEntity entity) {
        for (EquipmentSlot slot : new EquipmentSlot[]{
                EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET}) {
            ItemStack stack = entity.getItemBySlot(slot);
            if (!(stack.getItem() instanceof ArmorItem armor) || armor.getMaterial() != ModArmorMaterials.VOID) {
                return false;
            }
        }
        return true;
    }
}
