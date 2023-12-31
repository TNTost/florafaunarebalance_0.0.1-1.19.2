package net.tabby.florafaunarebalance.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.tabby.florafaunarebalance.entity.custom.DartProjectileEntity;
import net.tabby.florafaunarebalance.item.FFRii;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class TippedDartItem extends DartItem {
    public TippedDartItem(Properties p_40512_properties, float damage, @Nullable List<MobEffectInstance> effect, int col) {
        super(p_40512_properties, damage, effect, col);
    }
    @Override
    public AbstractArrow createArrow(Level p_40513_level, ItemStack p_40514_, LivingEntity p_40515_shooter) {
        DartProjectileEntity arrow = new DartProjectileEntity(p_40515_shooter, p_40513_level, FFRii.POISON_DART.get(), col);
        arrow.setBaseDamage(this.damage);
        arrow.setEffectsFromList(effects);
        return arrow;
    }
}
