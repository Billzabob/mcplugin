package plugin.listeners

import java.util.logging.Logger

import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.chat.TextComponent
import org.bukkit.event.{EventHandler, Listener}
import org.bukkit.event.player.PlayerJoinEvent

final class PlayerListener(logger: Logger) extends Listener {

    @EventHandler
    def join(event: PlayerJoinEvent): Unit = {
        val player = event.getPlayer
        val name = player.getName
        val message = new TextComponent(s"Welcome to our lovely 9 year olds server $name!")
        message.setColor(ChatColor.RED)
        player.spigot.sendMessage(message)
    }
}