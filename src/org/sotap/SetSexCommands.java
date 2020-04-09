
package org.sotap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/*
 * 
 * 
 * 设定性别和性取向用的方法
 * 
 */

public class SetSexCommands implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args){
		
		//限制只有玩家可以使用相关命令
		if(!(sender instanceof Player)){
			sender.sendMessage("只有玩家可以使用这个命令！");
			return true;
		}
		
		
		Player p=(Player)sender;//获得玩家
		
		// 设置性别命令
		if(cmd.getName().equalsIgnoreCase("sexset")){
			if(p.hasPermission("sexset.use")){
				String key="sexData."+p.getName()+".sex";
				if(Main.instance.getConfig().contains(key)){
					p.sendMessage("你已经有性别了！");
				}else{
					if(args[0].equals("male")||args[0].equals("female")){
						Main.instance.getConfig().set(key,args[0]);
						p.sendMessage("你的性别已设置成"+args[0]+"!");
						Main.instance.saveConfig();
						}else{
							p.sendMessage("你的性别只能是male或者female!");
						}
		   
					}
		    }
		return true;
		}
		
		//设置性取向命令
		else if(cmd.getName().equalsIgnoreCase("setpreference")){
			if(p.hasPermission("setpreference.use")){
				String key="sexData."+p.getName()+".sexpreference";
					if(args[0].equals("male")||args[0].equals("female")||args[0].equals("both")){
						Main.instance.getConfig().set(key,args[0]);
						p.sendMessage("你的性取向是"+args[0]+"!");
						Main.instance.saveConfig();
						}else{
							p.sendMessage("你的性别只能是male、female或者both!");
						}
					}
			return true;
		    }
		
		
		
		return true;
		}
	}
