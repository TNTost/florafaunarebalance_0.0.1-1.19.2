package net.tabby.florafaunarebalance.client.renderer.entity;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tabby.florafaunarebalance.FloraFaunaRebalance;
import net.tabby.florafaunarebalance.entity.custom.DartProjectileEntity;

@OnlyIn(Dist.CLIENT)
public class DartProjectileRenderer extends ArrowRenderer<DartProjectileEntity> {
    public DartProjectileRenderer(EntityRendererProvider.Context p_173917_context) {
        super(p_173917_context);
    }

    @Override
    public ResourceLocation getTextureLocation(DartProjectileEntity dartProjectileEntity) {
        Item referenceItem = dartProjectileEntity.getPickupItem().getItem();
        String refItemDESC = referenceItem.getDescriptionId();
        return new ResourceLocation(FloraFaunaRebalance.MOD_ID, "textures/entity/projectiles/"
                + refItemDESC.substring(refItemDESC.lastIndexOf(".") +1) + ".png");    }
}