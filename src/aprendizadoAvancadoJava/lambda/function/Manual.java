package aprendizadoAvancadoJava.lambda.function;

import java.util.function.Function;

public class Manual {

    public static void main(String[] args) {

        // Recebe dois tipos e retorna um outro tipo

        Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(27));

        Function<String, String> oResutladoE = v -> "O resultado é: " + v;

        Function<String, String> empolgado = x -> x + "!!";

        String resultadoFinal = parOuImpar
                .andThen(oResutladoE) //Função encadeada
                .andThen(empolgado) //Função encadeada
                .apply(27);
        System.out.println(resultadoFinal);

    }
}
