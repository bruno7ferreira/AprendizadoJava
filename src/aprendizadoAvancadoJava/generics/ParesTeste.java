package aprendizadoAvancadoJava.generics;

public class ParesTeste {

    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Bruno");
        resultadoConcurso.adicionar(2, "Alexandra");
        resultadoConcurso.adicionar(3, "Paulo");
        resultadoConcurso.adicionar(4, "Lucicleia");
        resultadoConcurso.adicionar(2, "Bruno Rogério");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));

    }
}
