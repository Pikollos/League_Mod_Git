package net.slime.leaguemod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.slime.leaguemod.LeagueMod;
import net.slime.leaguemod.item.ModItem;

import java.util.List;

@Mod.EventBusSubscriber(modid = LeagueMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomtrades(VillagerTradesEvent event){
        if(event.getType() == VillagerProfession.BUTCHER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItem.CERVEJA.get(),12),
                    10, 8, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 5),
                    new ItemStack(ModItem.BALDEDIAMANTE.get(),20),
                    10, 15, 2f));

        }
    }

}
