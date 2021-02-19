package edu.escuelaing.arep.ParcialPrimerTercio.app.Calculadora;

/**
 * Calculadora de funciones sin, cos y tan.
 *
 * @author Andres Mateo Calderon Ortega
 */
public class Calculadora {

    /**
     * Metodo que calcula el coseno de un numero.
     *
     * @param numero - numero a calcular.
     * @return resultado del coseno de un numero.
     */
    public String getCoseno(String numero) {
        try {
            Double resultado = Math.cos(Double.parseDouble(numero));
            return resultado.toString();
        } catch (Exception e) {
            return "Error al sacar el coseno";
        }
    }

    /**
     * Metodo que calcula la tangente de un numero.
     *
     * @param numero - numero a calcular.
     * @return resultado de la tangente de un numero.
     */
    public String getTangente(String numero) {
        try {
            Double resultado = Math.tan(Double.parseDouble(numero));
            return resultado.toString();
        } catch (Exception e) {
            return "Error al sacar la tangente";
        }
    }

    /**
     * Metodo que calcula el seno de un numero.
     *
     * @param numero - numero a calcular.
     * @return resultado del seno de un numero.
     */
    public String getSeno(String numero) {
        try {
            Double resultado = Math.sin(Double.parseDouble(numero));
            return resultado.toString();
        } catch (Exception e) {
            return "Error al sacar el seno";
        }
    }

}
