package tombenpotter.emt.common.modules.base.tile;

import cpw.mods.fml.common.registry.GameRegistry;

public class BaseTileRegistry {

    public static void registerBaseTiles() {
        GameRegistry.registerTileEntity(TileEntityPortableNode.class, "tileentityportablenode");
    }
}
