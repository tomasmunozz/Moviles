package org.example.validaciones;

import org.example.utilidades.Util;

public class UsuarioValidacion {

    protected Util util=new Util();


    public UsuarioValidacion() {
    }

    public boolean validarNombres(String nombres) throws Exception{
        if (nombres.length()<10){
            throw new Exception("Revisar cantidad de caracteres");
        } else if (!util.validarExpresionRegular(nombres, "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+$")) {
            throw new Exception("Solo se aceptan letras en el nombre");
        } else {
            return true;
        }
    }

    public boolean validarCorreo(String correo) throws Exception{
        if (!util.validarExpresionRegular(correo,"^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@\"\n" +
                "+ \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$")){
            throw new  Exception("El formato del correo no es valido");

        }else {
            return true;
        }
    }

    public boolean validarUbicacion(Integer ubicacion) throws Exception{
        if (ubicacion <1 || ubicacion>4){
            throw new Exception("Esta ubicacion no es valida");
        }else {return true;}
    }

}
