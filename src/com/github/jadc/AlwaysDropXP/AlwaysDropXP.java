package com.github.jadc.AlwaysDropXP;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AlwaysDropXP extends JavaPlugin implements Listener {
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		saveDefaultConfig();
	}
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {
		if(e.getDroppedExp() == 0) e.setDroppedExp(getConfig().getInt("naturalExperience"));
	}
}
