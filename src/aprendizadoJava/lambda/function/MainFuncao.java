package lambda.function;

import java.util.function.Function;

public class MainFuncao {

    public static void main(String[] args) {

        //Interface Funcional<classe> variável = variável -> variável Operador ternário
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE = num2 -> "O resultado é: " + num2;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        Function<String, String> duvida = value -> value + "???";

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);
        System.out.println(resultadoFinal);

        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(31);
        System.out.println(resultadoFinal2);
    }
}
