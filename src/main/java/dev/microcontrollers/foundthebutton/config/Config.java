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
            subcategory = "Skulls"
    )
    public static boolean enableSkulls = true;

    @Color(
            name = "Skull Box Color",
            subcategory = "Skulls"
    )
    public static OneColor skullColor = new OneColor(26, 35, 143, 50);

    @Switch(
            name = "Only Highlight Special Skulls",
            description = "This is meant for Hypixel's Grinch Simulator. May work on other gamemodes.",
            subcategory = "Skulls"
    )
    public static boolean specialSkulls = true;

    @Switch(
            name = "Enable Chests",
            subcategory = "Chests"
    )
    public static boolean enableChests = true;

    @Color(
            name = "Chest Box Color",
            subcategory = "Chests"
    )
    public static OneColor chestColor = new OneColor(26, 35, 143, 50);

    @Switch(
            name = "Enable Ender Chests",
            subcategory = "Chests"
    )
    public static boolean enableEnderChests = true;

    @Color(
            name = "Ender Chest Box Color",
            subcategory = "Chests"
    )
    public static OneColor enderChestColor = new OneColor(26, 35, 143, 50);

    @Switch(
            name = "Enable Players",
            subcategory = "Players"
    )
    public static boolean enablePlayers = true;

    @Color(
            name = "Player Box Color",
            subcategory = "Players"
    )
    public static OneColor playerColor = new OneColor(26, 35, 143, 50);

    public Config() {
        super(new Mod(FoundTheButton.NAME, ModType.UTIL_QOL), FoundTheButton.MODID + ".json");
        initialize();
    }
}

