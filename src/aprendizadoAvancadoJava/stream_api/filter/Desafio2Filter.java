package aprendizadoAvancadoJava.stream_api.filter;

import aprendizadoAvancadoJava.stream_api.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Desafio2Filter {

    public static void main(String[] args) {

        Produto p1 = new Produto("Pistola", 250, 0.15, 30);
        Produto p2 = new Produto("Camisa do Kobe", 200, 0.5, 20);
        Produto p3 = new Produto("Controle xbox", 300, 0.3, 0);
        Produto p4 = new Produto("Fonte xbox 110v", 150, 0.15, 0);
        Produto p5 = new Produto("Manutenção Carro", 1000, 0.0, 50);
        Produto p6 = new Produto("Reparo estetico Carro", 2000, 0.1, 100);

        List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Predicate<Produto> GrandeDesconto = p -> p.getDesconto() >= 30;
        Predicate<Produto> FreteGratis = f -> f.getValorFrete() == 0;
        Predicate<Produto> importante = i -> i.getPreco() >= 500;

        Function<Produto, String> valorLiquido = (x) -> {
            double valorReal = 0;
            valorReal = (x.getPreco() + x.getValorFrete());
            double valorComDesconto;
            valorComDesconto = valorReal - (valorReal * x.getDesconto());
            return "Valor do Produto " + x.getPreco() + "O valor com frete " + valorReal +
                    " Valor total com o desconto: " + valorComDesconto;
        };

        Function<Produto, String> status = s -> "Produto: '" + s.getNome() + "' valor: " + s.getPreco();


        listaProdutos.stream()
                .filter(importante)
                .map(valorLiquido)
                //.map(status)
                .forEach(System.out::println);


    }

}
