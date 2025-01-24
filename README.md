# DragonFix

[Chinese](README_CN.md) \
[English](README.md)

> A mod try to fix RotaryCraft or ReactorCraft issues

## issues

- RotaryCraft: [Crash when right clicking bevel gears](https://github.com/ReikaKalseki/Reika_Mods_Issues/issues/3272)
  - missing CrC api file, simple just add interface class file
- ReactorCraft: [Steam boiler not heat-up in Fusion Reactor](https://github.com/ReikaKalseki/Reika_Mods_Issues/issues/2971)
  - Proportionality`getLargestCategory` in DragonAPI : just simple mistake about 'find max value but forget set max var to newest' which case always return last element that case Steam Boiler get 0 in `getHeatEfficiency`
  - so i use mixin to Overwrite its method
  - btw:if you run windows platform may not have this issue because the last reaction type of KeySet happens to be Fusion. Other platforms do not guarantee that the order of reaction types is unique.

## other about dev

this also an example about RotaryCraft dev environment
- it should successfully launch with `Run Client` but will crash in game because of some ASM operation break Vanilla `EntityEnderman` class
  - but it should work fine in `Obfuscated` environment
