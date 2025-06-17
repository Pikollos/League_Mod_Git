package net.slime.leaguemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.slime.leaguemod.LeagueMod;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LeagueMod.MOD_ID);

    public static final RegistryObject<Item> GELOVERDADEIRO = ITEMS.register("geloverdadeiro",
         () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GEMAGELO = ITEMS.register("gemagelo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRISTAL = ITEMS.register("cristal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CERVEJA = ITEMS.register("cerveja",
            () -> new Item(new Item.Properties().food(ModFoods.CERVEJA)));

    public static final RegistryObject<Item> BALDEDIAMANTE = ITEMS.register("baldediamante",
            () -> new Item(new Item.Properties().food(ModFoods.BALDEDIAMANTE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
