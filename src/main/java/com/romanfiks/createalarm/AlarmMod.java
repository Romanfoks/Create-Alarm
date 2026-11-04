package com.romanfiks.createalarm;

import com.romanfiks.createalarm.block.ModBlocks;
import com.romanfiks.createalarm.block.entity.ModBlockEntities;
import com.romanfiks.createalarm.client.ClientModEvents;
import com.romanfiks.createalarm.fluid.ModFluids;
import com.romanfiks.createalarm.item.ModCreativeModeTabs;
import com.romanfiks.createalarm.item.ModItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(AlarmMod.MOD_ID)
public class AlarmMod {
    public static final String MOD_ID = "createalarm";
    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus and pass them in automatically.
    public AlarmMod(IEventBus modEventBus) {
        modEventBus.addListener(ClientModEvents::onClientExtensions);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluids.FLUID_TYPES.register(modEventBus); // Не забудь это!
        ModFluids.FLUIDS.register(modEventBus);
        // И это!
        ModBlockEntities.register(modEventBus);
    }
}
