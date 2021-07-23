package aprendizadoAvancadoJava.stream_api.minmax;

import aprendizadoAvancadoJava.stream_api.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {


        Aluno a1 = new Aluno("Bruno", 7.1);
        Aluno a2 = new Aluno("Rogério", 6.1);
        Aluno a3 = new Aluno("Ferreira", 8.1);
        Aluno a4 = new Aluno("Kobe", 9.0);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4);

        //Criação do Comparator para comparar  o maior e menor valor dentro de lista
        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.getNota() > aluno2.getNota()) return 1;
            if (aluno1.getNota() < aluno2.getNota()) return -1;
            return 0;
        };

        //Necessário criar um comparator para usar a stream min e max
        System.out.println(listaAlunos.stream().max(melhorNota).get());
        System.out.println(listaAlunos.stream().min(melhorNota).get());


    }
}
