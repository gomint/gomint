package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author KingAli
 * @version 1.0
 */
@RegisterInfo(id = 210 ,sId = "minecraft:cracked_nether_bricks" ) //TODO get ID ???
public class ItemCrimsonFungus extends ItemStack implements io.gomint.inventory.item.ItemCrimsonFungus {

    @Override
    public String getBlockId() {
        return "minecraft:cracked_nether_bricks";
    }

    @Override
    public ItemType getType() {
        return ItemType.CRACKED_NETHER_BRICK;
    }
}