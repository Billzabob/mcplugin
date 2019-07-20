package plugin

import commands.Commands
import listeners.PlayerListener

import org.bukkit.plugin.java.JavaPlugin;

final class Main extends JavaPlugin {

    val logger = getLogger

    override def onEnable(): Unit = {
        logger.info("Plugin has been enabled!")
        getServer.getPluginManager.registerEvents(new PlayerListener(logger), this)
        getCommand("hello").setExecutor(new Commands)
    }

    override def onDisable(): Unit = {
        getLogger.info("Plugin has been disabled!")
    }
}