package aprendizadoJava.teste.exercicio46;

public class Cubo extends Figura3D {

    //atributos
    private int lado;

    //Métodos
    @Override
    public double calcularArea() {
        return 6 * (Math.pow(lado, 2));
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }


    //get and set
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


    //Construtor

}
