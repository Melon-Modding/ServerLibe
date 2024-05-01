package org.useless.serverlibe.callbacks.player;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class PlayerDigEvent {
	@NotNull final EntityPlayer player;
	@NotNull final World world;
	public final int x;
	public final int y;
	public final int z;
	@NotNull
	public final Side side;
	public PlayerDigEvent
		(
			@NotNull final EntityPlayer player,
			@NotNull final World world,
			final int x,
			final int y,
			final int z,
			@NotNull final Side side
		)
	{
        this.player = Objects.requireNonNull(player);
        this.world = Objects.requireNonNull(world);
        this.x = x;
        this.y = y;
        this.z = z;
        this.side = Objects.requireNonNull(side);
    }
}
