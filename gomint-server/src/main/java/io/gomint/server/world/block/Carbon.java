package io.gomint.server.world.block;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.world.block.BlockCarbon;
import io.gomint.world.block.BlockType;

/**
 * @author Kaooot
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:element_6" )
public class Carbon extends BlockElement implements BlockCarbon {

    @Override
    public String getBlockId() {
        return "minecraft:element_6";
    }

    @Override
    public long getBreakTime() {
        return 0;
    }

    @Override
    public float getBlastResistance() {
        return 0;
    }

    @Override
    public BlockType getType() {
        return BlockType.CARBON;
    }

    @Override
    public boolean canBeBrokenWithHand() {
        return true;
    }

    @Override
    public int getProtons() {
        return 6;
    }

    @Override
    public int getElectrons() {
        return 6;
    }

    @Override
    public int getNeutrons() {
        return 5;
    }

    @Override
    public int getAtomicWeight() {
        return 12;
    }

    @Override
    public String getName() {
        return "Carbon";
    }
}