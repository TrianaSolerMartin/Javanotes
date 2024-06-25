package pseint;

public class Ejemplo_1_3 {

    //variaBLES DE INSTANCIAS 
    private int a, b;

    //constructores
    public Ejemplo_1_3() {
        this.a = 0;
        this.b = 0;
    }

    public Ejemplo_1_3(int a, int b) {
        this.a = a;
        this.b = b;
    }
//metodos get set

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    //metodo tostring
    @Override
    public String toString() {
        return "Ejemplo_1_3{" + "a=" + a + ", b=" + b + '}';
    }

    //metodos otros 
    public double resultado() {
        return Math.pow((a + b), 2) / 3;
    }

    public void imprimirResultado() {
        System.out.printf("RESULTADO:  %.2f", resultado());
    }

    public void entrada() {
        a = Entrada.leerInteger("ingresa a");
        b = Entrada.leerInteger("ingresa b");
    }
}
