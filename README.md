**Conversor de Monedas**
Este proyecto es un conversor de monedas desarrollado en Java 17, que permite consultar la tasa de conversión entre diferentes monedas utilizando una API de tasas de cambio. El programa consume la API de ExchangeRate API y permite realizar conversiones entre monedas como el Dólar estadounidense (USD), Peso argentino (ARS), Real brasileño (BRL) y Peso colombiano (COP).
Características
Conversión de monedas entre varias opciones predefinidas:
Dólar a Peso argentino
Peso argentino a Dólar
Dólar a Real brasileño
Real brasileño a Dólar
Dólar a Peso colombiano
Peso colombiano a Dólar
Consumo de una API externa para obtener tasas de cambio en tiempo real.
Sistema de menú interactivo en consola.
Permite realizar múltiples conversiones hasta que el usuario elija salir del programa.
**Requisitos**
Java 17 o superior.
Conexión a internet (para obtener las tasas de cambio desde la API).
Biblioteca externa Gson para analizar los datos JSON.
Instalación
Clona este repositorio en tu máquina local:
bash
Copiar código
git clone https://https://github.com/Johannaviracacha/Coversor-Monedas


**Descarga e instala las dependencias:**
Gson: Para manejar JSON, necesitas agregar la librería de Gson. Puedes descargarla aquí o, si usas un sistema de gestión de dependencias como Maven o Gradle, incluirla en tu archivo pom.xml o build.gradle.
Configura la API:
El proyecto usa ExchangeRate API. Debes tener una clave API y modificar la URL base en la clase ConversorAPI:
java
Copiar código
private static final String API_URL = "https://v6.exchangerate-api.com/v6/TU_CLAVE_API/latest/";


**Uso**
Ejecución: Ejecuta el programa desde tu entorno de desarrollo preferido (por ejemplo, IntelliJ IDEA o Visual Studio Code) o usando la línea de comandos:
bash
Copiar código
javac ConversorMonedas.java
java ConversorMonedas


**Menú Interactivo: Cuando el programa se ejecute, aparecerá un menú en consola con las siguientes opciones:**
bash
Copiar código
Seleccione una opción:
1. Dólar => Peso argentino
2. Peso argentino => Dólar
3. Dólar => Real brasileño
4. Real brasileño => Dólar
5. Dólar => Peso colombiano
6. Peso colombiano => Dólar
7. Salir


Selección: Elige la opción deseada ingresando el número correspondiente y el programa mostrará la tasa de conversión en tiempo real para las monedas seleccionadas.
Estructura del Proyecto
**El proyecto está organizado de la siguiente manera:**
bash
Copiar código
ConversorDeMonedas/
│
├── src/
│   ├── ConversorMonedas.java      # Clase principal
│   ├── ConversorAPI.java          # Clase para manejar las peticiones a la API
│   ├── FiltroMoneda.java          # Clase para manejar las monedas válidas
│   └── AnalizadorJSON.java        # Clase para analizar y procesar el JSON de la API
│
├── README.md                      # Documentación del proyecto
└── .gitignore                     # Archivos y carpetas ignoradas por Git


**Ejemplo de Conversión**
Si seleccionas la opción 1. Dólar => Peso argentino, el programa mostrará algo similar a lo siguiente:
bash
Copiar código
Resultado de la conversión:
Tasa de conversión: 350.50
