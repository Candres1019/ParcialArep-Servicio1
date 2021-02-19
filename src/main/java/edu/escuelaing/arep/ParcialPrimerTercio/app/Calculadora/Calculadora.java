package edu.escuelaing.arep.ParcialPrimerTercio.app.Calculadora;

public class Calculadora {

    public String getCoseno(String numero){
        try{
            Double resultado = Math.cos(Double.parseDouble(numero));
            return resultado.toString();
        }catch (Exception e){
            return "Error al sacar el coseno";
        }
    }

    public String getTangente(String numero){
        try{
            Double resultado = Math.tan(Double.parseDouble(numero));
            return resultado.toString();
        }catch (Exception e){
            return "Error al sacar la tangente";
        }
    }

    public String getSeno(String numero){
        try{
            Double resultado = Math.sin(Double.parseDouble(numero));
            return resultado.toString();
        }catch (Exception e){
            return "Error al sacar el seno";
        }
    }

}
