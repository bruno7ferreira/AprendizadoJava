package aprendizadoJava.estrutura_de_dados.fila.exercicio1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex1 {

    public static void main(String[] args) {

        Queue<String> regular = new LinkedList<>();
        Queue<String> prioridade = new PriorityQueue<>();

        final int MAX_PRIORIDADE = 3;


        regular.add("Pessoa1");
        regular.add("Pessoa2");
        regular.add("Pessoa3");
        prioridade.add("Pessoa1p");
        prioridade.add("Pessoa2p");
        prioridade.add("Pessoa3p");
        prioridade.add("Pessoa4p");
        prioridade.add("Pessoa5p");
        regular.add("Pessoa4");
        regular.add("Pessoa5");
        regular.add("Pessoa6");
        regular.add("Pessoa7");
        regular.add("Pessoa8");

        while (!regular.isEmpty() || !prioridade.isEmpty()) {

            int cont = 0;
            while (!prioridade.isEmpty() && cont < MAX_PRIORIDADE) {
                atendePessoa(prioridade);
                cont++;
            }

            if (!regular.isEmpty()) {
                atendePessoa(regular);
            }
            if (prioridade.isEmpty()) {
                while (!regular.isEmpty()) {
                    atendePessoa(regular);
                }
            }
        }

    }

    public static void atendePessoa(Queue<String> fila) {
        String pessoaAtendida = fila.remove();
        System.out.println(pessoaAtendida + " Foi atendida.");
    }
}
