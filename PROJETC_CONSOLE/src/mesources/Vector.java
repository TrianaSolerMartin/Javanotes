package mesources;
// @author Administrator
public class Vector {

    public static void main(String[] args) {
        /*double n1 = 5.6;
        double n2 = 5.6; 
        double n3 = 8.1;
        double n4 = 5.6;
        double n5 = 8.1;*/
                        // 0     1   2    3     4 
        double [] nota = {5.6, 5.6, 8.1, 5.6, 8.1, 0.6, 5,9};
        System.out.println("Nota 1: " + nota[0]);
        //manejo de errores
        try {
            System.out.println("Nota 6: " +nota[5]);
            //desbordamiento del array
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("No se ha encontrado todos los datos requeridos en la lista");
    }
        double suma = 0.0;
        /*for (int i=0; i<nota.length; i++){
            suma = suma +nota [i];
        }
        System.out.println("Promedio: for " + suma/nota.length);
        suma =0;*/
        for (double n: nota){
            suma = suma + n;
        }
        System.out.println("Promedio usando for each: " + suma/nota.length);
    }
}