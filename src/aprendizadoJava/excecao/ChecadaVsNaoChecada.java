package aprendizadoJava.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        geraErro1();
        geraErro2();
        System.out.println("Fim :)");


    }

    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro");
    }

    static void geraErro2() {
        new Exception("Ocorreu um erro");
    }
}
