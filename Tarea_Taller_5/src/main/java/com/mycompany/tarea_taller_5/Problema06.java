/*
Problema-6
Categoría de Edad: Clasificar a una persona en una 
categoría de edad (niño, adolescente, adulto) en 
función de su edad. 
*/
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
                
        System.out.println("Ingresar la edad: ");
        edad = teclado.nextInt();
        System.out.println("==============================");
        if(edad <= 12){
            System.out.println("Niño");
        }
        else{
            if(edad <= 18){
                System.out.println("Adolecente");
            }
            else{
                if(edad <= 40){
                    System.out.println("Adulto");
                }
                else{
                    System.out.println("Adulto mayor");
                }
            }
        }
    }
    
}
