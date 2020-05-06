package me.andreisava4.LaunchInTheSky;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("launch") || label.equalsIgnoreCase("lch")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("*console goes flying*");
				return true;
			}
			Player player = (Player) sender;

			if (args.length == 0) {
				// /launch
				player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Zoooooooming in the sky!");
				player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));
				
				return true;
			}
			
			// /launch <number>
			player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Zoooooooming in the sky!");
			player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])).setY(2));
			
			return true;
		}
		return false;
	}
	
	
}
	
	
	
	
	
	








