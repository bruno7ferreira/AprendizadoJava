package stream_api;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorStream {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bruno", "Henry", "Kobe");

        //Imprimindo uma lista de forma tradicional
        for (int cont = 0; cont < aprovados.size(); cont++) {
            System.out.println(aprovados.get(cont));
        }

        System.out.println("---------");

        //Imprimindo uma lista utilizando o forEach
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("---------");

        //Imprimindo uma lista utilizando um Iterator
        //Interface Iterator<tipo> variavel = lista.iterator();
        // laço while (variavel."temProximo"hasNext()){ System.out.println(variavel."Proximo"next())   }
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("__________");

        //Imprimindo uma lista utilizando Stream
        Stream<String> var = aprovados.stream();
        var.forEach(System.out::println);

    }
}
