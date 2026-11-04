package com.romanfiks.create_alarm;

import com.romanfiks.create_alarm.block.ModBlocks;
import com.romanfiks.create_alarm.block.entity.ModBlockEntities;
import com.romanfiks.create_alarm.client.ClientModEvents;
import com.romanfiks.create_alarm.fluid.ModFluids;
import com.romanfiks.create_alarm.item.ModCreativeModeTabs;
import com.romanfiks.create_alarm.item.ModItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(AlarmMod.MOD_ID)
public class AlarmMod {
    public static final String MOD_ID = "create_alarm";
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
