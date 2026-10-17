package com.mycompany.calculardescueto;

import java.util.Scanner;

public class CalcularDescueto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio de la tarifa (original): ");
        double precioTarifa = scanner.nextDouble();

        System.out.print("Introduce el precio finalmente pagado: ");
        double precioPagado = scanner.nextDouble();

        if (precioTarifa <= 0) {
            System.out.println("Error: El precio de la tarifa debe ser mayor que cero.");
        } else if (precioPagado > precioTarifa) {
            System.out.println("Error: El precio pagado no puede ser mayor que la tarifa original.");
        } else if (precioPagado < 0) {
            System.out.println("Error: El precio pagado no puede ser negativo.");
        } else {
            double porcentajeDescuento = ((precioTarifa - precioPagado) / precioTarifa) * 100;
            System.out.printf("El porcentaje de descuento aplicado es: %.2f%%%n", porcentajeDescuento);
        }

        scanner.close();
    }
}
