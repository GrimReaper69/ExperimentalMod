package net.grimreaper.experimentalmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ExperimentalTab {
    public static final CreativeModeTab EXPERIMENTAL_TAB = new CreativeModeTab("experimental_tab") {
        @Override public ItemStack makeIcon() {return new ItemStack(Items.ruby.get());}
    };
}
