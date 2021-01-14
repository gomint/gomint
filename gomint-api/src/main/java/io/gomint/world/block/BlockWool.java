/*
 * Copyright (c) 2020 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.world.block;

import io.gomint.world.block.data.BlockColor;

/**
 * @author geNAZt
 * @version 1.0
 * @stability 3
 */
public interface BlockWool extends Block {

    /**
     * Get the color of this block
     *
     * @return color of this block
     */
    BlockColor color();

    /**
     * Set the color of this block
     *
     * @param color which this block should be
     */
    BlockWool color(BlockColor color );

}
