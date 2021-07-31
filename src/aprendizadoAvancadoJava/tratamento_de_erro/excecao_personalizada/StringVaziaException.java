package aprendizadoAvancadoJava.tratamento_de_erro.excecao_personalizada;

@SuppressWarnings("Serial")
public class StringVaziaException extends RuntimeException {

    private String nomeDoAtributo;

    StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O Atributo '%s' está vazio", nomeDoAtributo);
    }
}
