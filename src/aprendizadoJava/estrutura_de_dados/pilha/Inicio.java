package estrutura_de_dados.pilha;

import java.util.Stack;

public class Inicio {

    public static void main(String[] args) {

        Stack<String> listaCarros = new Stack<>();

        listaCarros.push("Bravo");
        listaCarros.push("BMW");
        System.out.println(listaCarros.size());
        System.out.println(listaCarros.peek());
        listaCarros.pop();
        System.out.println(listaCarros);


    }
}
