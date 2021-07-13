package aprendizadoAvancadoJava.lambda.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Manual {

    public static void main(String[] args) {

        //Não recebe nenhum parametro e retorna um tipo

        //exemplo de retorno de uma lista, dentro do supplier é inforado o tipo do retorno
        Supplier<List<String>> umaLista = () -> Arrays.asList("Bruno", "Rogério", "Ferreira");

        System.out.println(umaLista.get());


    }

}
