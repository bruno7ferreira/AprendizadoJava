package aprendizadoAvancadoJava.coleçoesJava.set_colecao;

import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.8); //double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("Bruno"); //String
        conjunto.add(7); //int -> Integer
        conjunto.add('b'); //char -> Character

        System.out.println("Tamanho do conjunto: " + conjunto.size());// .size -> tamanho do conjunto
        System.out.println(conjunto.remove("Bruno"));// .remove -> remove o objeto do conjunto
        System.out.println(conjunto.contains(7));// .contains -> retorna se contem o objeto no conjunto

        System.out.println(conjunto);

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);

        conjunto.addAll(nums);// .addAll -> união de conjuntos

        conjunto.retainAll(nums); // .retainAll -> retorna apenas objetos em comum entre os conjuntos
        System.out.println(conjunto);

        conjunto.clear();// .clear -> limpa os objetos dentro do conjunto




    }
}
