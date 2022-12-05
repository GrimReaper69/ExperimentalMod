package net.grimreaper.experimentalmod.item;

import net.grimreaper.experimentalmod.ExperimentalMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExperimentalMod.MOD_ID);
    public static final RegistryObject<Item> ruby = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ExperimentalTab.EXPERIMENTAL_TAB)));

    public static void register(IEventBus iEventBus) {ITEMS.register(iEventBus);}
}