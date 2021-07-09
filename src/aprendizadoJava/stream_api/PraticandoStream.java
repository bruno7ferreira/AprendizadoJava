package aprendizadoJava.stream_api;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class PraticandoStream {

    public static void main(String[] args) {

        List<String> listaCarros = Arrays.asList("Bravo", "Lexus", "GT-R", "Civic", "Jetta");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

        for (String cont : listaCarros) {
            System.out.println(cont);
        }
        System.out.println("***********");

        //ForEach utilizando lambda
        listaCarros.forEach(b -> System.out.println(b));
        System.out.println("***********");

        //ForEach utilizando referencia
        listaCarros.forEach(System.out::println);

        numeros.forEach(System.out::println);
        numeros.forEach(contador -> System.out.println(contador));



    }


}
