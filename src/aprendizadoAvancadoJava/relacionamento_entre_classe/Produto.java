package aprendizadoAvancadoJava.relacionamento_entre_classe;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quatidade;
    private double preco;
    Compra compra;

    public Produto(String nome, int quatidade, double preco) {
        this.nome = nome;
        this.quatidade = quatidade;
        this.preco = preco;
    }

    //get and set
    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quatidade=" + quatidade +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return quatidade == produto.quatidade &&
                Double.compare(produto.preco, preco) == 0 &&
                Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quatidade, preco);
    }
}
