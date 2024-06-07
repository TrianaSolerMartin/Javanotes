
package mesources;

// @author Administrator
public class Prinicipal12 {

    public static void main(String[] args) {
        int diasmes = 0;
        int anio =(int)(Math.random()* 25 + 2000);
        int mes = (int)(Math.random() * 12 +1);
        switch(mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            diasmes = 31;break;
            
            case 4: case 6: case 9: case 11:
            diasmes = 30;break;
            
            case 2: 
            if(
               (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)
                    ) {
                diasmes =29;
            } else {
                diasmes = 28;
            }
                break;
        }
        System.out.println(anio + " " + mes + " = " + diasmes);
    }

}
