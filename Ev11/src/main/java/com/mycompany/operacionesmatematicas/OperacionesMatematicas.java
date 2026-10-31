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
        int a = teclado.nextInt();
        
        System.out.print("Ingrese el segundo numero para usar en las operaciones: ");
        int b = teclado.nextInt();
        
        //Hacemos las operaciones matemáticas con los numeros obtenidos 
        
           int suma = a + b ; 
           int resta = a - b ;
           int multiplicacion = a * b;
          
           
            //Mostramos los resultados en consola
        System.out.println("El resultado de la suma es: "+ suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
           
           //Condicional 
           if (b!= 0) {
               System.out.print("El resultado es:"+ (a/b));
           }
           else {
               System.out.println("No se puede dividir entre cero");
           }
    }
}
