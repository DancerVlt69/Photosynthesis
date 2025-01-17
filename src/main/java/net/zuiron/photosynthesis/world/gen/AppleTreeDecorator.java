package net.zuiron.photosynthesis.world.gen;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.zuiron.photosynthesis.Photosynthesis;
import net.zuiron.photosynthesis.block.ModBlocks;

public class AppleTreeDecorator extends TreeDecorator {
    public static final AppleTreeDecorator INSTANCE = new AppleTreeDecorator();
    public static final Codec<AppleTreeDecorator> CODEC = Codec.unit(() -> INSTANCE);
    private AppleTreeDecorator() {}
    @Override
    protected TreeDecoratorType<?> getType() {
        return Photosynthesis.APPLE_TREE_DECORATOR;
    }
    @Override
    public void generate(Generator generator) {
        generator.getLeavesPositions().forEach(pos -> {
            Random random = generator.getRandom();
            int chance = random.nextInt(4);

            if(generator.isAir(pos.down()) && chance == 0) {
                generator.replace(pos.offset(Direction.DOWN, 1), ModBlocks.APPLETREE_BUSHCROP.getDefaultState());
            }
        });
    }
}
