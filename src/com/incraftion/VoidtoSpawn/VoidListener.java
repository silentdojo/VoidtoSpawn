package com.incraftion.VoidtoSpawn;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class VoidListener implements Listener {
	public static VoidtoSpawn plugin;
	public void Voidlistener(VoidtoSpawn plugin) {
		VoidListener.plugin = plugin;
	}

	@EventHandler
	public void onVoidDamage(EntityDamageEvent event){
		
		if(event.getCause() == DamageCause.VOID){
			Entity ent = event.getEntity();
			if (ent == null){
				return;
			}

			if (!(ent instanceof Player)){
				return;
			}

			else if (ent instanceof Player){
				((Player) ent).setNoDamageTicks(30);
				((Player) ent).teleport(ent.getWorld().getSpawnLocation());
			}
			
			
		}
		
	}

}
