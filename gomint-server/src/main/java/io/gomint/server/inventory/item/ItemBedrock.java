package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:bedrock", id = 7)
public class ItemBedrock extends ItemStack< io.gomint.inventory.item.ItemBedrock> implements io.gomint.inventory.item.ItemBedrock {

    @Override
    public ItemType itemType() {
        return ItemType.BEDROCK;
    }

}
