/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiempo;

//importamos 
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Tiempo {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Ingrese el tiempo total en segundos: ");
        long segundosTotales = teclado.nextLong();

        // 2. Algoritmo de conversión
        long horas = segundosTotales / 3600;
        long minutos = (segundosTotales % 3600) / 60;
        long segundosRestantes = segundosTotales % 60;

        // 3. Salida de resultados
        System.out.println("\n--- TIEMPO EQUIVALENTE ---");
        System.out.printf("%d segundos equivalen a: %d horas, %d minutos y %d segundos.%n", 
                segundosTotales, horas, minutos, segundosRestantes);

        teclado.close();
    }
}
