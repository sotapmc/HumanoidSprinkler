
package org.sotap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/*
 * 
 * 
 * �趨�Ա����ȡ���õķ���
 * 
 */

public class SetSexCommands implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args){
		
		//����ֻ����ҿ���ʹ���������
		if(!(sender instanceof Player)){
			sender.sendMessage("ֻ����ҿ���ʹ��������");
			return true;
		}
		
		
		Player p=(Player)sender;//������
		
		// �����Ա�����
		if(cmd.getName().equalsIgnoreCase("sexset")){
			if(p.hasPermission("sexset.use")){
				String key="sexData."+p.getName()+".sex";
				if(Main.instance.getConfig().contains(key)){
					p.sendMessage("���Ѿ����Ա��ˣ�");
				}else{
					if(args[0].equals("male")||args[0].equals("female")){
						Main.instance.getConfig().set(key,args[0]);
						p.sendMessage("����Ա������ó�"+args[0]+"!");
						Main.instance.saveConfig();
						}else{
							p.sendMessage("����Ա�ֻ����male����female!");
						}
		   
					}
		    }
		return true;
		}
		
		//������ȡ������
		else if(cmd.getName().equalsIgnoreCase("setpreference")){
			if(p.hasPermission("setpreference.use")){
				String key="sexData."+p.getName()+".sexpreference";
					if(args[0].equals("male")||args[0].equals("female")||args[0].equals("both")){
						Main.instance.getConfig().set(key,args[0]);
						p.sendMessage("�����ȡ����"+args[0]+"!");
						Main.instance.saveConfig();
						}else{
							p.sendMessage("����Ա�ֻ����male��female����both!");
						}
					}
			return true;
		    }
		
		
		
		return true;
		}
	}
