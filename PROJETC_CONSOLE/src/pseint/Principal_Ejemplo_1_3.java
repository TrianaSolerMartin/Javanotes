package pseint;

// @author Administrator
import java.util.Scanner;

public class Principal_Ejemplo_1_3 {

    public static void main(String[] args) {
        versionPOO1();
    }

    public static void versionEstructurada() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double r;

        System.out.print("INGRESA A");
        a = sc.nextInt();
        System.out.print("INGRESA B");
        b = sc.nextInt();

        r = Math.pow((a + b), 2) / 3;

        System.out.printf("Resultado: %.2f", r);
    }

    public static void versionPOO1() {
        Ejemplo_1_3 objeto = new Ejemplo_1_3();
        objeto.entrada();
        objeto.imprimirResultado();
                }
}
