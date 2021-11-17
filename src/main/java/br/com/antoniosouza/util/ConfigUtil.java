package br.com.antoniosouza.util;

import br.com.antoniosouza.VotePlugin;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.List;

public class ConfigUtil {
    private Plugin plugin = VotePlugin.getPlugin(VotePlugin.class);
    FileConfiguration config = plugin.getConfig();

    public String getMessage() {
        return config.getString("voteMessage");
    }
    public List<String> getCommands() {
        System.out.println(config.getString("voteMessage"));
        return config.getStringList("commands");
    }
}
