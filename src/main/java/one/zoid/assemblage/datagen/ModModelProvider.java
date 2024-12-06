package one.zoid.assemblage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import one.zoid.assemblage.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // entirely unused
        // why must i override it
        // 😢
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PHANTOM_FABRIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNFINISHED_ELYTRA, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_TURTLE_SHELL, Models.GENERATED);
    }

}
