package aprendizadoAvancadoJava.coleçoesJava.list_colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColecaoList {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Bruno");
        Usuario u2 = new Usuario("Kobe");
        List<Usuario> contatos = new ArrayList<>();
        contatos.add(u1);
        contatos.add(new Usuario("Ferreira"));

        System.out.println(contatos);
        contatos.set(1, u2); // .set = substitui o item da lista de acordo com indice e objeto passado

        System.out.println(contatos.get(1)); // .get = retorna o item da lista de acordo com índice informado

        System.out.println(contatos);
        //Collections.sort(contatos); // Usado para organizar lista por ordem alfabética

        contatos.isEmpty(); // isEmpty = retorna se a lista está vazia ou não

        contatos.indexOf(u2); // indexOf = retorna se o item existe na lista e qual o seu índice

        Iterator<Usuario> iterator = contatos.iterator();

        while (iterator.hasNext()) {
            System.out.println(">>" + iterator.next());
        }



    }

}
