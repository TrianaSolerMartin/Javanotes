package mesources;

public class Principal {

    public static void main(String[] args) {
        char letter = 'A';
                System.out.println("Código ASCII: " +(int)letter);
                System.out.println("Codigo LETRA: " + letter);
                
                //COMO IMPRIMIR LASLTRAS DEL ALFABETO
                for(int i=65; i<=90; i++) {
                    System.out.println((char)i);
                }                    
    }
}