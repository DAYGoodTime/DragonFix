package com.day.dragonfix.mixins;

import java.lang.reflect.Field;
import java.util.Map;

import net.minecraft.util.StatCollector;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

import com.day.dragonfix.DragonFix;

import Reika.DragonAPI.Instantiable.Data.Proportionality;

@Mixin(value = Proportionality.class, remap = false)
public class DragonAPIProportionalityMixins<F> {

    @Unique
    private static boolean dragonFix$logged = false;
    @Unique
    private static boolean dragonFix$loggedError = false;

    /**
     * @author DAY
     * @reason why ordinal code have 'noob' mistake and not fix
     */
    @Overwrite
    public F getLargestCategory() {
        if (!dragonFix$logged) {
            DragonFix.LOG.info(StatCollector.translateToLocal("dragonfix.dragonapi.proportinality.getlargestcategory"));
            dragonFix$logged = true;
        }
        try {
            Field dataField = Proportionality.class.getDeclaredField("data");
            dataField.setAccessible(true);
            Map<F, Double> data = (Map<F, Double>) dataField.get(this);
            double max = (double) -1.0F;
            F big = null;
            for (F o : data.keySet()) {
                double has = ((Proportionality) (Object) this).getValue(o);
                if (has > max) {
                    max = has;
                    big = o;
                }
            }
            return big;
        } catch (Exception e) {
            if (!dragonFix$loggedError) {
                DragonFix.LOG.warn(
                    StatCollector.translateToLocal("dragonfix.dragonapi.proportinality.getlargestcategory.error"));
                DragonFix.LOG.error(e);
                dragonFix$loggedError = true;
            }
            return null;
        }
    }

}
