package fuzs.azaleagrowthcontrol;

import fuzs.azaleagrowthcontrol.init.ModRegistry;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AzaleaGrowthControl implements ModConstructor {
    public static final String MOD_ID = "azaleagrowthcontrol";
    public static final String MOD_NAME = "Azalea Growth Control";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onConstructMod() {
        ModRegistry.bootstrap();
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
