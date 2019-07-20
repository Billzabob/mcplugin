package plugin.commands

import org.bukkit.command.{Command, CommandExecutor, CommandSender}

final class PartyCommands extends CommandExecutor {

    def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
        args.toList match {
            case "disband" :: Nil =>
                // need to uninvite all players
                sender.sendMessage("disbanding party")
            case "uninvite" :: playerName :: Nil => 
                // need to get the next arg to uninvite that player
                sender.sendMessage(s"uninviting $playerName")
            case "invite" :: playerName :: Nil => 
                // Need to get the next arg to invite that player
                sender.sendMessage(s"inviting $playerName")
            case "list" :: Nil => 
                // List the party members
                sender.sendMessage("listing party")                
            case _ => 
                // Show help message
                sender.sendMessage("show help message")
        }
        true
    }
}