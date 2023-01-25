package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo08 {
    
    public static void main(String[] args) {
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:");
            int valor1 = entrada.nextInt(); // se espera un valor entero
            System.out.println("Ingrese valor 2:");
            int valor2 = entrada.nextInt(); // se espera un valor entero
            int resultado = valor1 / valor2;
            double resultado2 = (double)resultado;
            System.out.printf("Resultado %.2f", resultado2);
        }
        catch(Exception todo){
            
            System.out.printf(" Lo sentimos hay un error de tipo: %s\n", todo);
        
        }
               
    }
}
