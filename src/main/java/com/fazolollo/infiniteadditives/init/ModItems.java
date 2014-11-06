package com.fazolollo.infiniteadditives.init;

import com.fazolollo.infiniteadditives.item.ItemFazolWand;
import com.fazolollo.infiniteadditives.item.ItemIA;
import com.fazolollo.infiniteadditives.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemIA fazolWand = new ItemFazolWand();

    public static void init()
    {
        GameRegistry.registerItem(fazolWand, "fazolWand");
    }
}
