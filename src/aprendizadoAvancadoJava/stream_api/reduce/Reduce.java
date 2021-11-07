package aprendizadoAvancadoJava.stream_api.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> soma = (cont, x) -> cont + x;


        Integer total = numeros.stream()
                .reduce(soma)
                .get();//Reduce é uma operação terminal

        System.out.println(total);

        Integer total2 = numeros.stream()
                .reduce(100, soma);
        System.out.println(total2);

        numeros.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);

        






    }

}
