/*
Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes.
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% 
*/
package javaapplication2;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        double costokh;
        double numkm;
        double desc;
        double total;
        double costot;
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.println("Ingrese costo de los kilovatios por hora: ");
        costokh = teclado.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos en el mes:  ");
        numkm = teclado.nextDouble();
        if (edad > 65){
            costot = costokh*numkm;
            desc = (costot*10)/100;
            total = costot - desc;
            System.out.println("El costo total de la planilla es de: "+total);
        }else{
            costot = costokh*numkm;
            System.out.println("El csoto total de la planilla es de : "+costot);
                 
        }
    }
    
}
