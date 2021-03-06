package joshie.harvestmoon.blocks.tiles;

import joshie.harvestmoon.api.WorldLocation;
import joshie.harvestmoon.buildings.Building;
import joshie.harvestmoon.core.network.PacketHandler;
import joshie.harvestmoon.core.network.PacketSyncMarker;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.network.simpleimpl.IMessage;

public class TileMarker extends TileEntity {
    private Building group;

    @Override
    public boolean canUpdate() {
        return false;
    }

    public void setBuilding(Building group) {
        this.group = group;
        this.markDirty();
    }
    
    public Building getBuilding() {
        return group;
    }
    
    public IMessage getPacket() {
        return new PacketSyncMarker(new WorldLocation(worldObj.provider.dimensionId, xCoord, yCoord, zCoord), group);
    }

    @Override
    public Packet getDescriptionPacket() {
        return PacketHandler.getPacket(getPacket());
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        group = Building.getGroup(nbt.getString("Group"));
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setString("Group", group.getName());
    }
}
