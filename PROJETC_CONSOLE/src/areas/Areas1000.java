
package areas;

// @author Administrator
public class Areas1000 {

    public static void main(String[] args) {       
        Triangulo1.cabezera();
        for (int i=0; i<100; i++){
            //constructor siempre hace referencia a como hemos declarado las funciones reutilizbles
            Triangulo1 x = new Triangulo1 (
            (int) (Math.random() * 10000 + 1),
            (int) (Math.random() * 10000 + 1));
            
            x.cuerpo(i+1);
        }
    }
}
