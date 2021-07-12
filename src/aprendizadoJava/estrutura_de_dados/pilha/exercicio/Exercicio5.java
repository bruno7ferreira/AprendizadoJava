package aprendizadoJava.estrutura_de_dados.pilha.exercicio;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String palavra = entrada.nextLine();

        imprimirResultado(palavra);


        entrada.close();
    }

    public static void imprimirResultado(String palavra) {
        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();

        for (int cont = 0; cont < palavra.length(); cont++) {
            pilha.push(palavra.charAt(cont));

        }
        String palavraInversa = "";
        while (!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }
}
