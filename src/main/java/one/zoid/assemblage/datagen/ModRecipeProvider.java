package one.zoid.assemblage.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import one.zoid.assemblage.item.ModItems;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> lookup) {
        super(output, lookup);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Elytra Recipe Chain //
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PHANTOM_FABRIC)
                .pattern("PPP")
                .pattern("PSP")
                .pattern("PPP")
                .input('P', Items.PHANTOM_MEMBRANE)
                .input('S', Items.STRING)
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.UNFINISHED_ELYTRA)
                .pattern("PDP")
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.PHANTOM_FABRIC)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(ModItems.PHANTOM_FABRIC), conditionsFromItem(ModItems.PHANTOM_FABRIC))
                .offerTo(exporter);
        offerNetheriteUpgradeRecipe(exporter, ModItems.UNFINISHED_ELYTRA, RecipeCategory.TRANSPORTATION, Items.ELYTRA);

        // Shulker Shell Recipe Chain //
        offerSmelting(exporter, List.of(Items.TURTLE_HELMET), RecipeCategory.MISC, ModItems.DRIED_TURTLE_SHELL, 0.1f,
                600, "");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SHULKER_SHELL)
                .input(ModItems.DRIED_TURTLE_SHELL)
                .input(Items.PURPLE_DYE)
                .criterion(hasItem(ModItems.DRIED_TURTLE_SHELL), conditionsFromItem(ModItems.DRIED_TURTLE_SHELL))
                .offerTo(exporter);

        // End Stone Recipe //
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.END_STONE, 16)
                .pattern("NNN")
                .pattern("NEN")
                .pattern("NNN")
                .input('N', Items.NETHERRACK)
                .input('E', Items.ENDER_PEARL)
                .criterion(hasItem(Items.NETHERRACK), conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter);

        // Chorus Fruit Recipe //
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CHORUS_FRUIT, 8)
                .pattern("EPE")
                .pattern("PFP")
                .pattern("EPE")
                .input('P', Items.ENDER_PEARL)
                .input('E', Items.ENDER_EYE)
                .input('F', Items.APPLE)
                .criterion(hasItem(Items.ENDER_EYE), conditionsFromItem(Items.ENDER_EYE))
                .offerTo(exporter);
    }
}
