package net.astralsapphire.extrapillars.block;

import net.minecraft.block.Block;

public class ModBlock {
    private Block block;
    private String name;

    public ModBlock(Block block, String name) {
        this.block = block;
        this.name = name;
    }

    public Block getBlock() {
        return block;
    }

    public String getName() {
        return name;
    }
}
