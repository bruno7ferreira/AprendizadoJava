package aprendizadoAvancadoJava.tratamento_de_erro.excecao_personalizada;

import aprendizadoAvancadoJava.tratamento_de_erro.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno1 = new Aluno("Bruno", -7.0);
            Validar.aluno(aluno1);
        } catch (StringVaziaException e) {
            System.out.println("Mensagem de erro-> " + e.getMessage());
        } catch (NumeroForaIntervaloException e) {
            System.out.println("Mensagem de erro-> " + e.getMessage());
        }


        System.out.println("Fim!");

    }
}
