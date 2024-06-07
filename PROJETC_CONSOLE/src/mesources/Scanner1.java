package mesources;

import java.util.Scanner;
// @author Administrator
public class Scanner1 {
//crear un objeto para poder acceder a un metodo
    public static void main(String[] args) {
        //Scanner = clase -> sc = variable objeto  
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese número real?");
        // next = metodo para darme una cadena
        String numero = sc.next();
        // Math es una clase -> pow es un metodo ya que empieza despues de un punto 
        //Clase es double ya que empieza en mayusculas ->  es metodo es el parseDouble
        double cuadrado = Math.pow(Double.parseDouble(numero),2);
        System.out.println("Cuadrado: " + cuadrado);
    }
}
