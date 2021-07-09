package aprendizadoJava.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Kobe", 8.24);
        Aluno a2 = new Aluno("Henry", 7.14);
        Aluno a3 = new Aluno("Schumacher", 1);
        Aluno a4 = new Aluno("Bruno", 9.7);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = x -> x.nota >= 7;
        Function<Aluno, Double> getNota = x -> x.nota;
        BiFunction<MediaTeste, Double, MediaTeste> calcularMedia =
                (media, nota) -> media.adicionar(nota);
        BinaryOperator<MediaTeste> combinarMedia = (m1, m2) -> MediaTeste.combinar(m1, m2);

        MediaTeste media = listaAlunos.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(new MediaTeste(), calcularMedia, combinarMedia);
        System.out.println(media.getValor());

    }
}
