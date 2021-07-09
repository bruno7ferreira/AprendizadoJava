package aprendizadoJava.lambda.unary_operator;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = num -> num + 2;
        UnaryOperator<Integer> menosDois = num -> num - 2;
        UnaryOperator<Integer> vezesDois = num -> num * 2;
        UnaryOperator<Integer> divDois = num -> num / 2;
        UnaryOperator<Integer> aoQuadrado = num -> num * num;

        System.out.println(maisDois.apply(2));
        int resultado = aoQuadrado
                .andThen(divDois
                        .andThen(vezesDois))
                .andThen(maisDois).andThen(maisDois)
                .apply(20);
        System.out.println(aoQuadrado.andThen(vezesDois).andThen(menosDois).apply(10));
        System.out.println(resultado);


    }
}
