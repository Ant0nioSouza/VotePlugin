package br.com.antoniosouza.util;

import br.com.antoniosouza.VotePlugin;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ConfigUtil {
    private static Plugin plugin = VotePlugin.getPlugin(VotePlugin.class);
    static FileConfiguration config = plugin.getConfig();

    public String getMessage() {
        return config.getString("voteMessage");
    }
    public String getWebsite() {
        return config.getString("voteLink");
    }
    public List<String> getCommands() {
        return config.getStringList("commands");
    }
    public static List<String[][]> getRandomItens() {
        List<String[][]> finalIQ;
        finalIQ = new ArrayList();
        List<String> rawIQ = config.getStringList("randomItensID");
        String[][] itemQuantity = new String[rawIQ.size()][rawIQ.size()];
        for (int i = 0; i < rawIQ.size(); i ++) {
            String[] treatedIQ = rawIQ.get(i).split("/");
            itemQuantity[i][0] = treatedIQ[0];
            itemQuantity[i][1] = treatedIQ[1];
            finalIQ.add(itemQuantity);
        }
        return finalIQ;
    }
    public static int getHowManyItens() {
        return config.getInt("itensQuantity");
    }
    public static boolean isRandom() {
        return config.getBoolean("randomItensVote");
    }
}
