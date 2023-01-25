package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo101 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Ingrese valor 1 a operar: ");
            int valor1 = entrada.nextInt();
            System.out.println("Ingrese valor 2 a operar: ");
            int valor2 = entrada.nextInt();

            if (valor1 == 10 || valor1 == 20 || valor1 == 30) {
                throw new Exception("Numeros prohibidos");
            }
            
            if (valor2 == 2 || valor2 == 4 || valor1 == 14) {
                throw new Exception("Numeros prohibidos");

            }

            if (valor1 < 0 || valor2 < 0) {
                throw new Exception("Número negativos");
            }

            if (valor1 > 100) {
                throw new Exception("El valor de primer valor es muy alto");
            }
            int resultado = valor1 / valor2;
            System.out.printf("Resultado %s\n", resultado);

        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
    }
}
