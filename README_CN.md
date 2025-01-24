# DragonFix

[Chinese](README_CN.md) \
[English](README.md)

> 一个尝试修复Roc和Rec bug的mod

## 前置
本Mod 需要 [UniMixins](https://github.com/LegacyModdingMC/UniMixins) 才能正常启动。

## 解决的问题列表

- RotaryCraft: [右键斜齿轮箱崩溃](https://github.com/ReikaKalseki/Reika_Mods_Issues/issues/3272)
  - 蜜汁r姐操作之一,永远默认别人都是跑在全家桶的情况下。
- ReactorCraft: [蒸汽锅炉在聚变反应堆中不升温](https://github.com/ReikaKalseki/Reika_Mods_Issues/issues/2971)
  - 使用Mixin修改了DragonAPI中的Proportionality类下的`getLargestCategory`方法。
  - 蜜汁r姐操作之二,求最大值操作没有更新最大值导致方法永远只会返回最后一个反应堆类型。然后恰好在Windows下HashMapKeySet的最后一个为Fusion，所以才‘误打误撞’给蒸汽锅炉正确地升温。
  - 这个问题在linux下可以稳定复现
  - 拖到2025年还不修，也是神人。

## 关于开发

也是捣鼓了一阵子可以用来开发r姐系列mod的`基础开发环境`
-  `Run Client` 应该是能正常启动游戏的，但是会在世界中崩溃。(因为`EntityEnderman`类被字节码修改了,还改烂了.用脚趾都知道是谁干的)
- 你可以用 `Run ObfuscatedClient` 代替，此时是能够正常进行开发工作的。
