package net.astralsapphire.extrapillars.block;

import net.astralsapphire.extrapillars.TutorialMod;
import net.astralsapphire.extrapillars.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final ModBlock[] BLOCKS = {
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "white_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "orange_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "magenta_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "light_blue_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "yellow_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "lime_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "pink_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "gray_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "light_gray_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "cyan_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "purple_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "blue_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "brown_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "green_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "red_purpur_pillar"),
            new ModBlock(new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "black_purpur_pillar"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "white_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "orange_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "magenta_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "light_blue_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "yellow_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "lime_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "pink_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "gray_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "light_gray_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "cyan_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "purple_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "blue_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "brown_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "green_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "red_polished_block"),
            new ModBlock(new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), "black_polished_block")

    };

    public static void registerModBlocks() {
        for (ModBlock m : BLOCKS) {
            // Register blocks
            Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, m.getName()), m.getBlock());
            // Register blockitem
            Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, m.getName()),
                    new BlockItem(m.getBlock(), new FabricItemSettings().group(ModItemGroup.PILLARS)));
        }

        System.out.println("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }

}