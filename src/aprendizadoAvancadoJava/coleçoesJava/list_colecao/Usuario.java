package aprendizadoAvancadoJava.coleçoesJava.list_colecao;

import java.util.Objects;

public class Usuario {

    //atributos
    private String nome;

    //construtor
    public Usuario(String nome) {
        this.nome = nome;
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //HashCode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "" + nome;
    }
}
