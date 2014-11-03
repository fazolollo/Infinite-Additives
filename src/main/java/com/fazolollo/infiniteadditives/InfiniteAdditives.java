package com.fazolollo.infiniteadditives;

import com.fazolollo.infiniteadditives.proxy.IProxy;
import com.fazolollo.infiniteadditives.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class InfiniteAdditives
{
    @Mod.Instance(Reference.MOD_ID)
    public static InfiniteAdditives instance;

    @SidedProxy(clientSide = "com.fazolollo.infiniteadditives.proxy.ClientProxy", serverSide = "com.fazolollo.infiniteadditives.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
