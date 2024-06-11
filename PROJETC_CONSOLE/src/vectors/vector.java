package vectors;

// @author Administrator
public class vector {

    public static void main(String[] args) {
        int[] enteros = {3, 2, 1, 4};
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(i + "\t" + enteros[i]);
        }

        Object[] datos = {"Luis", 23, 2.34, true, 'h'};
        for (int i = 0; i < datos.length; i++) {
            System.out.println(i + "\t" + datos[i]);
        }
    }
}
