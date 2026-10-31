/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diassemana;
//Importamos la libreria necesaria
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class DiasSemana {
    public static void main(String[] args) {
        // Crear el Scanner para leer la entrada.
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número del 1 al 7: ");
        int numeroIngresado = teclado.nextInt();
        
        // Aqui va la class el objeto de la otra clase
        GestorDias miGestor = new GestorDias();
        
        // Llamamos al metodo de la otra clase y guardamos el resultado
        String resultadoDia = miGestor.obtenerNombreDia(numeroIngresado);
        
        // Mostrar la respuesta en pantalla
        System.out.println("El día correspondiente es: " + resultadoDia);
        
        // Cerramos el escaner.
        teclado.close();
    }
}

   