package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OfertaValidacion {
    protected Util util=new Util();

    public boolean validarTituloOferta (String titulo) throws Exception{
        if(titulo.length()<=20){
            throw new Exception(Mensaje.NUMERO_CARTACTERES_INVALIDO.getMensaje());
        } else if ((!util.validarExpresionRegular(titulo, "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+$"))) {

        }else {
            return true;
        }
    }

    public boolean validarFormatoFecha (String fecha)throws Exception{
        if (!util.validarExpresionRegular(fecha, "^(0?[1-9]|[1-2][0-9]|3[0-1])/(0?[1-9]|1[0-2])/\\d{4}$")
        ){throw new Exception(Mensaje.FECHA_INVALIDA.getMensaje());
        }else {
            return true;}
    }

    public boolean validarDiferenciaEntreFechas (LocalDate fechaInicial, LocalDate fechaFinal)throws Exception{
        if (fechaInicial.isBefore(fechaFinal)){
            throw new Exception(Mensaje.FECHA_INVALIDA.getMensaje());
        }else{
            return true;
        }
    }

    public boolean validarCosto (String costo)throws Exception{
        if(!util.validarExpresionRegular(costo, "^\\$?\\d+(\\.\\d{1,2})?$"));
        else{
            return true;
        }
    }
}
