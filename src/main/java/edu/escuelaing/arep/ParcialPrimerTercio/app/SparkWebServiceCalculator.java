package edu.escuelaing.arep.ParcialPrimerTercio.app;

import com.google.gson.Gson;
import edu.escuelaing.arep.ParcialPrimerTercio.app.Calculadora.Calculadora;

import static spark.Spark.*;

/**
 * Hello world!
 */
public class SparkWebServiceCalculator {

    /**
     * Metodo main de la clase SparkWebService
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        port(getPort());
        init();
        get("/fachada", (request, response) -> {
            response.type("application/json");
            String valor = request.queryParams("valor");
            String funcion = request.queryParams("funcion");
            String resultado = "Error al realizar la consulta";
            switch (funcion){
                case "cos":
                    resultado = calculadora.getCoseno(valor);
                    break;
                case "tan":
                    resultado = calculadora.getTangente(valor);
                    break;
                case "sin":
                    resultado = calculadora.getSeno(valor);
                    break;
            }
            return new Gson().toJson("{\"Resultado\": \""+resultado+"\"}");
        });
    }

    /**
     * Metodo para obtener el puerto por el cual el servidor se va a ejecutar
     *
     * @return - Puerto por donde correr spark
     */
    static int getPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
