package br.com.antoniosouza;

import br.com.antoniosouza.commands.VoteCommands;
import br.com.antoniosouza.events.VoteReceiveEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class VotePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println(ChatColor.RED + "VotePlugin initialized!");

        this.getServer().getPluginManager().registerEvents(new VoteReceiveEvent(), this);

        saveDefaultConfig();

        getCommand("vote").setExecutor(new VoteCommands());
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "VotePlugin disabled");
    }
}
