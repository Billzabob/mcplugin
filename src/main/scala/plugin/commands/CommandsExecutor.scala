package commands

import org.bukkit.command.CommandExecutor
import org.bukkit.command.{Command, CommandSender}

class CommandsExecutor extends CommandExecutor {
    override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
        sender.sendMessage(s"We just received a command with args: $args")
        true
    }
}