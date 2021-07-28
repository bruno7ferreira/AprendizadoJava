package aprendizadoAvancadoJava.generics.herancaGenerics;

import aprendizadoAvancadoJava.generics.Par;

import java.util.SortedSet;
import java.util.TreeSet;

public class Pares<C extends Number, V> {

    private final SortedSet<Par<C, V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor) {
        if (chave == null) return; //se a chave for nula, ele sai do método
        itens.add(new Par<C, V>(chave, valor));

    }


}
