package net.minecraftforge.ducker.digger.mixins;

import net.minecraftforge.ducker.digger.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Main.class)
public abstract class MainMixin
{
    @Inject(
      method = "run",
      at = @At(
        value = "INVOKE",
        target = "Lnet/minecraftforge/ducker/digger/Main;getRandom()Ljava/lang/String;"
      )
    )
    private void onMain(final CallbackInfo ci)
    {
        System.out.println("Hello from mixin!");
    }
}
