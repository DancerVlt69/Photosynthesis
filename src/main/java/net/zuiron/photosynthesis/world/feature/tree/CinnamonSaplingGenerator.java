package net.zuiron.photosynthesis.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.zuiron.photosynthesis.world.feature.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class CinnamonSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.CINNAMON_TREE;
    }
}