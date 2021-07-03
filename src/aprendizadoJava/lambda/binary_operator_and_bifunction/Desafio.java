package lambda.binary_operator_and_bifunction;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("Notebook", 0.15, 4500.00);

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> arredondar =
                preco -> {
                    return Double.valueOf(String.format("%.2f", preco));
                };

        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O pre?o final ? " + preco);


    }

}
