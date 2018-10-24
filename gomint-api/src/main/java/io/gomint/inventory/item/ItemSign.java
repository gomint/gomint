package io.gomint.inventory.item;

import io.gomint.GoMint;

/**
 * @author geNAZt
 * @version 1.0
 */
public interface ItemSign extends ItemStack, ItemBurnable {

    /**
     * Create a new item stack with given class and amount
     *
     * @param amount which is used for the creation
     */
    static ItemSign create( int amount ) {
        return GoMint.instance().createItemStack( ItemSign.class, amount );
    }

    @Override
    default long getBurnTime() {
        return 10000;
    }

}
