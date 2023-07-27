package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {
    protected Util util=new Util();

    public boolean validarTituloOferta (String titulo) throws Exception{
        if(titulo.length()<=20){
            throw new Exception(Mensaje.NUMERO_CARTACTERES_INVALIDO.getMensaje());
        } else if ((!util.validarExpresionRegular(titulo, "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+$"))) {

        }else {

        }
    }

    public boolean validarFormatoFecha (String fecha){

    }

    public boolean validarEDiferenciaEntreFechas (LocalDate fechaInicial, LocalDate fechaFinal){

    }

    public boolean validarCosto (Double costo){

    }

}
