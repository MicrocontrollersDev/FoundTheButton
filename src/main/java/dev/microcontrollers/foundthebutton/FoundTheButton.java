package dev.microcontrollers.foundthebutton;

import dev.microcontrollers.foundthebutton.event.ChestEsp;
import dev.microcontrollers.foundthebutton.event.PlayerEsp;
import dev.microcontrollers.foundthebutton.event.SkullEsp;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import dev.microcontrollers.foundthebutton.config.Config;

@Mod(modid = FoundTheButton.MODID, name = FoundTheButton.NAME, version = FoundTheButton.VERSION)
public class FoundTheButton {
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    @Mod.Instance(MODID)
    public static FoundTheButton INSTANCE;
    public static Config config;

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new Config();
        MinecraftForge.EVENT_BUS.register(new ChestEsp());
        MinecraftForge.EVENT_BUS.register(new SkullEsp());
        MinecraftForge.EVENT_BUS.register(new PlayerEsp());
    }
}
