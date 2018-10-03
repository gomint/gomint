package io.gomint.server.world.generator;

import com.google.common.base.Preconditions;
import io.gomint.world.World;
import io.gomint.world.generator.ChunkGenerator;
import io.gomint.world.generator.ChunkGeneratorRegistry;
import io.gomint.world.generator.GeneratorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SimpleChunkGeneratorRegistry implements ChunkGeneratorRegistry {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleChunkGeneratorRegistry.class);

    private final Map<String, Class<? extends ChunkGeneratorRegistry>> registeredGenerators = new HashMap<>();
    private final Map<String, Class<? extends ChunkGenerator>> registeredGenerators = new HashMap<>();

    @Override
    public ChunkGenerator createGenerator(String name, World world, GeneratorContext ctx) {
        return null;
    }

    @Override
    public boolean registerGenerator(Class<? extends ChunkGenerator> generatorClass) {
        Preconditions.checkNotNull(generatorClass, "'generatorClass' cannot be null");

        return false;
    }

    @Override
    public boolean isGeneratorAvailable(String name) {
        return this.registeredGenerators.get(name) != null;
    }

    @Override
    public Collection<String> getRegisteredGenerators() {
        return this.registeredGenerators.keySet();
    }

    @Override
    public Collection<Class<? extends ChunkGenerator>> getRegisteredGeneratorClasses() {
        return this.registeredGenerators.values();
    }

}