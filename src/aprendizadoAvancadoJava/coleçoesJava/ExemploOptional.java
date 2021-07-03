package aprendizadoAvancadoJava.coleçoesJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptional {

    public static void main(String[] args) {

        Optional<String> x = Optional.of("valor presente");

        System.out.println("Valor opcional que está presente");
        x.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));
        //Se tiver certeza que existe um valor no conjunto,variavel etc... Use esse!

        Optional<String> optionalNull = Optional.ofNullable(null);
        // Se a variavel por ser null, então use esse!

        System.out.println("Valor opcinal que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();
        // se quiser construir do zero, sem nenhum valor

        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));


        //exemplos de Optional primitivos
        OptionalInt.of(7).ifPresent(System.out::println);

        OptionalDouble.of(24.8).ifPresent(System.out::println);

        OptionalLong.of(24L).ifPresent(System.out::println);


    }

}
