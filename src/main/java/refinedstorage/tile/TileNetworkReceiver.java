package refinedstorage.tile;

import refinedstorage.RefinedStorage;
import refinedstorage.tile.config.RedstoneMode;

public class TileNetworkReceiver extends TileNode {
    @Override
    public void updateNode() {
    }

    @Override
    public int getEnergyUsage() {
        return RefinedStorage.INSTANCE.config.networkReceiverUsage;
    }

    @Override
    public void setRedstoneMode(RedstoneMode mode) {
        // NO OP
    }

    @Override
    public boolean hasConnectivityState() {
        return true;
    }
}
