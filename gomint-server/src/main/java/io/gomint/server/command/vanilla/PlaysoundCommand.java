package io.gomint.server.command.vanilla;

import io.gomint.command.Command;
import io.gomint.command.CommandOutput;
import io.gomint.command.CommandSender;
import io.gomint.command.ConsoleCommandSender;
import io.gomint.command.annotation.Description;
import io.gomint.command.annotation.Name;
import io.gomint.command.annotation.Parameter;
import io.gomint.command.annotation.Permission;
import io.gomint.command.annotation.Overload;
import io.gomint.command.validator.TargetValidator;
import io.gomint.command.validator.BlockPositionValidator;
import io.gomint.command.validator.StringValidator;
import io.gomint.command.validator.FloatValidator;
import io.gomint.server.entity.EntityPlayer;
import io.gomint.math.Vector;

import java.util.Map;

/**
 * @author lukeeey
 * @version 1.0
 */
@Name( "playsound" )
@Description( "Plays a sound." )
@Permission( "gomint.command.playsound" )
@Overload( {
    @Parameter( name = "sound", validator = StringValidator.class, arguments = { "[a-zA-Z0-9ß\\-]+" } ),
    @Parameter( name = "player", validator = TargetValidator.class, optional = true ),
    @Parameter( name = "position", validator = BlockPositionValidator.class, optional = true ),
    @Parameter( name = "volume", validator = FloatValidator.class, optional = true ),
    @Parameter( name = "pitch", validator = FloatValidator.class, optional = true )
} )
public class PlaysoundCommand extends Command {

    @Override
    public CommandOutput execute( CommandSender sender, String alias, Map<String, Object> arguments ) {
        CommandOutput output = new CommandOutput();
        EntityPlayer target;

        if( sender instanceof ConsoleCommandSender ){
            if( arguments.containsKey( "player" ) ) {
                target = (EntityPlayer) arguments.get( "player" );
            } else {
                return output.fail( "No targets matched selector" );
            }
        } else {
            if ( arguments.containsKey( "player" ) ) {
                target = (EntityPlayer) arguments.get( "player" );
            } else {
                target = (EntityPlayer) sender;
            }
        }

        Vector position = target.getPosition();
        float pitch = 1;
        float volume = 1;

        if( arguments.containsKey( "position" ) ) {
            position = (Vector) arguments.get( "position" );
        }

        if( arguments.containsKey( "pitch" ) ) {
            pitch = (float) arguments.get( "pitch" );
        }

        if( arguments.containsKey( "volume" ) ) {
            volume = (float) arguments.get( "volume" );
        }

        target.playSound( position, (String) arguments.get( "sound" ), pitch, volume );
        return output.success( "Played sound '%%s' to %%s", (String) arguments.get( "sound" ), target.getName() );
    }

}