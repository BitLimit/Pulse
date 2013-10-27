package com.bitlimit.pulse.bukkit;

import org.bukkit.ChatColor;

public enum PluginCondition {
	LOADED,
	UNLOADED,

	CREATED_PREFERENCES,
	LOADED_PREFERENCES,

	RECEIVED_COMMAND,
	EXECUTED_COMMAND,

	EVENT_LISTENED
}

