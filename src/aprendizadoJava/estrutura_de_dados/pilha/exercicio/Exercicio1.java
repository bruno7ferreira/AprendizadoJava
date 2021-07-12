package aprendizadoJava.estrutura_de_dados.pilha.exercicio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Integer> listaNumeros = new Stack<>();
        ArrayList<Integer> descartados = new ArrayList<>();

        System.out.println("Bem vindo ao Programa!\n");
        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Informe o " + (cont + 1) + "° número:");
            int num = entrada.nextInt();

            if (num % 2 == 0) {
                listaNumeros.push(num);
                System.out.println("Número adicionado");
            } else if (!listaNumeros.isEmpty()) {
                System.out.println(listaNumeros.pop() + " Número removido");
                descartados.add(num);
            } else {
                System.out.println("Pilha está vazia");
            }

        }
        System.out.println("Números empliados " + listaNumeros);
        System.out.println("Excluídos " + descartados);
        System.out.println("FIM!");

        entrada.close();
    }
}
