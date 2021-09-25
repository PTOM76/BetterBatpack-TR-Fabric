package ml.pkom.betterbatpack;

import net.minecraft.item.ArmorMaterial;
import reborncore.common.powerSystem.RcEnergyTier;
import team.reborn.energy.EnergyTier;
import techreborn.items.armor.BatpackItem;

public class BetterBatpackItem extends BatpackItem {
    public BetterBatpackItem(int maxCharge, ArmorMaterial armorMaterial, RcEnergyTier tier) {
        super(maxCharge, armorMaterial, tier);
    }
}
