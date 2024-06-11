package unidadesinformaticas;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar variables
        int opcioni;
        double cantidad;
        String[] unidades = {"BYTE", "KILO BYTE", "MEGA BYTE", "GIGA BYTE", "TERA BYTE", "PETA BYTE", "EXA BYTE", "ZETTA BYTE", "YOTTA BYTE"};
        
        // Mostrar menú de unidades
        for (int i = 0; i < unidades.length; i++) {
            System.out.println("(" + (i + 1) + ") " + unidades[i]);
        }
        
        // Solicitar unidad de medida inicial
        System.out.println("Ingrese la unidad de medida inicial (1-9):");
        opcioni = sc.nextInt() - 1;

        // Solicitar cantidad
        System.out.println("Ingrese la cantidad en " + unidades[opcioni] + ":");
        cantidad = sc.nextDouble();

        // Realizar conversiones y mostrar resultados
        System.out.println("Las conversiones son:");
        for (int i = 0; i < unidades.length; i++) {
            double cantidadConvertida = cantidad;
            int saltos = i - opcioni;

            if (saltos > 0) {
                // Si hay saltos positivos, dividimos
                for (int j = 0; j < saltos; j++) {
                    cantidadConvertida /= 1024;
                }
            } else if (saltos < 0) {
                // Si hay saltos negativos, multiplicamos
                for (int j = 0; j < -saltos; j++) {
                    cantidadConvertida *= 1024;
                }
            }
            
            // Imprimir resultado
            System.out.println(String.format("%.4f", cantidadConvertida) + " " + unidades[i]);
        }
    }
}
