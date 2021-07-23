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
        Aluno a8 = new Aluno("Lucicleia", 9.0);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

    }
}
