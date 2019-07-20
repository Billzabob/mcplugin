package plugin.commands

import org.bukkit.command.{Command, CommandExecutor, CommandSender}

class Commands extends CommandExecutor {

    def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
        val argsString = args.mkString(", ")
        sender.sendMessage(s"We just received a command with args: $argsString")
        true
    }
}