package fuzs.azaleagrowthcontrol.neoforge;

import fuzs.azaleagrowthcontrol.common.AzaleaGrowthControl;
import fuzs.azaleagrowthcontrol.common.data.tags.ModBiomeTagsProvider;
import fuzs.azaleagrowthcontrol.common.init.ModRegistry;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.neoforged.fml.common.Mod;

@Mod(AzaleaGrowthControl.MOD_ID)
public class AzaleaGrowthControlNeoForge {

    public AzaleaGrowthControlNeoForge() {
        ModConstructor.construct(AzaleaGrowthControl.MOD_ID, AzaleaGrowthControl::new);
        DataProviderHelper.registerDataProviders(AzaleaGrowthControl.MOD_ID,
                ModRegistry.REGISTRY_SET_BUILDER,
                ModBiomeTagsProvider::new);
    }
}
