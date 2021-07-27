package aprendizadoAvancadoJava.generics.exemploComGenerics;

public class Caixa {

    private Object coisa;

    public Object pegarCoisa() {
        return coisa;
    }

    public void guardarCoisa(Object coisa) {
        this.coisa = coisa;
    }
}
