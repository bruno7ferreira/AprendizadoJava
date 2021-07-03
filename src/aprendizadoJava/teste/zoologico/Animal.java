package teste.zoologico;

import java.util.Objects;

public abstract class Animal {

    //Atributos
    private String nome;
    private double comprimento;
    private static int numPatas = 4;
    private String cor;
    private String ambiente;
    private int velocidade;

    //Construtor
    public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, int velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", numPatas=" + numPatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    //HashCode and Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.comprimento, comprimento) == 0 &&
                numPatas == animal.numPatas &&
                velocidade == animal.velocidade &&
                Objects.equals(nome, animal.nome) &&
                Objects.equals(cor, animal.cor) &&
                Objects.equals(ambiente, animal.ambiente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, comprimento, numPatas, cor, ambiente, velocidade);
    }


}
