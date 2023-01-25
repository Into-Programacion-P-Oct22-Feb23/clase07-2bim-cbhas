package manejoexepciones;

public class Ejemplo03 {

    public static void main(String[] args) {
        try {
            int valor1 = 10;
            int valor2 = 0;
            int resultado = valor1 / valor2;

            System.out.printf("Resultado %d", resultado);

        } catch (ArithmeticException arithmeticException) {

            System.out.println("Lo sentimos hay un error");
            System.out.printf(" - De tipo %s\n", arithmeticException);

        }

        System.out.println("Continuamos");
    }

}
