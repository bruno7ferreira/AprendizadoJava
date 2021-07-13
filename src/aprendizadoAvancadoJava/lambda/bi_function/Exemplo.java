package aprendizadoAvancadoJava.lambda.bi_function;

import java.util.function.BiFunction;

public class Exemplo {

    public static void main(String[] args) {

        //recebe duas operaçoes e retorna um tipo que pode ser diferente

        BiFunction<Double, Double, String> resultado = (num, num2) -> ((num + num2) / 2) >= 7 ? "Aprovado" : "Reprovado";

        BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(7.0, 5.3));
        System.out.println(resultado2.apply(8.0, 9.1));


    }
}
