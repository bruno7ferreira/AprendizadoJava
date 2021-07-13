package aprendizadoAvancadoJava.lambda.function;

import java.util.function.BinaryOperator;
import java.util.function.Function;


public class Exemplo {

    public static void main(String[] args) {

        BinaryOperator<Double> teste = (x, y) -> (x + y) / 2;
        System.out.println(teste.apply(10.0, 5.0));
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";


        System.out.println(teste.andThen(conceito).apply(8.0, 7.0));

    }
}
