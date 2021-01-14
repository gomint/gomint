/*
 * Copyright (c) 2020 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.world.block;

import io.gomint.world.block.data.ConnectionType;
import io.gomint.world.block.data.Direction;
import io.gomint.world.block.data.StoneType;

/**
 * @author geNAZt
 * @version 1.0
 * @stability 3
 */
public interface BlockWall extends Block {

    /**
     * Get the type of stone from which this wall has been made
     *
     * @return type of stone
     */
    StoneType type();

    /**
     * Set the type of stone for this wall
     *
     * @param stoneType type of stone
     */
    BlockWall type(StoneType stoneType);

    /**
     * Does this wall have a center pole
     *
     * @return true when it has, false otherwise
     */
    boolean pole();

    /**
     * Set if this wall has a pole
     *
     * @param pole true when it should, false otherwise
     */
    BlockWall pole(boolean pole);

    /**
     * Set connection type for this direction
     *
     * @param direction for which we want to set the connection type
     * @param connectionType to set
     */
    BlockWall connection(Direction direction, ConnectionType connectionType);

    /**
     * Get the connection type for the given directions
     *
     * @param direction which we want to get the connection type for
     * @return connection type of this direction
     */
    ConnectionType connection(Direction direction);

}
