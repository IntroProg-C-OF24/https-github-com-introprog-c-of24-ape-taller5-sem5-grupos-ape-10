/*
Solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, la cantidad que se requiere y el precio unitario. 
Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 */
package javaapplication2;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        String nombre;
        double cantidad;
        double costo;
        double desc;
        double total;
        double costot;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        nombre = teclado.next();
        System.out.println("Ingrese el costo del producto: ");
        costo = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de productos adquiridos: ");
        cantidad = teclado.nextDouble();
        if (cantidad > 50){
            total = cantidad*costo;
            desc = (total*15)/100;
            costot = total - desc;
            System.out.println("El costo total de, "+nombre+ "es de: "+costot);
        }else{
            total = cantidad*costo;
            System.out.println("El costo total de, "+nombre+ "es de: "+total);
        }
        
        
    }
}
