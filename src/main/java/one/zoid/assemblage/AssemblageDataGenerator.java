package one.zoid.assemblage;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import one.zoid.assemblage.datagen.ModItemTagProvider;
import one.zoid.assemblage.datagen.ModModelProvider;
import one.zoid.assemblage.datagen.ModRecipeProvider;

public class AssemblageDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModModelProvider::new);
    }
}
