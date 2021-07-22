package aprendizadoAvancadoJava.stream_api.reduce;

import aprendizadoAvancadoJava.stream_api.Aluno;
import aprendizadoAvancadoJava.stream_api.Media;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bruno", 7.1);
        Aluno a2 = new Aluno("Rogério", 6.1);
        Aluno a3 = new Aluno("Ferreira", 8.1);
        Aluno a4 = new Aluno("Kobe", 9.0);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Function<Aluno, Double> apenasNota = a -> a.getNota();

        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia =
                (media1, media2) -> Media.combinar(media1, media2);


        //Forma complexa utilizando o Reduce
        Media media = listaAlunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("Media do aluno: " + media.getValue());


    }

}
