package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CriandoFilter {

    public static void main(String[] args) {

        Consumer<String> imprimir = System.out::println;

        Carro c1 = new Carro("Bravo", 132);
        Carro c2 = new Carro("Gol", 76);

        List<Carro> car = Arrays.asList(c1, c2);

        Predicate<Carro> potente = x -> x.potencia >= 100;
        Function<Carro, String> resultado =
                x -> "O " + x.nome.concat(" tem ") + x.potencia + " cv".concat(".");

        car.stream().filter(carro -> carro.potencia >= 100)
                .filter(potente)
                .map(resultado)
                //.map(y -> y.nome + " possui ".concat(String.valueOf(y.potencia)).concat(" CV"))
                .forEach(imprimir);

        System.out.println("---------------");
        Aluno a1 = new Aluno("Maria", 10.0);
        Aluno a2 = new Aluno("Clara", 7.9);
        Aluno a3 = new Aluno("Lucicleia", 8.0);
        Aluno a4 = new Aluno("Alexandra", 9.9);
        Aluno a5 = new Aluno("Paulo", 8.9);
        Aluno a6 = new Aluno("Gustavo", 7.5);


        Consumer<String> imprimir2 = System.out::println;
        List<Aluno> familias = Arrays.asList(a1, a2, a3, a4, a5, a6);

        familias.stream().filter(a -> a.nota >= 7)
                .map(a -> a.nome + " Passou na prova".concat("!"))
                .forEach(imprimir2);


    }
}
