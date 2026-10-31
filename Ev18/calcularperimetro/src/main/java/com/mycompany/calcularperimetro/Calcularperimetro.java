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
        //Entrada de datos por teclado
        Scanner teclado = new Scanner(System.in);
        
        //Preguntamos los datos al usuario
        
        System.out.print("Ingrese el lado 1: ");
        double lado1 = teclado.nextDouble();
        
        System.out.print("Ingrese el lado 2: ");
        double lado2 = teclado.nextDouble();
        
        System.out.print("Ingrese el lado 3: ");
        double lado3 = teclado.nextDouble();
        
        //Calculamos la longitud de los tres lados usando la formula P = lado1 + lado2 + lado3 
        
        double perimetro = lado1 + lado2 + lado3;
        
        //Salida
         System.out.print("El perimetro del lado es: "+ perimetro);
       
    }
}
 