package io.gomint.server.network.packet;

import io.gomint.jraknet.PacketBuffer;
import io.gomint.server.network.Protocol;
import io.gomint.server.resource.ResourcePack;
import lombok.Data;

import java.util.List;

/**
 * @author geNAZt
 * @version 1.0
 */
@Data
public class PacketResourcePacksInfo extends Packet {

    private boolean mustAccept;
    private List<ResourcePack> behaviourPackEntries;
    private List<ResourcePack> resourcePackEntries;

    public PacketResourcePacksInfo() {
        super( Protocol.PACKET_RESOURCEPACK_INFO );
    }

    @Override
    public void serialize( PacketBuffer buffer, int protocolID ) {
        buffer.writeBoolean( this.mustAccept );

        buffer.writeLShort( (short) ( this.behaviourPackEntries == null ? 0 : this.behaviourPackEntries.size() ) );
        if ( this.behaviourPackEntries != null ) {
            for ( ResourcePack entry : this.behaviourPackEntries ) {
                buffer.writeString( entry.getVersion().getId().toString() );
                buffer.writeString( entry.getVersion().getVersion() );
                buffer.writeLLong( entry.getSize() );
                buffer.writeString( "" );
                buffer.writeString( "" );
<<<<<<< HEAD

                // TODO: PRTCL 282
                if ( protocolID >= Protocol.MINECRAFT_PE_NEXT_STABLE_PROTOCOL_VERSION ) {
                    buffer.writeString( "" );
                }
=======
                buffer.writeString( "" );
>>>>>>> 893927c5c519bac56ae7d9e5f6a224f821340990
            }
        }

        buffer.writeLShort( (short) ( this.resourcePackEntries == null ? 0 : this.resourcePackEntries.size() ) );
        if ( this.resourcePackEntries != null ) {
            for ( ResourcePack entry : this.resourcePackEntries ) {
                buffer.writeString( entry.getVersion().getId().toString() );
                buffer.writeString( entry.getVersion().getVersion() );
                buffer.writeLLong( entry.getSize() );
                buffer.writeString( "" );
                buffer.writeString( "" );
<<<<<<< HEAD

                // TODO: PRTCL 282
                if ( protocolID >= Protocol.MINECRAFT_PE_NEXT_STABLE_PROTOCOL_VERSION ) {
                    buffer.writeString( "" );
                }
=======
                buffer.writeString( "" );
>>>>>>> 893927c5c519bac56ae7d9e5f6a224f821340990
            }
        }
    }

    @Override
    public void deserialize( PacketBuffer buffer, int protocolID ) {
        this.mustAccept = buffer.readBoolean();

        short behaviourAmount = buffer.readLShort();
        for ( short i = 0; i < behaviourAmount; i++ ) {
            buffer.readString();
            buffer.readString();
            buffer.readLLong();
            buffer.readString();
            buffer.readString();
<<<<<<< HEAD

            // TODO: PRTCL 282
            if ( protocolID >= Protocol.MINECRAFT_PE_NEXT_STABLE_PROTOCOL_VERSION ) {
                buffer.readString();
            }
=======
            buffer.readString();
>>>>>>> 893927c5c519bac56ae7d9e5f6a224f821340990
        }

        behaviourAmount = buffer.readLShort();
        for ( short i = 0; i < behaviourAmount; i++ ) {
            buffer.readString();
            buffer.readString();
            buffer.readLLong();
            buffer.readString();
            buffer.readString();
<<<<<<< HEAD

            // TODO: PRTCL 282
            if ( protocolID >= Protocol.MINECRAFT_PE_NEXT_STABLE_PROTOCOL_VERSION ) {
                buffer.readString();
            }
=======
            buffer.readString();
>>>>>>> 893927c5c519bac56ae7d9e5f6a224f821340990
        }
    }

}
