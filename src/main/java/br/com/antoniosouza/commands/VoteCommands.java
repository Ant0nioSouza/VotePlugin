package br.com.antoniosouza.commands;

import br.com.antoniosouza.util.ConfigUtil;
import br.com.antoniosouza.util.RandomConfigItem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class VoteCommands implements CommandExecutor {
    ConfigUtil cu = new ConfigUtil();
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage(ChatColor.RED + "Vote: " + cu.getWebsite());
        ItemStack[] itens = RandomConfigItem.randomIten();
        if (ConfigUtil.isRandom()) {
            for (ItemStack item : itens) {
                if (Bukkit.getServer().getOnlinePlayers() != null) {
                    for (Player p : Bukkit.getServer().getOnlinePlayers()) {
                        p.getInventory().addItem(item);
                    }
                }
            }
        }

        return true;
    }
}
