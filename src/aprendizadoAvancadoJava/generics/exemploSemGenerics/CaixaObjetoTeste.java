package aprendizadoAvancadoJava.generics.exemploSemGenerics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardarCoisa(2.7); // autoBox = double -> Double = tipo primitivo para uma classe Rapper


        Double coisa = (Double) caixaA.abrirCoisa();
        System.out.println(coisa);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardarCoisa("Bruno");


        System.out.println(caixaB.abrirCoisa());


    }

}
