package estrutura_de_dados.pilha.exercicio;

import java.util.Objects;

public class Livro {

    private String nome;
    private int numeroPaginas;
    private int anolancamento;
    private String autor;


    //Construtor
    public Livro(String nome, int numeroPaginas, int anolancamento, String autor) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
        this.anolancamento = anolancamento;
        this.autor = autor;
    }

    //toString
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", anolancamento=" + anolancamento +
                ", autor='" + autor + '\'' +
                "}\n";
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //HashCode and Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return numeroPaginas == livro.numeroPaginas &&
                anolancamento == livro.anolancamento &&
                Objects.equals(nome, livro.nome) &&
                Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroPaginas, anolancamento, autor);
    }
}
