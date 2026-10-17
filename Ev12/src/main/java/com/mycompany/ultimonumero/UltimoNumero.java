/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ultimonumero;

//importamos la libreria 
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class UltimoNumero {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos el numero por la consola
        System.out.print("Introduce un número (Maximo 10 numeros): ");
        int numero = scanner.nextInt();
        
        // Obtiene la última cifra usando el operador modulo (%)
        int ultimaCifra = Math.abs(numero) % 10;
        
        //Mostramos el ultimo numero
        System.out.println("La última cifra es: " + ultimaCifra);
        
        scanner.close();
    }
}
