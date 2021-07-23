package aprendizadoAvancadoJava.stream_api.outros;

import aprendizadoAvancadoJava.stream_api.Aluno;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bruno", 7.1);
        Aluno a2 = new Aluno("Rogério", 6.1);
        Aluno a3 = new Aluno("Ferreira", 8.1);
        Aluno a4 = new Aluno("Kobe", 9.0);
        Aluno a5 = new Aluno("Alexandra", 7.1);
        Aluno a6 = new Aluno("Maria Clara", 6.1);
        Aluno a7 = new Aluno("Paulo", 8.1);
        Aluno a8 = new Aluno("Kobe", 9.0);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        //Distinct = remove duplicidade no lista/conjunto
        listaAlunos.stream()
                .distinct()
                .forEach(System.out::println);

        //Skip = pula o número determinado de itens no inicio da coleção
        listaAlunos.stream()
                .distinct()
                .skip(1)
                .forEach(System.out::println);

        System.out.println("------");
        //Limit = limita a coleção a apenas 2 elementos
        listaAlunos.stream()
                .distinct()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("---------------");

        //takeWhile = continua a execução enquanto a condição for true, quando uma condição false e encontrada,
        // a execução da coleção/list e parada

        listaAlunos.stream()
                .distinct()
                .takeWhile(a -> a.getNota() >= 7)
                .forEach(System.out::println);


    }
}
