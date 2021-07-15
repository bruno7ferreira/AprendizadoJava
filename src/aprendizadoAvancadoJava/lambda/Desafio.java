package aprendizadoAvancadoJava.lambda;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {


        Function<Produto, Double> precoFinal = finalPrice -> finalPrice.preco * (1 - finalPrice.desconto);
        UnaryOperator<Double> impostoMunipal = cityTax -> cityTax >= 2500 ? cityTax * 1.085 : cityTax;
        UnaryOperator<Double> frete = shipping -> shipping >= 3000 ? shipping + 100 : shipping + 50;
        Function<Double, String> arredondar = round -> String.valueOf(String.format("%.2f", round))
                .replace(".", ",");
        //Function<Double, String> formatar = format -> ("R$" + format).replace(".", ",");

        Produto p = new Produto("Notebook", 3000.00, 0.13);

        String preco = precoFinal
                .andThen(impostoMunipal)
                .andThen(frete)
                .andThen(arredondar)
                //.andThen(formatar)
                .apply(p);

        System.out.println("O preco final é: " + preco);




    }

}
