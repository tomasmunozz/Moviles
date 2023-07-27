package org.example.utilidades;

public enum Mensaje {
    NUMERO_CARTACTERES_INVALIDO("eL NUMERO DE CARACTERES ES INVALIDO"),
    NOMBRE_INVALIDO("El nombre solo acepta nombres y espacios"),
    CORREO_INVALIDO("Revisa el formato del correo"),
    UBICACION_INVALIDA("La ubicacion solo puede ser in numero entre 1 y 4");
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
