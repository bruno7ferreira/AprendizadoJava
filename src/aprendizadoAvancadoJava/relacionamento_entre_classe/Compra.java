package aprendizadoAvancadoJava.relacionamento_entre_classe;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String cliente;

    void adicionarProduto(Produto produto) {
        this.listaCompra.add(produto);
        produto.compra = this;
    }

    void adicionarProduto(String nome, int quantidade, double preco) {
        this.adicionarProduto(new Produto(nome, quantidade, preco));
        // this.listaCompra.add(new Produto(nome,quantidade,preco));

    }

    List<Produto> listaCompra = new ArrayList<>();

    public double getValorTotal() {

        double total = 0;

        for (Produto cont : listaCompra) {
            total += (cont.getQuatidade() * cont.getPreco());
        }
        return total;
    }


}
