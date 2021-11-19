package br.com.antoniosouza.util;

import br.com.antoniosouza.VotePlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class RandomConfigItem {
    private Plugin plugin = VotePlugin.getPlugin(VotePlugin.class);
    private static Random rand = new Random();

    public static ItemStack[] randomIten() {
        ItemStack[] itens = new ItemStack[ConfigUtil.getHowManyItens()];
        int randIndex;
       for (int i = 0; i < ConfigUtil.getHowManyItens(); i++) {
            randIndex = rand.nextInt(ConfigUtil.getRandomItens().size());

           if (ConfigUtil.getRandomItens().get(randIndex)[randIndex][0].contains(":")) {
                int id = Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][0].split(":")[0]);
                int byteID = Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][0].split(":")[1]);
                Material material = Material.getMaterial(id);
                ItemStack item = new ItemStack(id, Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][1]), (short) byteID);
                itens[i] = item;
            } else {
                ItemStack item = new ItemStack(Material.getMaterial(Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][0])));
                item.setAmount(Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][1]));
                itens[i] = item;
            }


        }
        return itens;
    }

}
