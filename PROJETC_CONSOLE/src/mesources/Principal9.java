
package mesources;
// @author Administrator
public class Principal9 {

    //generador de numeros random de un dado con respuesta de impar o par en funcion de si el numero aleatrorio su resto de la division entre 2 es 0 o no lo es, por tanto es par o impar
    public static void main(String[] args) {
        int dado = (int) (Math.random() * 6 + 1);
        System.out.println("Dado: "+ dado);
        if (dado % 2 == 0) {
            System.out.println("Par");         
        } else {
            System.out.println("Impar");
        }

    }

}
