/*
 Problema-8
Calculadora de IMC: Calcular el índice de masa
corporal (IMC) de una persona y clasificarla en
función de su valor (bajo peso, peso normal, sobrepeso, etc.).
*/
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, imc;
        
        System.out.println("Ingrese su Altura:");
        altura = teclado.nextDouble();
        System.out.println("Ingrese su Peso:");
        peso = teclado.nextDouble();
        System.out.println("==============================");
        
        imc = peso/(Math.pow(altura, 2));
        
        if(imc <= 18.5){
            System.out.println("Bajo Peso");
        }
        else{
            if(imc <= 24.9){
                System.out.println("Peso Normal");
            }
            else{
                if(imc <= 29.9){
                    System.out.println("Sobrepeso");
                }
                else{
                    System.out.println("Obesidad");
                }
            }
        }
    }
    
}
