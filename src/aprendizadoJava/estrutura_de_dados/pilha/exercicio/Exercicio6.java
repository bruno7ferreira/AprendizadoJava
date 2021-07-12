package aprendizadoJava.estrutura_de_dados.pilha.exercicio;

import java.util.Stack;

public class Exercicio6 {

    public static void main(String[] args) {

    }

    public static boolean verificarSimbolosBalanceados(String expressao) {

        boolean balanceado = true;
        Stack<Character> pilha = new Stack<>();
        int index = 0;
        char simbolo;
        while (index < expressao.length() && balanceado) {
            simbolo = expressao.charAt(index);

            


            index++;
        }
        return false;
    }
}
