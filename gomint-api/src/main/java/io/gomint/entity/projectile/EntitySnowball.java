package io.gomint.entity.projectile;

import io.gomint.GoMint;

/**
 * A implementation of {@code EntityProjectile} representing the snowball
 * projectile. The interface itself does not contain any logic, provides methods
 * for any logic nor provides any getters or setters for a specific value bound
 * to a snowball projectile.
 *
 * @author Clockw1seLrd
 * @version 1.0
 */
public interface EntitySnowball extends EntityProjectile {

    /**
     * Creates a new instance of a snowball projectile. "Creates" describes
     * also spawning the actual snowball entity which is bound to this {@code EntitySnowball}
     * instance.
     *
     * @return The instance of the created snowball projectile
     * @see GoMint#createEntity(Class)
     */
    static EntitySnowball create() {
        return GoMint.instance().createEntity( EntitySnowball.class );
    }

}
