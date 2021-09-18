package me.wilkai.axolotl.command;

import me.wilkai.comlib.Command;
import me.wilkai.comlib.CommandContext;
import me.wilkai.comlib.exception.CommandException;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class AboutCommand extends Command<CommandContext<?>> {

    public void onCommand() throws CommandException {
        EmbedBuilder b = new EmbedBuilder();
        b.setTitle("About Axolotl");
        b.setDescription("Fantastic Discord Bot which gives information about and pictures of Axolotls.");
        b.addField("Author", "Wilkai", false);
        b.setColor(Color.MAGENTA);
        b.setImage("https://media.discordapp.net/attachments/808700312881070120/848290622937759754/CU_TE.jpg");
        b.setFooter("Version 0.1.0");

        context.reply(b.build());
    }

}
