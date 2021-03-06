package fr.titi.infinityore;

import fr.titi.infinityore.init.ModBlocks;
import fr.titi.infinityore.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(InfinityOre.MODID)
public class InfinityOre {

    public static final String MODID = "infinityore";


    //public static Config config;

    public InfinityOre() {
        //config = new Config();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);

        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, config.configSpec);

    }




    private void setup (FMLCommonSetupEvent event) {

    }

    private void clientSetup(FMLClientSetupEvent event) {


    }
}
