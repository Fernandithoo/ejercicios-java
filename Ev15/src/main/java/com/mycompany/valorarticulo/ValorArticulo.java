/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valorarticulo;

//Importamos esta cosa 
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class ValorArticulo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Lectura de datos de entrada
        System.out.print("Ingrese el valor por unidad del artículo: ");
        double valorUnidad = teclado.nextDouble();

        System.out.print("Ingrese la cantidad de artículos a llevar: ");
        int cantidad = teclado.nextInt();

        // 2. Algoritmo de cálculo
        double valorTotal = valorUnidad * cantidad;

        // 3. Impresión del resultado
        System.out.println("\n--- TOTAL A PAGAR ---");
        System.out.println("Cantidad de artículos: " + cantidad);
        System.out.println("Precio unitario: $" + valorUnidad);
        System.out.println("El valor total a pagar es: $" + valorTotal);

        teclado.close();
    }
}
