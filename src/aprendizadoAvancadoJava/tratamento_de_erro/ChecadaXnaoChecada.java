package aprendizadoAvancadoJava.tratamento_de_erro;

public class ChecadaXnaoChecada {

    public static void main(String[] args) throws Exception { //throws Exception =
        // é obrigatorio colocar ao tratar o erro na classe

        try {
            geraErro1();
        } catch (RuntimeException e) { //RuntimeException = erro em tempo de execução, classe filha da Exception
            System.out.println(e.getMessage());// getMessage = retorna a mensagem do erro
        }

        geraErro2();

        System.out.println("Fim");

    }

    //RuntimeException - > exceção não checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro 2"); //throw = lançar uma exceção/erro
    }

    // Exception -> exceção Checada ou verificada
    static void geraErro2() throws Exception { //throws = necessário marcar quando a exceção é checada
        try {
            throw new Exception("Ocorreu um erro 2");
        } catch (Exception e) {
            System.out.println("erro tratado");
        }
    }

}
