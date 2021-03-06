package joshie.harvestmoon.core.helpers.generic;

import java.util.List;
import java.util.UUID;

import joshie.harvestmoon.core.helpers.UUIDHelper;
import joshie.harvestmoon.npc.EntityNPCBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.FakePlayer;
import cpw.mods.fml.common.FMLCommonHandler;

public class EntityHelper {
    //Loops through all the animals in the specified dimension id
    public static EntityAnimal getAnimalFromUUID(int dimension, UUID uuid) {
        World world = MCServerHelper.getWorld(dimension);
        for (int i = 0; i < world.loadedEntityList.size(); i++) {
            Entity entity = (Entity) world.loadedEntityList.get(i);
            if (entity instanceof EntityAnimal) {
                if (UUIDHelper.getEntityUUID(entity).equals(uuid)) {
                    return (EntityAnimal) entity;
                }
            }
        }
    
        return null;
    }
    
    public static EntityNPCBuilder getBuilderFromUUID(int dimension, UUID uuid) {
        World world = MCServerHelper.getWorld(dimension);
        for (int i = 0; i < world.loadedEntityList.size(); i++) {
            Entity entity = (Entity) world.loadedEntityList.get(i);
            if (entity instanceof EntityNPCBuilder) {
                if (UUIDHelper.getEntityUUID(entity).equals(uuid)) {
                    return (EntityNPCBuilder) entity;
                }
            }
        }
    
        return null;
    }

    //Returns the entity id from it's uuid
    public static int getEntityIDFromUUID(UUID uuid) {
        for (WorldServer world : DimensionManager.getWorlds()) {
            for (int i = 0; i < world.loadedEntityList.size(); i++) {
                Entity entity = (Entity) world.loadedEntityList.get(i);
                if (entity instanceof EntityLivingBase) {
                    if (UUIDHelper.getEntityUUID(entity).equals(uuid)) {
                        return entity.getEntityId();
                    }
                }
            }
        }
    
        return 0;
    }

    /** Gets the player from the uuid **/
    public static EntityPlayerMP getPlayerFromUUID(UUID uuid) {        
        //Loops through every single player
        for (EntityPlayer player : (List<EntityPlayer>) FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().playerEntityList) {
            if (UUIDHelper.getPlayerUUID(player).equals(uuid)) {
                return (EntityPlayerMP) player;
            }
        }
    
        return null;
    }
    
    public static boolean isFakePlayer(EntityPlayer player) {
        return player instanceof FakePlayer || player.getCommandSenderName().equals("CoFH") || player.getCommandSenderName().startsWith("[Thaumcraft");
    }
}
