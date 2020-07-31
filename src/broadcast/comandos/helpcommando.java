package broadcast.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import broadcastgg.main.Mainbroadcastgg;

public class helpcommando implements CommandExecutor{

	private Mainbroadcastgg plugin;
	
	public helpcommando(Mainbroadcastgg plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if(!(sender instanceof Player)){
			Bukkit.getConsoleSender().sendMessage(plugin.nombre+ChatColor.WHITE+" no puedes ejectucar ese comando desde la consola");
			return false;	
		}else{
			Player jugador = (Player) sender;
			jugador.sendMessage(plugin.nombre+ChatColor.WHITE+" ");
			jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b<---------------------------------------------------------------->"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d<---------------------------&4[&aBroadcastGG&4]&d------------------------>"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Author: &aHappyRogelio7 "));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Version: &b1.0.2 "));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', " "));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&l        COMMANDS:"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: &6/bchelp &7[help plugin BroadCastGG] "));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: &6/broadcast <message> /broadcast <reload> /broadcast admin <Message>"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: &6/alert <message> /alert <reload> /alert admin <message>"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: &6/bc <message> /bc <reload> /bc admin <message>"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', " "));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&l       PERMISSIONS:"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', " "));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b BroadCast Admin permission: &aBroadcastGG.Admin"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b BroadCast permission: &aBroadcastGG.send"));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', " "));
	        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d<---------------------------&4[&aBroadcastGG&4]&d------------------------>"));
			jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b<---------------------------------------------------------------->"));
			if(args.length > 0) {
				if(args[0].equalsIgnoreCase("help1")){
					
				}else{
					
				}
			}else{
				jugador.sendMessage(plugin.nombre+ChatColor.WHITE+" ");
	
				}
		}
		return true;
		}
	}
