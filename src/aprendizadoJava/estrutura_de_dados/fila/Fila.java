package estrutura_de_dados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> cars = new LinkedList<>();
        cars.add("Bravo");
        cars.add("BMW");
        cars.add("GTR");
        System.out.println(cars);
        cars.remove();
        System.out.println(cars);
        

    }

}
