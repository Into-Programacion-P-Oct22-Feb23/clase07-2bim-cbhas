package manejoexepciones;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Ejemplo04 {

    public static void main(String[] args) {
        
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:");
            int valor1 = entrada.nextInt();
            System.out.println("Ingrese valor 2:");
            int valor2 = entrada.nextInt(); 
            
            int resultado = valor1 / valor2;

            System.out.printf("Resultado %d", resultado);
            
        } catch (InputMismatchException e) {

            System.out.printf("Existe un error de tipo %s\n",
                    e);
        }
        

    }
}
