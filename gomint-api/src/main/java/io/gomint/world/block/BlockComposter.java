/*
 * Copyright (c) 2020 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.world.block;

/**
 * @author geNAZt
 * @author jihuayu
 * @version 1.0
 * @stability 3
 */
public interface BlockComposter extends Block {
    //TODO: docs
    BlockComposter level(int level);
    //TODO: docs
    int level();
}
