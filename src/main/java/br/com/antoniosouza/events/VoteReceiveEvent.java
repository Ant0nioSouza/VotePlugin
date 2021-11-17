package br.com.antoniosouza.events;

import com.vexsoftware.votifier.model.VotifierEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class VoteReceiveEvent implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onVotifierEvent(VotifierEvent e) {
        try {
            if (Bukkit.getPlayer(e.getVote().getUsername()).isOnline()) {
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "kit " + e.getVote().getUsername() + " Tools");
            }
        } catch (Exception ex) {
            // Player is not online.
        }
    }
}
