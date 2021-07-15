package aprendizadoAvancadoJava.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoConsumer {

    public static void main(String[] args) {

        List<String> listaCarros = Arrays.asList("Lexus", "GTR", "Bravo", "M5", "Renegate");
        Consumer<String> imprime = System.out::println;
        System.out.println();

        Stream<String> c = listaCarros.stream();
        c.forEach(imprime);
        System.out.println();

        Stream<String> carros = Stream.of("Gol", "Bravo", "Lexus");
        carros.forEach(imprime);
        System.out.println();

        String[] maisCarros = {"BMW", "UP", "Mercedes", "Hilux"};
        Stream.of(maisCarros).forEach(imprime);
        System.out.println();

        Arrays.stream(maisCarros, 1, 3).forEach(imprime);

        List<String> outrosCarros = Arrays.asList("Civic", "Jetta", "Tjet", "Creta");
        outrosCarros.parallelStream().forEach(imprime);




    }


}
