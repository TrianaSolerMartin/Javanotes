package forpackages;

// @author Administrator
public class for_1 {

    public static void main(String[] args) {
        System.out.println("SERIE : 0.1, 0.2, 0.3, 0.4 ... 1.0");
        for(float i =0.1f; i<=1.0f; i=redondear(i + 0.1f)){
            System.out.print(i + "  ");
        }
    }
    public static float redondear (float numero){
    return (float)(Math.round(numero*100.0)/100.0);
    }
  
}
