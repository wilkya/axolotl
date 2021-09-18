package me.wilkai.axolotl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectReader;

import java.net.URL;

public class AxolotlData {

    public String url;
    public String facts;

    public AxolotlData() {
        try {
            URL path = new URL("https://axoltlapi.herokuapp.com/");
            ObjectReader reader = Main.mapper.reader();
            JsonNode node = reader.readTree(path.openStream());

            this.url = node.get("url").asText();
            this.facts = node.get("facts").asText();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
