/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.millasmarinas;
//Importamos la libreria scanner 
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class MillasMarinas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        //Leemos los datos y guardamos las variables
        System.out.print("Ingrese el valor de las millas marinas: ");
        double millas = teclado.nextDouble();
        //Hacemos las conversiones de unidades 
        double metros = 1852;
        double total = millas * metros;
        //Moostramos en consola
        System.out.println("El resultado de la conversion de millas a metros es: "+ total);
    
    }
}
