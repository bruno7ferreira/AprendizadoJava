package lambda.binary_operator_and_bifunction;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinarioEbiFuncoes {

    public static void main(String[] args) {

        //Recebe dois argumento de entrada e retorna um do mesmo tipo
        BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(10.8, 5.0));

        BinaryOperator<Integer> soma = (Integer num1, Integer num2) -> (num1 + num2);
        System.out.println(soma.apply(20, 10));

        //Receber 2 números e retornar uma string
        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(7.0, 7.0));

        Function<Double, String> conceito =
                m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(7.0, 6.0));
    }
}
