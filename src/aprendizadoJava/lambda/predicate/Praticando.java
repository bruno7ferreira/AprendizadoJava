package aprendizadoJava.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Praticando {

    public static void filtro(List<String> lista, Predicate<String> condicao) {
        for (String cont : lista)
            if (condicao.test(cont))
                System.out.println(cont);
    }

    public static void main(String[] args) {

        List<String> lista1 = Arrays.asList("Bravo", "GT-R", "Lexus", "Jetta", "BMW", "Gol");
        System.out.println("Carros com a Letra B");
        filtro(lista1, (cont) -> cont.startsWith("B"));
        filtro(lista1, (cont -> cont.endsWith("s")));
        System.out.println();
        filtro(lista1, cont -> true);
        System.out.println("-------");
        filtro(lista1, cont -> false);
        System.out.println();
        filtro(lista1, (cont) -> cont.length() > 4);

    }
}
