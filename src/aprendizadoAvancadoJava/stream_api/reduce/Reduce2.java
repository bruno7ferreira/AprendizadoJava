package aprendizadoAvancadoJava.stream_api.reduce;

import aprendizadoAvancadoJava.stream_api.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bruno", 7.1);
        Aluno a2 = new Aluno("Bruno", 7.1);
        Aluno a3 = new Aluno("Bruno", 7.1);
        Aluno a4 = new Aluno("Bruno", 7.1);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovados = a -> a.getNota() >= 7;
        Function<Aluno, Double> notaAluno = n -> n.getNota();


    }

}
