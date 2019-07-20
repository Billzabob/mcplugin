package plugin

import org.bukkit.plugin.java.JavaPlugin;

class Main extends JavaPlugin {
    override def onEnable(): Unit = {
        getLogger.info("Plugin has been enabled!")
    }

    override def onDisable(): Unit = {
        getLogger.info("Plugin has been disabled!")
    }
}