/*
Problema-9
Ordenamiento de Tres Números: Dados tres números, 
ordenarlos en orden ascendente. 
*/
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA, numB, numC;
        
        System.out.println("Ingrese Primer numero:");
        numA = teclado.nextInt();
        System.out.println("Ingrese Segundo numero:");
        numB = teclado.nextInt();
        System.out.println("Ingrese Tercer numero:");
        numC = teclado.nextInt();
        System.out.println("==============================");
        
        if(numA < numB){
            if(numA < numC){
                if(numB < numC){
                    System.out.println(numA);
                    System.out.println(numB);
                    System.out.println(numC);
                }
                else{
                    System.out.println(numA);
                    System.out.println(numC);
                    System.out.println(numB);
                }
            }
            else{
                System.out.println(numC);
                System.out.println(numA);
                System.out.println(numB);
            }
        }
        else{
            if(numB < numC){
               if(numC < numA){
                   System.out.println(numB);
                   System.out.println(numC);
                   System.out.println(numA);
               }
               else{
                   System.out.println(numB);
                   System.out.println(numA);
                   System.out.println(numC);
               }                
            }
            else{
                if(numC < numA){
                    if(numA < numB){
                        System.out.println(numC);
                        System.out.println(numA);
                        System.out.println(numB);
                    }
                    else{
                        System.out.println(numC);
                        System.out.println(numB);
                        System.out.println(numA);
                    }
                }
                                              
            }
        }
    }
    
}
