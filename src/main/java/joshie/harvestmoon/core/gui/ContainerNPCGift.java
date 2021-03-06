package joshie.harvestmoon.core.gui;

import static joshie.harvestmoon.core.helpers.RelationsHelper.getRelationshipValue;

import java.util.HashSet;

import joshie.harvestmoon.api.core.IDate;
import joshie.harvestmoon.api.npc.INPC;
import joshie.harvestmoon.api.quest.IQuest;
import joshie.harvestmoon.core.helpers.CalendarHelper;
import joshie.harvestmoon.core.helpers.QuestHelper;
import joshie.harvestmoon.core.helpers.RelationsHelper;
import joshie.harvestmoon.core.helpers.ToolHelper;
import joshie.harvestmoon.npc.EntityNPC;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;

public class ContainerNPCGift extends ContainerBase {
    //The Fridge CAN be null
    private EntityNPC npc;

    public ContainerNPCGift(EntityNPC npc, InventoryPlayer playerInventory) {
        this.npc = npc;
    }

    @Override
    public void onContainerClosed(EntityPlayer player) {
        super.onContainerClosed(player);
        npc.setTalking((EntityPlayer) null);
        HashSet<IQuest> quests = QuestHelper.getCurrentQuest(player);
        for (IQuest quest : quests) {
            if (quest != null) {
                quest.onClosedChat(player, npc);
            }
        }

        if (!player.worldObj.isRemote) {
            ItemStack gift = player.getCurrentEquippedItem();
            INPC theNpc = npc.getNPC();
            int points = theNpc.getGiftValue(gift).getRelationPoints();
            IDate today = CalendarHelper.getServerDate();
            IDate birthday = theNpc.getBirthday();
            if (today.getSeason() == birthday.getSeason() && today.getDay() == birthday.getDay()) {
                points *= 5;
            }

            if (ToolHelper.isBlueFeather(gift)) {
                int relationship = getRelationshipValue(npc, player);
                if (relationship >= joshie.harvestmoon.core.config.NPC.MARRIAGE_REQUIREMENT) {
                    RelationsHelper.setMarried(npc, player);
                }
            }

            RelationsHelper.setGifted(player, npc.getNPC(), points);
            player.inventory.decrStackSize(player.inventory.currentItem, 1);
        }
    }
}
