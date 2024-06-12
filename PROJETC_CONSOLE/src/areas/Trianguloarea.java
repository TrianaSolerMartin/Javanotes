package areas;

import java.util.Scanner;

public class Trianguloarea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double base, altura;
       
       System.out.print("Ingresa base");
            base = sc.nextDouble();
       System.out.print("Ingresa Altura");
            altura = sc.nextDouble();
            
        Triangulo1 triangulo = new Triangulo1(base,altura);
        
        System.out.println(triangulo);
        System.out.println(triangulo.Areacalculator());
        triangulo.setAltura(10);
        System.out.print(triangulo);
    }

}
