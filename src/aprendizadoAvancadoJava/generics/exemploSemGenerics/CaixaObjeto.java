package aprendizadoAvancadoJava.generics.exemploSemGenerics;


public class CaixaObjeto {

    //Classe com um unico atributo
    private Object coisa;

    // guardar algo no atributo, semelhante ao método Set
    public void guardarCoisa(Object coisa) {
        this.coisa = coisa;
    }

    // retornar algo do atributo, semelhante ao método Get
    public Object abrirCoisa() {
        return coisa;
    }

}
