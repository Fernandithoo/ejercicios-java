import java.util.Scanner;

public class Mavenproject3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.print("Ingrese la nota del primer corte: ");
        nota1 = teclado.nextDouble();

        System.out.print("Ingrese la nota del segundo corte: ");
        nota2 = teclado.nextDouble();

        nota3 = (3.0 - nota1 * 0.20 - nota2 * 0.20) / 0.60;

        if (nota3 <= 0) {
            System.out.println("Ya tiene la nota necesaria para aprobar.");
        } else if (nota3 <= 5.0) {
            System.out.println("Necesita sacar " + nota3
                    + " en el tercer corte para aprobar.");
        } else {
            System.out.println("No es posible aprobar con una nota maxima de 5.0.");
        }

        teclado.close();
    }
}
