package mesources;
//blucle infinito
// @author Administrator
public class Principal16 {

    public static void main(String[] args) {
        System.out.println("blucle infinito");
        int i = 1;
        
        for (;true;){
                      if (i == 5) {
                          i = 1;
                          continue;
                      }
             System.out.print(i + " ");
            i++;
            
        }

    }
}
