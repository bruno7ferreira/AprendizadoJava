package aprendizadoAvancadoJava.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachFuncionalVariasFormas {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bruno", "Rogério", "Ferreira");

        //Forma tradicional do forEach
        for (String cont : aprovados) {
            System.out.println(cont);
        }
        System.out.println("---------------");

        // ForEach usando Lambda, mais de um parametro entre chaves
        aprovados.forEach((cont) -> {
            System.out.println(cont + "!!");
        });
        System.out.println("______________");

        // ForEach usando Lambda, apenas um parametro sem as chaves
        aprovados.forEach(cont -> System.out.println(cont + "!!!"));
        System.out.println("************");

        //ForEach usando Método de referência. OBS: não e possível personalizar, apenas imprime a lista
        aprovados.forEach(System.out::println);
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨");

        //Usando um método externo
        aprovados.forEach(y -> meuImprimir(y));
        System.out.println(">>>>>>>>>>");

        //Usando outro método externo, mas referenciando a classe aonde está o método
        aprovados.forEach(ForEachFuncionalVariasFormas::meuImprimir);

    }

    static void meuImprimir(String cont) {
        System.out.println("Meu nome é " + cont);
    }


}
