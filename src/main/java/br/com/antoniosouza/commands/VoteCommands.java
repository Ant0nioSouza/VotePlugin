package br.com.antoniosouza.commands;

import br.com.antoniosouza.util.ConfigUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class VoteCommands implements CommandExecutor {
    ConfigUtil cu = new ConfigUtil();
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage(ChatColor.RED + "Vote: " + cu.getWebsite());
        return true;
    }
}
