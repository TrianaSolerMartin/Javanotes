package mesources;

import java.util.Scanner;

public class Principal20 {

    public static void main(String[] args) {
        //reconocer un numero entero 
        Scanner sc = new Scanner(System.in);

        //Declarar variables
        System.out.println("ingrese un número");

        int entero_numero; //343
        String entero_texto; //"343"
        String patron = "[0-9]+"; //expresion regular para averiguar nuero enteros que incluyan 0 al 9 

        //ENTRADA
        entero_texto = sc.next();
        //metodo matches es el metodo al que le pasamos el patron a cumplir
        if (entero_texto.matches(patron)) {
            System.out.println("ENTRADA CORRECTA: NÚMERO ENTERO");
            entero_numero = Integer.parseInt(entero_texto);
            if (entero_numero >=18){
                System.out.println("Eres mayor de edad");
            } else {
            System.out.println("Eres menor de edad");}
        } else {
            System.out.println("NO ES UN NÚMERO ENTERO");
        }

    }

}
