package expresionesregulares;

import java.util.Scanner;

public class ExpresionesRegulares {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo1();
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
}
