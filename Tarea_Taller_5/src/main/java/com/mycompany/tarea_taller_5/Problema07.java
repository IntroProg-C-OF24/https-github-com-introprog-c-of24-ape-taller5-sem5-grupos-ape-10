/*
 Problema-7
Rango de Notas: Asignar una letra (A, B, C, D) 
a una calificación en función de su rango 
(A para 90-100, B para 80-89, etc.).
*/
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        
        System.out.println("Ingrese su nota porfavor: ");
        nota = teclado.nextInt();
        System.out.println("==============================");
        
        if(nota <= 100){
            if(nota >= 90){
                System.out.println("A");
            }
            else{
                if(nota <= 89){
                    if(nota >= 80){
                        System.out.println("B");
                    }
                    else{
                        if(nota <= 79){
                            if(nota >= 70){
                                System.out.println("C");
                            }
                            else{
                                if(nota <= 69){
                                    if(nota >= 60){
                                       System.out.println("D");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
