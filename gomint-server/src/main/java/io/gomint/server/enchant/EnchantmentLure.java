/*
 * Copyright (c) 2020, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.enchant;

import io.gomint.enchant.Rarity;
import io.gomint.inventory.item.ItemType;
import io.gomint.server.inventory.item.ItemStack;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 24 )
public class EnchantmentLure extends Enchantment implements io.gomint.enchant.EnchantmentLure {

    /**
     * Create new enchantment lure
     */
    public EnchantmentLure() {
        super( (short) 3 );
    }

    @Override
    public int getMinEnchantAbility( short level ) {
        return (byte) ( 15 + ( level - 1 ) * 9 );
    }

    @Override
    public int getMaxEnchantAbility( short level ) {
        return (byte) ( getMinEnchantAbility( level ) + 50 );
    }

    @Override
    public boolean canBeApplied(ItemStack<?> itemStack ) {
        return itemStack.itemType() == ItemType.FISHING_ROD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
