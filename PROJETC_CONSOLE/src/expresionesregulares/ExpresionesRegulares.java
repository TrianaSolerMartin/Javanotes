package expresionesregulares;

import java.util.Scanner;
import java.util.Random;

public class ExpresionesRegulares {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo10(10);
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
        System.out.print("Ingrese una cadena con espacios en blanco sin preocuparte por cuanto empacios introduces ya que e sustituirá unicaméte por 1: ");
        cadena = sc.nextLine();
        cadenaSinEspacios = cadena.replaceAll(patron, " ");
        System.out.println(cadenaSinEspacios);
    }

    public static void ejemplo9() {
        String cadena = "";
        String patron = "(191[6-8]|200[0123])";
        boolean correcto;

        do {
            System.out.print("ingrese una cadena");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) 
                System.out.println("no cumple el patron");

        }while (!correcto);
    } 
    
    public static void ejemplo10(int cantidad) {
        String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789?=#&%";
        String simbolos = "?=#&%";
        String patron = "^(?=.*[A-Za-z])(?=.*[?=#&%])[A-Za-z0-9?=#&%]{8,}$";

        int contador = 0;
        while (contador < cantidad) {
            char[] passwordArray = new char[(int)(Math.random() * 5) + 8]; // Longitud aleatoria entre 8 y 12 caracteres
            boolean tieneLetra = false;
            boolean tieneSimbolo = false;

            for (int i = 0; i < passwordArray.length; i++) {
                int index = (int)(Math.random() * caracteresValidos.length());
                char caracter = caracteresValidos.charAt(index);
                passwordArray[i] = caracter;

                if (Character.isLetter(caracter)) {
                    tieneLetra = true;
                } else if (simbolos.indexOf(caracter) != -1) {
                    tieneSimbolo = true;
                }
            }

            String password = new String(passwordArray);
            if (tieneLetra && tieneSimbolo && password.matches(patron)) {
                System.out.println("Contraseña generada: " + password);
                contador++;
            }
        }
    }
}        