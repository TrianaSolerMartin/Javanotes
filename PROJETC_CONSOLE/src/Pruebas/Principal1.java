
package Pruebas;

// @author Administrator
import java.util.ArrayList;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        List<String> nombres_al = new ArrayList<>();

        nombres_al.add("Juan");
        nombres_al.add("Pedro");
        nombres_al.add("Maria");
        nombres_al.add("Jose");
    
    for (String elemento : nombres_al){
        System.out.println(elemento);
    }}
}