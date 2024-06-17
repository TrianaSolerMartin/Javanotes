package calculadoraPOO;

public class Calcular {

    private double numero1;
    private double numero2;
    private String operador;

    public Calcular() {
        this.numero1 = 0.0;
        this.numero2 = 0.0;
        this.operador = "";
    }

    public Calcular(double numero1, double numero2, String operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

 public double calcular() {
        switch (operador) {
            case "+":
                return numero1 + numero2;
            case "-":
                return numero1 - numero2;
            case "*":
                return numero1 * numero2;
            case "/":
                if (numero2 != 0) {
                    return numero1 / numero2;
                } else {
                    System.out.println("No se puede dividir entre cero.");
                    return Double.NaN; // Devuelve NaN para indicar un error
                }
            case "#":
                return Math.pow(numero1, numero2);
            default:
                System.out.println("Operador no reconocido.");
                return Double.NaN; // Devuelve NaN para indicar un error
        }
    }

    public static void cabecera() {
        System.out.printf("%4s %10s %9s %9s %9s%n", "ID", "OPERADOR", "NUMERO1", "NUMERO2", "RESULTADO");
    }

    public void cuerpo(int i) {
        double resultado = calcular();
        System.out.printf("%4d %10s %9.2f %9.2f %9.2f%n", i, operador, numero1, numero2, resultado);
    }
}