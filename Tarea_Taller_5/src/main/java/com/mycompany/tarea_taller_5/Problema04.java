/*
Problema-4
Descuento en Compras: Calcular el precio final
de un producto con un descuento del 10% si el
precio original es mayor de $100; De lo contrario,
no hay descuento.
*/
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio, porcentaje;
        
        System.out.println("Ingrese el precio del producto:");
        precio = teclado.nextDouble();
        
        porcentaje = (precio * 10)/100;
        
        if(precio >= 100){
            System.out.println("Valor a pagar con descuento es: ");
            System.out.println(precio - porcentaje);
        }
        else{
            System.out.println("Valor a pagar sin Descuento es: "+precio);
        }
        
    }
    
}
