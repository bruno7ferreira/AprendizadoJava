package estrutura_de_dados.pilha.exercicio;

import java.util.Stack;

public class Exercicio3 {

    public static void main(String[] args) {

        Stack<Livro> livraria = new Stack<>();

        Livro l1 = new Livro("Mamba Mentality", 824, 2021, "Kobe Bryant");
        Livro l2 = new Livro("A Maquina", 224, 2001, "Michel Schumacher");
        Livro l3 = new Livro("Amor", 424, 2011, "Maria Clara Ferreira");
        Livro l4 = new Livro("I'am", 324, 2009, "Bruno Rogério Ferreira");
        Livro l5 = new Livro("Fé", 154, 2006, "Deus");
        Livro l6 = new Livro("Sucesso", 784, 2002, "Dedicação");


        livraria.push(l1);
        livraria.push(l2);
        livraria.push(l3);
        livraria.push(l4);
        livraria.push(l5);
        livraria.push(l6);


        System.out.println(livraria);


    }
}
