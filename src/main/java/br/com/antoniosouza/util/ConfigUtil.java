package br.com.antoniosouza.util;

import br.com.antoniosouza.VotePlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class ConfigUtil {
    JavaPlugin plugin = new VotePlugin();
    FileConfiguration config = plugin.getConfig();

    public String getMessage() {
        return config.getString("voteMessage");
    }
    public List<String> getCommands() {
        return config.getStringList("commands");
    }
}
