package aprendizadoJava.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acumulador, i) -> acumulador + i;

        Integer total = nums.parallelStream().reduce(soma).get();
        System.out.println(total);

        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2);

        nums.stream()
                .filter(i -> i > 5)
                .reduce(soma)
                .ifPresent(System.out::println);


    }
}
