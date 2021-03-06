package joshie.harvestmoon.api.crops;

import io.netty.buffer.ByteBuf;
import joshie.harvestmoon.api.WorldLocation;
import joshie.harvestmoon.api.crops.ICropRenderHandler.PlantSection;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public interface ICropData {    
    /** Returns the crop itself **/
    public ICrop getCrop();
    
    /** Sets this contents of this crop data 
     * @param stage **/
    public ICropData setCrop(EntityPlayer player, ICrop crop, int quality, int stage);
    
    /** The WorldLocation of this crop in the world **/
    public WorldLocation getLocation();
    
    /** Returns the stage this crop is at **/
    public int getStage();

    /** Returns the quality of this crop **/
    public int getQuality();
    
    /** Whether or not this crop is allowed to grow **/
    public boolean canGrow();

    /** Causes the crop to grow one stage **/
    public void grow();

    /** Wipes out the data for this crop **/
    public void clear();

    /** Sets this crop as having been hydrated for the day **/
    public void setHydrated();

    /** Causes this crop to perform it's new day action
     * @return true if the crop survived without withering, false if it is withered */
    public boolean newDay();
    
    /** Returns the icon for the crop
     *  @param      whether it's the top half or bottom half of the crop **/
    @SideOnly(Side.CLIENT)
    public IIcon getCropIcon(PlantSection section);

    /** Returns the ItemStack that would be harvested
     *  @param          The player harvesting
     *  @param          Whether we should actually harvest the plant **/
    public ItemStack harvest(EntityPlayer player, boolean doHarvest);
    
    /** Writes the crop data to nbt **/
    public void readFromNBT(NBTTagCompound tag);

    /** Writes the crop data to nbt **/
    public void writeToNBT(NBTTagCompound tag);

    /** Reads the crop data from the buffer **/
    public void fromBytes(ByteBuf buf);

    /** Writes the crop data to the buffer **/
    public void toBytes(ByteBuf buf);
}
