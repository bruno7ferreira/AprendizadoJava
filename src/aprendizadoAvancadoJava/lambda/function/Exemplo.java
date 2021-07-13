package aprendizadoAvancadoJava.lambda.function;

import java.util.function.Function;

public class Exemplo {

    public static void main(String[] args) {

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println();

    }
}
