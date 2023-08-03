package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class ReservaValidacion {

    protected Util util=new Util();
    public boolean validarFormatoFecha (String fecha)throws Exception{
        if (!util.validarExpresionRegular(fecha, "^(0?[1-9]|[1-2][0-9]|3[0-1])/(0?[1-9]|1[0-2])/\\d{4}$")
        ){throw new Exception(Mensaje.FECHA_INVALIDA.getMensaje());
        }else {
            return true;
        }
    }

    public boolean validarNumeroPersonas (int nPersonas)throws Exception{
        if (nPersonas>4 || nPersonas<0){
            throw new Exception("El numero de personas debe ser entre 1 y 4");
        }else {
            return true;
        }
    }

}
