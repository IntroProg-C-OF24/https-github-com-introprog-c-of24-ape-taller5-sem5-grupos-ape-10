/*
Problema-2
Día de la Semana: Mostrar el nombre del día de
la semana en función del número ingresado 
(1 para lunes, 2 para martes, etc.). 
*/
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;
        
        System.out.println("Ingrese un numero del 1 al 7 por favor: ");
        dia = teclado.nextInt();
        
        if(dia == 7){
            System.out.println("Domingo");
        }
        else{
            if(dia == 1){
                System.out.println("Lunes");
            }
            else{
                if(dia == 2){
                    System.out.println("Martes");
                }
                else{
                    if(dia == 3){
                        System.out.println("Miercoles");
                    }
                    else{
                        if(dia == 4){
                            System.out.println("Jueves");
                        }
                        else{
                            if(dia == 5){
                                System.out.println("Viernes");
                            }
                            else{
                                if(dia == 6){
                                    System.out.println("Sabado");
                                }
                            }
                        }
                    }
                }
            }
        }
            
    }
}
