package aprendizadoJava.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PraticandoFilter {

    public static void main(String[] args) {

        Carros c1 = new Carros("Bravo", 132, 1.8);
        Carros c2 = new Carros("Gol", 76, 1.0);
        Carros c3 = new Carros("Jetta", 211, 2.0);
        Carros c4 = new Carros("GTR", 572, 3.8);

        List<Carros> listaCarros = Arrays.asList(c1, c2, c3, c4);

        Function<Carros, String> imprimir = x -> "Retorno da pesquisa " + x.nome.concat(" Potencia ") + x.potencia + " Motor " + x.motor;

        Predicate<Carros> cavalosPotencia = x -> x.potencia >= 100;
        Predicate<Carros> motorCilindrada = x -> x.motor >= 2;


        listaCarros.stream()
                .filter(cavalosPotencia)
                .filter(motorCilindrada)

                .map(imprimir)
                .forEach(System.out::println);

    }
}
