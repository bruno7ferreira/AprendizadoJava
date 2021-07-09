package aprendizadoJava.stream_api;

import javax.print.attribute.standard.Media;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainMediaTeste {

    public static void main(String[] args) {

        MediaTeste m1 = new MediaTeste();
        MediaTeste m2 = new MediaTeste().adicionar(8).adicionar(7);
        m1.adicionar(8.3);
        m1.adicionar(6.7);


        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(MediaTeste.combinar(m1, m2).getValor());


    }
}
