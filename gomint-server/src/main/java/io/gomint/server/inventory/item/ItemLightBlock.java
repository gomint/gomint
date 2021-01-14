/*
 * Copyright (c) 2020, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;
import io.gomint.world.block.Block;
import io.gomint.world.block.BlockLightBlock;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:light_block", id = -215)
public class ItemLightBlock extends ItemStack implements io.gomint.inventory.item.ItemLightBlock {

    private static final float DIVIDER = 1f / 15;

    @Override
    public ItemType getItemType() {
        return ItemType.LIGHT_BLOCK;
    }

    @Override
    public float getIntensity() {
        return this.getData() * DIVIDER;
    }

    @Override
    public void setIntensity(float intensity) {
        this.setData((short) (intensity * 15));
    }

    @Override
    public Block getBlock() {
        BlockLightBlock block = (BlockLightBlock) super.getBlock();
        block.intensity(this.getIntensity());
        return block;
    }

}
