package teste.exercicio46;

import java.util.Objects;

public class Quadrado extends Figura2D {

    //Atributos
    private double lado;


    //Métodos
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2); //lado elevado ao quadrado
    }

    //Construtor


    //get and set
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
