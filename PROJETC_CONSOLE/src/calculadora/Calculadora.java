package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        char[] vector = {'+', '-', '*', '/', '#'};
        
        // Mostrar las operaciones disponibles
        System.out.println("Operaciones disponibles:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("(" + (i + 1) + ") " + vector[i]);
        }
        
        // Solicitar al usuario elegir una operación
        int opcion;
        do {
            System.out.print("Ingrese un número del 1 al " + vector.length + ": ");
            opcion = sc.nextInt();
            
            // Verificar que la opción ingresada está dentro del rango
            if (opcion < 1 || opcion > vector.length) {
                System.out.println("Opción inválida. Debe ser un número del 1 al " + vector.length + ".");
            }
        } while (opcion < 1 || opcion > vector.length); // Repetir hasta que se ingrese una opción válida
        
        // Solicitar los números con los que se realizará la operación
        System.out.print("Ingresa el primer número: ");
        x = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        y = sc.nextInt();
        
        // Obtener el operador correspondiente al índice
        char operador = vector[opcion - 1];
        
        // Realizar la operación según el operador seleccionado
        switch (operador) {
            case '+':
                System.out.println("Resultado de la suma: " + (x + y));
                break;
            case '-':
                System.out.println("Resultado de la resta: " + (x - y));
                break;
            case '*':
                System.out.println("Resultado de la multiplicación: " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("Resultado de la división: " + ((double) x / y));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            case '#':
                System.out.println("Resultado de la operación especial (#): " + Math.pow(x, y));
                break;
            default:
                System.out.println("Operador no reconocido.");
        }
    }
}
