/*
Problema-3
Mayor de dos números: Dados tres números,
determine cuál es el mayor. Si son iguales,
muestra un mensaje. 
*/
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA, numB, numC;
        
        System.out.println("Ingrese Primer numero: ");
        numA = teclado.nextInt();
        System.out.println("Ingrese Segundo numero: ");
        numB = teclado.nextInt();
        System.out.println("Ingrese Tercer numero: ");
        numC = teclado.nextInt();
        
        if(numA == numB){
            if(numB == numC){
                System.out.println("Los numeros son iguales");
            }                
        }
        else{
             if(numA > numB){
                if(numA > numC){
                    System.out.println("El mayor es: "+numA);
                }
                else{
                    System.out.println("El mayor es: "+numC);
                }
            }
            else{
                if(numB > numC){                    
                   System.out.println("El mayor es: "+numB);
                }
                else{
                    if(numC > numA){
                        System.out.println("El mayor es: "+numC);
                    }
                }
            }                
        }         
    }    
}
