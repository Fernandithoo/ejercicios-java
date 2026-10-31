/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diassemana;

/**
 *
 * @author luis
 */
public class GestorDias {

    // Recibimos el número y devuelve el texto del día correspondiente
    public String obtenerNombreDia(int numero) {
        String dia;
        
        switch (numero) {
            case 1: dia = "Lunes"; break;
            case 2: dia = "Martes"; break;
            case 3: dia = "Miércoles"; break;
            case 4: dia = "Jueves"; break;
            case 5: dia = "Viernes"; break;
            case 6: dia = "Sábado"; break;
            case 7: dia = "Domingo"; break;
            default: dia = "Número inválido. Debe ser entre 1 y 7."; break;
        }
        
        return dia;
    }
}