package dev.microcontrollers.foundthebutton.event;

import dev.microcontrollers.foundthebutton.config.Config;
import dev.microcontrollers.foundthebutton.util.BoxUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Most of this code is taking from Hytils which is taken from NotEnoughUpdates
 * https://github.com/Polyfrost/Hytils-Reborn/blob/master/LICENSE
 * https://github.com/Moulberry/NotEnoughUpdates/blob/master/LICENSE
 */
public class PlayerEsp {
    @SubscribeEvent
    public void onRender(RenderWorldLastEvent event) {
        if (!Config.enablePlayers) return;
        for (Entity entity : Minecraft.getMinecraft().theWorld.loadedEntityList) {
            if (entity instanceof EntityOtherPlayerMP) {
                BoxUtil.drawBoundingBox(event, entity.posX - 0.5, entity.posY + 0.5, entity.posZ - 0.5, 0, 0.5, 0, Config.playerColor);
            }
        }
    }
}
