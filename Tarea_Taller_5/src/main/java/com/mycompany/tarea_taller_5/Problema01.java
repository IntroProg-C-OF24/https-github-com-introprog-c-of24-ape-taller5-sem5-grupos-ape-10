/*
Problema-1
Edad para Votar: Determinar si una persona es elegible 
para votar en función de su edad (mayor o igual a 18 años). 
 */
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad porfavor:");
        edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Puede votar =) ");
        }
        else {
            System.out.println("No puede votar =( ");
        }
    }
}
