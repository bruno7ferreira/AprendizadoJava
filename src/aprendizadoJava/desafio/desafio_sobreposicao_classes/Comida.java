package aprendizadoJava.desafio.desafio_sobreposicao_classes;

/**
 * @author Bruno
 */

public class Comida {

    //Atributo
    private double peso;

    //Método construtor
    public Comida(double peso) {
        this.peso = peso;
    }

    //Métodos get and set
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
