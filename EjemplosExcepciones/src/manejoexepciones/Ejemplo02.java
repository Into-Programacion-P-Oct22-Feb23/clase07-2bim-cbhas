package manejoexepciones;

import java.util.Scanner;

public class Ejemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valor 1:");
        int valor1 = entrada.nextInt(); // se espera un valor entero
        System.out.println("Ingrese valor 2:");
        int valor2 = entrada.nextInt(); // se espera un valor entero
        int resultado = valor1 / valor2;

        System.out.printf("Resultado %d", resultado);

    }
}
