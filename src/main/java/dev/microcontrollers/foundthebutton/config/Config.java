package dev.microcontrollers.foundthebutton.config;

import cc.polyfrost.oneconfig.config.annotations.Color;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.core.OneColor;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import dev.microcontrollers.foundthebutton.FoundTheButton;

public class Config extends cc.polyfrost.oneconfig.config.Config {
    @Switch(
            name = "Enable Skulls",
            description = "This is meant for Hypixel's Grinch Simulator. May work on other gamemodes."
    )
    public static boolean enableSkulls = true;

    @Color(
            name = "Skull Box Color"
    )
    public static OneColor skullColor = new OneColor(26, 35, 143);

    public Config() {
        super(new Mod(FoundTheButton.NAME, ModType.UTIL_QOL), FoundTheButton.MODID + ".json");
        initialize();
    }
}

