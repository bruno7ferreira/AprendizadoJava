package aprendizadoAvancadoJava.coleçoesJava.set_colecao;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Iterator<Integer> y = numeros.iterator();

        while (y.hasNext()) {
            System.out.println(y.next());
        }

        numeros.remove(numeros.iterator().next());
        System.out.println("-----------");
        for (Integer yy : numeros) {
            System.out.println(yy);
        }
        System.out.println("<>");
        numeros.add(23);
        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());


    }
}
