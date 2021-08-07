package aprendizadoJava.teste.zoologico;

public class Mamifero extends Animal {


    //Construtor
    public Mamifero(String nome, double comprimento, int numPatas, String cor,
                    String ambiente, int velocidade) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.setAmbiente("Terra");
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "nome='" + getNome() + '\'' +
                ", comprimento=" + getComprimento() +
                ", numPatas=" + getNumPatas() +
                ", cor='" + getCor() + '\'' +
                ", ambiente='" + getAmbiente() + '\'' +
                ", velocidade=" + getAmbiente() +
                '}';
    }


}
