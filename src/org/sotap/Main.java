package org.sotap;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main instance;

	@Override  
    public void onEnable(){  
		instance = this;
		
    	this.saveDefaultConfig();//创建config.yml
    	
        this.getLogger().info("LoadSuccessfully");//加载成功
        
        getServer().getPluginManager().registerEvents(new LS(), this);//事件监听器
        
        Bukkit.getPluginCommand("sexset").setExecutor(new SetSexCommands());//命令监听器
        Bukkit.getPluginCommand("setpreference").setExecutor(new SetSexCommands());
    }  
  
    @Override      
    public void onDisable(){}  
}  