package expresionesregulares;

import java.util.Scanner;

public class ExpresionesRegulares {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo1();
        ejemplo2(); // Llamada al segundo método para probar su funcionalidad
        ejemplo3();
    }

    public static void ejemplo1() {
        String cadena;
        String patron = "[0-9]+";
        boolean correcto;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("No es un número entero. Inténtelo de nuevo.");
            }
        } while (!correcto);

        // Si llega aquí, la cadena es un número entero positivo válido
        int numero = Integer.parseInt(cadena);
        System.out.println("Número entero ingresado: " + numero);
    }

    public static void ejemplo2() {
        String cadena = "";
        String patron = "\\S+";
        boolean correcto;

        do {
            System.out.print("Ingrese una cadena sin espacios en blanco: ");
            cadena = sc.nextLine();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("La cadena contiene espacios en blanco. Inténtelo de nuevo.");
            }
        } while (!correcto);

        // Si llega aquí, la cadena no contiene espacios en blanco
        System.out.println("Cadena ingresada sin espacios en blanco: " + cadena);
    }

    public static void ejemplo3() {
        String cadena = "";
        String patron = "\\s+";//de uno a mas espacios en blanco
        String cadenaSinEspacios;
        System.out.print("Ingrese una cadena con espacios en blancojhkhkh: ");
        cadena = sc.nextLine();
        cadenaSinEspacios = cadena.replaceAll(patron, " ");
        System.out.println(cadenaSinEspacios);
    }
}
