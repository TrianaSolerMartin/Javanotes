package vectos;

import java.util.Scanner;
// @author Administrator

public class Principal1 {

    public static void main(String[] args) {
        System.out.println("FORMAS DE DECLARAR VECTOR");
        System.out.println("--------------------");
        System.out.println("ESTATICA");
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Dinámica");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int n = sc.nextInt();
        int[] vector1 = new int[n];
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese un número [" + i + " ] = ");
      
        vector1[i] = sc.nextInt();
          }

    }

}
