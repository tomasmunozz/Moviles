package org.example.validaciones;
import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;
public class LocalValidacion {
    protected Util util=new Util();
public boolean validarNit (Integer nit)throws Exception{
    if (nit.length() != 10) {
        throw new Exception("Número de NIT inválido");

    } else if (!util.validarExpresionRegular(nit,  "^[0-9]+$")) {
        throw new Exception("El NIT solo puede contener números");

    }else{
        return true;
    }
}

    public Boolean validarNombre(String nombre)throws Exception {
        if(nombre.length()>30){
            throw new Exception("El nombre debe ser menor a 30 caracteres");
        }else {
            return true;
        }
    }




}
