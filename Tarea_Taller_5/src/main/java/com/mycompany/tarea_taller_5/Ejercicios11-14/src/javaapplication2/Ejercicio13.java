/*
Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 */
package javaapplication2;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la marca del automóvil:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el origen del automóvil (Alemania, Japón, Italia, USA):");
        String origen = scanner.nextLine();

        System.out.println("Ingrese el costo del automóvil:");
        double costo = scanner.nextDouble();

        // Calcular el impuesto según el origen
        double impuesto = 0;

        switch (origen.toLowerCase()) {
            case "alemania":
                impuesto = costo * 0.2;
                break;
            case "japón":
                impuesto = costo * 0.3;
                break;
            case "italia":
                impuesto = costo * 0.15;
                break;
            case "usa":
                impuesto = costo * 0.08;
                break;
            default:
                System.out.println("Origen no válido. Impuesto por defecto: 0%");
        }

        // Calcular el precio de venta
        double precioVenta = costo + impuesto;

        // Imprimir resultados
        System.out.println("Impuesto a pagar: " + impuesto);
        System.out.println("Precio de venta (incluido el impuesto): $" + precioVenta);
    }
}

        
        
   
    
    

