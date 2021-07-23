package aprendizadoAvancadoJava.stream_api.match;

import aprendizadoAvancadoJava.stream_api.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bruno", 7.1);
        Aluno a2 = new Aluno("Rogério", 6.1);
        Aluno a3 = new Aluno("Ferreira", 8.1);
        Aluno a4 = new Aluno("Kobe", 9.0);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;

        //allMatch = todas condições verdadeiras para retorna true
        System.out.println(listaAlunos.stream().allMatch(aprovado));

        //anyMatch = pelo menos uma condição verdadeira já retorna true
        System.out.println(listaAlunos.stream().anyMatch(aprovado));

        //noneMatch = todas as condiçoes são falsas para retornar verdadeiro
        System.out.println(listaAlunos.stream().noneMatch(aprovado));
        System.out.println(listaAlunos.stream().noneMatch(aprovado.negate()));

    }
}
