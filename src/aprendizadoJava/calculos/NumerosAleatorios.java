package aprendizadoJava.calculos;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        System.out.println(Math.random() * 10);

        //floor = arredondar o número
        System.out.println("------");
        int num = (int) Math.floor(Math.random() * 10);
        System.out.println("número: " + num);
        System.out.println(Math.floor(Math.random() * 100));
        Random aleatorio = new Random();

        System.out.println(aleatorio.nextInt(101));

    }
}
