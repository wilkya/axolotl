package me.wilkai.axolotl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.wilkai.axolotl.command.AboutCommand;
import me.wilkai.axolotl.command.FactCommand;
import me.wilkai.axolotl.command.PictureCommand;
import me.wilkai.comlib.Comlib;
import me.wilkai.comlib.CommandWrapper;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.Arrays;

public class Main {

    public static final ObjectMapper mapper = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);

    public static void main(String[] args) {
        try {
            JDA jda  = JDABuilder.create("token here ?", GatewayIntent.GUILD_MESSAGES).build();
            Comlib comlib = new Comlib(jda);

            comlib.addCommand(new CommandWrapper()
                    .setName("fact")
                    .setSummary("Display a fact about Axolotls!")
                    .setExecutor(FactCommand.class)
                    .setType(CommandWrapper.CommandType.BOTH));

            comlib.addCommand(new CommandWrapper()
                    .setName("picture")
                    .setSummary("Display a picture of an Axolotl!")
                    .setExecutor(PictureCommand.class)
                    .setType(CommandWrapper.CommandType.BOTH));

            comlib.addCommand(new CommandWrapper()
                    .setName("about")
                    .setSummary("About the Axolotl Bot")
                    .setExecutor(AboutCommand.class)
                    .setType(CommandWrapper.CommandType.BOTH));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
