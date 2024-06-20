package expresionesregulares;

import java.util.Scanner;

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
        /*String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789?=#&%";
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
        }*/
      /*  String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789?=#&%";
        String simbolos = "?=#&%";
        String patron = "^(?=.*[A-Za-z])(?=.*[?=#&%])[A-Za-z0-9?=#&%]{8,}$";

        for (int contador = 0; contador < cantidad; ) {
            String password = generarPasswordAleatoria(caracteresValidos, simbolos);
            if (password.matches(patron)) {
                System.out.println("Contraseña generada: " + password);
                contador++;
            }
        }
    }

    public static String generarPasswordAleatoria(String caracteresValidos, String simbolos) {
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
        return new String(passwordArray);
    }*/
       String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789?=#&%";
        String simbolos = "?=#&%";

        for (int contador = 0; contador < cantidad; ) {
            String password = generarPasswordAleatoria(caracteresValidos, simbolos);
            if (esValida(password)) {
                System.out.println("Contraseña generada: " + password);
                contador++;
            }
        }
    }

    public static String generarPasswordAleatoria(String caracteresValidos, String simbolos) {
        int longitud = (int)(Math.random() * 5) + 8; // Longitud aleatoria entre 8 y 12 caracteres
        char[] passwordArray = new char[longitud];

        boolean tieneLetra = false;
        boolean tieneSimbolo = false;

        for (int i = 0; i < longitud; i++) {
            char caracter = caracteresValidos.charAt((int)(Math.random() * caracteresValidos.length()));
            passwordArray[i] = caracter;

            if (Character.isLetter(caracter)) {
                tieneLetra = true;
            } else if (simbolos.indexOf(caracter) != -1) {
                tieneSimbolo = true;
            }
        }

        // Si no se han añadido aún letra o símbolo, forzar la inclusión
        if (!tieneLetra) {
            passwordArray[0] = caracteresValidos.charAt((int)(Math.random() * 52)); // Forzar letra en primera posición
        }
        if (!tieneSimbolo) {
            passwordArray[1] = simbolos.charAt((int)(Math.random() * simbolos.length())); // Forzar símbolo en segunda posición
        }

        return new String(passwordArray);
    }

    public static boolean esValida(String password) {
        String patron = "^(?=.*[A-Za-z])(?=.*[?=#&%])[A-Za-z0-9?=#&%]{8,}$";
        return password.matches(patron);
    }
}

// triana soler martin departamento de reservas { triana soler martin departamen}[][]{}}  1!@ Ç ç XÇÇÇÇ} çç}}}}}dfgqwertyasdfghjklop`.,; . ----..,m--   {}