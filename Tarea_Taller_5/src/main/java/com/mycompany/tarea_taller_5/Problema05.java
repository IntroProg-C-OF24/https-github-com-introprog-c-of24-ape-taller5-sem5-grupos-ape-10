/*
Problema-5
Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. 
Si es bisiesto, muestra un mensaje especial. 
*/
package com.mycompany.tarea_taller_5;
import java.util.Scanner;
public class Problema05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anio;
                
        System.out.println("Ingresar el año: ");
        anio = teclado.nextInt();
        
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
           System.out.println("El año es Bisiesto =) ");
                      
        }
    }
}
