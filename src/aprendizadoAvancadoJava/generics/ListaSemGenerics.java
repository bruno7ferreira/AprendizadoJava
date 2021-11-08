package aprendizadoAvancadoJava.generics;

import java.util.List;

public class ListaSemGenerics {

    //Pegar o ultimo item de uma lista
    // ? = significa que a lista será de qualquer tipo
    public static Object getUltimo1(List<?> nomeLista) {
        return nomeLista.get(nomeLista.size() - 1);
    }

}
