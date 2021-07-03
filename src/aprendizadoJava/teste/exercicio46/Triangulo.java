package teste.exercicio46;

public class Triangulo extends Figura2D {

    //Atributo
    private double base;
    private double altura;

    //Métodos
    @Override
    public double calcularArea() {
        return (altura * base) / 2;
    }


    //get and set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
