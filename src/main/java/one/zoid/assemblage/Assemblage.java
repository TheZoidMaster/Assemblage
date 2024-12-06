package one.zoid.assemblage;

import net.fabricmc.api.ModInitializer;
import one.zoid.assemblage.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assemblage implements ModInitializer {
    public static final String MOD_ID = "assemblage";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("https://youtu.be/dQNN4Lvmja8?t=3");

        ModItems.registerModItems();
    }
}