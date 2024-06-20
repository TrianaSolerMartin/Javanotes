package fecha;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Principal2 {

    public static void main(String[] args) {
       String[] dias = {"L","M","X","J","V","S","D"};
       String[] meses = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
       for(int mes=1; mes<=12; mes++) {
            int[][] matrizmes = new int[6][7];
            int diaSemana = obtenerDiaSemanaPrimerDiaMesNumero(mes, 2024);
            int numeroDias = obtenerNumeroDiasMes(mes, 2024);
            boolean bandera = false;
            int indice = 1;
            System.out.println("   " + meses[mes-1]);
            System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", dias);
            for(int i=0; i<matrizmes.length; i++) {
                for(int j=0; j<matrizmes[0].length; j++) {
                    if(i==0 && j == diaSemana) {
                       bandera = true; 
                    }
                    if(bandera) {
                       matrizmes[i][j] = indice;
                       indice++;
                    }
                    if(indice > numeroDias) {
                        bandera = false;
                    }
                }
            }
            imprimirMatriz(matrizmes);
            System.out.println();
       }
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    public static int obtenerDiaSemanaPrimerDiaMesNumero(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        DayOfWeek diaSemanaTexto = fecha.getDayOfWeek();// Obtener el día de la semana del primer día del mes
        int diaSemanaNumero = diaSemanaTexto.getValue();// Convertir el día de la semana a un número (1=Lunes, 2=Martes, ..., 7=Domingo)
        return diaSemanaNumero - 1;
    }    
    
    public static int obtenerNumeroDiasMes(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        return fecha.lengthOfMonth();
    }   
    
}