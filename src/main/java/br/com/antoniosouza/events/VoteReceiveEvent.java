package br.com.antoniosouza.events;

import com.vexsoftware.votifier.model.VoteListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class VoteReceiveEvent implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    private void VoteReceived(VoteListener e) {
        // stuff here
    }
}
