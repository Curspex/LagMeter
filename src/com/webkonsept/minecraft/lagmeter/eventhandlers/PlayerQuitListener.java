package com.webkonsept.minecraft.lagmeter.eventhandlers;

import com.webkonsept.minecraft.lagmeter.LagMeter;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener{
	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onPlayerQuitEvent(PlayerQuitEvent evt)
	{
		LagMeter.getInstance().removePlayerIP(evt.getPlayer().getName());
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
}