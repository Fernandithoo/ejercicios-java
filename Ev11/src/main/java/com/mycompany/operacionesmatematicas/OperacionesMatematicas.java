/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionesmatematicas;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class OperacionesMatematicas {

    public static void main(String[] args) {
       
        //llamamos la función para escribir con el teclado en numeros enteros
        
            Scanner teclado = new Scanner(System.in);
        
        //Pedimos los datos a usar para las operaciones matematicas
        System.out.print("Ingrese el primer numero a usar en las operaciones: ");
        double a = teclado.nextDouble();
        
        System.out.print("Ingrese el segundo numero para usar en las operaciones: ");
        double b = teclado.nextDouble();
        
        //Hacemos las operaciones matemáticas con los numeros obtenidos 
        
           double  suma = a + b ; 
           double resta = a - b ;
           double multiplicacion = a * b;
           double division = a / b;
        
   
        
        //Mostramos los resultados en consola
        System.out.println("El resultado de la suma es: "+ suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: "+ division);
        
    }
}
