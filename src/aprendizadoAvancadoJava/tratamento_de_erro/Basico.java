package aprendizadoAvancadoJava.tratamento_de_erro;

import aprendizadoAvancadoJava.stream_api.Aluno;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try { // try = executar o trecho de codigo
            imprimirNomeAluno(a1);
        } catch (Exception e) { //catch = em caso caira nesse bloco
            System.out.println("Ocorreu um erro!");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace(); //printStackTrace = imprime em que ponto ocorreu o erro
            System.out.println("Ocorreu um erro " + e.getMessage()); // getMessage = retorna a mensagem do erro
        }

        System.out.println("Teste");


    }

    //Classe para imprimir nome do aluno
    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }


}
