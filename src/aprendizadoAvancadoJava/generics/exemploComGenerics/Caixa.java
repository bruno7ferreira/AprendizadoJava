package aprendizadoAvancadoJava.generics.exemploComGenerics;

public class Caixa<T> {

    //Generics  = classe com apenas um atributo

    private T coisa;

    public T pegarCoisa() {
        return coisa;
    }

    public void guardarCoisa(T coisa) {
        this.coisa = coisa;
    }
}
