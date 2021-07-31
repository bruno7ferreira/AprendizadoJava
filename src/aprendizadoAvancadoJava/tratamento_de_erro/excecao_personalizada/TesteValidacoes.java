package aprendizadoAvancadoJava.tratamento_de_erro.excecao_personalizada;

import aprendizadoAvancadoJava.tratamento_de_erro.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("", -7.0);
        Validar.aluno(aluno1);
        System.out.println("Fim!");

    }
}
