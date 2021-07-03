package desafio.desafio_sobreposicao_classes;

public class Pessoa {

    //Atributo
    private double peso;

    //Método construtor
    public Pessoa(double peso) {
        this.peso = peso;
    }

    //Métodos get and set
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Métodos
    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }
}
