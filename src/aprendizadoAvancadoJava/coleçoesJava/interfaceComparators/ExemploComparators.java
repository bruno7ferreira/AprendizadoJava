package aprendizadoAvancadoJava.coleçoesJava.interfaceComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparators {

    public static void main(String[] args) {

        List<Estudante> listaDeEstudantes = new ArrayList<>();
        listaDeEstudantes.add(new Estudante("Bruno", 29));
        listaDeEstudantes.add(new Estudante("Rogério", 18));
        listaDeEstudantes.add(new Estudante("Ferreira", 50));
        listaDeEstudantes.add(new Estudante("Kobe", 41));
        listaDeEstudantes.add(new Estudante("Schumacher", 42));
        listaDeEstudantes.add(new Estudante("Senna", 36));

        System.out.println("Ordem de inserção");
        System.out.println(listaDeEstudantes);

        listaDeEstudantes.sort((primeiro, segundo) -> primeiro.getIdade() - segundo.getIdade());
        System.out.println(listaDeEstudantes);//comparação idade

        listaDeEstudantes.sort((primeiro, segundo) -> segundo.getIdade() - primeiro.getIdade());
        System.out.println(listaDeEstudantes);//comparação idade reversa

        listaDeEstudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(listaDeEstudantes);//comparação pela idade

        listaDeEstudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(listaDeEstudantes);// comparação pela idade reserva

        Collections.sort(listaDeEstudantes);
        System.out.println(listaDeEstudantes);//ordem natural dos números

        //Collections.sort(listaDeEstudantes, new classeComImplementaçãoComparable());

    }
}
