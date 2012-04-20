package com.incraftion.VoidtoSpawn;

import java.util.logging.Logger;


import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class VoidtoSpawn extends JavaPlugin{
public static VoidtoSpawn plugin;
public final Logger log = Logger.getLogger("Minecraft");
public final VoidListener vListener = new VoidListener();

	@Override
	public void onEnable() {
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this.vListener, this);
	}
}
