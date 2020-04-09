package org.sotap;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class EffectPlay {
	public static void mlEffect1(Player p){
		Location loc =p.getLocation().clone();
		loc.add(0,1,0);
		for(int i=0;i<360;i++){
			double r =Math.toRadians(i);
			double x =Math.cos(r);
			double z =Math.sin(r);
			loc.add(x,0,z);
			loc.getWorld().spawnParticle(Particle.VILLAGER_HAPPY,loc,1,null);
			loc.subtract(x,0,z);
		}
	}
	
	public static void pee(Player p){
		Location loc =p.getLocation().clone();
		loc.add(0,1,0);
		double i=0;
		double x=loc.getX();
		double y=loc.getY();
		double z=loc.getZ();
		double a=p.getFacing().getDirection().getX();
		double b=p.getFacing().getDirection().getZ();
		double cos=a/Math.sqrt(a*a+b*b);
		double sin=b/Math.sqrt(a*a+b*b);
		while(loc.getY()>0){
			 x =x+0.03*i*cos;
			 z =z+0.03*i*sin;
			 y =y+0.1*i*(1-2*i);
			loc.setX(x);
			loc.setY(y);
			loc.getWorld().spawnParticle(Particle.FALLING_WATER,loc,1,null);
			
			i=i+0.01;
		}
	}
}
