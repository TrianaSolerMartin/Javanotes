package areas;

public class Triangulo1 {

    //ATRIBUTOS
    private double base;
    private double altura;

    //CONSTRUCTORES permiten dar valor a los atrbutos)
    public Triangulo1() {
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Triangulo1(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //METODOS SET Y GET *gestionar los valores de los atributos
    public double getBase() {
        return this.base;
    }

    public void setBase(double atributobase) {
        this.base = atributobase;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double atributoaltura) {
        this.altura = atributoaltura;
    }

    //TOSTRING (MOSTRAR VALORES DE LOS ATRIBUTOS RAPIDO
    @Override
    public String toString() {
        return "Triangulo1{" + "base=" + base + ", altura=" + altura + '}';
    }

    //CALCULOS O PROCESOS   
    public double Areacalculator() {
        return this.base * this.altura / 2;
    }
}