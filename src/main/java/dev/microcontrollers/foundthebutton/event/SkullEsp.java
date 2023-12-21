package dev.microcontrollers.foundthebutton.event;

import cc.polyfrost.oneconfig.utils.hypixel.HypixelUtils;
import cc.polyfrost.oneconfig.utils.hypixel.LocrawUtil;
import dev.microcontrollers.foundthebutton.config.Config;
import dev.microcontrollers.foundthebutton.util.BoxUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Most of this code is taking from Hytils which is taken from NotEnoughUpdates
 * https://github.com/Polyfrost/Hytils-Reborn/blob/master/LICENSE
 * https://github.com/Moulberry/NotEnoughUpdates/blob/master/LICENSE
 */
public class SkullEsp {
    @SubscribeEvent
    public void onRender(RenderWorldLastEvent event) {
        if (!Config.enableSkulls) return;
        for (TileEntity entity : Minecraft.getMinecraft().theWorld.loadedTileEntityList) {
            if (entity instanceof TileEntitySkull) {
                if (!Config.specialSkulls) {
                    BlockPos pos = entity.getPos();
                    BoxUtil.drawBoundingBox(event, pos.getX(), pos.getY(), pos.getZ(), 0, 0, 0, Config.skullColor);
                } else {
                    TileEntitySkull e = (TileEntitySkull) entity;
                    if (Config.specialSkulls && e.getPlayerProfile() != null && e.getPlayerProfile().getName() != null && e.getPlayerProfile().getName().equals("§item")) {
                        BlockPos pos = entity.getPos();
                        BoxUtil.drawBoundingBox(event, pos.getX(), pos.getY(), pos.getZ(), 0, 0, 0, Config.skullColor);
                    } if ((HypixelUtils.INSTANCE.isHypixel() && !LocrawUtil.INSTANCE.isInGame() && (e.getPlayerProfile() == null || (e.getPlayerProfile().getName() != null && e.getPlayerProfile() != null)))) {
                        BlockPos pos = entity.getPos();
                        BoxUtil.drawBoundingBox(event, pos.getX(), pos.getY(), pos.getZ(), 0, 0, 0, Config.skullColor);
                    }
                }
            }
        }
    }

}
