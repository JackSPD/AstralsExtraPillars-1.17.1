package net.astralsapphire.extrapillars.block;

import net.astralsapphire.extrapillars.TutorialMod;
import net.astralsapphire.extrapillars.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //Pillars:
    public static final Block WHITE_PURPUR_PILLAR = registerBlock("white_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block ORANGE_PURPUR_PILLAR = registerBlock("orange_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block MAGENTA_PURPUR_PILLAR = registerBlock("magenta_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block LIGHT_BLUE_PURPUR_PILLAR = registerBlock("light_blue_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block YELLOW_PURPUR_PILLAR = registerBlock("yellow_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block LIME_PURPUR_PILLAR = registerBlock("lime_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block PINK_PURPUR_PILLAR = registerBlock("pink_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block GRAY_PURPUR_PILLAR = registerBlock("gray_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block LIGHT_GRAY_PURPUR_PILLAR = registerBlock("light_gray_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block CYAN_PURPUR_PILLAR = registerBlock("cyan_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block PURPLE_PURPUR_PILLAR = registerBlock("purple_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block BLUE_PURPUR_PILLAR = registerBlock("blue_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block BROWN_PURPUR_PILLAR = registerBlock("brown_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block GREEN_PURPUR_PILLAR = registerBlock("green_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block RED_PURPUR_PILLAR = registerBlock("red_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));

    public static final Block BLACK_PURPUR_PILLAR = registerBlock("black_purpur_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));


    //Standard Blocks:

    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()));




    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.PILLARS)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }

}