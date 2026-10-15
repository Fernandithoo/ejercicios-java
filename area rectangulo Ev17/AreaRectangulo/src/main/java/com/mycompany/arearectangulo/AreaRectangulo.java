/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arearectangulo;


//Importamos la libreria 
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Leemos los datos y guardamos los resultados en la variable
        System.out.print("Ingrese la longitud del lado (A): ");
        double a = teclado.nextDouble();

        System.out.print("Ingrese la longitud del lado (B): ");
        double b = teclado.nextDouble();

        // Hacemos las operaciones matematicas
        double perimetro = 2 * a + 2 * b;
        double area = a * b;

        // Mostramos los resultados en pantalla
        System.out.println("-------RESULTADOS------");
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);

        teclado.close();
    }
}
