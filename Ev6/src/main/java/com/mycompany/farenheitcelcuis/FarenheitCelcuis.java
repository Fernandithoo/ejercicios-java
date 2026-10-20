/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farenheitcelcuis;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class FarenheitCelcuis {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de grados F° para hacer la conversion a C°: ");
        double farenheit = teclado.nextDouble();
        
        //Conversion  usando la formula °C=°F−32/1.8
        
        double celsius = farenheit - 32;
        double total = celsius / 1.8;
        
        System.out.println("El resultado de F° a C° es: " + total);
    }
}
