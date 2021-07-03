package aprendizadoAvancadoJava.coleçoesJava.map_colecao;

import java.util.HashMap;
import java.util.Map;

public class ColecaoMap {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>(); // criação do MAP;

        usuarios.put(10, "Bruno"); // .put = adicionar elemento ao MAP, substitui caso já exista
        usuarios.put(2, "Ferreira");


        // .isEmpty = retorna se está vazio
        // .keySet = retorna o conjunto das chaves
        // .values = retorna os valores
        // .entrySet = retorna a chave e valores de cada item relacionado a chave

        System.out.println(usuarios);
        System.out.println(usuarios.keySet());

        for (int i : usuarios.keySet()) {
            System.out.println(i);
        }// pecorrendo pela chave
        for (String x : usuarios.values()) {
            System.out.println(x);
        }// pecorrendo pelo valor


        for (Map.Entry<Integer, String> cont : usuarios.entrySet()) {
            System.out.println(cont);
        } //forEach para pecorrer uma MAP usando o for


    }
}
