package aprendizadoAvancadoJava.desafioCompra;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    //Atributos
    final private String nome;
    //final private int id;
    final List<Compra> listaDeCompras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
        //this.id = (int) (Math.random() * 100); //Gerando ID aleatório.
    }

    //Métodos
    public double obterValorTotal() {
        double total = 0;

        for (Compra i : listaDeCompras) {
            total += i.obterValorTotal();
        }
        return total;
    }

    //Métodos especiais
    public String getNome() {
        return nome;
    }

}
