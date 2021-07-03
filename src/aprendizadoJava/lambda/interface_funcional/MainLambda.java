package lambda.interface_funcional;
/**
 * @autor : Bruno Rogério
 */

import lambda.interface_funcional.Calcular;

import java.util.function.BinaryOperator;

public class MainLambda {

    public static void main(String[] args) {

        //Utilizando interfaces padrões do java
        BinaryOperator<Double> operatorBinario = (x, y) -> {
            return x + y;
        };
        System.out.println("+ " + operatorBinario.apply(100.00, 50.00));

        operatorBinario = (x, y) -> (x - y);
        System.out.println("- " + operatorBinario.apply(100.00, 50.00));

        operatorBinario = (x, y) -> x * y;
        System.out.println("* " + operatorBinario.apply(100.00, 50.00));

        operatorBinario = (x, y) -> x / y;
        System.out.println("/ " + operatorBinario.apply(100.00, 50.00));
        System.out.println("------------");

        //Pratica testando outras classes Wrappers
        BinaryOperator<Integer> calc2 = (x, y) -> x + y;
        System.out.println("Soma-> " + calc2.apply(4, 5));

        BinaryOperator<String> texto = (x, y) -> x + y;
        System.out.println(texto.apply("Hello", " World").concat("!"));

        System.out.println("------------");

        //Utilizando Lambda
        Calcular soma = (a, b) -> {
            return a + b;
        };

        Calcular menos = (x, y) -> {
            return x - y;
        };

        Calcular vezes = (o, x) -> {
            return o * x;
        };

        Calcular divi = (a, b) -> {
            return a / b;
        };
        System.out.println("------------");

        //Outra forma, sem retorno explicito
        Calcular calc = (a, b) -> {
            return a + b;
        };
        calc = (x, y) -> x * y;
        calc = (a, b) -> a - b;
        calc = (x, y) -> x / y;
        calc = (x, y) -> x + y;

        System.out.println("Divisão " + divi.executar(8, 2));
        System.out.println("Subtração " + menos.executar(8, 2));
        System.out.println("Multiplicação " + vezes.executar(8, 2));
        System.out.println("Adição " + soma.executar(8, 2));
        System.out.println("------------");

        //Executando o método default criado para teste na interface Calcular
        System.out.println(calc.world());

        //Executando o método static criado para teste na interface Calcular
        System.out.println(Calcular.mundo());
        System.out.println("------------");

    }

}
