package aprendizadoAvancadoJava.coleçoesJava;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreams {

    public static void main(String[] args) {

        List<String> estudante = new ArrayList<>();
        estudante.add("Bruno");
        estudante.add("Alexandra");
        estudante.add("Maria Clara");
        estudante.add("Paulo Marcello");
        estudante.add("Lucicleia");
        estudante.add("Clara Luanny");
        estudante.add("Gustavo");

        Iterator<String> x = estudante.iterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }

        System.out.println(estudante.stream().count());// .count = quantidade de elementos

        System.out.println(estudante.stream().min(Comparator.comparingInt(String::length)));
        // com menor quantidade de letras

        System.out.println(estudante.stream().max(Comparator.comparingInt(String::length)));
        // com maior quantidade de letras

        System.out.println("> " + estudante.stream().filter((cont) -> cont.toLowerCase().contains("r")).collect(Collectors.toList()));
        // cria uma nova lista apenas com os elementos que possuem da letra "r".

        System.out.println(">> " + estudante.stream().filter((u) -> u.toLowerCase().contains("u")).collect(Collectors.toList()));
        // cria uma nova lista apenas com os elementos que possuem da letra "u".

        System.out.println(".map = " + estudante.stream().map(variavelEstudanteX -> variavelEstudanteX.concat(" - ").concat(String.valueOf(variavelEstudanteX.length()))).collect(Collectors.toList()));
        //retorna uma lista com todos os itens e a quantidade de letras que cada um possui

        System.out.println("-- " + estudante.stream().limit(4).collect(Collectors.toList()));
        //retorna uma lista com os itens de acordo com a limitação passada.

        System.out.println("-> " + estudante.stream().peek(System.out::println).collect(Collectors.toList()));
        // retorna cada item da lista

        estudante.stream().forEach(System.out::println);
        //retorna a lista, mesma coisa do foreach, a diferença e que ëxibe por referencia e não retorna nada
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        System.out.println(estudante.stream().allMatch((variavelB) -> variavelB.contains("s")));
        //retorna se todos os elementos da lista contem a letra "s"

        System.out.println(estudante.stream().anyMatch((variavelR) -> variavelR.contains("a")));
        //retorna se algum dos elementos da lista possui a letra "a"

        System.out.println(estudante.stream().noneMatch((variavelF) -> variavelF.contains("r")));
        // retorna se true se nenhum dos itens da lista tiver a letra informada, no caso a letra "r"

        estudante.stream().findFirst().ifPresent(System.out::println);
        // retorna o primeiro item da lista
        System.out.println("---------+-----------");
        //Exemplos de operação encadeada
        System.out.println(estudante.stream()
                .peek(System.out::println)
                .map(variavelXY ->
                        variavelXY.concat(" - ").concat(String.valueOf(variavelXY.length())))
                .peek(System.out::println)
                // .filter((xy) ->
                //        xy.toLowerCase().contains("r"))
                //.collect(Collectors.toList())
                .collect(Collectors.groupingBy(brf -> brf.substring(brf.indexOf("-") + 1))));
        // groupingBy = cria uma um conjunto de lista de acordo com o parametro passado


    }
}
