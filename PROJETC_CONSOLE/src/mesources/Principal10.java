
package mesources;

// @author Administrator
public class Principal10 {

    public static void main(String[] args) {
        int number = (int)(Math.random()*1+ 1);
        System.out.println("Numero: " + number);
        if (number == 0){
            System.out.println("Cero");            
        } else if (number > 0 ){
                    System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }
    }

}
