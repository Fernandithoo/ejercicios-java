package com.mycompany.condicional;

import java.util.Scanner;

public class login {
    
    //Método que activa el inicio de sesión
    public void iniciarSesion() {
        // Se usa System.in en lugar de System.class
        Scanner teclado = new Scanner(System.in); 
        
        //Hacemos el sistema de login
        System.out.println("\n--- BIENVENIDO AL SISTEMA DE LOGIN ---");
        
        //Pedimos el usuario
        System.out.print("Introduce tu usuario: ");
        String usuario = teclado.nextLine();
        
        //Pedimos la contraseña
        System.out.print("Introduce tu contraseña: ");
        String password = teclado.nextLine();
        
        //Si el usuario es igual a "admin", y la contraseña es "1234" exito
        if (usuario.equals("admin") && password.equals("1234")) {
            System.out.println("¡Inicio de sesión exitoso!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
