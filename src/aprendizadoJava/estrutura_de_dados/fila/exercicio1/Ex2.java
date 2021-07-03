package estrutura_de_dados.fila.exercicio1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex2 {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;


    public static void main(String[] args) {

        Queue<Pessoa> fila = new PriorityQueue<>();
        fila.add(new Pessoa("Maria", VERDE));
        fila.add(new Pessoa("Clara", AMARELO));
        fila.add(new Pessoa("Alexandra", VERMELHO));
        fila.add(new Pessoa("Lucicleia", VERDE));
        fila.add(new Pessoa("Paulo", AMARELO));
        fila.add(new Pessoa("Gustavo", VERMELHO));



    }

    public static void atendePessoa(Pessoa pessoa){

    }
}
