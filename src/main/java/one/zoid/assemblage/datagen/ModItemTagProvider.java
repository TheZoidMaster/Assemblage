package one.zoid.assemblage.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> lookup) {
        super(output, lookup);
    }

    @Override
    protected void configure(WrapperLookup wrapperLookup) {
    }
}
