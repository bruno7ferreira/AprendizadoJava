package aprendizadoAvancadoJava.lambda.binary_operator;

import java.util.function.BinaryOperator;

public class Manual {

    public static void main(String[] args) {

        //recebe dois operadores do mesmo tipo, e retorna um do mesmo tipo

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(5.0, 7.0));



    }
}
