package mesources;

public class Principal3 {

    public static void main(String[] args) {
          int binario = 100101;
          //convertimos a cadena de texto
          
          String sbinario = String.valueOf(binario);//"100101"
          int decimal0 = Integer.parseInt(sbinario.charAt(0)+"") * (int)Math.pow(2,5);
          int decimal2 = Integer.parseInt(sbinario.charAt(3)+ "") * (int)Math.pow(2,2);
          int decimal3 = Integer.parseInt(sbinario.charAt(5)+ "") * (int)Math.pow(2,0);
            System.out.println("Resultado: " + (decimal0+decimal2+decimal3));
    }
    
}

/* Math.pow            POTENCIA                         double
ObjetoCadena.charAt(0) obtener un caracter e una cadena char
String.valueOf         Convierte número a cadena        String
*/