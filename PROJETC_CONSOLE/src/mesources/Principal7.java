package mesources;

public class Principal7 {
    //numero aleaatorio de un dado
    public static void main(String[] args) {
       int dado =(int)(Math.random() * /*CantidadNumerosRango*/ 6 + /*PrimerNumeroRango*/ 1);
       System.out.println("Dado: "+ dado);
    }
}
