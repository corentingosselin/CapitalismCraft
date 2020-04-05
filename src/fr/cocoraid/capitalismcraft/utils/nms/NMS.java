package fr.cocoraid.capitalismcraft.utils.nms;

import net.minecraft.server.v1_15_R1.BlockPosition;
import net.minecraft.server.v1_15_R1.ChunkSection;
import net.minecraft.server.v1_15_R1.IBlockData;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_15_R1.util.CraftMagicNumbers;

public class NMS {


    public static IBlockData fromMaterial(Material m) {
        net.minecraft.server.v1_15_R1.Block nmsBlock = CraftMagicNumbers.getBlock(m);
        return nmsBlock.getBlockData();
    }

    public static void setBlockInNativeDataPalette(Material m, Block block, boolean applyPhysics) {
        int x = block.getX();
        int y = block.getY();
        int z = block.getZ();
        net.minecraft.server.v1_15_R1.World nmsWorld = ((CraftWorld) block.getWorld()).getHandle();
        net.minecraft.server.v1_15_R1.Chunk nmsChunk = nmsWorld.getChunkAt(x >> 4, z >> 4);
        IBlockData ibd = fromMaterial(m);
        ChunkSection cs = nmsChunk.getSections()[y >> 4];
        if (cs == nmsChunk.a()) {
            cs = new ChunkSection(y >> 4 << 4);
            nmsChunk.getSections()[y >> 4] = cs;
        }

        if (applyPhysics)
            cs.getBlocks().setBlock(x & 15, y & 15, z & 15, ibd);
        else
            cs.getBlocks().b(x & 15, y & 15, z & 15, ibd);
    }
}
