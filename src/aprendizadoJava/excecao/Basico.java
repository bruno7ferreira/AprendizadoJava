package aprendizadoJava.excecao;


public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;


        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException x) {
            System.out.println("Ocorreu um erro" + x.getMessage());
        }


        System.out.println("Fim!");


    }


}
