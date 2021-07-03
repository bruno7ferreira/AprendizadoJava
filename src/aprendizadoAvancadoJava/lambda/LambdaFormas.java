package aprendizadoAvancadoJava.lambda;

import java.util.function.BinaryOperator;

public class LambdaFormas {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (a, b) -> {
            return a + b;
        };
        System.out.println(calc.apply(30.0, 10.0));

        calc = (x, y) -> x - y;
        System.out.println(calc.apply(50.0, 20.0));





    }
}
