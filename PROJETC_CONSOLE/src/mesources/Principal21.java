package mesources;

import java.util.Scanner;

public class Principal21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        String nombre;
        // Patrón modificado para incluir caracteres con acentos
        String patron = "[A-ZÁÉÍÓÚÑÜ][a-záéíóúñü]+\\s[A-ZÁÉÍÓÚÑÜ][a-záéíóúñü]+";
        
        System.out.println("INGRESE UN NOMBRE");
        nombre = sc.nextLine();
        
        if (nombre.matches(patron)) {
            System.out.println("Nombre válido: " + nombre);            
        } else {
            System.out.println("Nombre inválido: " + nombre);
        }
        sc.close();
    }
}
