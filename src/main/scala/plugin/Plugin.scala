package plugin

import commands.{Commands, PartyCommands}
import listeners.PlayerListener

import org.bukkit.plugin.java.JavaPlugin;

final class Main extends JavaPlugin {

    val logger = getLogger

    override def onEnable(): Unit = {
        logger.info("Plugin has been enabled!")
        getServer.getPluginManager.registerEvents(new PlayerListener(logger), this)
        getCommand("hello").setExecutor(new Commands)
        getCommand("party").setExecutor(new PartyCommands)
    }

    override def onDisable(): Unit = {
        logger.info("Plugin has been disabled!")
    }
}