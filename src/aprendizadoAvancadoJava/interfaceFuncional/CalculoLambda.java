package aprendizadoAvancadoJava.interfaceFuncional;

public class CalculoLambda {

    public static void main(String[] args) {


        Calculo calc = (x, y) -> {
            return x + y;
        };

        InterfaceFuncionalCalc calc1 = (x, y) -> {
            return x + y;
        };

        System.out.println(calc.executar(50, 25));

        calc = (x, y) -> x * y;
        System.out.println(calc.executar(50, 25));

        calc = (x, y) -> x / y;
        System.out.println(calc.executar(50, 25));
        calc = (x, y) -> x - y;
        System.out.println(calc.executar(50, 25));

        System.out.println(calc1.legal());

        System.out.println(InterfaceFuncionalCalc.testeMetodo());


    }
}
