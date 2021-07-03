package aprendizadoAvancadoJava.coleçoesJava.fila_colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueueFila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>(); //Criação da fila

        fila.add("Ana");
        fila.offer("Bia"); // .offer = adiciona um elemento a fila e retorna true ou false,
        // de acordo se foi adicionado ou não

        fila.offer("Bruno");
        System.out.println(fila.peek()); // .peek = retorna o elemento da fila, mas não remove
        System.out.println(fila.element()); // .element = retorna o elemento da fila, mas não remove,
        // lança uma exceção se tiver vazia

        System.out.println(fila.isEmpty()); // .isEmpty = retorna se a fila está vazia ou não
        // .poll = retorna o elemento da fila já removendo, pode retorna true ou false
        // .remove = retorna o elemento da fila já removido, pode retornar uma exceção



    }
}
