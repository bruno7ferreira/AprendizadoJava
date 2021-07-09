package aprendizadoJava.stream_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Pratica {

    public static void main(String[] args) {

        List<String> carros = Arrays.asList("Gol", "Bravo", "Amarok");

        for (String cont : carros) {
            System.out.println(cont);
        }

        System.out.println("----");

        Iterator<String> varCarro = carros.iterator();
        while (varCarro.hasNext()) {
            System.out.println(varCarro.next());
        }

        System.out.println("=======");
        Stream<String> car = carros.stream();
        car.forEach(System.out::println);

        System.out.println("-----------");
        for (String var1 : carros) {
            System.out.println(var1);
        }
        System.out.println(",,,,");

        Iterator<String> var2 = carros.iterator();
        while (var2.hasNext()) {
            System.out.println(var2.next());
        }

        System.out.println();

        Stream<String> var3 = carros.stream();
        var3.forEach(System.out::println);

        Stream<String> var4 = carros.parallelStream();
        var4.forEach(System.out::println);
    }

}

