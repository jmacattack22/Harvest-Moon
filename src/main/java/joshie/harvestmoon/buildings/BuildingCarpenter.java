package joshie.harvestmoon.buildings;

import java.util.ArrayList;

import joshie.harvestmoon.blocks.BlockWood;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableBlock;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableButton;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableDoor;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableFlowerPot;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableIFaceable;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableLadder;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableLog;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableStairs;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableTorches;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableTrapDoor;
import joshie.harvestmoon.buildings.placeable.entities.PlaceableItemFrame;
import joshie.harvestmoon.buildings.placeable.entities.PlaceableNPC;
import joshie.harvestmoon.buildings.placeable.entities.PlaceablePainting;
import joshie.harvestmoon.core.lib.LootStrings;
import joshie.harvestmoon.init.HMBlocks;
import joshie.harvestmoon.player.Town;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;

public class BuildingCarpenter extends Building {
    public BuildingCarpenter() {
        super("carpenter");
        offsetY = - 1;
        offsetY = -1;
        list = new ArrayList(373);
        list.add(new PlaceableBlock(Blocks.planks, 5, 0, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 5, 0, 0, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 1, 0, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 1, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 1, 1, 0, 2));
        list.add(new PlaceableBlock(Blocks.planks, 1, 1, 0, 3));
        list.add(new PlaceableBlock(Blocks.planks, 1, 1, 0, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 1, 0, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 1, 0, 6));
        list.add(new PlaceableBlock(Blocks.planks, 1, 2, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 2, 0, 2));
        list.add(new PlaceableBlock(Blocks.planks, 3, 2, 0, 3));
        list.add(new PlaceableBlock(Blocks.planks, 3, 2, 0, 4));
        list.add(new PlaceableBlock(Blocks.planks, 1, 2, 0, 5));
        list.add(new PlaceableBlock(Blocks.planks, 1, 3, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 3, 0, 2));
        list.add(new PlaceableBlock(Blocks.planks, 1, 3, 0, 3));
        list.add(new PlaceableBlock(Blocks.planks, 3, 3, 0, 4));
        list.add(new PlaceableBlock(Blocks.planks, 1, 3, 0, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 0, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 4, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 4, 0, 2));
        list.add(new PlaceableBlock(Blocks.planks, 1, 4, 0, 3));
        list.add(new PlaceableBlock(Blocks.planks, 1, 4, 0, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 4, 0, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 0, 6));
        list.add(new PlaceableBlock(Blocks.planks, 1, 5, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 5, 0, 2));
        list.add(new PlaceableBlock(Blocks.planks, 1, 5, 0, 3));
        list.add(new PlaceableBlock(Blocks.planks, 3, 5, 0, 4));
        list.add(new PlaceableBlock(Blocks.planks, 1, 5, 0, 5));
        list.add(new PlaceableBlock(Blocks.planks, 1, 6, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 6, 0, 2));
        list.add(new PlaceableBlock(Blocks.planks, 3, 6, 0, 3));
        list.add(new PlaceableBlock(Blocks.planks, 3, 6, 0, 4));
        list.add(new PlaceableBlock(Blocks.planks, 1, 6, 0, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 7, 0, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 7, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 1, 7, 0, 2));
        list.add(new PlaceableBlock(Blocks.planks, 1, 7, 0, 3));
        list.add(new PlaceableBlock(Blocks.planks, 1, 7, 0, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 7, 0, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 7, 0, 6));
        list.add(new PlaceableBlock(Blocks.planks, 5, 8, 0, 1));
        list.add(new PlaceableBlock(Blocks.planks, 5, 8, 0, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 0, 0, 1, 1));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 14, 0, 1, 2));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 14, 0, 1, 3));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 14, 0, 1, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 0, 0, 1, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 1, 1, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 1, 1, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 1, 1, 2));
        list.add(new PlaceableBlock(Blocks.planks, 3, 1, 1, 3));
        list.add(new PlaceableBlock(Blocks.planks, 3, 1, 1, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 1, 1, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 1, 1, 6));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 12, 2, 1, 0));
        list.add(new PlaceableBlock(Blocks.planks, 3, 2, 1, 1));
        list.add(new PlaceableBlock(Blocks.fence, 0, 2, 1, 2));
        list.add(new PlaceableLadder(Blocks.ladder, 5, 2, 1, 3));
        list.add(new PlaceableBlock(Blocks.fence, 0, 2, 1, 4));
        list.add(new PlaceableBlock(Blocks.planks, 3, 2, 1, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 13, 2, 1, 6));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 12, 3, 1, 0));
        list.add(new PlaceableBlock(Blocks.planks, 3, 3, 1, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 1, 3, 1, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 1, 3));
        list.add(new PlaceableItemFrame(null, 0, 0, 3, 1, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 5, 3, 1, 4));
        list.add(new PlaceableBlock(Blocks.planks, 3, 3, 1, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 13, 3, 1, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 4, 1, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 4, 1, 1));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 9, 4, 1, 2));
        npc_offsets.put(Town.CARPENTER_DOWNSTAIRS, new PlaceableNPC("", 4, 1, 3));
        list.add(new PlaceableBlock(Blocks.crafting_table, 0, 4, 1, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 4, 1, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 4, 1, 6));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 12, 5, 1, 0));
        list.add(new PlaceableBlock(Blocks.planks, 3, 5, 1, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 0, 5, 1, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 1, 3));
        list.add(new PlaceableItemFrame(null, 0, 0, 5, 1, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 4, 5, 1, 4));
        list.add(new PlaceableBlock(Blocks.planks, 3, 5, 1, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 13, 5, 1, 6));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 12, 6, 1, 0));
        list.add(new PlaceableBlock(Blocks.planks, 3, 6, 1, 1));
        list.add(new PlaceableBlock(Blocks.fence, 0, 6, 1, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 6, 1, 3));
        list.add(new PlaceableBlock(Blocks.fence, 0, 6, 1, 4));
        list.add(new PlaceableBlock(Blocks.planks, 3, 6, 1, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 13, 6, 1, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 7, 1, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 7, 1, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 7, 1, 2));
        list.add(new PlaceableDoor(Blocks.wooden_door, 0, 7, 1, 3));
        list.add(new PlaceableBlock(Blocks.planks, 3, 7, 1, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 7, 1, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 7, 1, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 1, 8, 1, 1));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 15, 8, 1, 2));
        npc_offsets.put(Town.CARPENTER_DOOR, new PlaceableNPC("", 8, 1, 3));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 15, 8, 1, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 1, 8, 1, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 0, 2, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 0, 2, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 1, 2, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 1, 2, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 0, 1, 2, 2));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 0, 1, 2, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 0, 1, 2, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 1, 2, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 1, 2, 6));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 2, 2, 1));
        list.add(new PlaceableBlock(Blocks.fence, 0, 2, 2, 2));
        list.add(new PlaceableLadder(Blocks.ladder, 5, 2, 2, 3));
        list.add(new PlaceableBlock(Blocks.fence, 0, 2, 2, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 2, 2, 5));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 3, 2, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 3, 2, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 2, 3));
        list.add(new PlaceableFlowerPot(Blocks.flower_pot, 5, 3, 2, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 3, 2, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 4, 2, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 4, 2, 1));
        list.add(new PlaceableTorches(Blocks.torch, 3, 4, 2, 2));
        list.add(new PlaceableItemFrame(new ItemStack(Blocks.trapdoor, 1, 0), 0, 0, 4, 2, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 2, 3));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 2, 4));
        list.add(new PlaceableItemFrame(new ItemStack(Items.stone_axe, 1, 0), 0, 2, 4, 2, 4, LootStrings.CARPENTER_FRAME));
        list.add(new PlaceableLog(Blocks.log, 1, 4, 2, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 4, 2, 6));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 5, 2, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 5, 2, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 2, 3));
        list.add(new PlaceableTorches(Blocks.lever, 13, 5, 2, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 5, 2, 5));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 6, 2, 1));
        list.add(new PlaceableBlock(Blocks.fence, 0, 6, 2, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 6, 2, 3));
        list.add(new PlaceableBlock(Blocks.fence, 0, 6, 2, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 6, 2, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 7, 2, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 7, 2, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 1, 7, 2, 2));
        list.add(new PlaceableDoor(Blocks.wooden_door, 8, 7, 2, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 1, 7, 2, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 7, 2, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 7, 2, 6));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 8, 2, 1));
        list.add(new PlaceableBlock(Blocks.air, 0, 8, 2, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 8, 2, 3));
        list.add(new PlaceableBlock(Blocks.air, 0, 8, 2, 4));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 8, 2, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 4, 0, 3, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 0, 3, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 4, 0, 3, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 6, 1, 3, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 1, 3, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 4, 1, 3, 2));
        list.add(new PlaceableLog(Blocks.log, 9, 1, 3, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 4, 1, 3, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 1, 3, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 7, 1, 3, 6));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 2, 3, 0));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 2, 3, 1));
        list.add(new PlaceableBlock(Blocks.planks, 1, 2, 3, 2));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 2, 2, 3, 3));
        list.add(new PlaceableBlock(Blocks.planks, 1, 2, 3, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 2, 3, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 2, 3, 6));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 3, 3, 0));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 3, 3, 1));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 3, 3, 2));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 3, 3, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 3, 3, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 3, 3, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 3, 3, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 6, 4, 3, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 4, 3, 1));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 4, 3, 2));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 4, 3, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 4, 3, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 4, 3, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 7, 4, 3, 6));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 5, 3, 0));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 5, 3, 1));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 5, 3, 2));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 5, 3, 3));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 5, 3, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 5, 3, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 5, 3, 6));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 6, 3, 0));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 6, 3, 1));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 6, 3, 2));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 6, 3, 3));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 6, 3, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 6, 3, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 6, 3, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 6, 7, 3, 0));
        list.add(new PlaceableLog(Blocks.log, 1, 7, 3, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 5, 7, 3, 2));
        list.add(new PlaceableLog(Blocks.log, 9, 7, 3, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 5, 7, 3, 4));
        list.add(new PlaceableLog(Blocks.log, 1, 7, 3, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 7, 7, 3, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 5, 8, 3, 1));
        list.add(new PlaceableBlock(Blocks.air, 0, 8, 3, 2));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 8, 3, 3));
        list.add(new PlaceableBlock(Blocks.air, 0, 8, 3, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 5, 8, 3, 5));
        list.add(new PlaceableBlock(Blocks.fence, 0, 0, 4, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 0, 4, 2));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 0, 4, 4));
        list.add(new PlaceableBlock(Blocks.fence, 0, 0, 4, 5));
        list.add(new PlaceableBlock(Blocks.fence, 0, 1, 4, 0));
        list.add(new PlaceableBlock(Blocks.planks, 3, 1, 4, 1));
        list.add(new PlaceableLog(Blocks.log, 9, 1, 4, 2));
        list.add(new PlaceableBlock(Blocks.fence, 0, 1, 4, 3));
        list.add(new PlaceableLog(Blocks.log, 9, 1, 4, 4));
        list.add(new PlaceableBlock(Blocks.planks, 3, 1, 4, 5));
        list.add(new PlaceableBlock(Blocks.fence, 0, 1, 4, 6));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 12, 2, 4, 0));
        list.add(new PlaceableLog(Blocks.log, 5, 2, 4, 1));
        list.add(new PlaceableIFaceable(HMBlocks.woodmachines, BlockWood.RURAL_CHEST, 2, 4, 2, ForgeDirection.EAST, LootStrings.JADE_CHEST));
        list.add(new PlaceableBlock(Blocks.air, 0, 2, 4, 3));
        list.add(new PlaceableIFaceable(HMBlocks.woodmachines, BlockWood.RURAL_CHEST, 2, 4, 4, ForgeDirection.EAST, LootStrings.YULIF_CHEST));
        list.add(new PlaceableLog(Blocks.log, 5, 2, 4, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 13, 2, 4, 6));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 12, 3, 4, 0));
        list.add(new PlaceableLog(Blocks.log, 5, 3, 4, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 3, 4, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 4, 3));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 3, 4, 4));
        list.add(new PlaceableLog(Blocks.log, 5, 3, 4, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 13, 3, 4, 6));
        list.add(new PlaceableBlock(Blocks.fence, 0, 4, 4, 0));
        list.add(new PlaceableBlock(Blocks.planks, 3, 4, 4, 1));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 5, 4, 4, 2));
        list.add(new PlaceableNPC("jade", 4, 4, 3));
        npc_offsets.put(Town.JADE, new PlaceableNPC("", 4, 4, 3));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 4, 4, 4, 4));
        list.add(new PlaceableBlock(Blocks.planks, 3, 4, 4, 5));
        list.add(new PlaceableBlock(Blocks.fence, 0, 4, 4, 6));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 12, 5, 4, 0));
        list.add(new PlaceableLog(Blocks.log, 5, 5, 4, 1));
        list.add(new PlaceableBlock(Blocks.carpet, 5, 5, 4, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 4, 3));
        list.add(new PlaceableBlock(Blocks.carpet, 4, 5, 4, 4));
        list.add(new PlaceableLog(Blocks.log, 5, 5, 4, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 13, 5, 4, 6));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 4, 6, 4, 0));
        list.add(new PlaceableLog(Blocks.log, 5, 6, 4, 1));
        list.add(new PlaceableBlock(Blocks.carpet, 0, 6, 4, 2));
        list.add(new PlaceableFlowerPot(Blocks.flower_pot, 5, 6, 4, 3));
        list.add(new PlaceableBlock(Blocks.carpet, 0, 6, 4, 4));
        list.add(new PlaceableLog(Blocks.log, 5, 6, 4, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 13, 6, 4, 6));
        list.add(new PlaceableBlock(Blocks.fence, 0, 7, 4, 0));
        list.add(new PlaceableBlock(Blocks.planks, 3, 7, 4, 1));
        list.add(new PlaceableLog(Blocks.log, 9, 7, 4, 2));
        list.add(new PlaceableBlock(Blocks.fence, 0, 7, 4, 3));
        list.add(new PlaceableLog(Blocks.log, 9, 7, 4, 4));
        list.add(new PlaceableBlock(Blocks.planks, 5, 7, 4, 5));
        list.add(new PlaceableBlock(Blocks.fence, 0, 7, 4, 6));
        list.add(new PlaceableBlock(Blocks.fence, 0, 8, 4, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 8, 4, 2));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 8, 4, 4));
        list.add(new PlaceableBlock(Blocks.fence, 0, 8, 4, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 0, 5, 1));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 7, 0, 5, 2));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 0, 5, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 6, 0, 5, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 0, 5, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 1, 5, 0));
        list.add(new PlaceableBlock(Blocks.planks, 5, 1, 5, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 1, 5, 2));
        list.add(new PlaceableLog(Blocks.log, 9, 1, 5, 3));
        list.add(new PlaceableBlock(Blocks.planks, 3, 1, 5, 4));
        list.add(new PlaceableBlock(Blocks.planks, 5, 1, 5, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 1, 5, 6));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 2, 5, 0));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 2, 5, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 2, 5, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 2, 5, 3));
        list.add(new PlaceablePainting("Wasteland", 3, 2, 5, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 2, 5, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 2, 5, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 2, 5, 6));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 3, 5, 0));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 3, 5, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 3, 5, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 5, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 3, 5, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 3, 5, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 3, 5, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 4, 5, 0));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 5, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 4, 5, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 5, 3));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 4, 5, 4));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 5, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 4, 5, 6));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 5, 5, 0));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 5, 5, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 5, 5, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 5, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 5, 5, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 5, 5, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 5, 5, 6));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 6, 5, 0));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 6, 5, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 6, 5, 2));
        list.add(new PlaceableTorches(Blocks.torch, 2, 6, 5, 3));
        list.add(new PlaceableItemFrame(new ItemStack(Blocks.trapdoor, 1, 0), 0, 1, 6, 5, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 6, 5, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 6, 5, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 6, 5, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 7, 5, 0));
        list.add(new PlaceableBlock(Blocks.planks, 5, 7, 5, 1));
        list.add(new PlaceableBlock(Blocks.planks, 3, 7, 5, 2));
        list.add(new PlaceableLog(Blocks.log, 9, 7, 5, 3));
        list.add(new PlaceableBlock(Blocks.planks, 3, 7, 5, 4));
        list.add(new PlaceableBlock(Blocks.planks, 5, 7, 5, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 7, 5, 6));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 8, 5, 1));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 7, 8, 5, 2));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 8, 5, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 6, 8, 5, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 8, 5, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 0, 6, 2));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 5, 0, 6, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 0, 6, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 1, 6, 1));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 7, 1, 6, 2));
        list.add(new PlaceableBlock(Blocks.planks, 3, 1, 6, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 6, 1, 6, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 1, 6, 5));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 2, 6, 2));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 2, 6, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 2, 6, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 3, 6, 2));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 3, 6, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 3, 6, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 4, 6, 1));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 7, 4, 6, 2));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 4, 6, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 6, 4, 6, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 4, 6, 5));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 5, 6, 2));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 5, 6, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 5, 6, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 2, 6, 6, 2));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 6, 6, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 3, 6, 6, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 7, 6, 1));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 7, 7, 6, 2));
        list.add(new PlaceableBlock(Blocks.planks, 3, 7, 6, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 6, 7, 6, 4));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 7, 6, 5));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 8, 6, 2));
        list.add(new PlaceableBlock(Blocks.planks, 5, 8, 6, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 8, 6, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 0, 7, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 1, 7, 2));
        list.add(new PlaceableBlock(Blocks.planks, 5, 1, 7, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 1, 7, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 2, 7, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 3, 7, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 4, 7, 2));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 7, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 4, 7, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 5, 7, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 1, 6, 7, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 2, 7, 7, 2));
        list.add(new PlaceableBlock(Blocks.planks, 5, 7, 7, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 3, 7, 7, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 8, 7, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 1, 1, 8, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 4, 8, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 0, 7, 8, 3));
    }
}
