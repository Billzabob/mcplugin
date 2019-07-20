package plugin

import org.bukkit.plugin.java.JavaPlugin;
import commands.CommandsExecutor

class Main extends JavaPlugin {
    override def onEnable(): Unit = {
        getLogger.info("Plugin has been enabled!")
        getCommand("hello").setExecutor(new CommandsExecutor())
    }

    override def onDisable(): Unit = {
        getLogger.info("Plugin has been disabled!")
    }
}