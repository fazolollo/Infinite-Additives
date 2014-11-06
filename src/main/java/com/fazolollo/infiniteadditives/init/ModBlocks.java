package com.fazolollo.infiniteadditives.init;

import com.fazolollo.infiniteadditives.block.BlockIA;
import com.fazolollo.infiniteadditives.block.BlockMikul;
import com.fazolollo.infiniteadditives.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockIA mikul = new BlockMikul();

    public static void init()
    {
        GameRegistry.registerBlock(mikul, "mikul");
    }
}
