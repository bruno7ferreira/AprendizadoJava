package aprendizadoAvancadoJava.coleçoesJava.interfaceComparators;

public class Estudante implements Comparable<Estudante> {

    private String nome;
    private int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + "  " + idade;
    }


    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
