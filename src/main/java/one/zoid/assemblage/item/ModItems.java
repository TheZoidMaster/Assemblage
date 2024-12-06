package one.zoid.assemblage.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import one.zoid.assemblage.Assemblage;

public class ModItems {
    public final static Item PHANTOM_FABRIC = registerItem("phantom_fabric", new Item(new Item.Settings()));
    public final static Item UNFINISHED_ELYTRA = registerItem("unfinished_elytra",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item DRIED_TURTLE_SHELL = registerItem("dried_turtle_shell", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Assemblage.MOD_ID, name), item);
    }

    public static void registerModItems() {

    }
}
