package aprendizadoJava.stream_api;

public class Carros {

    final protected String nome;
    final protected int potencia;
    final protected double motor;


    public Carros(String nome, int potencia, double motor) {
        this.nome = nome;
        this.potencia = potencia;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "nome='" + nome + '\'' +
                ", potencia=" + potencia +
                ", motor=" + motor +
                '}';
    }
}
