package com.bitlimit.pulse.bukkit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;

public class Pulse {
	private static Pulse ourInstance = new Pulse();

	public static Pulse getInstance() {
		return ourInstance;
	}

	public static void recordCondition(Plugin plugin, String condition, Level level)
	{
		PulsePlugin pulsePlugin = (PulsePlugin)Bukkit.getPluginManager().getPlugin("Pulse");
		pulsePlugin.recordCondition(plugin, condition, level);
	}

	private Pulse() {

	}
}
