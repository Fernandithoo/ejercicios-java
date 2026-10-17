/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.centimepulgadas;
// importamos la libreria de scanner 
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class CentimePulgadas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
        //Pedimos los datos por teclado
          System.out.print("Ingresa la cantidad de (CM) centímetros a convertír: ");
        double a = teclado.nextDouble();
        // Definimos lo que vale una pulgada a centimetros
         double b;
        b = 2.54;
        
        //Hacemos la conversión de unidades 
        double pulgadas = a / b;
        
        //Imprimimos los resultados
        
         System.out.println("La cantidad de CM en pulgadas es: " + pulgadas);
       
        
    }
}
