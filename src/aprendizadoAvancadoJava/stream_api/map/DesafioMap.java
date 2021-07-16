package aprendizadoAvancadoJava.stream_api.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<Object> printNums = System.out::println;

        // Inverter a ordem da lista
        UnaryOperator<String> inverter =
                texto -> new StringBuilder(texto).reverse().toString();

        //Converter de binario para inteiro
        Function<String, Integer> converterParaInteiro =
                bi -> Integer.parseInt(bi, 2);

        numeros.stream()
                .map(Integer::toBinaryString)//convertendo de inteiro para binario em formado string
                .map(inverter)
                .map(converterParaInteiro)
                .forEach(printNums);


    }

}
