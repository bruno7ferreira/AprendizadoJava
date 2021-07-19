package aprendizadoAvancadoJava.stream_api;

public class Carro {

    private String nome;
    private int potencia;

    public Carro(String nome, int potencia) {
        this.nome = nome;
        this.potencia = potencia;
    }

    public String getNome() {
        return nome;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return nome + " " + potencia + "cv";
    }
}
