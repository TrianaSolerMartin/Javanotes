package mesources;
// @author Administrator
public class Bucleinfinito {
    public static void main(String[] args) {
        System.out.println("welcome to MATRIX");
        long n = Long.MAX_VALUE;
        int contador = 1;
        for (long i = n; i >-n; i=i -10000000) {
            System.out.print(i + " ");
            contador ++;
            if (contador == 5){
                System.out.println();
                contador =1;
            }                  
        }
    }
}