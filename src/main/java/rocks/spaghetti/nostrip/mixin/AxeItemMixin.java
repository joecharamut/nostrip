package rocks.spaghetti.nostrip.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class AxeItemMixin {
	@Inject(method = "getStrippedState", at = @At("HEAD"), cancellable = true)
	private void getStrippedState(BlockState state, CallbackInfoReturnable<Optional<BlockState>> info) {
		info.setReturnValue(Optional.empty());
	}
}
