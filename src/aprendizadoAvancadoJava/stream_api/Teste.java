package aprendizadoAvancadoJava.stream_api;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Teste {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bruno", "Alexandra", "Paulo", "Maria");

        //Usando for tradicional
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        //Usando forEach
        for (String cont : aprovados) {
            System.out.println(cont);
        }

        //Usando iterator
        Iterator<String> nomeIterator = aprovados.iterator();
        while (nomeIterator.hasNext()) {
            System.out.println(nomeIterator.next());
        }

        //Usando Stream
        Stream<String> nomeStream = aprovados.stream();
        nomeStream.forEach(System.out::println);


    }

}
