package aprendizadoAvancadoJava.coleçoesJava.interfaceComparators;

public class Carro implements Comparable<Carro> {

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

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "" + nome + " " + potencia;
    }

    @Override
    public int compareTo(Carro o) {
        return this.getPotencia() - o.getPotencia();
    }
}
