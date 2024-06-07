package mesources;
//generador aleatorio de 
// @author Administrator
public class Principal11 {

    public static void main(String[] args) {
        String dialetra = "";
        int dia = (int)(Math.random()* 9 + 1);
        switch(dia){
            case 1: dialetra = "Lunes"; break;
            case 2: dialetra = "Martes"; break;
            case 3: dialetra = "Miércoles"; break;
            case 4: dialetra = "Jueves"; break;
            case 5: dialetra = "Viernes"; break;
            case 6: dialetra = "Sábado";break;
            case 7: dialetra = "Domingo";break;
            default: System.out.println("Dia no valido");
        }
        System.out.println( dialetra);
    
    }
}