
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
        System.out.println();
        System.out.println("RECORRER CADENA EN UN PUERTO ITALIANO");
        String texto = "EN UN PUERTO ITALIANO";
        int longitud = texto.length();
        
        for(int i=0; i<longitud; i++){
            System.out.print(texto.charAt(i)+ "");
        }
        System.out.println("CUANTAS VOCALES EN EL TEXTO?");
        String patron ="[AEIOU]";
                int contador = 0;      
        for(int i = 0; i < longitud; i++) {
            if (String.valueOf(texto.charAt(i)).matches(patron)) {
                contador++;
            }
        }
        System.out.println("Número de vocales en el texto: " + contador);    
    }
    public static float redondear (float numero){
    return (float)(Math.round(numero*100.00)/100.00);
    }
    }
