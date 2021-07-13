package aprendizadoAvancadoJava.lambda.consumer;

import aprendizadoAvancadoJava.lambda.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Manual {

    public static void main(String[] args) {

        // Recebe um tipo e não retorna nada.

        Consumer<Produto> imprimir = p -> System.out.println(p.getNome());
        Produto p1 = new Produto("Desktop", 7000, 0.20);
        Produto p2 = new Produto("Notebook", 4000, 0.15);
        Produto p3 = new Produto("Xbox", 2000, 0.05);
        Produto p4 = new Produto("Monitor", 900, 0.10);
        Produto p5 = new Produto("Teclado", 400, 0.05);

        imprimir.accept(p1);

        List<Produto> listaDeProdutos = Arrays.asList(p1, p2, p3, p4, p5);

        listaDeProdutos.forEach(imprimir);


        listaDeProdutos.forEach(p -> System.out.println(p.getPreco()));

        listaDeProdutos.forEach(System.out::println);

    }
}
