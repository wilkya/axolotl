package me.wilkai.axolotl.command;

import me.wilkai.axolotl.AxolotlData;
import me.wilkai.comlib.Command;
import me.wilkai.comlib.CommandContext;
import me.wilkai.comlib.exception.CommandException;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class FactCommand extends Command<CommandContext<?>> {

    public void onCommand() throws CommandException {
        AxolotlData data = new AxolotlData();

        EmbedBuilder b = new EmbedBuilder();
        b.setTitle("Axolotl Fact");
        b.setDescription(data.facts);
        b.setThumbnail(data.url);
        b.setColor(Color.MAGENTA);

        context.reply(b.build());
    }

}
