import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {

    public Conversion buscarConversion(String PaisOrigen,
                      String PaisTarget
                      ){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d4cc42c7b182735c1f0fe1d2/pair/"+PaisOrigen+"/"+PaisTarget);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("Ocurrio un error" + e.getMessage());
        }

    }

}
