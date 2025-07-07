import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {
    public Conversion converts(String baseCode, String targetCode, double value) {
        HttpClient client = HttpClient.newHttpClient();
        URI uriDefault = URI.create("https://v6.exchangerate-api.com/v6/d334330d0665ea2dc66452fc" +
                "/pair/" + baseCode + "/" + targetCode + "/" + value);

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(uriDefault)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Conversion conversion = gson.fromJson(response.body(), Conversion.class);

            System.out.println("Valor: " + value + " " + baseCode +
                    " corresponde ao valor final de =>>> " +
                    conversion.conversion_result() + " " + targetCode);

            return conversion;

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
