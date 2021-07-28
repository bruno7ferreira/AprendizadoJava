package aprendizadoAvancadoJava.generics.herancaGenerics;

import aprendizadoAvancadoJava.generics.Par;

import java.util.SortedSet;
import java.util.TreeSet;

public class Pares<C, V> {

    private final SortedSet<Par<C, V>> itens = new TreeSet<>();

}
