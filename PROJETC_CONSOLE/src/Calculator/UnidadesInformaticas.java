package Calculator;

import java.util.Scanner;

public class UnidadesInformaticas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Mostrar menú de unidades
        String[] unidades = Calculator.getUnidades();
        for (int i = 0; i < unidades.length; i++) {
            System.out.println("(" + (i + 1) + ") " + unidades[i]);
        }

        // Solicitar unidad de medida inicial
        System.out.print("Ingrese la unidad de medida inicial (1-9): ");
        int opcioni = sc.nextInt() - 1;

        // Solicitar cantidad
        System.out.println("Ingrese la cantidad:");
        double cantidad = sc.nextDouble();
        
        Calculator.cabezera();

        // Crear objeto Conversion y mostrar conversiones
        Calculator conversion = new Calculator(cantidad, opcioni);
        conversion.mostrarConversiones();
    }
}