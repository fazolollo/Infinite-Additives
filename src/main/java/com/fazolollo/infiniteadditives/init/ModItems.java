package com.fazolollo.infiniteadditives.init;

import com.fazolollo.infiniteadditives.item.ItemFazolWand;
import com.fazolollo.infiniteadditives.item.ItemIA;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemIA fazolWand = new ItemFazolWand();

    public static void init()
    {
        GameRegistry.registerItem(fazolWand, "fazolWand");
    }
}
