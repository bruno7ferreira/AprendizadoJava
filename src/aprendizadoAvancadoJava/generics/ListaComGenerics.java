package aprendizadoAvancadoJava.generics;

import java.util.List;

public class ListaComGenerics {

    //passando o tipo do objeto que será o mesmo tipo da lista = <T>
    public static <T> T getUltimo2(List<T> nomeLista) {
        return nomeLista.get(nomeLista.size() - 1);
    }
}
