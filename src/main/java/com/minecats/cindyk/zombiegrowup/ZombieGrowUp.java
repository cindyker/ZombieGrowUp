package com.minecats.cindyk.zombiegrowup;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by cindy on 6/13/14.
 */
public class ZombieGrowUp extends JavaPlugin implements Listener {

    @Override
    public void onEnable()
    {
        getLogger().info("Enabling ZombieGrowUp...");
        getLogger().info("Visit www.Spigotmc.org for more wonderful things...");

        getServer().getPluginManager().registerEvents(this, this);
    }

    //when a creature spawns...
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntitySpawn(CreatureSpawnEvent event)
    {
        if( event.getEntity().getType() == EntityType.ZOMBIE )
        {
            Zombie z750 = (Zombie)event.getEntity();

            //make them grow up.
            if(z750.isBaby())
                z750.setBaby(false);

        }

    }

    @Override
    public void onDisable()
    {
        getLogger().info("Disabling ZombieGrowUp...");

    }

}
