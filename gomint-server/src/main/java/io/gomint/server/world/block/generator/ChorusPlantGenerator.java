package io.gomint.server.world.block.generator;

import io.gomint.server.world.block.ChorusPlant;
import io.gomint.taglib.NBTTagCompound;
import io.gomint.server.world.WorldAdapter;
import io.gomint.math.Location;
import io.gomint.server.entity.tileentity.TileEntity;

/**
 * @author geNAZt
 * @version 1.0
 */
public class ChorusPlantGenerator implements BlockGenerator {

   @Override
   public ChorusPlant generate( byte blockData, byte skyLightLevel, byte blockLightLevel, TileEntity tileEntity, Location location ) {
       ChorusPlant block = generate();
       block.setData( blockData, tileEntity, (WorldAdapter) location.getWorld(), location, skyLightLevel, blockLightLevel );
       return block;
   }

   @Override
   public ChorusPlant generate() {
       return new ChorusPlant();
   }

}
