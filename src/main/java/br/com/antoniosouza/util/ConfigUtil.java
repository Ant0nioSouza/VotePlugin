package br.com.antoniosouza.util;

import br.com.antoniosouza.VotePlugin;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.List;

public class ConfigUtil {

    public ConfigUtil(FileConfiguration config) {
        this.config = config;
    }
    FileConfiguration config;

    public String getMessage() {
        return config.getString("voteMessage");
    }
    public List<String> getCommands() {
        return config.getStringList("commands");
    }
}
