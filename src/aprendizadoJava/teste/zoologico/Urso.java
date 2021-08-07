package aprendizadoJava.teste.zoologico;

import java.util.Objects;

public class Urso extends Mamifero {

    //Atributos
    private String alimento = "Mel";


    //Construtor
    public Urso(String nome, double comprimento, int numPatas, String cor,
                String ambiente, int velocidade, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.setCor("Castanho");
        this.alimento = alimento;

    }

    //get and set
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    //HashCode and Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Urso urso = (Urso) o;
        return Objects.equals(alimento, urso.alimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), alimento);
    }
}
