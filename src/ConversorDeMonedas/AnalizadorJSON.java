package ConversorDeMonedas;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class AnalizadorJSON {


    public void analizar(String jsonResponse, String monedaDestino) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);

        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
        if (rates.has(monedaDestino)) {
            System.out.println("Tasa de conversión: " + rates.get(monedaDestino).getAsDouble());
        } else {
            System.out.println("Moneda destino no encontrada.");
        }
    }
}