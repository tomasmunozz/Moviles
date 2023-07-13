package org.example.entidades;

import org.example.validaciones.UsuarioValidacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

    private Integer id;
    private String documento;
    private String nombres;
    private String correo;
    private Integer ubicacion;

    protected UsuarioValidacion validacion=new UsuarioValidacion();
    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres)  {
       try {
           this.validacion.validarNombres(nombres);
           this.nombres=nombres;
       }catch (Exception error){
           System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
       }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        String patronCorreo = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patron = Pattern.compile(patronCorreo);
        Matcher coincidencia = patron.matcher(correo);

        if (coincidencia.matches()) {
            this.correo=correo;
        } else {
            throw new Exception("Revisa el formato del correo");
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }
}
