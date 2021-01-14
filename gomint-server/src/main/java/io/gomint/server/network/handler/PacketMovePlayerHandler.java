package io.gomint.server.network.handler;

import io.gomint.math.Location;
import io.gomint.server.entity.EntityPlayer;
import io.gomint.server.network.PlayerConnection;
import io.gomint.server.network.packet.PacketMovePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author geNAZt
 * @version 1.0
 */
public class PacketMovePlayerHandler implements PacketHandler<PacketMovePlayer> {

    private static final Logger LOGGER = LoggerFactory.getLogger( PacketMovePlayer.class );

    @Override
    public void handle( PacketMovePlayer packet, long currentTimeMillis, PlayerConnection connection ) {
        EntityPlayer entity = connection.getEntity();
        Location to = entity.getLocation();
        to.setX( packet.getX() );
        to.setY( packet.getY() - entity.getEyeHeight() ); // Subtract eye height since client sends it at the eyes
        to.setZ( packet.getZ() );
        to.headYaw( packet.getHeadYaw() );
        to.yaw( packet.getYaw() );
        to.pitch( packet.getPitch() );

        // Does the entity have a teleport open?
        if ( connection.getEntity().getTeleportPosition() != null ) {
            if ( connection.getEntity().getTeleportPosition().distanceSquared( to ) > 0.2 ) {
                LOGGER.warn( "Player {} did not teleport to {}", connection.getEntity().getName(), connection.getEntity().getTeleportPosition(), to );
                connection.sendMovePlayer( connection.getEntity().getTeleportPosition() );
                return;
            } else {
                connection.getEntity().setTeleportPosition( null );
            }
        }

        Location from = entity.getLocation();

        // The packet did not contain any movement? skip it
        if ( from.getX() - to.getX() == 0 &&
            from.getY() - to.getY() == 0 &&
            from.getZ() - to.getZ() == 0 &&
            from.headYaw() - to.headYaw() == 0 &&
            from.yaw() - to.yaw() == 0 &&
            from.pitch() - to.pitch() == 0 ) {
            return;
        }

        connection.getEntity().setNextMovement( to );
    }

}
