package ml.pkom.betterbatpack;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import team.reborn.energy.EnergyTier;
import techreborn.config.TechRebornConfig;

public class BetterBatpack implements ModInitializer {

    public static Item batpack4 = new BetterBatpackItem(TechRebornConfig.lithiumBatpackCharge * 4, new BBArmorMaterial("batpack4"), EnergyTier.MEDIUM);
    public static Item batpack16 = new BetterBatpackItem(TechRebornConfig.lithiumBatpackCharge * 16, new BBArmorMaterial("batpack16"), EnergyTier.MEDIUM);
    public static Item batpack64 = new BetterBatpackItem(TechRebornConfig.lithiumBatpackCharge * 64, new BBArmorMaterial("batpack64"), EnergyTier.MEDIUM);
    public static Item batpack128 = new BetterBatpackItem(TechRebornConfig.lithiumBatpackCharge * 128, new BBArmorMaterial("batpack128"), EnergyTier.MEDIUM);

    public static final ItemGroup BETTER_BATPACK = FabricItemGroupBuilder.create(
            new Identifier("better_batpack:all"))
            .icon(() -> new ItemStack(batpack4))
            .appendItems((stacks -> {
                stacks.add(new ItemStack(batpack4));
                stacks.add(new ItemStack(batpack16));
                stacks.add(new ItemStack(batpack64));
                stacks.add(new ItemStack(batpack128));
            }))
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, "better_batpack:batpack4", batpack4);
        Registry.register(Registry.ITEM, "better_batpack:batpack16", batpack16);
        Registry.register(Registry.ITEM, "better_batpack:batpack64", batpack64);
        Registry.register(Registry.ITEM, "better_batpack:batpack128", batpack128);
    }
}