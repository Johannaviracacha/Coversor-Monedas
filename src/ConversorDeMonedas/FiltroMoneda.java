package ConversorDeMonedas;

import java.util.HashMap;
import java.util.Map;

public class FiltroMoneda {
    private static final Map<String, String> monedasValidas = new HashMap<>();


    public boolean esMonedaValida(String codigoMoneda) {
        return monedasValidas.containsKey(codigoMoneda);
    }

    public void mostrarMonedasValidas() {
        int index = 1;
        for (Map.Entry<String, String> entry : monedasValidas.entrySet()) {
            System.out.println(index + ". " + entry.getValue() + " => " + obtenerNombreMonedaDestino(entry.getKey()));
            index++;
        }
    }

    // Método auxiliar para obtener una moneda destino
    private String obtenerNombreMonedaDestino(String codigoMoneda) {
        if ("USD".equals(codigoMoneda)) {
            return "Peso argentino";
        } else {
            return "otra moneda";
        }
    }
}