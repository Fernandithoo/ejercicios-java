/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celciosfarengie;
//importamos la libreria Scanner 
import java.util.Scanner;

/**
 *
 * @author luis
 */

 //°F=(°C×1,8)+32°F 

public class CelciosFarengie {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        //Leemos los datos por consola
        System.out.print("Ingrese la cantidad de grados C°");
        double c = teclado.nextDouble();
         //Conversion de datos usando la formula matematica
         double farenheit;
        farenheit = c *1.8 + 32;
        //Imprimimos 
        System.out.println("El resultado de la conversion de C a F es: " + farenheit);
    }
}
