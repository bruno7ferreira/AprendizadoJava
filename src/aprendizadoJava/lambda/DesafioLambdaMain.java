package aprendizadoJava.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * 1. A partir do produto calcular o preço real (com desconto)
 * 2. Imposto Municipal: >= 2500 (8,5)/ <2500(Isento)
 * 3. Frete >= 3000 (100) / < 3000 (50)
 * 4. Arredondar: Deoxar dias casas decimais
 * 5. Formatar:R$1234,56
 */
public class DesafioLambdaMain {

    public static void main(String[] args) {


        Function<ProdutoDesafio, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        ProdutoDesafio p = new ProdutoDesafio("Notebook", 3000.00, 0.10);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é " + preco);


    }
}
