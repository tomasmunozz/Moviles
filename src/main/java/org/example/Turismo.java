package org.example;

import org.example.entidades.Usuario;

import java.util.Scanner;

public class Turismo {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Scanner lea = new Scanner(System.in);

        System.out.println("\u001B[32m----Bienvenido----\u001B[0m");
        System.out.println("\u001B[34m1.Datos del usuario \u001B[0m");
        System.out.print("Digite su nombre y apellidos");
        usuario.setNombres(lea.nextLine());

    }
}