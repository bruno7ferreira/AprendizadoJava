package aprendizadoAvancadoJava.coleçoesJava.interfaceComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparators {

    public static void main(String[] args) {

        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Carro("Bravo", 132));
        listaDeCarros.add(new Carro("Lexus", 300));
        listaDeCarros.add(new Carro("GTR", 700));

        listaDeCarros.sort((primeiro, segundo) -> primeiro.getPotencia() - segundo.getPotencia());
        System.out.println(listaDeCarros);
        listaDeCarros.sort((primeiro, segundo) -> segundo.getPotencia() - primeiro.getPotencia());
        System.out.println(listaDeCarros);


        listaDeCarros.sort(Comparator.comparingInt(Carro::getPotencia));
        System.out.println(listaDeCarros);
        listaDeCarros.sort(Comparator.comparingInt(Carro::getPotencia).reversed());
        System.out.println(listaDeCarros);

        Collections.sort(listaDeCarros);
        System.out.println(listaDeCarros);
        Collections.sort(listaDeCarros, new ComparadorObjCarroReverso());
        System.out.println(listaDeCarros);

    }
}
