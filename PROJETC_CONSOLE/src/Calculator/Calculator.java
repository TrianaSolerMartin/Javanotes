package Calculator;

public class Calculator {

    private double cantidad;
    private int unidadInicial;
    private static final String[] UNIDADES = {"BYTE", "KILO BYTE", "MEGA BYTE", "GIGA BYTE", "TERA BYTE", "PETA BYTE", "EXA BYTE", "ZETTA BYTE", "YOTTA BYTE"};

    public Calculator(double cantidad, int unidadInicial) {
        this.cantidad = cantidad;
        this.unidadInicial = unidadInicial;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getUnidadInicial() {
        return unidadInicial;
    }

    public void setUnidadInicial(int unidadInicial) {
        this.unidadInicial = unidadInicial;
    }

    public static String[] getUnidades() {
        return UNIDADES;
    }

    public void mostrarConversiones() {
        System.out.println("Las conversiones son:");
        for (int i = 0; i < UNIDADES.length; i++) {
            double cantidadConvertida = cantidad;
            int saltos = i - unidadInicial;

            if (saltos > 0) {
                for (int j = 0; j < saltos; j++) {
                    cantidadConvertida /= 1024;
                }
            } else if (saltos < 0) {
                for (int j = 0; j < -saltos; j++) {
                    cantidadConvertida *= 1024;
                }
            }
            // Imprimir resultado
            System.out.println(String.format("%.40f", cantidadConvertida) + " " + UNIDADES[i]);
        }
    }
      public static void cabezera (){
        System.out.printf("%5s %7s %9s %15s\n", "N", "OPCIÓNI", "OPCIÓNF","UNIDADFINAL");
        System.out.printf("%5s %7s %9s %15s\n","--","----","------","----");
    }
      
   public void cuerpo(int i, String unidadInicial, String unidadFinal, double cantidadConvertida) {
        System.out.printf("%5d %15s %15s %20.10f\n", i + 1, unidadInicial, unidadFinal, cantidadConvertida);
    }
}