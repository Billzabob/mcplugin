package plugin

import org.bukkit.plugin.java.JavaPlugin;

final class Main extends JavaPlugin {

    val logger = getLogger

    override def onEnable(): Unit = {
        getServer.getPluginManager.registerEvents(new PlayerListener(logger), this)
        logger.info("Plugin has been enabled!")
    }

    override def onDisable(): Unit = {
        getLogger.info("Plugin has been disabled!")
    }
}