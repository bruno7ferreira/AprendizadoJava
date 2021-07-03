package stream_api;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Kobe", 8.24);
        Aluno a2 = new Aluno("Henry", 7.14);
        Aluno a3 = new Aluno("Schumacher", 1);
        Aluno a4 = new Aluno("Bruno", 9.7);
        Aluno a5 = new Aluno("Iverson", 5.85);
        Aluno a6 = new Aluno("Iverson", 5.85);
        Aluno a7 = new Aluno("Ferreira", 4.1);
        Aluno a8 = new Aluno("Rogério", 6.7);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        listaAlunos.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("\nSkip/Limit");
        listaAlunos.stream()
                .distinct()
                .skip(3)
                .forEach(System.out::println);

    }
}
