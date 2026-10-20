/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiocirculo;
  import java.util.Scanner;

/**
 *
 * @author luis
 */
public class RadioCirculo {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio al usuario
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Validar que el radio no sea negativo
        if (radio < 0) {
            System.out.println("Error: El radio no puede ser negativo.");
        } else {
            // Calcular el área usando la fórmula: PI * radio^2
            double area = Math.PI * Math.pow(radio, 2);

            // Imprimir el resultado con dos decimales
            System.out.printf("El área del círculo con radio %.2f es: %.2f%n", radio, area);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
