package br.com.antoniosouza.util;

import br.com.antoniosouza.VotePlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class RandomConfigItem {
    private Plugin plugin = VotePlugin.getPlugin(VotePlugin.class);
    private static Random rand = new Random();

    public static ItemStack[] randomIten() {
        ItemStack[] itens = new ItemStack[ConfigUtil.getHowManyItens()];
        int randIndex;
        System.out.println("======> " + rand.nextInt(ConfigUtil.getRandomItens().size()));

       for (int i = 0; i < ConfigUtil.getHowManyItens(); i++) {
            randIndex = rand.nextInt(ConfigUtil.getRandomItens().size());

           if (ConfigUtil.getRandomItens().get(randIndex)[randIndex][0].contains(":")) {
               int id = Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][0].split(":")[0]);
               int byteID = Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][0].split(":")[0]);

               Material material = Material.getMaterial(id);
                System.out.println("Rand index -> " + randIndex + " | rand amount: " + ConfigUtil.getRandomItens().get(randIndex)[randIndex][1] + " | rand id: " + ConfigUtil.getRandomItens().get(randIndex)[randIndex][0]);
                ItemStack item = new ItemStack(id, Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][1]), (byte) byteID);
                itens[i] = item;
                System.out.println(itens[i]);
            } else {
                System.out.println("Rand index -> " + randIndex + " | rand amount: " + ConfigUtil.getRandomItens().get(randIndex)[randIndex][1] + " | rand id: " + ConfigUtil.getRandomItens().get(randIndex)[randIndex][0]);
                ItemStack item = new ItemStack(Material.getMaterial(Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][0])));
                item.setAmount(Integer.parseInt(ConfigUtil.getRandomItens().get(randIndex)[randIndex][1]));
                itens[i] = item;
            }


        }
        return itens;
    }

}
