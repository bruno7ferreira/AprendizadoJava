package aprendizadoAvancadoJava.coleçoesJava.set_colecao;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ColecaoSetHeterogeneo {

    public static void main(String[] args) {

        SortedSet<String> carros = new TreeSet<>();// TreeSet -> cria um Set de forma organizada por ordem de inserção(inclusão)
        //SortedSet -> conjunto ordenado

        carros.add("Ferrari");
        carros.add("Lexus");
        System.out.println(carros);

        for (String i : carros) {
            System.out.println(i);
        }

        Iterator<String> x = carros.iterator(); // criando um iterator
        while (x.hasNext()) { //.hasNext = pecorre todo o conjunto
            System.out.println(x.next()); //.next = informa o proxímo item do conjunto
        }

    }
}
