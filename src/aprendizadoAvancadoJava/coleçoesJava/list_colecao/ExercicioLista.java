package aprendizadoAvancadoJava.coleçoesJava.list_colecao;

import desafioPratica.Pessoa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioLista {

    public static void main(String[] args) {

        List<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Juliana");
        Pessoa p2 = new Pessoa("Pedro");
        Pessoa p3 = new Pessoa("Carlos");
        Pessoa p4 = new Pessoa("Larrisa");
        Pessoa p5 = new Pessoa("João");

        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);
        listaPessoas.add(p4);
        listaPessoas.add(p5);


        // System.out.println(listaPessoas.toString());

        Iterator<Pessoa> i = listaPessoas.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
        Pessoa p6 = new Pessoa("Roberto");
        listaPessoas.set(2, p6);
        listaPessoas.get(1);
        listaPessoas.remove(4);
        listaPessoas.remove(p5);
        listaPessoas.size();
        Pessoa p7 = new Pessoa("Juliano");
        listaPessoas.contains(p7);

        Pessoa p8 = new Pessoa("Ismael");
        Pessoa p9 = new Pessoa("Rodrigo");
        List<Pessoa> lista2 = listaPessoas;
        lista2.add(p8);
        lista2.add(p9);
        System.out.println("-----------------------");

        for (Pessoa x : lista2) {
            System.out.println(x);
        }

        lista2.clear();
        System.out.println(lista2.isEmpty());


    }
}
