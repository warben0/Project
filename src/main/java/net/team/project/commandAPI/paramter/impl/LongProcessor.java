package net.team.project.commandAPI.paramter.impl;

import net.team.project.commandAPI.paramter.Processor;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class LongProcessor extends Processor<Long> {
    public Long process(CommandSender sender, String supplied) {
        try {
            return Long.parseLong(supplied);
        } catch(Exception ex) {
            sender.sendMessage(ChatColor.RED + "The value you entered '" + supplied + "' is an invalid long.");
            return 0L;
        }
    }
}
