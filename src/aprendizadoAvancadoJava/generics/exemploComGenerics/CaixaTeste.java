package aprendizadoAvancadoJava.generics.exemploComGenerics;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardarCoisa("Segredo!");

        System.out.println(caixaA.pegarCoisa());


    }
}
