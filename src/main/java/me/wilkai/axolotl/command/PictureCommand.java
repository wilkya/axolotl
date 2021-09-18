package me.wilkai.axolotl.command;

import me.wilkai.axolotl.AxolotlData;
import me.wilkai.comlib.Command;
import me.wilkai.comlib.CommandContext;
import me.wilkai.comlib.exception.CommandException;

public class PictureCommand extends Command<CommandContext<?>> {

    public void onCommand() throws CommandException {
        AxolotlData data = new AxolotlData();
        context.reply(data.url);
    }

}
