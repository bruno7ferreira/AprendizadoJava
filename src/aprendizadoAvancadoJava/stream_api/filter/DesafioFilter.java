package aprendizadoAvancadoJava.stream_api.filter;

import aprendizadoAvancadoJava.stream_api.Carro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Carro c1 = new Carro("Lexus", 400);
        Carro c2 = new Carro("GTR", 700);

        Consumer<Carro> imprimir = System.out::println;
        List<Carro> listaDeCarros = Arrays.asList(c1, c2);

        Predicate<Carro> esportivo = x -> x.getPotencia() >= 600;
        Predicate<Carro> luxo = x -> x.getPotencia() < 600;
        Function<Carro, String> statusCarro =
                x -> "Nome do Carro " + x.getNome() + " Potencia do Carro " + x.getPotencia();

        listaDeCarros
                .stream()
                .filter(esportivo)
                .map(statusCarro)
                .forEach(System.out::println);

        listaDeCarros
                .stream()
                .filter(luxo)
                .map(statusCarro)
                .forEach(System.out::println);


    }

}
