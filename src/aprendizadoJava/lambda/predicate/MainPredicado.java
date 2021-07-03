package lambda.predicate;

import java.util.function.Predicate;

public class MainPredicado {

    public static void main(String[] args) {

        //100 * (1+0.10) calculo para descobrir o valor de um produto com aumento
        //3000 * (1 - 0.05) calculo para descobrir o valor de um produto com desconto
        Predicate<Produto> isCaro = variavel -> (variavel.preco * (1 - variavel.desconto)) >= 2500;


        Produto p1 = new Produto("XBOX", 3000.00, 0.05);
        System.out.println(isCaro.test(p1));


    }
}
