package javaapplication2;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de días que se hospedará:");
        int numeroDias = scanner.nextInt();

        System.out.println("Ingrese el precio diario de la habitación:");
        double precioDiario = scanner.nextDouble();

        // Calcular el subtotal
        double subtotal = numeroDias * precioDiario;

        // Calcular el descuento según el número de días
        double descuento = 0;

        if (numeroDias > 15) {
            descuento = subtotal * 0.2;
        } else if (numeroDias > 10) {
            descuento = subtotal * 0.15;
        } else if (numeroDias > 5) {
            descuento = subtotal * 0.1;
        }

        // Calcular el total a pagar
        double totalPagar = subtotal - descuento;

        // Imprimir resultados
        System.out.println("Subtotal por pagar: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total por pagar: $" + totalPagar);
    }
}

    
    

