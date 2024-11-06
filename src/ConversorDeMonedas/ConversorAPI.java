package ConversorDeMonedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ConversorAPI {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/7f5e899dd7bce734f675aafd/latest/";

    public String obtenerDatos(String monedaBase) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + monedaBase))
                .GET()
                .build();


        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        if (response.statusCode() != 200) {
            throw new IOException("Código de respuesta inesperado: " + response.statusCode());
        }


        return response.body();
    }
    public static class FiltroMoneda {
        private static final Map<String, String> monedasValidas = new HashMap<>();

        public boolean esMonedaValida(String codigoMoneda) {
            return monedasValidas.containsKey(codigoMoneda);
        }

        public void mostrarMonedasValidas() {
            monedasValidas.forEach((codigo, nombre) -> System.out.println(codigo + ": " + nombre));
        }
    }
}