package aprendizadoAvancadoJava.coleçoesJava.fila_colecao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFila {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larrisa");
        filaBanco.add("João");

        Iterator<String> i = filaBanco.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("1° da fila: " + filaBanco.peek());
        System.out.println("Removido da fila: " + filaBanco.poll());

        for (String y : filaBanco) {
            System.out.print(y + ", ");
        }
        System.out.println();

        filaBanco.offer("Daniel");
        System.out.println("->" + filaBanco.size());
        System.out.println("## " + filaBanco.contains("Carlos"));

        System.out.println("><" + filaBanco.isEmpty());
        //filaBanco.clear();


    }
}
