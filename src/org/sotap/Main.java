package org.sotap;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main instance;

	@Override  
    public void onEnable(){  
		instance = this;
		
    	this.saveDefaultConfig();//����config.yml
    	
        this.getLogger().info("LoadSuccessfully");//���سɹ�
        
        getServer().getPluginManager().registerEvents(new LS(), this);//�¼�������
        
        Bukkit.getPluginCommand("sexset").setExecutor(new SetSexCommands());//���������
        Bukkit.getPluginCommand("setpreference").setExecutor(new SetSexCommands());
    }  
  
    @Override      
    public void onDisable(){}  
}  