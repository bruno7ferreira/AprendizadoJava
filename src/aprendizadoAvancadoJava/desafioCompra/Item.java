package aprendizadoAvancadoJava.desafioCompra;

import java.util.Objects;

public class Item {

    //Atributos
    final private int quantidade;
    final Produto produto;

    Compra compra;

    //Construtor
    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    //Métodos especiais
    public int getQuantidade() {
        return quantidade;
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantidade == item.quantidade &&
                Objects.equals(produto, item.produto) &&
                Objects.equals(compra, item.compra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidade, produto, compra);
    }
}
