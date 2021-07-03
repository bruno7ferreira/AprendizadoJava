package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Kobe", 8.24);
        Aluno a2 = new Aluno("Henry", 7.14);
        Aluno a3 = new Aluno("Schumacher", 1);
        Aluno a4 = new Aluno("Bruno", 9.7);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = x -> x.nota >= 7;
        Function<Aluno, Double> getNota = x -> x.nota;
        BinaryOperator<Double> soma = (x, y) -> x + y;

        listaAlunos.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(soma)
                .ifPresent(System.out::println);


    }
}
