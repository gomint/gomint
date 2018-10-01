package io.gomint.inventory.item;

import io.gomint.GoMint;

/**
 * @author Kaooot
 * @version 1.0
 */
public interface ItemFluorine extends ItemStack {

    /**
     * Create a new item stack with given class and amount
     *
     * @param amount which is used for the creation
     */
    static ItemFluorine create( int amount ) {
        return GoMint.instance().createItemStack( ItemFluorine.class, amount );
    }
}
