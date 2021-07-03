package aprendizadoAvancadoJava.coleçoesJava.interfaceComparators;

import java.util.Comparator;

public class ComparadorObjCarroReverso implements Comparator<Carro> {

    @Override
    public int compare(Carro o1, Carro o2) {
        return o2.getPotencia() - o1.getPotencia();
    }
}
