package aprendizadoAvancadoJava.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachFuncionalVariasFormas {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bruno", "Rogério");

        for (String cont : aprovados) {
            System.out.println(cont);
        }

        aprovados.forEach((cont) -> {
            System.out.println(cont + "!!");
        });
        aprovados.forEach(cont -> System.out.println(cont + "!!!"));

        aprovados.forEach(System.out::println);

        aprovados.forEach(cont -> meuImprimir(cont));


    }

    private static void meuImprimir(String cont) {
        System.out.println("Meu nome é " + cont);
    }


}
