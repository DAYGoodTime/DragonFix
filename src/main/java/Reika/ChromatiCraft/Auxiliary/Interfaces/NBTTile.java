//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Reika.ChromatiCraft.Auxiliary.Interfaces;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.List;

public interface NBTTile {

    void getTagsToWriteToStack(NBTTagCompound var1);

    void setDataFromItemStackTag(ItemStack var1);

    void addTooltipInfo(List var1, boolean var2);
}
