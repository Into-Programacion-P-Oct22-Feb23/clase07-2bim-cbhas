package manejoexepciones;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo06 {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:");
            int valor1 = entrada.nextInt();
            System.out.println("Ingrese valor 2:");
            int valor2 = entrada.nextInt();

            int resultado = valor1 / valor2;
            double resultado2 = (double) resultado;
            System.out.printf("Resultado: %d\n", resultado2);
            
        } catch (InputMismatchException inputMismatchException) {
            System.out.printf("Existe un error de tipo %s\n",
                    inputMismatchException);
            
        } catch (ArithmeticException arithmeticException) {
            System.out.printf("Existe un error de tipo %s\n",
                    arithmeticException);

        } catch (IllegalFormatConversionException illegalFormatConversionException) {
            System.out.printf("Existe un error de tipo %s\n",
                    illegalFormatConversionException);

        }

    }
}
