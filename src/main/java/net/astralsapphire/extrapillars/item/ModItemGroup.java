package net.astralsapphire.extrapillars.item;

import net.astralsapphire.extrapillars.TutorialMod;
import net.astralsapphire.extrapillars.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PILLARS = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "pillars"),
            () -> new ItemStack(ModBlocks.WHITE_PURPUR_PILLAR));
}
