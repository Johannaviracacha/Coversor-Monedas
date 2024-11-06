package ConversorDeMonedas;

import java.io.IOException;
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiltroMoneda filtro = new FiltroMoneda();
        ConversorAPI api = new ConversorAPI();
        AnalizadorJSON analizador = new AnalizadorJSON();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Dólar => Peso argentino");
            System.out.println("2. Peso argentino => Dólar");
            System.out.println("3. Dólar => Real brasileño");
            System.out.println("4. Real brasileño => Dólar");
            System.out.println("5. Dólar => Peso colombiano");
            System.out.println("6. Peso colombiano => Dólar");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();

            String monedaBase = "";
            String monedaDestino = "";

            switch (opcion) {
                case 1:
                    monedaBase = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    monedaBase = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    monedaDestino = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL";
                    monedaDestino = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaDestino = "COP";
                    break;
                case 6:
                    monedaBase = "COP";
                    monedaDestino = "USD";
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    continue;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    continue;
            }

            if (continuar) {
                try {
                    String datosAPI = api.obtenerDatos(monedaBase);


                    System.out.println("Resultado de la conversión:");
                    analizador.analizar(datosAPI, monedaDestino);

                } catch (IOException | InterruptedException e) {
                    System.out.println("Error al obtener los datos: " + e.getMessage());
                }
            }
        }

        scanner.close();
    }
}