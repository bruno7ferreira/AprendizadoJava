package aprendizadoAvancadoJava.stream_api.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> imprimir = System.out::println;

        List<String> carros = Arrays.asList("Lexus", "UP", "Mustang");

        //Usando map
        carros.stream().map(m -> m.toUpperCase()).forEach(imprimir);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = l -> l.charAt(0) + "";
        UnaryOperator<String> grito = g -> g + "!!!";
        carros.forEach(imprimir);

        System.out.println("----------");

        // Usando funçoes
        maiuscula.andThen(primeiraLetra).andThen(grito).apply("Lexus");

        //Usando composição de Stream
        carros.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(imprimir);


    }

}
