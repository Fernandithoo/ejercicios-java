/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.precioarticulo;

//Importamos esta libreria 
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class PrecioArticulo {

    public static void main(String[] args) {
        // Entrada por teclado
        Scanner teclado =  new Scanner(System.in);
        
        //Pedios los datos
        System.out.print("Ingrese el valor del precio del producto: "); 
        double total = teclado.nextDouble();
         //Calculamos el iva
        double b = 0.19;
        //Operaciones
        double precio_iva = total * b;
        //Sumamos el precio del iva con el total para dar un solo numero.
        double precio_total = precio_iva + total;
        
       //Imprimimos los datos en pantalla
       System.out.println("El valor del articulo sin iva es: " + total);
       System.out.println ("El valor del iva es: "+ precio_iva);
       System.out.println("El valor total a pagar es: " + precio_total);
    }
}
