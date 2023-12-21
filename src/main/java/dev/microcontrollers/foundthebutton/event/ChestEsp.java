package dev.microcontrollers.foundthebutton.event;

import dev.microcontrollers.foundthebutton.config.Config;
import dev.microcontrollers.foundthebutton.util.BoxUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.util.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Most of this code is taking from Hytils which is taken from NotEnoughUpdates
 * https://github.com/Polyfrost/Hytils-Reborn/blob/master/LICENSE
 * https://github.com/Moulberry/NotEnoughUpdates/blob/master/LICENSE
 */
public class ChestEsp {
    @SubscribeEvent
    public void onRender(RenderWorldLastEvent event) {
        if (!Config.enableChests && !Config.enableEnderChests) return;
        for (TileEntity entity : Minecraft.getMinecraft().theWorld.loadedTileEntityList) {
            if (entity instanceof TileEntityChest && Config.enableChests) {
                BlockPos pos = entity.getPos();
                BoxUtil.drawBoundingBox(event, pos.getX(), pos.getY(), pos.getZ(), 0, 0, 0, Config.chestColor);
            } else if (entity instanceof TileEntityEnderChest && Config.enableEnderChests) {
                BlockPos pos = entity.getPos();
                BoxUtil.drawBoundingBox(event, pos.getX(), pos.getY(), pos.getZ(), 0, 0, 0, Config.enderChestColor);
            }
        }
    }
}
