package javaapplication1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        double edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextDouble();
        if (edad >= 18){
        System.out.println("Usted puede votar.");    
        }
        else{
            System.out.println("Usted no puede votar.");
        }
            
    }   
}
