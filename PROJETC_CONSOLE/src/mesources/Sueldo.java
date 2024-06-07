
package mesources;

// @author Administrator
public class Sueldo {

    public static void main(String[] args) {
        double [] vectorsueldo = {1500.50, 1200.30, 900.00, 2500.40, 1800.00};
        double nomina = 0;
        
        for (double sueldo: vectorsueldo) {
            nomina = nomina + sueldo;            
        }
        System.out.println("TOTAL NOMINA: " + nomina);  
    }
}
