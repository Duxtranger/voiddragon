package com.voiddragons.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.voiddragons.VoidDragonsMod;
import com.voiddragons.entity.VoidDragonEntity;
import net.minecraft.client.model.CowModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

/** Renderer provisional (modelo de vaca escalado). Sustituir por GeckoLib/modelo propio. */
public class VoidDragonRenderer extends MobRenderer<VoidDragonEntity, CowModel<VoidDragonEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(VoidDragonsMod.MODID, "textures/entity/void_dragon.png");

    public VoidDragonRenderer(EntityRendererProvider.Context context) {
        super(context, new CowModel<>(context.bakeLayer(ModelLayers.COW)), 1.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(VoidDragonEntity entity) {
        return TEXTURE;
    }

    @Override
    protected void scale(VoidDragonEntity entity, PoseStack poseStack, float partialTick) {
        poseStack.scale(2.0F, 2.0F, 2.0F);
    }
}
