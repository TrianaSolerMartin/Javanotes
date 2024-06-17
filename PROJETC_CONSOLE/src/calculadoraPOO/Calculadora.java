package calculadoraPOO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int contador = 1;

        while (continuar) {
            try {
                System.out.print("Ingrese el primer número: ");
                double numero1 = sc.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double numero2 = sc.nextDouble();

                System.out.print("Ingrese el operador (+, -, *, /, #): ");
                String operador = sc.next();

                Calcular calculo = new Calcular(numero1, numero2, operador);

                if (contador == 1) {
                    Calcular.cabecera();
                }
                calculo.cuerpo(contador);
                contador++;

                System.out.print("¿Desea realizar otra operación? (s/n): ");
                String respuesta = sc.next();
                if (!respuesta.equalsIgnoreCase("s")) {
                    continuar = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor ingrese datos válidos.");
                sc.next(); // Limpiar la entrada incorrecta
            }
        }
    }
}
