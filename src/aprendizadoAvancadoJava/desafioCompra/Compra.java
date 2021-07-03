package aprendizadoAvancadoJava.desafioCompra;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> listaDeItem = new ArrayList<>();

    //Métodos
    public void adicionarItem(Produto produto, int quantidade) {
        this.listaDeItem.add(new Item(produto, quantidade));
    }

    public void adicionarItem(String nome, double preco, int quatidade) {
        this.listaDeItem.add(new Item(new Produto(nome, preco), quatidade));
    }

    public double obterValorTotal() {
        double total = 0;

        for (Item i : this.listaDeItem) {
            total += i.getQuantidade() * i.produto.getPreco();
        }

        return total;
    }

}
