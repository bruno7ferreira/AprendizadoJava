package aprendizadoAvancadoJava.coleçoesJava.set_colecao;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Iterator<Integer> x = numeros.iterator();

        while (x.hasNext()) {
            System.out.println(x.next());
        }
        System.out.println("----------");

        numeros.remove(numeros.iterator().next());
        for (Integer cont : numeros) {
            System.out.println(cont);
        }
        numeros.add(23);
        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());


    }
}
