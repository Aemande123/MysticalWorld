package epicsquid.mysticalworld.block;

import epicsquid.mysticallib.block.BlockCropBase;
import epicsquid.mysticalworld.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumPlantType;

import javax.annotation.Nonnull;

public class BlockAubergineCrop extends BlockCropBase {

  public BlockAubergineCrop(@Nonnull String name, @Nonnull EnumPlantType plantType) {
    super(name, plantType);
  }

  /**
   * Gets the seed to drop for the crop
   */
  @Override
  @Nonnull
  public Item getSeed() {
    return ModItems.aubergine_seed;
  }

  /**
   * Gets the crop to drop for the plant
   */
  @Override
  @Nonnull
  public Item getCrop() {
    return ModItems.aubergine;
  }

}
