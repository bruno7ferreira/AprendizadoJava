package aprendizadoAvancadoJava.desafioCompra;

import java.util.Objects;

public class Produto {

    private String nome;
    private double preco;
    Item item;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public Produto() {

    }

    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 &&
                Objects.equals(nome, produto.nome) &&
                Objects.equals(item, produto.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, item);
    }
}


