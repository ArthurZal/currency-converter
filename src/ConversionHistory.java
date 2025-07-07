import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ConversionHistory {
    public void registerHistory(Conversion conversion) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(conversion.base_code() + "to" + conversion.target_code() + ".json");
            writer.write(gson.toJson(conversion));
            writer.write(System.lineSeparator());
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
