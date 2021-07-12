package aprendizadoAvancadoJava.lambda.predicate;

import java.util.function.Predicate;

public class Manual {

    public static void main(String[] args) {

        // Representa uma função que recebe um tipo retorna um valor verdadeiro ou falso

        Predicate<Produto> isCaro = prod -> (prod.preco * (1-prod.desconto))  >= 800;

        Produto produto = new Produto("Notebook", 4000, 0.15);
        System.out.println(isCaro.test(produto));


    }

}
