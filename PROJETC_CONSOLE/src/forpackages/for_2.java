
package forpackages;

// @author Administrator
public class for_2 {

    public static void main(String[] args) {
        System.out.println("SERIE: 0.1, 0.02, 0.03, 0.04 ... 1.00");
        int c =0;
        for(float i=0.01f; i<=1.00f; i = redondear(i + 0.01f)) {
            System.out.print(i + "  ");
            c++;
            if(c==10){
                System.out.println();
                c=0;
            }
        }
    }
    public static float redondear (float numero){
    return (float)(Math.round(numero*100.00)/100.00);
    }
    }
