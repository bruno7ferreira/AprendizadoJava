package teste.exercicio;

import teste.exercicio.Contador;

public class Main2Teste {


    public static void main(String[] args) {

        Contador c1 = new Contador();
        c1.retornarContador();
        c1.incrementarContador();

        Contador c2 = new Contador();
        System.out.println("-----------");
        c2.retornarContador();

    }
}
