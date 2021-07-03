package estrutura_de_dados.pilha.exercicio;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Integer> par = new Stack<>();
        Stack<Integer> impar = new Stack<>();

        System.out.println("Inicio do programa!");

        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Informe o " + (cont + 1) + "° número");
            int num = entrada.nextInt();

            if (num % 2 == 0) {
                if (num == 0) {
                    try {
                        par.pop();
                        impar.pop();
                    } catch (Exception c) {
                        System.out.println("Erro! Pilha já está vazia");
                    }

                } else {
                    par.push(num);
                }

            } else {
                impar.push(num);
            }


        }
        System.out.println("PAR " + par);
        System.out.println("ÍMPAR " + impar);

        entrada.close();
    }
}
