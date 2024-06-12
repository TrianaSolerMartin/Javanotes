
package areas;

import circulo.Libreria;
import java.util.Scanner;
// @author Administrator
public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;
        
        System.out.print("ingrese base");
        base =sc.nextDouble();
        
        System.out.print("ingrese altura");
        altura = sc.nextDouble();
        
        area = base*altura/2;
        
        System.out.println("Area: " + Libreria.redondear(area));
    }

}
