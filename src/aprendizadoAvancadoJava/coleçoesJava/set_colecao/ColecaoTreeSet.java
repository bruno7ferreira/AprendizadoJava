package aprendizadoAvancadoJava.coleçoesJava.set_colecao;

import java.util.TreeSet;

public class ColecaoTreeSet {

    public static void main(String[] args) {

        TreeSet<String> carros = new TreeSet<>();
        carros.add("Bravo");
        carros.add("Lexus");
        carros.add("BMW");
        carros.add("GTR");
        carros.add("Hilux");
        carros.add("Gol");

        System.out.println(carros);

        System.out.println(carros.first()); //.first = retorna o primeiro carro no topo da árvore

        System.out.println(carros.last()); //.last = retorna o último carro no final da árvore

        System.out.println(carros.lower("Bravo")); //.lower = retorna o primeiro carro abaixo na árvore,passado
        //como parâmetro

        System.out.println(carros.higher("Bravo")); //.higher = retorna o primeiro carro acima na árvore, passado
        //como parâmetro

        System.out.println(">"+carros.pollFirst()); //.pollFirst = retorna o primeiro carro no topo da árvore,
        //removendo do Set







    }
}
