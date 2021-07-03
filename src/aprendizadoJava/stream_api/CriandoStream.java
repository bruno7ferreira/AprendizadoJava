package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

    public static void main(String[] args) {

        Consumer<String> imprimir = System.out::println;
        Consumer<Integer> imprimir2 = System.out::println;

        Stream<String> linguagens = Stream.of("Java", "MySQL", "Kotlin", "Python\n");
        linguagens.forEach(imprimir);

        String[] maisLinguagens = {"JavaScript", "PHP", "HTML", "CSS"};

        Stream.of(maisLinguagens).forEach(imprimir);
        Arrays.stream(maisLinguagens).forEach(imprimir);
        System.out.println();
        Arrays.stream(maisLinguagens, 1, 3).forEach(imprimir);

        List<String> outrasLinguagens = Arrays.asList("C#", "C++");
        outrasLinguagens.stream().forEach(imprimir);
        outrasLinguagens.parallelStream().forEach(imprimir);

        //Stream.generate(() -> "b").forEach(imprimir);
        Stream.iterate(0, n -> n + 1).forEach(imprimir2);


    }
}
