package unidadesinformaticas;

import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar variables
        int opcioni, opcionf, saltos;
        double cantidad;
        String[] unidades = {"BYTE", "KILO BYTE", "MEGA BYTE", "GIGA BYTE", "TERA BYTE", "PETA BYTE", "EXA BYTE", "ZETTA BYTE", "YOTTA BYTE"};
        
        // Mostrar menú de unidades
        for (int i = 0; i < unidades.length; i++) {
            System.out.println("("+ (i + 1)+")" + unidades[i]);
        }
        // Solicitar unidad de medida inicial
        System.out.println("Ingrese la unidad de medida inicial (1-9):");
        opcioni = sc.nextInt() - 1;

        // Solicitar unidad de medida deseada
        System.out.println("Ingrese la unidad de medida deseada (1-9):");
        opcionf = sc.nextInt() - 1;

        // Solicitar cantidad
        System.out.println("Ingrese la cantidad en " + unidades[opcioni] + ":");
        cantidad = sc.nextDouble();

        // Realizar conversión
        saltos = opcionf - opcioni;
        if (saltos > 0) {
            for (int i = 0; i < saltos; i++) {
                cantidad = cantidad / 1024;
            }
        } else {
            for (int i = 0; i < -saltos; i++) {
                cantidad = cantidad * 1024;
            }
        }
        // Mostrar resultado
System.out.println("La cantidad convertida es: " + String.format("%.4f", cantidad) + " " + unidades[opcionf]);
    }
}