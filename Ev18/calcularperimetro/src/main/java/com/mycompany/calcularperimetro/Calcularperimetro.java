/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularperimetro;

/**
 *
 * @author luis
 */
//Importamos la libreria scanner para perdi los datos por teclado
import java.util.Scanner;

public class Calcularperimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        //Pedimos la entrada de datos por consola
        System.out.print("Ingrese la longitud del lado del cuadrado (a): ");
        double lado = scanner.nextDouble();
        
        //Hacemos las operaciones matematicas 
        double perimetro = 4 * lado;
        double area = Math.pow(lado, 2);
        
        //Mostramos los resultados por consla 
        System.out.println("---------------------------------");
        System.out.println("         Resultados");
        System.out.println(" El perímetro es:" + perimetro);
        System.out.println("El area es: " + area);
        
        scanner.close();
    }
}