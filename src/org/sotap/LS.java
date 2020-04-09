package org.sotap;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
public class LS implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		Bukkit.broadcastMessage("Welcome to the server!");
	}
	@EventHandler
	public void onPlayerItemBreak(PlayerInteractAtEntityEvent event){
		if(event.getHand().name().equals("HAND")){
			for(int i=0;i<5;i++){
			EffectPlay.pee(event.getPlayer());}
			//Bukkit.broadcastMessage("你正在和"+event.getRightClicked().getName()+"交互");
			
		}
	}

	
}
