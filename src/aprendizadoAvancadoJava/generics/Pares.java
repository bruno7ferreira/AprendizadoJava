package aprendizadoAvancadoJava.generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> itens = new LinkedHashSet<>();

    public void adicionar(C chave, V valor) {
        if (chave == null) return; //se a chave for nula, ele sai do método

        Par<C, V> novoPar = new Par<C, V>(chave, valor);

        //Substitui o valor do item cuja chave for repetida
        if (itens.contains(novoPar)) {
            itens.remove(novoPar);
        }

        itens.add(novoPar);

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
