package lambda;

import static java.lang.Math.*;

public class Praticando {

    public static void main(String[] args) {

        System.out.println("===Inicio do Teste===");

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Estudando a expressão lambda #1");
            }
        };

        Runnable r2 = () -> System.out.println("Estudando a expressão lambda #2");

        r1.run();
        r2.run();

        System.out.println("¨¨¨¨¨¨¨¨");

        InterfaceTeste1 num;
        num = () -> 7;
        System.out.println(num.getValue());

        InterfaceTeste1 nome;
        nome = () -> 24;
        System.out.println(nome.getValue());

        InterfaceTeste1 n2 = () -> Math.random() * 100;
        System.out.println(n2.getValue());


    }

}
