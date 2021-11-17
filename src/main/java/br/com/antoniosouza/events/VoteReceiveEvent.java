package br.com.antoniosouza.events;

import br.com.antoniosouza.util.ConfigUtil;
import com.vexsoftware.votifier.model.VotifierEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class VoteReceiveEvent implements Listener {
    ConfigUtil configUtil = new ConfigUtil();

    @EventHandler(priority = EventPriority.HIGH)
    public void onVotifierEvent(VotifierEvent e) {
        Player player = Bukkit.getPlayer(e.getVote().getUsername());
        try {
            if (player.isOnline()) {
                player.sendMessage(configUtil.getMessage());
                for (String command : configUtil.getCommands()) {
                    String consoleCommand = "";
                    String[] splitedCommand = command.split(" ");
                    String[] treatedCommand = splitedCommand;
                    for (int i = 0; i < splitedCommand.length; i++) {
                        if (treatedCommand[i].equals("USER")) {
                            treatedCommand[i] = e.getVote().getUsername();
                        }
                    }
                    for (int i = 0; i < treatedCommand.length; i ++) {
                        if (i == 0) {
                            consoleCommand += treatedCommand[i];
                            continue;
                        }
                        consoleCommand += " " + treatedCommand[i];
                    }
                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), consoleCommand);
                }
            }
        } catch (Exception ex) {
            // Player is not online.
        }
    }
}
