package io.gomint.inventory.item;

import io.gomint.GoMint;

/**
 * @author Kaooot
 * @version 1.0
 */
public interface ItemNitrogen extends ItemStack {

    /**
     * Create a new item stack with given class and amount
     *
     * @param amount which is used for the creation
     */
    static ItemNitrogen create( int amount ) {
        return GoMint.instance().createItemStack( ItemNitrogen.class, amount );
    }
}