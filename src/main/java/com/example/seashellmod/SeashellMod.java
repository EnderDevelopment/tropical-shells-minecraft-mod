package com.example.seashellmod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import com.example.seashellmod.registry.ModBlocks;

@Mod("seashellmod")
public class SeashellMod {
    public SeashellMod(IEventBus eventBus) {
        eventBus.addListener(this::setup);
        ModBlocks.register(eventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Initialization code
    }
}