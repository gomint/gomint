/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.event.entity.projectile;

import io.gomint.entity.Entity;
import io.gomint.entity.projectile.EntityProjectile;
import io.gomint.event.entity.CancellableEntityEvent;

/**
 * @author geNAZt
 * @version 1.0
 */
public class ProjectileHitEntityEvent extends CancellableEntityEvent {

    private final EntityProjectile projectile;

    /**
     * Create a new entity based cancellable event
     *
     * @param entity     for which this event is
     * @param projectile which hit the entity
     */
    public ProjectileHitEntityEvent( Entity entity, EntityProjectile projectile ) {
        super( entity );
        this.projectile = projectile;
    }

    /**
     * Get the projectile which hit the entity
     *
     * @return projectile which hit the entity
     */
    public EntityProjectile getProjectile() {
        return this.projectile;
    }

}
