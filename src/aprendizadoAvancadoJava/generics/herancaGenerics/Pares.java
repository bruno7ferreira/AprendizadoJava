package aprendizadoAvancadoJava.generics.herancaGenerics;

import aprendizadoAvancadoJava.generics.Par;

import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pares<C extends Number, V> {

    private final SortedSet<Par<C, V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor) {
        if (chave == null) return; //se a chave for nula, ele sai do método
        itens.add(new Par<C, V>(chave, valor));

    }

    //Pegando o valor da chave
    public V getValor(C chave) {
        if (chave == null) return null;

        Optional<Par<C, V>> parOptional = itens.stream()
                .filter(cvPar -> chave.equals(cvPar.getChave()))
                .findFirst();

        return parOptional.isPresent()
                ? parOptional.get().getValor() : null;
    }


}
