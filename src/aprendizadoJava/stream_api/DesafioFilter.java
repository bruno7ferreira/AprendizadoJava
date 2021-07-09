package aprendizadoJava.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        System.out.println("Inicio do programa!");

        Produto p1 = new Produto("Notebook", 5000.00, 0.70, 0);
        Produto p2 = new Produto("Máquina de lavar", 3000.00, 0.50, 0);
        Produto p3 = new Produto("gabinete", 500.00, 0.04, 30);
        Produto p4 = new Produto("teclado", 300.00, 0.05, 20);
        Produto p5 = new Produto("placa de video", 3000.00, 0.05, 0);
        Produto p6 = new Produto("fone", 200.00, 0.70, 0);
        Produto p7 = new Produto("fan", 400.00, 0.05, 0);

        List<Produto> listaProduto = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        //Filter,filter,map
        Predicate<Produto> grandeDesconto = p -> p.preco >= 1000;
        Predicate<Produto> freteGratis = f -> f.frete == 0;
        Predicate<Produto> precoRelevante = p -> p.preco >= 1000;

        Function<Produto, String> chamadaPromocional = c -> "Aproveite! " + c.nome + " por " + c.preco;


        listaProduto.stream().filter(grandeDesconto).filter(freteGratis).filter(precoRelevante)
                .map(chamadaPromocional).forEach(System.out::println);


    }
}
