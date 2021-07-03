package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CriandoMap {

    public static void main(String[] args) {


        Consumer<String> imprimir = System.out::println;

        List<String> marcas = Arrays.asList("Fiat", "VW", "BMW", "Mercedes");
        marcas.stream().map(m -> m.toUpperCase()).forEach(imprimir);

        UnaryOperator<String> maiscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n.concat("!!!");
        System.out.println();
        marcas.stream()
                .map(maiscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(imprimir);


    }
}
