package com.elmakers.mine.bukkit.effect;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Location;

import com.elmakers.mine.bukkit.api.magic.Mage;
import com.elmakers.mine.bukkit.api.wand.Wand;

public class WandEffectContext extends MageEffectContext implements com.elmakers.mine.bukkit.api.effect.WandEffectContext {
    protected final @Nullable Wand wand;

    public WandEffectContext(@Nonnull Mage mage, @Nullable Wand wand) {
        super(mage);
        this.wand = wand;
    }

    @Override
    @Nullable
    public Wand getWand() {
        return wand;
    }

    @Nullable
    @Override
    public Location getCastLocation() {
        if (location != null) {
            return location;
        }
        Location wandLocation = wand == null ? null : wand.getLocation();
        return wandLocation == null ? getEyeLocation() : wandLocation;
    }
}