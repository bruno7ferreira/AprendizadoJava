package aprendizadoAvancadoJava.lambda.unary_operator;

import java.util.function.UnaryOperator;

public class Exemplo {

    public static void main(String[] args) {

        // Recebe de um tipo e retorna do mesmo tipo

        UnaryOperator<Integer> maisDois = num -> num + 2;

        UnaryOperator<Integer> vezesDois = (num) -> num * 2;
        UnaryOperator<Integer> aoQuadrado = (num) -> num * num;

        System.out.println(maisDois.apply(2));
        System.out.println(vezesDois.apply(5));
        System.out.println(aoQuadrado.apply(7));

        //Usando encadeamento
        System.out.println(maisDois
                .andThen(vezesDois
                        .andThen(aoQuadrado))
                .apply(7));

        int resultado1 = maisDois
                .andThen(vezesDois
                        .andThen(aoQuadrado))
                .apply(7);

        System.out.println(resultado1);

        int resultado2 = aoQuadrado
                .compose(vezesDois
                        .compose(maisDois))
                .apply(7);

        System.out.println(resultado2);


    }

}
