package aprendizadoAvancadoJava.stream_api.filter;

import aprendizadoAvancadoJava.stream_api.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Filter {

    public static void main(String[] args) {

        Consumer<Aluno> imprimir = System.out::println;

        Aluno a1 = new Aluno("Bruno", 9);
        Aluno a2 = new Aluno("Rogério", 6.7);
        Aluno a3 = new Aluno("Ferreira", 8);
        Aluno a4 = new Aluno("Alexandra", 10);
        Aluno a5 = new Aluno("Maria Clara", 10);
        Aluno a6 = new Aluno("Paulo", 8);

        List<Aluno> claseDeAluno = new ArrayList<>();
        claseDeAluno.add(a1);
        claseDeAluno.add(a2);
        claseDeAluno.add(a3);
        claseDeAluno.add(a4);
        claseDeAluno.add(a5);
        claseDeAluno.add(a6);

        claseDeAluno.forEach(imprimir);


    }

}
