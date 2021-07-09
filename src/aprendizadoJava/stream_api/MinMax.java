package aprendizadoJava.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {


        Aluno a1 = new Aluno("Kobe", 8.24);
        Aluno a2 = new Aluno("Henry", 7.14);
        Aluno a3 = new Aluno("Schumacher", 1);
        Aluno a4 = new Aluno("Bruno", 9.7);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println(listaAlunos.stream().max(melhorNota).get());
        System.out.println(listaAlunos.stream().min(melhorNota).get());


    }
}

