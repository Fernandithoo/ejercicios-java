/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.centimetros;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Centimetros {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese la medida en centímetros (cm): ");
        double centimetros = teclado.nextDouble();

        // 2. Algoritmo de conversión
        double pulgadas = centimetros / 2.54;

        // 3. Salida de resultados
        System.out.println("\n--- RESULTADO DE LA CONVERSIÓN ---");
        System.out.printf("%.2f centímetros equivalen a: %.2f pulgadas.%n", centimetros, pulgadas);

        teclado.close();
    }
}
