package aprendizadoAvancadoJava.coleçoesJava.set_colecao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioSet {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Iterator<Integer> i = numeros.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        numeros.remove(numeros.iterator().next());
        System.out.println("----");

        Iterator<Integer> x = numeros.iterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }
        numeros.add(23);
        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());

    }
}
