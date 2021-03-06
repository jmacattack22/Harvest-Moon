package joshie.harvestmoon.core.gui;

import joshie.harvestmoon.player.FridgeContents;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;

public class GuiFridge extends GuiBase {
    private final FridgeContents fridge;

    public GuiFridge(IInventory playerInv, FridgeContents fridge) {
        super(new ContainerFridge(playerInv, fridge), "fridge", 0);
        this.fridge = fridge;
    }
}
