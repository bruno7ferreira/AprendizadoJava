package aprendizadoAvancadoJava.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class LambdaTipos {

    public static void main(String[] args) {

        // BinaryOperator = Retorna um tipo e informa 2 tipos sendo do mesmo tipo de retorno
        BinaryOperator<Double> calc = (a, b) -> {
            return a + b;
        };

        System.out.println(calc.apply(30.0, 10.0));

        calc = (x, y) -> x - y;
        System.out.println(calc.apply(50.0, 20.0));

        //BiFunction<Integer,Double> calc1 = (a,b)->


    }
}
