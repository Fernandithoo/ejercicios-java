package com.mycompany.condicional;

import java.util.Scanner;

public class Controlador {  
    public static void main(String[] args) {
        //Pedimos los datos por teclado
        try (
                Scanner teclado = new Scanner(System.in)) {
            
//Pedimos la edad del usuario
            System.out.print("Por favor, introduce tu edad: ");
            int edad = teclado.nextInt();
            
            //Si la edad pasa de 18 se lee el siguiente script
            if (edad >= 18) {
                System.out.println("Acceso concedido por ser mayor de edad.");
                
                // Llamamos a la clase login despues de colocar la edad, si la edad es menor a 18 el script acaba y no pasa a leer el segundo archivo.
                login pantallaLogin = new login();
                
                //Pasa a leer directamente el otro archivo.
                pantallaLogin.iniciarSesion();
                //Acaba el script si la edad es menor a 18
            } else {
                System.out.println("Acceso denegado. Debes ser mayor de 18 años para iniciar sesión.");
            }
        }
    }
}
